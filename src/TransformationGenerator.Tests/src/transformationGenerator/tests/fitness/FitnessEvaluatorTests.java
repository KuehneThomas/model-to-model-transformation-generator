package transformationGenerator.tests.fitness;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import transformationGenerator.fitness.functions.interfaces.IFitnessFunction;
import transformationGenerator.fitness.functions.interfaces.IFitnessFunctionFactory;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.main.InjectionConfiguration;
import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;

public class FitnessEvaluatorTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	ILogger logger;
	IPrettyPrinter prettyPrinter;
	IModelFactory modelFactory;
	IFitnessEvaluator fitnessEvaluator;
	URI outputMetaModelFile;
	IModel manuallyCreatedOutputModel;
	IFitnessFunction fitnessFunction;

	@Before
	public void setUp() throws Exception {
		logger = InjectionConfiguration.getInjector().getInstance(ILogger.class);
		logger.initialize(FitnessEvaluatorTests.class);

		modelFactory = InjectionConfiguration.getInjector().getInstance(IModelFactory.class);
		prettyPrinter = InjectionConfiguration.getInjector().getInstance(IPrettyPrinter.class);

		fitnessEvaluator = InjectionConfiguration.getInjector().getInstance(IFitnessEvaluator.class);
		IFitnessFunctionFactory fitnessFunctionFactory = InjectionConfiguration.getInjector().getInstance(IFitnessFunctionFactory.class);
		fitnessFunction = fitnessFunctionFactory.createBalancedFitnessFunction();
		
		outputMetaModelFile = new URI("file:../MetaModels.Relational/relationalMetaModel.ecore");
		URI manuallyCreatedOutputModelFile = new URI("file:../ExampleModels/relational/001_relational.model");

		manuallyCreatedOutputModel = modelFactory.cloneModel(modelFactory.loadModelByURI("Target", manuallyCreatedOutputModelFile, outputMetaModelFile, true, false));
	}

	private IModel loadTestOutputModel(String testFile) throws URISyntaxException, EolModelLoadingException, Exception {
		URI outputModelOfIndividualFile = new URI("file:../ExampleModels/relational/" + testFile);
		IModel outputModelOfIndividual = modelFactory.cloneModel(modelFactory.loadModelByURI("Target", outputModelOfIndividualFile, outputMetaModelFile, true, false));
		return outputModelOfIndividual;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEvaluateFitnessWithEqualModel() throws EolModelLoadingException, URISyntaxException, Exception {
		IModel outputModelOfIndividual = loadTestOutputModel("001_relational.model");

		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));
		logger.LogDebug("testEvaluateFitnessIModelIModel", "outputModelOfIndividual\n{}", prettyPrinter.ToStringRecursive(outputModelOfIndividual));

		double fitness = fitnessEvaluator.evaluateFitness(manuallyCreatedOutputModel, outputModelOfIndividual, fitnessFunction);

		assertEquals(100., fitness, 0.);
	}

	@Test
	public void testEvaluateFitnessMofClassNotMapped() throws EolModelLoadingException, URISyntaxException, Exception {
		IModel outputModelOfIndividual = loadTestOutputModel("001_relational_test_mofClass_notmapped.model");

		logger.LogDebug("testEvaluateFitnessIModelIModel", "manuallyCreatedOutputModel\n{}", prettyPrinter.ToStringRecursive(manuallyCreatedOutputModel));
		logger.LogDebug("testEvaluateFitnessIModelIModel", "outputModelOfIndividual\n{}", prettyPrinter.ToStringRecursive(outputModelOfIndividual));

		double fitness = fitnessEvaluator.evaluateFitness(manuallyCreatedOutputModel, outputModelOfIndividual, fitnessFunction);

		assertEquals(70., fitness, 1.);
	}

}
