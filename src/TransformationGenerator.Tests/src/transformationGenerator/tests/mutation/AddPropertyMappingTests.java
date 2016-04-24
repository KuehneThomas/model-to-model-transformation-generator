package transformationGenerator.tests.mutation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.operators.AddPropertyMapping;
import transformationGenerator.mutation.operators.AddPropertyMappingMutationOption;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;

public class AddPropertyMappingTests extends MutationOperatorTests {

	@Before
	public void setUp() throws Exception {
		setUp(TransformationScenario.UmlClass2Relational, /* transformationModelFileIsEmpty: */false);
	}

	@Test
	public void testGetMutationOptions() throws Exception {
		AddPropertyMapping addPropertyMapping = mutationOperatorFactory.createAddPropertyMappingMutationOperator();

		List<IMutationOption> mutationOptions = addPropertyMapping.getMutationOptions(transformationInAbtractSyntax);

		assertEquals(20, mutationOptions.size());
		for (IMutationOption mutationOption : mutationOptions) {
			assertEquals("EtlTransformationRule", mutationOption.getElement().eClass().getName());
		}
	}

	@Test
	public void testMutate() throws Exception {
		AddPropertyMapping addPropertyMapping = mutationOperatorFactory.createAddPropertyMappingMutationOperator();
		List<IMutationOption> mutationOptions = addPropertyMapping.getMutationOptions(transformationInAbtractSyntax);
		
		AddPropertyMappingMutationOption mutationOption = mutationOptions.stream()
				.map(mo -> (AddPropertyMappingMutationOption) mo)
				.filter(mo -> mo.getSelectedMofPropertyTarget().getName().equals("Tables") &&
						mo.getSelectedChainedPropertySource().getMofProperty().getName().equals("Classes")).findFirst().get();

		addPropertyMapping.mutate(mutationOption);

		IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, transformationInAbtractSyntax);
		String transformationInConcreteSyntax = (String) eglExecuter.execute();
		eglExecuter.dispose();

		String expected = "rule UmlPackage2RelationalSchema\r\n" +
				"	transform umlPackage : Source!UmlPackage\r\n" +
				"	to	  relationalSchema : Target!RelationalSchema {\r\n" +
				"	\r\n" +
				"	umlPackage.Name = relationalSchema.Name;\r\n" +
				"	relationalSchema.Tables = umlPackage.Classes.equivalent();\r\n" +
				"}\r\n\r\n";

		System.out.print(transformationInConcreteSyntax);

		assertTrue(transformationInConcreteSyntax.startsWith(expected));
	}

}