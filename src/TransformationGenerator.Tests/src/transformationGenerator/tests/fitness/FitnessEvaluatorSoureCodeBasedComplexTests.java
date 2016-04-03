package transformationGenerator.tests.fitness;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.functions.interfaces.IFitnessFunctionFactory;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.main.InjectionConfiguration;
import transformationGenerator.main.ManuallyCreatedExampleModelPair;
import transformationGenerator.main.TransformationGenerationOrchestrator;
import transformationGenerator.main.interfaces.ITransformationGenerationOrchestratorFactory;
import transformationGenerator.mutation.interfaces.IMutationStrategy;
import transformationGenerator.mutation.interfaces.IMutationStrategyFactory;
import transformationGenerator.population.Individual;
import transformationGenerator.population.Program;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.selectionAndReproduction.interfaces.ISelectionAndReplicationAlgorithmFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;

public class FitnessEvaluatorSoureCodeBasedComplexTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	ILogger logger;
	IPrettyPrinter prettyPrinter;
	IFitnessFunctionFactory fitnessFunctionFactory;
	IFitnessEvaluator fitnessEvaluator;
	List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs;
	IModel manuallyCreatedOutputModel;
	IFitnessFunction fitnessFunction;

	@SuppressWarnings("serial")
	@Before
	public void setUp() throws Exception {
		URI inputMetaModelFile = new URI("file:../MetaModels.ComplexStateMachine/complexStateMachineMetaModel.ecore");
		URI outputMetaModelFile = new URI("file:../MetaModels.SimpleStateMachine/simpleStateMachineMetaModel.ecore");
		manuallyCreatedExampleModelPairs = new ArrayList<ManuallyCreatedExampleModelPair>() {
			{
				add(new ManuallyCreatedExampleModelPair(new URI("file:../ExampleModels/complexStateMachine/002_complexStateMachine.model"), new URI("file:../ExampleModels/simpleStateMachine/002_simpleStateMachine.model")));
			}
		};
		URI emptyOutputFile = new URI("file:../ExampleModels/relational/001_relational_generated.model");

		ISelectionAndReplicationAlgorithmFactory selectionAndReplicationAlgorithmFactory = InjectionConfiguration.getInjector().getInstance(ISelectionAndReplicationAlgorithmFactory.class);
		fitnessFunctionFactory = InjectionConfiguration.getInjector().getInstance(IFitnessFunctionFactory.class);
		fitnessFunction = fitnessFunctionFactory.createBalancedFitnessFunction();
		IMutationStrategyFactory mutationStrategyFactory = InjectionConfiguration.getInjector().getInstance(IMutationStrategyFactory.class);
		IMutationStrategy mutationStrategy = mutationStrategyFactory.createSelectOperatorFirstAndThenAnOption();
		ITransformationGenerationOrchestratorFactory transformationGenerationOrchestratorFactory = InjectionConfiguration.getInjector().getInstance(ITransformationGenerationOrchestratorFactory.class);
		TransformationGenerationOrchestrator transformationGenerationOrchestrator = transformationGenerationOrchestratorFactory.create(selectionAndReplicationAlgorithmFactory.createNaiveMaximumSelectionPressureAlgorithm(0, 0.), fitnessFunction, mutationStrategy, 0, 0);
		manuallyCreatedOutputModel = transformationGenerationOrchestrator.loadModels(inputMetaModelFile, outputMetaModelFile, manuallyCreatedExampleModelPairs, emptyOutputFile);

		logger = InjectionConfiguration.getInjector().getInstance(ILogger.class);
		logger.initialize(FitnessEvaluatorSoureCodeBasedComplexTests.class);

		prettyPrinter = InjectionConfiguration.getInjector().getInstance(IPrettyPrinter.class);

		fitnessEvaluator = InjectionConfiguration.getInjector().getInstance(IFitnessEvaluator.class);
	}

	@Test
	public void testEvaluateFitnessWithSample1() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule Transition2SimpleStateMachine\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceTransition.Source.equivalent();\r\n" +
						"	targetSimpleStateMachine.Name = sourceTransition.ComplexStateMachine.Name + \" -> \" + sourceTransition.Target.ComplexStateMachine.Name;\r\n" +
						"	targetSimpleStateMachine.States = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"	targetSimpleStateMachine.Transitions = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		assertEquals(0., fitness, 1.); // before error penalty: 0.0
	}

	@Test
	public void testEvaluateFitnessWithSample2() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachine\r\n" +
						"	transform complexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to simpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	simpleStateMachine.Name = complexStateMachine.Name;\r\n" +
						// "	simpleStateMachine.InitialState = complexStateMachine.InitialState.equivalent();\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		// assertEquals(8., fitness, 1.);
		assertEquals(2.7, fitness, 1.); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample3() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +
						"}\r\n\r\n" +
						"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		// assertEquals(9.2, fitness, 1.); // before error penalty: 20.0
		assertEquals(7.4, fitness, 1.); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample4() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule TransitionFromComplexState2ManyTransitions\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to targetTransitions : Sequence(Target!Transition) { \r\n" +
						"	guard : sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"			and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"		var targetTransition = new Target!Transition; \r\n" +
						"		targetTransitions.add(targetTransition); \r\n" +
						"		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						"		targetTransition.Source = sourceState.equivalent();\r\n" +
						"		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"		targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		// assertEquals(20., fitness, 1.);
		assertEquals(18.5, fitness, 1.); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample5() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachine\r\n" +
						"	transform complexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to simpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	\r\n" +
						"	simpleStateMachine.Name = complexStateMachine.Name;\r\n" +
						"	simpleStateMachine.InitialState = complexStateMachine.InitialState.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"	\r\n" +
						"	targetState.SimpleStateMachine = sourceState.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to targetTransition : Target!Transition {\r\n" +
						"	guard : not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"		    and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule TransitionToComplexState2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to targetTransition : Target!Transition {\r\n" +
						"	guard : sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"			and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule TransitionFromComplexState2ManyTransitions\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard : sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"			and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"		var targetTransition = new Target!Transition;\r\n" +
						"		targetTransitions.add(targetTransition);\r\n" +
						"		\r\n" +
						"		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						"		targetTransition.Source = sourceState.equivalent();\r\n" +
						"		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"		targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		assertEquals(100., fitness, 1.);
	}

	@Test
	public void testEvaluateFitnessWithSample6() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule Transition2ManyTransitions\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.ComplexStateMachine.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachine\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		// assertEquals(77.9, fitness, 0.1); // before error penalty: 98.1
		assertEquals(61.2, fitness, 0.1); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample7_IdealSolution() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(new String(Files.readAllBytes(Paths.get("../Transformations/complexStateMachine2simpleStateMachine/002_complexStateMachine2simpleStateMachine.etl")))));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness = individual.getFitness();
		assertEquals(100.0, fitness, 0.1); // before error penalty: 98.1
	}

	@Test
	public void testEvaluateFitnessWithSample8() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Incoming = sourceState.ComplexStateMachine.InitialState.Incoming.equivalent();\r\n" +
						"	targetState.Outgoing = sourceState.Incoming.equivalent();\r\n" +
						"	targetState.Name = sourceState.ComplexStateMachine.Name;\r\n" +
						"}\r\n\r\n" +
						"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Source = sourceTransition.Target.equivalent();\r\n" +
						"	targetTransition.Name = sourceTransition.ComplexStateMachine.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" +
						"	targetTransition.Target = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachine\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n" +
						"}\r\n\r\n" +
						"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		// assertEquals(10.8, fitness, 0.1);
		assertEquals(8.9, fitness, 0.1); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample9() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachine\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +

						"rule TransitionToComplexState2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to targetTransition : Target!Transition { \r\n" +
						"	guard : sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"			and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +
						"\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n" +

						"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState) and\r\n" +
						"		   not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2ManyTransitions\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState) and\r\n" +
						"		   sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"	  		targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnlyOnStructure());
		double fitness = individual.getFitness();
		// assertEquals(98.1, fitness, 0.1);
		assertEquals(100, fitness, 0.);
	}

	@Test
	public void testEvaluateFitnessWithSample10_1() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachine\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n" +
						// "	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						// "	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.Transitions.equivalent();\r\n" +
						// "	targetSimpleStateMachine.States = sourceComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +

						"rule TransitionToComplexState2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to targetTransition : Target!Transition { \r\n" +
						"	guard : sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"			and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +
						// "	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						// "	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +
						// "\r\n" +
						// "	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n" +

						"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState) and\r\n" +
						"		   not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						// "	targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						// "	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						// "	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2ManyTransitions\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState) and\r\n" +
						"		   sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						// "	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						// "	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						// "	  		targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnlyOnStructure());
		double fitness = individual.getFitness();
		// assertEquals(98.1, fitness, 0.1);
		assertEquals(0., fitness, 0.);
	}

	@Test
	public void testEvaluateFitnessWithSample10_2() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachine\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n" +
						// "	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						// "	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.Transitions.equivalent();\r\n" +
						// "	targetSimpleStateMachine.States = sourceComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +

						"rule TransitionToComplexState2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to targetTransition : Target!Transition { \r\n" +
						"	guard : sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"			and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +
						// "	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						// "	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +
						// "\r\n" +
						// "	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n" +

						"rule Transition2Transition\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState) and\r\n" +
						"		   not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						// "	targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						// "	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						// "	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2ManyTransitions\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState) and\r\n" +
						"		   sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						// "	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						// "	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						// "	  		targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness = individual.getFitness();
		// assertEquals(93.5, fitness, 0.1);
		assertEquals(73.1, fitness, 0.1); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample11() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionIncludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						// "	targetTransition.Name = sourceTransition.Target.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" + // ??
						// must be changed to:
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +

						// "	targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						// must be changed to:
						"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +

						// missing:
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +

						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsExcludingTargetAsCompositeStateIncludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +

						// must be changed to:
						// "	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n"+ // ??
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;" +

						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.InitialState.ComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		assertEquals(100, fitness, 0.);
	}

	@Test
	public void testEvaluateFitnessWithSample12() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n" +
						// "	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n"+

						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.InitialState.ComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateIncludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						"	targetTransition.Target = sourceTransition.Source.equivalent();\r\n" +
						// "	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n"+

						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						"	targetTransition.Name = sourceTransition.ComplexStateMachine.InitialState.Name;\r\n" +
						// "	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +

						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +

						"	targetState.Incoming = sourceState.ComplexStateMachine.InitialState.Outgoing.equivalent();\r\n" +
						//

						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +

						"	targetTransition.Source = sourceTransition.Target.equivalent();\r\n" +
						// "	targetTransition.Source = sourceTransition.Source.equivalent();\r\n"+

						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +

						"	targetTransition.Target = sourceTransition.Source.equivalent();\r\n" +
						// "	targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+

						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsIncludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +

						"	  		targetTransition.Target = sourceState.equivalent();\r\n" +
						// "	  		targetTransition.Source = sourceState.equivalent();\r\n"+

						"	  		targetTransition.Source = sourceTransition.Target.equivalent();\r\n" +
						// "	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	}\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		// assertEquals(94.4, fitness, 0.1);
		assertEquals(75.9, fitness, 0.1); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample12_2_SimpleStateMachineName() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n" +
						// "	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n"+

						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.InitialState.ComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateIncludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						// "	targetTransition.Target = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						// "	targetTransition.Name = sourceTransition.ComplexStateMachine.InitialState.Name;\r\n"+
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +

						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +

						// "	targetState.Incoming = sourceState.ComplexStateMachine.InitialState.Outgoing.equivalent();\r\n"+

						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +

						// "	targetTransition.Source = sourceTransition.Target.equivalent();\r\n"+
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +

						// "	targetTransition.Target = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +

						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsIncludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +

						// "	  		targetTransition.Target = sourceState.equivalent();\r\n"+
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +

						"	  		targetTransition.Source = sourceTransition.Target.equivalent();\r\n" +
						// "	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	}\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		// assertEquals(95.3, fitness, 0.1);
		assertEquals(89.8, fitness, 0.1); // after rating errors once per instance, not once per class

		IIndividual individualWithCorrectName = new Individual(new Program(
				"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						// "	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n"+
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n" +

						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.InitialState.ComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateIncludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						// "	targetTransition.Target = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						// "	targetTransition.Name = sourceTransition.ComplexStateMachine.InitialState.Name;\r\n"+
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +

						"}\r\n\r\n" +
						"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +

						// "	targetState.Incoming = sourceState.ComplexStateMachine.InitialState.Outgoing.equivalent();\r\n"+

						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +

						// "	targetTransition.Source = sourceTransition.Target.equivalent();\r\n"+
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +

						// "	targetTransition.Target = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +

						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsIncludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +

						// "	  		targetTransition.Target = sourceState.equivalent();\r\n"+
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +

						"	  		targetTransition.Source = sourceTransition.Target.equivalent();\r\n" +
						// "	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	}\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individualWithCorrectName, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitnessWithCorrectName = individualWithCorrectName.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		// assertEquals(96.3, fitnessWithCorrectName, 0.1);
		assertEquals(90.7, fitnessWithCorrectName, 0.1);// after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample13() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n" +
						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionIncludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +
						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsExcludingTargetAsCompositeStateIncludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" +
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		// assertEquals(94.4, fitness, 0.1);
		assertEquals(83.3, fitness, 0.1); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample13_WithImportantAssociations() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n" +
						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionIncludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +
						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsExcludingTargetAsCompositeStateIncludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" +
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallbackAndImportantAssociations());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		// assertEquals(89.6, fitness, 0.1);
		assertEquals(70.3, fitness, 0.1); // after rating errors once per instance, not once per class
	}

	@Test
	public void testEvaluateFitnessWithSample11_WithImportantAssociations() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionIncludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						// "	targetTransition.Name = sourceTransition.Target.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" + // ??
						// must be changed to:
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +

						// "	targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						// must be changed to:
						"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetTransition.Name = sourceTransition.Name;\r\n" +

						// missing:
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +

						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsExcludingTargetAsCompositeStateIncludingSourceAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
						"	}\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +

						// must be changed to:
						// "	targetSimpleStateMachine.Name = sourceComplexStateMachine.InitialState.Name;\r\n"+ // ??
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;" +

						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.InitialState.ComplexStateMachine.Transitions.equivalent();\r\n" +
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n" +
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallbackAndImportantAssociations());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		assertEquals(100, fitness, 0.);
	}

	@Test
	public void testEvaluateFitnessWithSample14_WithImportantAssociations_CountEachErrorBasedOnObjectsNotClasses() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"	targetState.SimpleStateMachine = sourceState.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateIncludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.ComplexStateMachine.Name;\r\n" +
						// "	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +

						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						//
						// "	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n" +
						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.InitialState.ComplexStateMachine.Transitions.equivalent();\r\n" +

						//
						// "	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n" + // NOT REQUIRED BECAUSE SOLVED VIA PARENT SETTTING IN STATE RULE

						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" +
						// "	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+

						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						// "	targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+

						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsIncludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.ComplexStateMachine.InitialState.Name;\r\n" + // THIS IS CORRECT IN THIS SPECFIC EXAMPLE!!
						// "	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.Target = sourceTransition.ComplexStateMachine.InitialState.equivalent();\r\n" +
						// "	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	}\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallbackAndImportantAssociations());
		double fitness = individual.getFitness();
		// assertEquals(94.81, fitness, 0.01);
		assertEquals(84.4, fitness, 0.1); // after rating errors once per instance, not once per class
		
		IIndividual individualWithOneErrorOfSameKindLess = new Individual(new Program(
				"rule State2State\r\n" +
						"	transform sourceState : Source!State\r\n" +
						"	to	  targetState : Target!State {\r\n" +
						"	\r\n" +
						"	targetState.Name = sourceState.Name;\r\n" +
						"	targetState.SimpleStateMachine = sourceState.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateIncludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						//"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.ComplexStateMachine.Name;\r\n" +
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +

						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						//
						// "	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +

						"	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n" +
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n" +
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n" +
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n" +
						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.InitialState.ComplexStateMachine.Transitions.equivalent();\r\n" +

						//
						// "	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n" + // NOT REQUIRED BECAUSE SOLVED VIA PARENT SETTTING IN STATE RULE

						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2TransitionExcludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransition : Target!Transition {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +

						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Source.ComplexStateMachine.Name;\r\n" +
						// "	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+

						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +

						// "	targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+

						"	targetTransition.SimpleStateMachine = sourceTransition.Source.ComplexStateMachine.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule Transition2ManyTransitionsIncludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n" +
						"	transform sourceTransition : Source!Transition\r\n" +
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
						"	       and sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
						"	\r\n" +
						"	for(sourceState in sourceTransition.Source.States) {\r\n" +
						"	  		var targetTransition = new Target!Transition;\r\n" +
						"	  		targetTransitions.add(targetTransition);\r\n" +
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.ComplexStateMachine.InitialState.Name;\r\n" + // THIS IS CORRECT IN THIS SPECFIC EXAMPLE!!
						// "	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+
						"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
						"	  		targetTransition.Target = sourceTransition.ComplexStateMachine.InitialState.equivalent();\r\n" +
						// "	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	}\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individualWithOneErrorOfSameKindLess, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallbackAndImportantAssociations());
		double fitnessWithOneErrorOfSameKindLess = individualWithOneErrorOfSameKindLess.getFitness();
		// assertEquals(94.81, fitness, 0.01);
		assertEquals(86.6, fitnessWithOneErrorOfSameKindLess, 0.1); // after rating errors once per instance, not once per class
	}
	
	@Test
	public void testEvaluateFitnessWithSample15_WithImportantAssociations() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule State2State\r\n"+
						"	transform sourceState : Source!State\r\n"+
						"	to	  targetState : Target!State {\r\n"+
						"	\r\n"+
						"	targetState.Name = sourceState.Name;\r\n"+
						"}\r\n\r\n"+
						"rule Transition2TransitionExcludingSourceAsCompositeStateIncludingTargetAsCompositeState\r\n"+
						"	transform sourceTransition : Source!Transition\r\n"+
						"	to	  targetTransition : Target!Transition {\r\n"+
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n"+
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+
						//"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n"+
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						//"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n"+
						"	targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n"+
						"}\r\n\r\n"+
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n"+
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n"+
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n"+
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n"+
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.States.equivalent();\r\n"+
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n"+
						"}\r\n\r\n"+
						"rule Transition2TransitionExcludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n"+
						"	transform sourceTransition : Source!Transition\r\n"+
						"	to	  targetTransition : Target!Transition {\r\n"+
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n"+
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n"+
						"}\r\n\r\n"+
						"rule Transition2ManyTransitionsIncludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n"+
						"	transform sourceTransition : Source!Transition\r\n"+
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n"+
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n"+
						"	       and sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	for(sourceState in sourceTransition.Source.States) {\r\n"+
						"	  		var targetTransition = new Target!Transition;\r\n"+
						"	  		targetTransitions.add(targetTransition);\r\n"+
						"	  		targetTransition.SimpleStateMachine = sourceState.ComplexStateMachine.equivalent();\r\n"+
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+
						"	  		targetTransition.Source = sourceState.equivalent();\r\n"+
						"	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	}\r\n"+
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallbackAndImportantAssociations());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		assertEquals(94.8, fitness, 0.1);
		
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness2 = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		assertEquals(97.2, fitness2, 0.1);
	}
	
	@Test
	public void testEvaluateFitnessWithSample16_WithImportantAssociations() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule Transition2TransitionExcludingSourceAsCompositeStateIncludingTargetAsCompositeState\r\n"+
						"	transform sourceTransition : Source!Transition\r\n"+
						"	to	  targetTransition : Target!Transition {\r\n"+
						"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n"+
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.Name = sourceTransition.ComplexStateMachine.InitialState.Name;\r\n"+
						//"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n"+
						"	targetTransition.SimpleStateMachine = sourceTransition.Source.CompositeState.equivalent();\r\n"+ 
						"	targetTransition.Target = sourceTransition.Source.CompositeState.equivalent();\r\n"+
						//"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n"+ // to be added, but last line must be also removed to keep (!) the fitness
						"}\r\n\r\n"+
						"rule ComplexStateMachine2SimpleStateMachineExcludingInitialStateAsCompositeState\r\n"+
						"	transform sourceComplexStateMachine : Source!ComplexStateMachine\r\n"+
						"	to	  targetSimpleStateMachine : Target!SimpleStateMachine {\r\n"+
						"	guard: not sourceComplexStateMachine.InitialState.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	targetSimpleStateMachine.Name = sourceComplexStateMachine.Name;\r\n"+
						"	targetSimpleStateMachine.Transitions = sourceComplexStateMachine.Transitions.equivalent();\r\n"+
						"	targetSimpleStateMachine.InitialState = sourceComplexStateMachine.InitialState.equivalent();\r\n"+
						"	targetSimpleStateMachine.States = sourceComplexStateMachine.InitialState.ComplexStateMachine.States.equivalent();\r\n"+
						"}\r\n\r\n"+
						"rule Transition2TransitionExcludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n"+
						"	transform sourceTransition : Source!Transition\r\n"+
						"	to	  targetTransition : Target!Transition {\r\n"+
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n"+
						"	       and not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	targetTransition.Name = sourceTransition.Target.Name + \" -> \" + sourceTransition.Source.Name;\r\n"+
						"	targetTransition.Source = sourceTransition.Target.equivalent();\r\n"+
						"	targetTransition.Target = sourceTransition.Source.equivalent();\r\n"+
						"	targetTransition.SimpleStateMachine = sourceTransition.Target.ComplexStateMachine.equivalent();\r\n"+
						"}\r\n\r\n"+
						"rule Transition2ManyTransitionsIncludingSourceAsCompositeStateExcludingTargetAsCompositeState\r\n"+
						"	transform sourceTransition : Source!Transition\r\n"+
						"	to	  targetTransitions : Sequence(Target!Transition) {\r\n"+
						"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n"+
						"	       and sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n"+
						"	\r\n"+
						"	for(sourceState in sourceTransition.Source.States) {\r\n"+
						"	  		var targetTransition = new Target!Transition;\r\n"+
						"	  		targetTransitions.add(targetTransition);\r\n"+
						"	  		targetTransition.SimpleStateMachine = sourceTransition.Source.equivalent();\r\n"+
						"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n"+
						"	  		targetTransition.Source = sourceState.equivalent();\r\n"+
						"	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n"+
						"	}\r\n"+
						"}\r\n\r\n"+
						"rule State2State\r\n"+
						"	transform sourceState : Source!State\r\n"+
						"	to	  targetState : Target!State {\r\n"+
						"	\r\n"+
						"	targetState.Name = sourceState.Name;\r\n"+
						"	targetState.Incoming = sourceState.ComplexStateMachine.InitialState.Outgoing.equivalent();\r\n"+ // to be removed
						"}\r\n\r\n"

				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallbackAndImportantAssociations());
		double fitness = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		assertEquals(97.7, fitness, 0.1);
		
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunctionFactory.createBalancedFitnessFunctionBasedOnStructureAsFallback());
		double fitness2 = individual.getFitness();
		// assertEquals(99.07, fitness, 0.01);
		assertEquals(99.07, fitness2, 0.1);
	}
}
