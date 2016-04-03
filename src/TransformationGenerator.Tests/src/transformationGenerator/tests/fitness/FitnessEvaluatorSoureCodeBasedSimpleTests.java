package transformationGenerator.tests.fitness;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
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

public class FitnessEvaluatorSoureCodeBasedSimpleTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	ILogger logger;
	IPrettyPrinter prettyPrinter;
	IFitnessEvaluator fitnessEvaluator;
	List<ManuallyCreatedExampleModelPair> manuallyCreatedExampleModelPairs;
	IModel manuallyCreatedOutputModel;
	IFitnessFunction fitnessFunction;

	@SuppressWarnings("serial")
	@Before
	public void setUp() throws Exception {
		URI inputMetaModelFile = new URI("file:../MetaModels.UmlClass/umlClassMetaModel.ecore");
		URI outputMetaModelFile = new URI("file:../MetaModels.Relational/relationalMetaModel.ecore");
		manuallyCreatedExampleModelPairs = new ArrayList<ManuallyCreatedExampleModelPair>() {
			{
				add(new ManuallyCreatedExampleModelPair(new URI("file:../ExampleModels/umlClass/001_umlClass.model"), new URI("file:../ExampleModels/relational/001_relational.model")));
			}
		};
		URI emptyOutputFile = new URI("file:../ExampleModels/relational/001_relational_generated.model");

		ISelectionAndReplicationAlgorithmFactory selectionAndReplicationAlgorithmFactory = InjectionConfiguration.getInjector().getInstance(ISelectionAndReplicationAlgorithmFactory.class);
		ITransformationGenerationOrchestratorFactory transformationGenerationOrchestratorFactory = InjectionConfiguration.getInjector().getInstance(ITransformationGenerationOrchestratorFactory.class);
		IFitnessFunctionFactory fitnessFunctionFactory = InjectionConfiguration.getInjector().getInstance(IFitnessFunctionFactory.class);
		fitnessFunction = fitnessFunctionFactory.createBalancedFitnessFunction();
		IMutationStrategyFactory mutationStrategyFactory = InjectionConfiguration.getInjector().getInstance(IMutationStrategyFactory.class);
		IMutationStrategy mutationStrategy = mutationStrategyFactory.createSelectOperatorFirstAndThenAnOption();
		TransformationGenerationOrchestrator transformationGenerationOrchestrator = transformationGenerationOrchestratorFactory.create(selectionAndReplicationAlgorithmFactory.createNaiveMaximumSelectionPressureAlgorithm(0, 0.), fitnessFunction, mutationStrategy, 0, 0);
		manuallyCreatedOutputModel = transformationGenerationOrchestrator.loadModels(inputMetaModelFile, outputMetaModelFile, manuallyCreatedExampleModelPairs, emptyOutputFile);

		logger = InjectionConfiguration.getInjector().getInstance(ILogger.class);
		logger.initialize(FitnessEvaluatorSoureCodeBasedSimpleTests.class);

		prettyPrinter = InjectionConfiguration.getInjector().getInstance(IPrettyPrinter.class);

		fitnessEvaluator = InjectionConfiguration.getInjector().getInstance(IFitnessEvaluator.class);
	}

	@Test
	public void testEvaluateFitnessWithSample1() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule UmlClass2RelationalTable\r\n" +
						"	transform sourceUmlClass : Source!UmlClass\r\n" +
						"	to	  targetRelationalTable : Target!RelationalTable {\r\n" +
						"		\r\n" +
						"	targetRelationalTable.Name = sourceUmlClass.Name;\r\n" +
						"	targetRelationalTable.ForeignKeys = sourceUmlClass.outgoingRelations.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule UmlAssociation2RelationalForeignKey\r\n" +
						"	transform sourceUmlAssociation : Source!UmlAssociation\r\n" +
						"	to	  targetRelationalForeignKey : Target!RelationalForeignKey {\r\n" +
						"	\r\n" +
						"	targetRelationalForeignKey.Name = sourceUmlAssociation.Name;\r\n" +
						"	targetRelationalForeignKey.ReferencedTable = sourceUmlAssociation.Target.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule UmlPackage2RelationalSchema\r\n" +
						"	transform sourceUmlPackage : Source!UmlPackage\r\n" +
						"	to	  targetRelationalSchema : Target!RelationalSchema {\r\n" +
						"	\r\n" +
						"	targetRelationalSchema.Name = sourceUmlPackage.Name;\r\n" +
						"	targetRelationalSchema.Tables = sourceUmlPackage.Classes.equivalent();\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		assertEquals(100., fitness, 1.);
	}

	@Test
	public void testEvaluateFitnessWithSample2() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule UmlPackage2RelationalSchema\r\n" +
						"  	transform umlPackage : Source!UmlPackage\r\n" +
						"  	to relationalSchema : Target!RelationalSchema {\r\n" +
						"\r\n" +
						"  	relationalSchema.Name = umlPackage.Name;\r\n" +
						"}\r\n" +
						"\r\n" +
						"rule UmlClass2RelationalTable \r\n" +
						"	transform umlClass : Source!UmlClass\r\n" +
						"	to relationalTable : Target!RelationalTable {\r\n" +
						"\r\n" +
						"	relationalTable.Name = umlClass.Name;\r\n" +
						"	relationalTable.Schema = umlClass.Package.equivalent();\r\n" +
						"}\r\n" +
						"\r\n" +
						"rule UmlAssociation2RelationalForeignKey\r\n" +
						"	transform umlAssociation : Source!UmlAssociation\r\n" +
						"	to relationalForeignKey : Target!RelationalForeignKey {\r\n" +
						"\r\n" +
						"	relationalForeignKey.Name = umlAssociation.Name;\r\n" +
						"	relationalForeignKey.OwnedByTable = umlAssociation.Source.equivalent();\r\n" +
						"	relationalForeignKey.ReferencedTable = umlAssociation.Target.equivalent();	\r\n" +
						"}\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		assertEquals(100., fitness, 1.);
	}

	@Test
	public void testEvaluateFitnessWithSample3() throws EolModelLoadingException, URISyntaxException, Exception {
		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));

		IIndividual individual = new Individual(new Program(
				"rule UmlAssociation2RelationalForeignKey\r\n" +
						"	transform sourceUmlAssociation : Source!UmlAssociation\r\n" +
						"	to	  targetRelationalForeignKey : Target!RelationalForeignKey {\r\n" +
						"	\r\n" +
						"	targetRelationalForeignKey.Name = sourceUmlAssociation.Name;\r\n" +
						"	targetRelationalForeignKey.ReferencedTable = sourceUmlAssociation.Target.equivalent();\r\n" +
						"}\r\n\r\n" +
						"rule UmlClass2RelationalTable\r\n" +
						"	transform sourceUmlClass : Source!UmlClass\r\n" +
						"	to	  targetRelationalTable : Target!RelationalTable {\r\n" +
						"	\r\n" +
						"	targetRelationalTable.Name = sourceUmlClass.Name;\r\n" +
						"}\r\n\r\n" +
						"rule UmlPackage2RelationalSchema\r\n" +
						"	transform sourceUmlPackage : Source!UmlPackage\r\n" +
						"	to	  targetRelationalSchema : Target!RelationalSchema {\r\n" +
						"	\r\n" +
						"	targetRelationalSchema.Name = sourceUmlPackage.Name;\r\n" +
						"}\r\n\r\n"
				));
		fitnessEvaluator.evaluateFitness(individual, manuallyCreatedExampleModelPairs, manuallyCreatedOutputModel, fitnessFunction);
		double fitness = individual.getFitness();
		assertEquals(92.3, fitness, 1.); // 94.8 before each error was rated once per instance, not per class
	}
}
