package transformationGenerator.fitness;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.internal.spec.AttributeChangeSpec;
import org.eclipse.emf.compare.internal.spec.ReferenceChangeSpec;
import org.eclipse.emf.compare.internal.spec.ResourceAttachmentChangeSpec;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.population.ChangeLogEntry;
import transformationGenerator.population.interfaces.IIndividual;

import common.emf.interfaces.IModelFactory;
import common.util.StringResource;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.etl.interfaces.IEtlExecuter;
import epsilonExecuter.executers.etl.interfaces.IEtlExecuterFactory;

public class FitnessEvaluator implements IFitnessEvaluator {

	private final ILogger logger;
	private final IModelFactory modelFactory;
	private final IEtlExecuterFactory etlExecuterFactory;
	private final IPrettyPrinter prettyPrinter;
	private final double maximumFitness = 100.;

	@Inject
	public FitnessEvaluator(ILogger logger, IModelFactory modelFactory, IEtlExecuterFactory etlExecuterFactory, IPrettyPrinter prettyPrinter) {
		this.logger = logger.initialize(FitnessEvaluator.class);
		this.modelFactory = modelFactory;
		this.etlExecuterFactory = etlExecuterFactory;
		this.prettyPrinter = prettyPrinter;
	}

	@Override
	public double getMaximumFitness() {
		return maximumFitness;
	}

	@Override
	public void evaluateFitness(IIndividual individual, List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, IModel emptyOutputModelBlueprint, IFitnessFunction fitnessFunction) throws Exception {
		String transformationInConcreteSyntax = individual.getPhenotpye().getSourceCode();
		@SuppressWarnings("unused")
		String resultingOutputModel = "";

		if (individual != null && individual.getPopulation() != null && individual.getPopulation().getSourceCodeToFitness() != null && individual.getPopulation().getSourceCodeToFitness().containsKey(transformationInConcreteSyntax)) {
			individual.setFitness(individual.getPopulation().getSourceCodeToFitness().get(transformationInConcreteSyntax));
		} else {

			HashSet<Double> fitnessValues = new HashSet<Double>();
			for (ManuallyCreatedExampleModelPair manuallyCreatedExampleModelPair : manuallyCreatedExampleModelPairs) {
				logger.LogTrace("evaluateFitness", "evaluating fitness based on pair {}-{}", manuallyCreatedExampleModelPair.getInputModelFile(), manuallyCreatedExampleModelPair.getOutputModelFile());

				logger.LogTrace("evaluateFitness", "execute ETL...");

				// logger.LogInfo("evaluateFitness", "execute ETL:\n{}", transformationInConcreteSyntax);

				IStringResource transformationSource = new StringResource(transformationInConcreteSyntax);

				// avoid concurrency issues in ETL executer (see bug #4968):
				IModel clonedInputModel = modelFactory.cloneModel(manuallyCreatedExampleModelPair.getInputModel());
				IModel clonedemptyOutputModel = modelFactory.cloneModel(emptyOutputModelBlueprint);

				IEtlExecuter etlExecuter = etlExecuterFactory.create(transformationSource, clonedInputModel, clonedemptyOutputModel);

				// double fitnessBefore = individual.getFitness();
				try {
					etlExecuter.execute();

					resultingOutputModel = prettyPrinter.ToStringRecursive(clonedemptyOutputModel);

					logger.LogTrace("evaluateFitness", "compare result with manually created example...");

					try {
						double fitness = evaluateFitness(manuallyCreatedExampleModelPair.getOutputModel(), clonedemptyOutputModel, fitnessFunction);
						fitnessValues.add(fitness);

						// individual.getChangeLog().add(new ChangeLogEntry(String.format("Fitness value set to %s - Output Model:\n%s", fitness, resultingOutputModel)));
						DecimalFormat df = new DecimalFormat("0.00");
						individual.getChangeLog().add(new ChangeLogEntry(String.format("Fitness value set to %s", df.format(fitness))));
					} catch (Exception ex) {
						// logger.LogWarning("evaluateFitness", "Comparison failed after transformation: {}\n{}", ex.getMessage(), transformationSource.getContent());
						// logger.LogWarning("evaluateFitness", "Comparison failed on manually created output model:\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedExampleModelPair.getOutputModel()));
						// logger.LogWarning("evaluateFitness", "Comparison failed on output model:\n{}", prettyPrinter.ToStringRecursive(emptyOutputModel));
						individual.getChangeLog().add(new ChangeLogEntry(String.format("Fitness evaluation set finess to 0 due to comparison error: %s", ex.getMessage())));
						fitnessValues.add(0.);
					}
				} catch (Exception ex) {
					// logger.LogWarning("evaluateFitness", "ETL execution failed on transformation: {}\n{}", ex.getMessage(), transformationSource.getContent());
					// logger.LogWarning("evaluateFitness", "ETL execution failed on input model:\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedExampleModelPair.getInputModel()));
					// logger.LogWarning("evaluateFitness", "ETL execution failed on output model:\n{}", prettyPrinter.ToStringRecursive(emptyOutputModel));

					individual.getChangeLog().add(new ChangeLogEntry(String.format("Fitness evaluation set finess to -100. due to ETL exeuction error: %s", ex.getMessage())));
					fitnessValues.add(-100.);

					// if (!individual.getPopulation().getSourceCodeToDestroyingMutationOperators().containsKey(individual.getPhenotpye().getSourceCode())) {
					// individual.getPopulation().getSourceCodeToDestroyingMutationOperators().put(individual.getPhenotpye().getSourceCode(), new HashSet<String>());
					// }
					// individual.getPopulation().getSourceCodeToDestroyingMutationOperators().get(individual.getPhenotpye().getSourceCode()).add(individual.getLastMutation());
				}
				// logger.LogInfo("evaluateFitness", "{}: {} -> {}", individual.getLastMutationOperator(), fitnessBefore, individual.getFitness());

				// "etlExecuter.dispose()" is not executed, because it disposes all participating models.
				// The only relevant thing happening here is the removal of the models from the global registry
				// => must be done when killing the individual
				modelFactory.lockGlobalModelRegistry();
				try {
					clonedemptyOutputModel.dispose();
				} finally {
					modelFactory.unlockGlobalModelRegistry();
				}
			}

			// individual.setFitness(Collections.min(fitnessValues));
			Double aggregatedFitnessValue = fitnessValues.stream().mapToDouble(d -> d).average().getAsDouble();
			individual.setFitness(aggregatedFitnessValue);
			if (individual.getPopulation() != null && individual.getPopulation().getSourceCodeToFitness() != null) {
				individual.getPopulation().getSourceCodeToFitness().putIfAbsent(transformationInConcreteSyntax, aggregatedFitnessValue);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public double evaluateFitness(IModel manuallyCreatedOutputModel, IModel outputModelOfIndividual, IFitnessFunction fitnessFunction) {

		IEObjectMatcher matcher = fitnessFunction.createObjectMatcher();

		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);

		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);

		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		IComparisonScope scope = EMFCompare.createDefaultScope(((EmfModel) manuallyCreatedOutputModel).getResource(), ((EmfModel) outputModelOfIndividual).getResource());
		Comparison comparison = comparator.compare(scope);

		if (comparison.getDifferences().size() == 0) {
			return maximumFitness;
		} else {
			Map<EObject, Integer> notMappedMofClassInstances = new HashMap<EObject, Integer>();
			Map<EObject, Integer> unexpectedMappedMofClassInstances = new HashMap<EObject, Integer>();
			HashSet<EObject> notMappedMofPropertiesInMappedMofClassesWithAssociations = new HashSet<EObject>();
			HashSet<EObject> notMappedMofAssociationPropertiesInMappedMofClasses = new HashSet<EObject>();
			for (Diff difference : comparison.getDifferences()) {
				logger.LogDebug("evaluateFitness", "Difference: {}", difference);
				// difference.getKind(); // CHANGE

				// MofClass is not mapped
				if (difference.getMatch().getLeft() != null && difference.getMatch().getRight() == null) {
					if (!notMappedMofClassInstances.containsKey(difference.getMatch().getLeft())) {
						notMappedMofClassInstances.put(difference.getMatch().getLeft(), 1);
					} else {
						notMappedMofClassInstances.put(difference.getMatch().getLeft(), notMappedMofClassInstances.get(difference.getMatch().getLeft()) + 1);
					}
				} else if (difference.getMatch().getLeft() != null && difference.getMatch().getRight() != null) {
					for (Diff differenceOfMofClass : difference.getMatch().getDifferences()) {
						//logger.LogDebug("evaluateFitness", "\tDifferenceOfMofClass: {}", differenceOfMofClass);
						if (differenceOfMofClass instanceof ReferenceChangeSpec) {
							// inverse property: differenceOfMofClass.getRequiredBy()
							// LEFT: differenceOfMofClass.getSource()
							// UNRESOLVED: differenceOfMofClass.getState()
							// ADD: differenceOfMofClass.getKind()
							// []: differenceOfMofClass.getRefines()
							// []: differenceOfMofClass.getRequires()
							// ...differenceOfMofClass.getMatch()
							// [] differenceOfMofClass.getRefinedBy()
							// null: differenceOfMofClass.getEquivalence()
							// null: differenceOfMofClass.getConflict()
							ReferenceChangeSpec referenceDifferenceOfMofClass = (ReferenceChangeSpec) differenceOfMofClass;
							if (differenceOfMofClass.getKind() == DifferenceKind.MOVE) {
								Object attributeLeft = difference.getMatch().getLeft().eGet(referenceDifferenceOfMofClass.getReference());
								Object attributeRight = difference.getMatch().getRight().eGet(referenceDifferenceOfMofClass.getReference());

								List attrbuteLeftAsList = (List) attributeLeft;
								List attrbuteRightAsList = (List) attributeRight;

								if (attrbuteLeftAsList != null && attrbuteRightAsList != null && attrbuteLeftAsList.size() != attrbuteRightAsList.size()) {
									notMappedMofPropertiesInMappedMofClassesWithAssociations.add(referenceDifferenceOfMofClass);
									notMappedMofAssociationPropertiesInMappedMofClasses.add(referenceDifferenceOfMofClass);
								} else {
									// ignore different enumeration order
								}
							} else {
								notMappedMofPropertiesInMappedMofClassesWithAssociations.add(referenceDifferenceOfMofClass);
								notMappedMofAssociationPropertiesInMappedMofClasses.add(referenceDifferenceOfMofClass);
							}
						} else if (differenceOfMofClass instanceof ResourceAttachmentChangeSpec) {
							// ResourceAttachmentChangeSpec resourceAttachmentChangeSpec = (ResourceAttachmentChangeSpec) differenceOfMofClass;
						} else if (differenceOfMofClass instanceof AttributeChangeSpec) {
							AttributeChangeSpec attributeChange = (AttributeChangeSpec) differenceOfMofClass;
							notMappedMofPropertiesInMappedMofClassesWithAssociations.add(attributeChange);
						} else {
							// TODO
							logger.LogWarning("evaluateFitness", "unexpected difference: {}", differenceOfMofClass);
						}
					}
				} else if (difference.getMatch().getLeft() == null && difference.getMatch().getRight() != null) {
					if (!unexpectedMappedMofClassInstances.containsKey(difference.getMatch().getRight())) {
						unexpectedMappedMofClassInstances.put(difference.getMatch().getRight(), 1);
					} else {
						unexpectedMappedMofClassInstances.put(difference.getMatch().getRight(), unexpectedMappedMofClassInstances.get(difference.getMatch().getRight()) + 1);
					}
				} else {
					// TODO
					logger.LogWarning("evaluateFitness", "unexpected difference: {}", "??");
				}

			}

			double numberOfMofClassInstancesInManuallyCreatedModel = manuallyCreatedOutputModel.allContents().size();

			double numberOfMofClassInstancesInOutputModelOfIndividual = outputModelOfIndividual.allContents().size();

			int numberOfMofPropertiesInManuallyCreatedModel = manuallyCreatedOutputModel.allContents().stream()
					.map(c -> (EObject) c)
					.map(eObject -> eObject.eClass().getFeatureCount())
					.reduce(0, (f1, f2) -> f1 + f2);

			int numberOfMofAssociationPropertiesInManuallyCreatedModel = manuallyCreatedOutputModel.allContents().stream()
					.map(c -> (EObject) c)
					.map(eObject -> eObject.eClass().getEAllReferences().size())
					.reduce(0, (f1, f2) -> f1 + f2);

			int numberOfNotMappedMofPropertiesInNotMappedClasses = notMappedMofClassInstances.entrySet().stream()
					.map(eObjectWithCount -> eObjectWithCount.getKey().eClass().getFeatureCount())
					.reduce(0, (f1, f2) -> f1 + f2);

			int numberOfNotMappedMofAssociationPropertiesInNotMappedClasses = notMappedMofClassInstances.entrySet().stream()
					.map(eObjectWithCount -> eObjectWithCount.getKey().eClass().getEAllReferences().size())
					.reduce(0, (f1, f2) -> f1 + f2);

			int numberOfnotMappedMofClassInstances = notMappedMofClassInstances.size();
			int numberOfunexpectedMappedMofClassInstances = unexpectedMappedMofClassInstances.size();
			int numberOfnotMappedMofPropertiesInMappedMofClassesWithAssociations = notMappedMofPropertiesInMappedMofClassesWithAssociations.size();

			int numberOfnotMappedMofAssociationPropertiesInMappedMofClasses = notMappedMofAssociationPropertiesInMappedMofClasses.size();

//			logger.LogDebug("evaluateFitness", "numberOfMofClassInstancesInManuallyCreatedModel: {}", numberOfMofClassInstancesInManuallyCreatedModel);
//			logger.LogDebug("evaluateFitness", "numberOfMofClassInstancesInOutputModelOfIndividual: {}", numberOfMofClassInstancesInOutputModelOfIndividual);
//			logger.LogDebug("evaluateFitness", "numberOfMofPropertiesInManuallyCreatedModel: {}", numberOfMofPropertiesInManuallyCreatedModel);
//			logger.LogDebug("evaluateFitness", "numberOfMofAssociationPropertiesInManuallyCreatedModel: {}", numberOfMofAssociationPropertiesInManuallyCreatedModel);
//			logger.LogDebug("evaluateFitness", "numberOfNotMappedMofPropertiesInNotMappedClasses: {}", numberOfNotMappedMofPropertiesInNotMappedClasses);
//			logger.LogDebug("evaluateFitness", "numberOfNotMappedMofAssociationPropertiesInNotMappedClasses: {}", numberOfNotMappedMofAssociationPropertiesInNotMappedClasses);
//			logger.LogDebug("evaluateFitness", "numberOfnotMappedMofClassInstances: {}", numberOfnotMappedMofClassInstances);
//			logger.LogDebug("evaluateFitness", "numberOfunexpectedMappedMofClassInstances: {}", numberOfunexpectedMappedMofClassInstances);
//			logger.LogDebug("evaluateFitness", "numberOfnotMappedMofPropertiesInMappedMofClassesWithAssociations: {}", numberOfnotMappedMofPropertiesInMappedMofClassesWithAssociations);
//			logger.LogDebug("evaluateFitness", "numberOfnotMappedMofAssociationPropertiesInMappedMofClasses: {}", numberOfnotMappedMofAssociationPropertiesInMappedMofClasses);
			
			return fitnessFunction.calculateFitness(maximumFitness,
					numberOfMofClassInstancesInManuallyCreatedModel,
					numberOfMofClassInstancesInOutputModelOfIndividual,
					numberOfMofPropertiesInManuallyCreatedModel,
					numberOfMofAssociationPropertiesInManuallyCreatedModel,
					numberOfNotMappedMofPropertiesInNotMappedClasses,
					numberOfNotMappedMofAssociationPropertiesInNotMappedClasses,
					numberOfnotMappedMofClassInstances,
					numberOfunexpectedMappedMofClassInstances,
					numberOfnotMappedMofPropertiesInMappedMofClassesWithAssociations,
					numberOfnotMappedMofAssociationPropertiesInMappedMofClasses);
		}
	}
}
