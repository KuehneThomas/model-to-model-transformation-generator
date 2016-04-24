package transformationGenerator.mutation;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.mutation.interfaces.IMutationExecuter;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.population.ChangeLogEntry;
import transformationGenerator.population.PossibleMutation;
import transformationGenerator.population.interfaces.IChangeLogEntry;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPossibleMutation;
import common.emf.interfaces.IModelFactory;
import common.util.Throwables;
import common.util.interfaces.ILogger;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;
import common.util.interfaces.IStringResource;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;
import epsilonExecuter.executers.egl.interfaces.IEglExecuterFactory;
import etlMetaModel.EtlModule;

public class MutationExecuter implements IMutationExecuter {

	private final Boolean enableExtendedMutationOperatorLogging;
	private final ILogger logger;
	private final IRandomizer randomizer;
	private final IEglExecuterFactory eglExecuterFactory;
	private final IStringResource etl2TextSource;
	private final Set<IMutationOperator> mutationOperators;
	private final IModelFactory modelFactory;

	@Inject
	public MutationExecuter(ILogger logger, IRandomizer randomizer, IEglExecuterFactory eglExecuterFactory, IResourceReader resourceReader, IModelFactory modelFactory, Set<IMutationOperator> mutationOperators) {
		this.enableExtendedMutationOperatorLogging = false;
		this.logger = logger.initialize(MutationExecuter.class);
		this.randomizer = randomizer;
		this.eglExecuterFactory = eglExecuterFactory;
		this.etl2TextSource = resourceReader.getJarResourceAsStringResource("resources/etl2text.egl");
		this.modelFactory = modelFactory;
		this.mutationOperators = mutationOperators;
	}

	@Override
	public void removeEverythingNotChangingTheFitness(IIndividual individual, IFitnessEvaluator fitnessEvaluator, List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, IModel emptyOutputModelBlueprint, IFitnessFunction fitnessFunction) throws Exception {

		EtlModule etlModule = individual.getGenotype().allContents().stream().filter(c -> c instanceof EtlModule).map(c -> (EtlModule) c).findFirst().get();

		etlModule.getTransformationRules().stream().collect(Collectors.toList()).stream().forEach(transformationRule -> {

			try {
				IIndividual clonedIndividual = individual.cloneIndividual(modelFactory, /* addToPopulation: */false, /* cloneChangeLog: */false);

				int indexOfTransformationRule = etlModule.getTransformationRules().indexOf(transformationRule);
				etlModule.getTransformationRules().remove(transformationRule);

				IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, individual.getGenotype());
				String transformationInConcreteSyntax = (String) eglExecuter.execute();
				eglExecuter.dispose();

				individual.getPhenotpye().setSourceCode(transformationInConcreteSyntax);

				fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction);

				if (clonedIndividual.getFitness() > individual.getFitness()) {
					etlModule.getTransformationRules().add(indexOfTransformationRule, transformationRule);

					IEglExecuter eglExecuterRollback = eglExecuterFactory.create(etl2TextSource, individual.getGenotype());
					String transformationInConcreteSyntaxRollback = (String) eglExecuter.execute();
					eglExecuterRollback.dispose();

					individual.getPhenotpye().setSourceCode(transformationInConcreteSyntaxRollback);

					fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction);
				} else { // FIXME: model cleanup after mutation from JavaMutationOperator

					EmfModel emfModel = (EmfModel) individual.getGenotype();
					for (EObject eObject : emfModel.getResource().getContents().toArray(new EObject[0])) {
						if (!eObject.eClass().getName().equals("EtlModule")) {
							emfModel.getResource().getContents().remove(eObject);
						}
					}

					individual.getChangeLog().add(new ChangeLogEntry(String.format("Removed rule during cleanup:\n %s", transformationInConcreteSyntax)));
				}

				clonedIndividual.killIndividual(modelFactory);

				modelFactory.reinitializeCache(individual.getGenotype()); // cleans up model.allContents()
			} catch (Exception e) {
				logger.LogWarning("removeEverythingNotChangingTheFitness", "PossibleMutation mutation/evaluation error: {} - {}", e, e.getStackTrace()[0]);
			}

		});
	}

	@Override
	public void applyMutationAndEvaluateFitness(IIndividual individual, IFitnessEvaluator fitnessEvaluator, List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, IModel emptyOutputModelBlueprint, IFitnessFunction fitnessFunction, IMutationStrategy mutationStrategy) {

		try {

			if (enableExtendedMutationOperatorLogging) {
				IModel transformationInAbtractSyntax = individual.getGenotype();
				Map<IMutationOperator, List<IMutationOption>> mutationOptionsByOperator = mutationOperators.stream()
						.flatMap(mutationOperator -> Throwables.propagate(() -> mutationOperator.getMutationOptions(transformationInAbtractSyntax).stream()))
						.collect(Collectors.toList()).stream()
						.collect(Collectors.groupingBy(IMutationOption::getMutationOperator));

				mutationOptionsByOperator.forEach((mutationOperator, mutationOptionsOfOperator) -> {
					mutationOptionsOfOperator.parallelStream().forEach(mutationOption -> Throwables.propagate(() -> {
						IEglExecuter eglExecuter;
						try {

							IIndividual clonedIndividual = individual.cloneIndividual(modelFactory, /* addToPopulation: */false, /* cloneChangeLog: */false);
							List<IMutationOption> mutationOptionsForClone = mutationOperator.getMutationOptions(clonedIndividual.getGenotype());
							Optional<IMutationOption> equivalentMutationOptionForClone = mutationOptionsForClone.stream().filter(mo -> mo.isOptionEquivalentTo(mutationOption)).findFirst();

							if (!equivalentMutationOptionForClone.isPresent()) {
								throw new Exception(String.format("Found no equivalent for %s: %s", mutationOption.getClass().getName(), mutationOption));
							}
							equivalentMutationOptionForClone.get().getMutationOperator().mutate(equivalentMutationOptionForClone.get());

							eglExecuter = eglExecuterFactory.create(etl2TextSource, clonedIndividual.getGenotype());
							String transformationInConcreteSyntaxCopy = (String) eglExecuter.execute();
							eglExecuter.dispose();

							clonedIndividual.getPhenotpye().setSourceCode(transformationInConcreteSyntaxCopy);

							fitnessEvaluator.evaluateFitness(clonedIndividual, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction);

							IPossibleMutation possibleMutation = new PossibleMutation();
							possibleMutation.setFitnessBefore(individual.getFitness());
							possibleMutation.setFitnessAfter(clonedIndividual.getFitness());
							possibleMutation.setIndividual(individual);
							individual.getPossibleMutations().add(possibleMutation);
							possibleMutation.setMutationOperator(mutationOperator.getClass().getSimpleName());
							// possibleMutation.setMutationOption(mutationOptionsOfOperator.toString());

							clonedIndividual.killIndividual(modelFactory);

						} catch (Exception e) {
							logger.LogWarning("applyMutationAndEvaluateFitness", "PossibleMutation mutation/evaluation error: {} - {}", e, e.getStackTrace()[0]);
						}
						return null;
					}));
				});
			}

			applyMutation(individual, mutationStrategy);
			fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction);

		} catch (Exception ex) {
			logger.LogWarning("Error during mutation / fitness evaluation", "Error: {}, Individual: {}", ex.getMessage(), individual != null && individual.getPhenotpye() != null ? individual.getPhenotpye().getSourceCode() : "NULL");
			if (individual != null && individual.getPopulation() != null) {
				individual.getPopulation().getIndividuals().remove(individual);
			}
		}

	}

	@Override
	public void applyMutation(IIndividual individual, IMutationStrategy mutationStrategy) throws Exception {
		logger.LogTrace("applyMutation", "....");

		IMutationOption mutationOption = mutationStrategy.getMutationOption(individual, mutationOperators, randomizer);

		if (mutationOption != null) {
			applyMutationOption(individual, mutationOption);
		} else {
			logger.LogWarning("applyMutation", "found no applicable mutation operators!");
		}

	}

	protected void applyMutationOption(IIndividual individual, IMutationOption mutationOption) throws Exception {
		IChangeLogEntry changeLogEntry = mutationOption.getMutationOperator().mutate(mutationOption);
		individual.setLastMutationOperator(mutationOption.getClass().getName());
		individual.setLastMutation(mutationOption.toString());
		individual.getChangeLog().add(changeLogEntry);

		// logger.LogInfo("applyMutation", "{}", changeLogEntry);
		logger.LogTrace("applyMutation", "convert to ETL...");

		IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, individual.getGenotype());
		String transformationInConcreteSyntax = (String) eglExecuter.execute();
		eglExecuter.dispose();

		// "mutationOperator.dispose()" is not executed, because it disposes all participating models.
		// The only relevant thing happening here is the removal of the models from the global registry
		// => must be done when killing the individual

		individual.getPhenotpye().setSourceCode(transformationInConcreteSyntax);
		individual.getChangeLog().add(new ChangeLogEntry(String.format("Updated SourceCode after mutation to:\n %s", transformationInConcreteSyntax)));
	}
}
