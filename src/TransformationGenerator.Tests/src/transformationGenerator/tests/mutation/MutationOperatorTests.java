package transformationGenerator.tests.mutation;

import java.net.URI;

import org.eclipse.epsilon.eol.models.IModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import transformationGenerator.main.InjectionConfiguration;
import transformationGenerator.mutation.interfaces.IMutationOperatorFactory;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IResourceReader;
import common.util.interfaces.IStringResource;

import epsilonExecuter.executers.egl.interfaces.IEglExecuterFactory;

public abstract class MutationOperatorTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	IModel transformationInAbtractSyntax;
	IMutationOperatorFactory mutationOperatorFactory;
	IStringResource etl2TextSource;
	IEglExecuterFactory eglExecuterFactory;
	IPrettyPrinter prettyPrinter;
	IModelFactory modelFactory;

	public void setUp(TransformationScenario transformationScenario, Boolean transformationModelFileIsEmpty) throws Exception {
		URI transformationModelFile = getTransformationModelFile(transformationScenario, transformationModelFileIsEmpty);
		IResourceReader resourceReader = InjectionConfiguration.getInjector().getInstance(IResourceReader.class);
		URI transformationAbtractSyntaxMetaModel = resourceReader.getJarResourceAsUri("resources/etlMetaModel.ecore");
		modelFactory = InjectionConfiguration.getInjector().getInstance(IModelFactory.class);

		transformationInAbtractSyntax = modelFactory.loadModelByURI("Model", transformationModelFile, transformationAbtractSyntaxMetaModel, true, false);

		mutationOperatorFactory = InjectionConfiguration.getInjector().getInstance(IMutationOperatorFactory.class);

		etl2TextSource = resourceReader.getJarResourceAsStringResource("resources/etl2text.egl");
		eglExecuterFactory = InjectionConfiguration.getInjector().getInstance(IEglExecuterFactory.class);

		prettyPrinter = InjectionConfiguration.getInjector().getInstance(IPrettyPrinter.class);
	}

	public URI getTransformationModelFile(TransformationScenario transformationScenario, Boolean transformationModelFileIsEmpty) throws Exception {
		switch (transformationScenario) {
		case UmlClass2Relational:
			return transformationModelFileIsEmpty ? new URI("file:../ExampleModels/etl/001_umlclass2relational_generated.model") : new URI("file:../ExampleModels/etl/001_umlclass2relational.model");
		case ComplexStateMachine2SimpleStateMachine:
			return transformationModelFileIsEmpty ? new URI("file:../ExampleModels/etl/002_complexStateMachine2simpleStateMachine_generated.model") : new URI("file:../ExampleModels/etl/002_complexStateMachine2simpleStateMachine.model");
		default:
			throw new Exception("Scenario not defined");
		}

	}

	@After
	public void tearDown() throws Exception {
		if (transformationInAbtractSyntax != null) {
			transformationInAbtractSyntax.dispose();
		}
	}

	public enum TransformationScenario {
		UmlClass2Relational,
		ComplexStateMachine2SimpleStateMachine
	}

}
