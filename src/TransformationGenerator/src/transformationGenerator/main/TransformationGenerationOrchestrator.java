package transformationGenerator.main;

import java.net.URI;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.epsilon.emc.emf.EmfModelResourceFactory;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.main.interfaces.ITransformationGenerationOrchestrator;
import transformationGenerator.mutation.interfaces.IMutationExecuter;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.population.Configuration;
import transformationGenerator.population.interfaces.IConfiguration;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPopulation;
import transformationGenerator.reporting.interfaces.IReporter;
import transformationGenerator.selectionAndReproduction.interfaces.ISelectionAndReplicationAlgorithm;

import com.google.inject.Key;
import com.google.inject.assistedinject.Assisted;

import common.emf.interfaces.IModelFactory;
import common.util.Throwables;
import common.util.interfaces.ILogger;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;

public class TransformationGenerationOrchestrator implements ITransformationGenerationOrchestrator {

	private int maximumPopulationSize;
	private int maximumNumberOfGenerations;

	private ILogger logger;
	private IPopulation population;
	private IResourceReader resourceReader;
	private IModelFactory modelFactory;
	private IRandomizer randomizer;
	private IFitnessEvaluator fitnessEvaluator;
	private IMutationExecuter mutationExecuter;
	private IReporter reporter;
	private ISelectionAndReplicationAlgorithm selectionAndReplicationAlgorithm;
	private IFitnessFunction fitnessFunction;
	private IMutationStrategy mutationStrategy;

	@Inject
	public TransformationGenerationOrchestrator(ILogger logger, IPopulation population, IResourceReader resourceReader, IModelFactory modelFactory,
			IRandomizer randomizer, IFitnessEvaluator fitnessEvaluator, IMutationExecuter mutationExecuter, IReporter reporter,
			@Assisted ISelectionAndReplicationAlgorithm selectionAndReplicationAlgorithm,
			@Assisted IFitnessFunction fitnessFunction,
			@Assisted IMutationStrategy mutationStrategy,
			@Assisted("maximumPopulationSize") int maximumPopulationSize,
			@Assisted("maximumNumberOfGenerations") int maximumNumberOfGenerations) {

		this.maximumPopulationSize = maximumPopulationSize;
		this.maximumNumberOfGenerations = maximumNumberOfGenerations;

		this.logger = logger;
		this.logger.initialize(TransformationGenerationOrchestrator.class);
		this.population = population;
		this.population.setMaximumSize(maximumPopulationSize);
		this.resourceReader = resourceReader;
		this.modelFactory = modelFactory;
		this.randomizer = randomizer;
		this.fitnessEvaluator = fitnessEvaluator;
		this.mutationExecuter = mutationExecuter;
		this.reporter = reporter;
		this.selectionAndReplicationAlgorithm = selectionAndReplicationAlgorithm;
		this.fitnessFunction = fitnessFunction;
		this.mutationStrategy = mutationStrategy;
	}

	public IIndividual generate(URI inputMetaModelFile, URI outputMetaModelFile, final List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, URI emptyOutputFile, URI sourceAndTargetMetaModelInAbstractSyntax) throws Exception {

		logger.LogInfo("generate", "started");

		IConfiguration configuration = new Configuration();
		configuration.setInputMetaModel(inputMetaModelFile.toString());
		configuration.setOutputMetaModel(outputMetaModelFile.toString());
		configuration.setPopulationSize(maximumPopulationSize);
		configuration.setMaximumNumberOfGenerations(maximumNumberOfGenerations);
		configuration.setSelectionAndReplicationAlgorithm(selectionAndReplicationAlgorithm.toString());
		configuration.setFitnessFunction(fitnessFunction.toString());
		configuration.setMutationOperatorSelection(mutationStrategy.toString());
		configuration = reporter.getOrCreateConfiguration(configuration);

		logger.LogInfo("generate", "{}", configuration);
		population.setConfiguration(configuration);

		final IModel emptyOutputModelBlueprint = loadModels(inputMetaModelFile, outputMetaModelFile, manuallyCreatedExampleModelPairs, emptyOutputFile);
		IModel transformationInAbtractSyntaxBlueprint = convertInputMetaModelAndOutputMetaModelIntoAbstractSyntax(sourceAndTargetMetaModelInAbstractSyntax);

		createInitialPopulation(manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, transformationInAbtractSyntaxBlueprint);

		logger.LogInfo("generate", "reporting current population state...");
		reporter.reportStateOf(population);

		population.nextGeneration();

		for (IIndividual individual : population.getIndividuals()) {
			logger.LogDebug("generate", "individual {}: \n{}", individual.hashCode(), individual.getPhenotpye().getSourceCode());
		}

		logger.LogInfo("generate", "starting evolution...");
		while (population.getGeneration() <= maximumNumberOfGenerations && population.getMaximumFitness() < fitnessEvaluator.getMaximumFitness() && population.getIndividuals().size() > 0) {
			double maximumFitnessBefore = population.getMaximumFitness();

			// Map<String, List<IIndividual>> sourceCodeToIndividuals = population.getIndividuals().stream().collect(Collectors.groupingBy(k -> k.getPhenotpye().getSourceCode()));
			// int numberOfEquivalences = sourceCodeToIndividuals.values().stream().mapToInt(l -> l.size() - 1).sum();
			// logger.LogInfo("generate", "numberOfEquivalences : {}/{}", numberOfEquivalences, population.getIndividuals().size());

			selectionAndReplicationAlgorithm.execute(manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, population, fitnessFunction, mutationStrategy);

			logger.LogInfo("generate", "reporting current population state...");
			reporter.reportStateOf(population);

			if (population.getIndividuals().size() > 0) {
				DecimalFormat df = new DecimalFormat("0.00");
				logger.LogInfo("generate", "generation {}: current best fitness changed from {} to {} of {}", population.getGeneration(), df.format(maximumFitnessBefore), df.format(population.getMaximumFitness()), fitnessEvaluator.getMaximumFitness());

				if (!areEqualDouble(maximumFitnessBefore, population.getMaximumFitness(), 1)) {
					logger.LogInfo("generate", "one of the currently fittest indidivduals:\n{}", population.getFittestIndividuals().size() > 0 ? population.getFittestIndividuals().get(0).getPhenotpye().getSourceCode() : "NONE!");
				}

				population.nextGeneration();
			} else {
				logger.LogInfo("generate", "no individuals left, aborting.");
			}

		}

		logger.LogInfo("generate", "remove all rules that do not change the fitness...");
		population.getFittestIndividuals().stream().forEach(individual ->
		{
			try {
				mutationExecuter.removeEverythingNotChangingTheFitness(individual, fitnessEvaluator, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction);
			} catch (Exception e) {
				logger.LogWarning("generate", "PossibleMutation mutation/evaluation error: {} - {}", e, e.getStackTrace()[0]);
			}
		});

		reporter.complete(population);

		if (population.getMaximumFitness() < 100.) {
			logger.LogInfo("generate", "finished because generation limit of {} has beend reached. There are {} best individuals with a fitness of {} (maximum: {})", maximumNumberOfGenerations, population.getFittestIndividuals().size(), population.getMaximumFitness(),
					fitnessEvaluator.getMaximumFitness());
		} else {
			logger.LogInfo("generate", "finished because generation {} contained the {} individual(s) with maximum fitness of {}", population.getGeneration(), population.getFittestIndividuals().size(), fitnessEvaluator.getMaximumFitness());
		}

		IIndividual selectedBestIndividual = randomizer.getRandomElementFrom(population.getFittestIndividuals());

		logger.LogInfo("generate", "Selected Best Individual: \n{}", selectedBestIndividual);

		logger.LogInfo("generate", "Population:\n{}", population.toString());

		// cleanup
		for (IIndividual individual : population.getIndividuals().stream().collect(Collectors.toList())) {
			individual.killIndividual(modelFactory);
		}
		EmfModelResourceFactory.getInstance().clearCache();

		logger.LogInfo("generate", "Finished");
		return selectedBestIndividual;
	}

	private void createInitialPopulation(final List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, final IModel emptyOutputModelBlueprint, final IModel transformationInAbtractSyntaxBlueprint) throws Exception {
		logger.LogInfo("createInitialPopulation", "...");

		List<Integer> individualNumbers = new ArrayList<Integer>();
		for (int individualNumber = 1; individualNumber <= this.population.getMaximumSize(); individualNumber++) {
			individualNumbers.add(individualNumber);
		}

		List<IIndividual> individuals = individualNumbers.parallelStream().map(individualNumber ->
				Throwables.propagate(() -> {
					IIndividual individual = InjectionConfiguration.getInjector().getInstance(new Key<IIndividual>() {});
					try {
						logger.LogTrace("generate", "creating {}. individual {}", individualNumber, individual.hashCode());

						individual.setPopulation(population);
						individual.setGeneration(population.getGeneration());
						individual.setGenotype(modelFactory.cloneModel(transformationInAbtractSyntaxBlueprint));

						int maximumNumberOfMutations = 1;
						int numberOfMutations = 0;
						while (individual.getFitness() <= 0. && numberOfMutations < maximumNumberOfMutations) {
							mutationExecuter.applyMutationAndEvaluateFitness(individual, fitnessEvaluator, manuallyCreatedExampleModelPairs, emptyOutputModelBlueprint, fitnessFunction, mutationStrategy);
							numberOfMutations++;
						}
						return individual;
					} catch (Exception ex) {
						logger.LogWarning("Error during clone/mutate/fitness evaluation", "Error: {}, Individual: {}", ex, individual.hashCode());
						return null;
					}
				}))
				.filter(individual -> individual != null)
				.collect(Collectors.toList());

		for (IIndividual individual : individuals) {
			population.getIndividuals().add(individual);
			logger.LogTrace("generate", "individual {} added", individual.hashCode());
		}
	}

	private boolean areEqualDouble(double a, double b, int precision) {
		return Math.abs(a - b) <= Math.pow(10, -precision);
	}

	public IModel loadModels(URI inputMetaModelFile, URI outputMetaModelFile, List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs, URI emptyOutputModelFile) throws Exception {
		logger.LogInfo("loadModels", "Loading manually created example models...");
		// this is only an empty dummy file ..TODO maybe this can be created at runtime....
		IModel emptyOutputModel = modelFactory.loadModelByURI("Target", emptyOutputModelFile, outputMetaModelFile, true, false);

		for (ManuallyCreatedExampleModelPair manuallyCreatedExampleModelPair : manuallyCreatedExampleModelPairs) {
			IModel inputModel = modelFactory.loadModelByURI("Source", manuallyCreatedExampleModelPair.getInputModelFile(), inputMetaModelFile, true, false);
			IModel outputModel = modelFactory.loadModelByURI("Target", manuallyCreatedExampleModelPair.getOutputModelFile(), outputMetaModelFile, true, false);
			manuallyCreatedExampleModelPair.setInputModel(inputModel);
			manuallyCreatedExampleModelPair.setOutputModel(outputModel);
		}
		return emptyOutputModel;
	}

	public IModel convertInputMetaModelAndOutputMetaModelIntoAbstractSyntax(URI sourceAndTargetMetaModelInAbstractSyntax) throws Exception {
		logger.LogTrace("convertInputMetaModelAndOutputMetaModelIntoAbstractSyntax", "=========== converting meta models...");
		// TODO create automatically:
		URI transformationModelFile = sourceAndTargetMetaModelInAbstractSyntax;
		logger.LogWarning("generate", "conversion has not been implemented yet - using transformation model file which contains already the source and target meta model in abstract syntax: {}", transformationModelFile);

		URI transformationAbtractSyntaxMetaModel = resourceReader.getJarResourceAsUri("resources/etlMetaModel.ecore");
		IModel transformationInAbtractSyntax = modelFactory.loadModelByURI("Model", transformationModelFile, transformationAbtractSyntaxMetaModel, true, false);
		return transformationInAbtractSyntax;
	}

}