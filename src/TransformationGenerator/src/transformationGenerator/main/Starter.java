package transformationGenerator.main;

import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.functions.interfaces.IFitnessFunctionFactory;
import transformationGenerator.main.interfaces.ITransformationGenerationOrchestrator;
import transformationGenerator.main.interfaces.ITransformationGenerationOrchestratorFactory;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.mutation.interfaces.IMutationStrategyFactory;
import transformationGenerator.selectionAndReproduction.interfaces.ISelectionAndReplicationAlgorithm;
import transformationGenerator.selectionAndReproduction.interfaces.ISelectionAndReplicationAlgorithmFactory;

import com.google.inject.Injector;

import common.util.Throwables;
import common.util.interfaces.ILogger;

public class Starter {

	public static void main(String[] args) throws Exception {
		redirectSystemOutAndSystemErrToLogger();

		Injector injector = InjectionConfiguration.getInjector();
		ILogger logger = injector.getInstance(ILogger.class);
		logger.initialize(Starter.class);
		IFitnessFunctionFactory fitnessFunctionFactory = injector.getInstance(IFitnessFunctionFactory.class);
		IMutationStrategyFactory mutationStrategyFactory = injector.getInstance(IMutationStrategyFactory.class);
		ISelectionAndReplicationAlgorithmFactory selectionAndReplicationAlgorithmFactory = injector.getInstance(ISelectionAndReplicationAlgorithmFactory.class);

		// Evaluation configuration:

		int numberOfExecutionsPerConfiguration = 50;

		int[] maximumNumberOfGenerationsSettings = new int[] { 50, 100, 200 };

		int[] maximumPopulationSizeSettings = new int[] { 10, 50, 100, 200 };

		IFitnessFunction[] fitnessFunctionSettings = new IFitnessFunction[] {
				fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback(),
				fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnlyOnStructure(),
				fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallbackAndImportantAssociations(),
				fitnessFunctionFactory.createPropertyFocusedFitnessFunctionBasedOnStructureAsFallback(),
				fitnessFunctionFactory.createStructureFocusedFitnessFunction(),
				fitnessFunctionFactory.createBalancedFitnessFunction() };

		IMutationStrategy mutationStrategy = mutationStrategyFactory.createSelectOptionFromAllPossibleDirectly();

		ISelectionAndReplicationAlgorithm[] selectionAndReplicationAlgorithmSettings = new ISelectionAndReplicationAlgorithm[] {
				selectionAndReplicationAlgorithmFactory.createNaiveMaximumSelectionPressureAlgorithm(
						/* minimumPopulationSize */10,
						/* badFitnessIsBelow */2.),
				selectionAndReplicationAlgorithmFactory.createRouletteWheelBasedAlgorithm(),
				selectionAndReplicationAlgorithmFactory.createTournamentBasedAlgorithm(
						/* tournamentSize */2),
				selectionAndReplicationAlgorithmFactory.createTournamentBasedAlgorithm(
						/* tournamentSize */10)
		};
		
		// Note: the available mutation operators can be changed in the InjectionConfiguration (this settings is not documented in the database!) 

		for (int maximumNumberOfGenerations : maximumNumberOfGenerationsSettings) {
			for (int maximumPopulationSize : maximumPopulationSizeSettings) {
				for (IFitnessFunction fitnessFunction : fitnessFunctionSettings) {				
					for (ISelectionAndReplicationAlgorithm selectionAndReplicationAlgorithm : selectionAndReplicationAlgorithmSettings) {
						logger.LogInfo("main", "Started with evaluation of maximumNumberOfGenerations={},maximumPopulationSize={},fitnessFunction={},selectionAndReplicationAlgorithm={}", maximumNumberOfGenerations, maximumPopulationSize, fitnessFunction.toString(), selectionAndReplicationAlgorithm.toString());
						runEvaluation(logger, numberOfExecutionsPerConfiguration, maximumPopulationSize, maximumNumberOfGenerations, fitnessFunction, mutationStrategy, selectionAndReplicationAlgorithm);
					}
				}
			}
		}
	}

	public static void runEvaluation(ILogger logger, int numberOfExecutionsPerConfiguration, int maximumPopulationSize, int maximumNumberOfGenerations, IFitnessFunction fitnessFunction, IMutationStrategy mutationStrategy, ISelectionAndReplicationAlgorithm selectionAndReplicationAlgorithm) {
		// run ComplexScenario
		IntStream.range(0, numberOfExecutionsPerConfiguration).forEach(iteration -> Throwables.propagate(() -> {
			Injector injector = InjectionConfiguration.getInjector();

			ITransformationGenerationOrchestratorFactory transformationGenerationOrchestratorFactory = injector.getInstance(ITransformationGenerationOrchestratorFactory.class);

			ITransformationGenerationOrchestrator transformationGenerationOrchestrator = transformationGenerationOrchestratorFactory.create(
					/* selectionAndReplicationAlgorithm */selectionAndReplicationAlgorithm,
					/* fitnessFunction */fitnessFunction,
					/* mutationStrategy */mutationStrategy,
					/* maximumPopulationSize */maximumPopulationSize,
					/* maximumNumberOfGenerations */maximumNumberOfGenerations);

			runComplexScenario(transformationGenerationOrchestrator);
			return null;
		}));

		// run SimpleScenario
		IntStream.range(0, numberOfExecutionsPerConfiguration).forEach(iteration -> Throwables.propagate(() -> {
			Injector injector = InjectionConfiguration.getInjector();

			ITransformationGenerationOrchestratorFactory transformationGenerationOrchestratorFactory = injector.getInstance(ITransformationGenerationOrchestratorFactory.class);

			ITransformationGenerationOrchestrator transformationGenerationOrchestrator = transformationGenerationOrchestratorFactory.create(
					/* selectionAndReplicationAlgorithm */selectionAndReplicationAlgorithm,
					/* fitnessFunction */fitnessFunction,
					/* mutationStrategy */mutationStrategy,
					/* maximumPopulationSize */maximumPopulationSize,
					/* maximumNumberOfGenerations */maximumNumberOfGenerations);

			runSimpleScenario(transformationGenerationOrchestrator);
			return null;
		}));
	}

	@SuppressWarnings("serial")
	private static void runSimpleScenario(ITransformationGenerationOrchestrator transformationGenerationOrchestrator) throws URISyntaxException, Exception {
		URI inputMetaModelFile = new URI("file:../MetaModels.UmlClass/umlClassMetaModel.ecore");
		URI outputMetaModelFile = new URI("file:../MetaModels.Relational/relationalMetaModel.ecore");
		List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs = new ArrayList<ManuallyCreatedExampleModelPair>() {
			{
				add(new ManuallyCreatedExampleModelPair(new URI("file:../ExampleModels/umlClass/001_umlClass.model"), new URI("file:../ExampleModels/relational/001_relational.model")));
			}
		};
		URI emptyOutputFile = new URI("file:../ExampleModels/relational/001_relational_generated.model");
		URI sourceAndTargetMetaModelInAbstractSyntax = new URI("file:../ExampleModels/etl/001_umlclass2relational_generated.model");

		transformationGenerationOrchestrator.generate(inputMetaModelFile, outputMetaModelFile, manuallyCreatedExampleModelPairs, emptyOutputFile, sourceAndTargetMetaModelInAbstractSyntax);
	}

	@SuppressWarnings("serial")
	private static void runComplexScenario(ITransformationGenerationOrchestrator transformationGenerationOrchestrator) throws URISyntaxException, Exception {
		URI inputMetaModelFile = new URI("file:../MetaModels.ComplexStateMachine/complexStateMachineMetaModel.ecore");
		URI outputMetaModelFile = new URI("file:../MetaModels.SimpleStateMachine/simpleStateMachineMetaModel.ecore");
		List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs = new ArrayList<ManuallyCreatedExampleModelPair>() {
			{
				add(new ManuallyCreatedExampleModelPair(new URI("file:../ExampleModels/complexStateMachine/002_complexStateMachine.model"), new URI("file:../ExampleModels/simpleStateMachine/002_simpleStateMachine.model")));
			}
		};
		URI emptyOutputFile = new URI("file:../ExampleModels/relational/001_relational_generated.model");
		URI sourceAndTargetMetaModelInAbstractSyntax = new URI("file:../ExampleModels/etl/002_complexStateMachine2simpleStateMachine.model");

		transformationGenerationOrchestrator.generate(inputMetaModelFile, outputMetaModelFile, manuallyCreatedExampleModelPairs, emptyOutputFile, sourceAndTargetMetaModelInAbstractSyntax);
	}

	private static final ILogger stdAndErrOutLogger = InjectionConfiguration.getInjector().getInstance(ILogger.class).initialize(Starter.class);;

	public static void redirectSystemOutAndSystemErrToLogger() {
		System.setOut(new PrintStream(System.out) {
			public void print(String s) {
				stdAndErrOutLogger.LogInfo("System.out", s);
			}
		});
		System.setErr(new PrintStream(System.err) {
			public void print(String s) {
				stdAndErrOutLogger.LogError("System.err", s);
			}
		});
	}
}
