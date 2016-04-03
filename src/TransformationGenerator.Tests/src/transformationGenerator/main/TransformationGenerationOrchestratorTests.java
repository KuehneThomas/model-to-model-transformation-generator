package transformationGenerator.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunctionFactory;
import transformationGenerator.main.interfaces.ITransformationGenerationOrchestrator;
import transformationGenerator.main.interfaces.ITransformationGenerationOrchestratorFactory;
import transformationGenerator.mutation.interfaces.IMutationStrategyFactory;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.selectionAndReproduction.interfaces.ISelectionAndReplicationAlgorithmFactory;

import com.google.inject.Injector;

public class TransformationGenerationOrchestratorTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void testGenerateSimple() throws Exception {
		Injector injector = InjectionConfiguration.getInjector();
		ISelectionAndReplicationAlgorithmFactory selectionAndReplicationAlgorithmFactory = injector.getInstance(ISelectionAndReplicationAlgorithmFactory.class);
		ITransformationGenerationOrchestratorFactory transformationGenerationOrchestratorFactory = injector.getInstance(ITransformationGenerationOrchestratorFactory.class);
		IFitnessFunctionFactory fitnessFunctionFactory = injector.getInstance(IFitnessFunctionFactory.class);
		IMutationStrategyFactory mutationStrategyFactory = injector.getInstance(IMutationStrategyFactory.class);

		ITransformationGenerationOrchestrator transformationGenerationOrchestrator = transformationGenerationOrchestratorFactory.create(
				/* selectionAndReplicationAlgorithm */selectionAndReplicationAlgorithmFactory.createNaiveMaximumSelectionPressureAlgorithm(
						/* minimumPopulationSize */10,
						/* badFitnessIsBelow */2.),
				/* fitnessFunction */ fitnessFunctionFactory.createBalancedFitnessFunction(),
				/* mutationStrategy */ mutationStrategyFactory.createSelectOperatorFirstAndThenAnOption(),
				/* maximumPopulationSize */100,
				/* maximumNumberOfGenerations */50);
		
		URI inputMetaModelFile = new URI("file:../MetaModels.UmlClass/umlClassMetaModel.ecore");
		URI outputMetaModelFile = new URI("file:../MetaModels.Relational/relationalMetaModel.ecore");
		@SuppressWarnings("serial")
		List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs = new ArrayList<ManuallyCreatedExampleModelPair>() {
			{
				add(new ManuallyCreatedExampleModelPair(new URI("file:../ExampleModels/umlClass/001_umlClass.model"), new URI("file:../ExampleModels/relational/001_relational.model")));
			}
		};
		URI emptyOutputFile = new URI("file:../ExampleModels/relational/001_relational_generated.model");
		URI sourceAndTargetMetaModelInAbstractSyntax = new URI("file:../ExampleModels/etl/001_umlclass2relational_generated.model");

		IIndividual individual = transformationGenerationOrchestrator.generate(inputMetaModelFile, outputMetaModelFile, manuallyCreatedExampleModelPairs, emptyOutputFile, sourceAndTargetMetaModelInAbstractSyntax);

		assertTrue("Individual was not identified within 7 generations!", individual.getGeneration() <= 7);
		assertEquals("Individual has not 100% fitness!", 100., individual.getFitness(), 0.);
	}
	
	//@Test
	public void testGenerateComplex() throws Exception {
		Injector injector = InjectionConfiguration.getInjector();
		ISelectionAndReplicationAlgorithmFactory selectionAndReplicationAlgorithmFactory = injector.getInstance(ISelectionAndReplicationAlgorithmFactory.class);
		ITransformationGenerationOrchestratorFactory transformationGenerationOrchestratorFactory = injector.getInstance(ITransformationGenerationOrchestratorFactory.class);
		IFitnessFunctionFactory fitnessFunctionFactory = injector.getInstance(IFitnessFunctionFactory.class);
		IMutationStrategyFactory mutationStrategyFactory = injector.getInstance(IMutationStrategyFactory.class);

		ITransformationGenerationOrchestrator transformationGenerationOrchestrator = transformationGenerationOrchestratorFactory.create(
				/* selectionAndReplicationAlgorithm */selectionAndReplicationAlgorithmFactory.createNaiveMaximumSelectionPressureAlgorithm(
						/* minimumPopulationSize */10,
						/* badFitnessIsBelow */2.),
				/* fitnessFunction */ fitnessFunctionFactory.createBalancedFitnessFunction(),
				/* mutationStrategy */ mutationStrategyFactory.createSelectOperatorFirstAndThenAnOption(),
				/* maximumPopulationSize */100,
				/* maximumNumberOfGenerations */5);
		
		URI inputMetaModelFile = new URI("file:../MetaModels.ComplexStateMachine/complexStateMachineMetaModel.ecore");
		URI outputMetaModelFile = new URI("file:../MetaModels.SimpleStateMachine/simpleStateMachineMetaModel.ecore");
		@SuppressWarnings("serial")
		List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs = new ArrayList<ManuallyCreatedExampleModelPair>() {
			{
				add(new ManuallyCreatedExampleModelPair(new URI("file:../ExampleModels/complexStateMachine/002_complexStateMachine.model"), new URI("file:../ExampleModels/simpleStateMachine/002_simpleStateMachine.model")));
			}
		};
		URI emptyOutputFile = new URI("file:../ExampleModels/relational/001_relational_generated.model");
		URI sourceAndTargetMetaModelInAbstractSyntax = new URI("file:../ExampleModels/etl/002_complexStateMachine2simpleStateMachine.model");	

		IIndividual individual = transformationGenerationOrchestrator.generate(inputMetaModelFile, outputMetaModelFile, manuallyCreatedExampleModelPairs, emptyOutputFile, sourceAndTargetMetaModelInAbstractSyntax);

		//DoubleSummaryStatistics populationStatistics = individual.getPopulation().getIndividuals().stream().mapToDouble(i -> i.getFitness()).summaryStatistics();
		
		//assertTrue("Individual was not identified within 7 generations!", individual.getGeneration() <= 7);
		assertEquals("Individual has not 100% fitness!", 100., individual.getFitness(), 0.);
	}

}
