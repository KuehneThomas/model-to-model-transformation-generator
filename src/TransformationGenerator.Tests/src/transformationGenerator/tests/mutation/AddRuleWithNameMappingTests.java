package transformationGenerator.tests.mutation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.operators.AddRuleWithNameMapping;
import transformationGenerator.mutation.operators.AddRuleWithNameMappingMutationOption;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;

public class AddRuleWithNameMappingTests extends MutationOperatorTests {

	@Before
	public void setUp() throws Exception {
		setUp(TransformationScenario.UmlClass2Relational, /* transformationModelFileIsEmpty: */true);
	}

	@Test
	public void testGetMutationOptions() throws Exception {
		AddRuleWithNameMapping addRuleWithNameMappingMutationOperator = mutationOperatorFactory.createAddRuleWithNameMappingMutationOperator();

		List<IMutationOption> mutationOptions = addRuleWithNameMappingMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		assertEquals(9, mutationOptions.size());
		for (IMutationOption mutationOption : mutationOptions) {
			assertEquals("EtlModule", mutationOption.getElement().eClass().getName());
		}
	}

	@Test
	public void testMutate() throws Exception {
		AddRuleWithNameMapping addRuleWithNameMappingMutationOperator = mutationOperatorFactory.createAddRuleWithNameMappingMutationOperator();
		List<IMutationOption> mutationOptions = addRuleWithNameMappingMutationOperator.getMutationOptions(transformationInAbtractSyntax);
		assertEquals(9, mutationOptions.size());
		
		IMutationOption mutationOption = mutationOptions.get(0);

		assertEquals("UmlPackage", ((AddRuleWithNameMappingMutationOption) mutationOption).getSelectedMofClassSource().getName());
		assertEquals("RelationalSchema", ((AddRuleWithNameMappingMutationOption) mutationOption).getSelectedMofClassTarget().getName());

		addRuleWithNameMappingMutationOperator.mutate(mutationOption);

		IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, transformationInAbtractSyntax);
		String transformationInConcreteSyntax = (String) eglExecuter.execute();
		eglExecuter.dispose();

		String expected = "rule UmlPackage2RelationalSchema\r\n" +
				"	transform sourceUmlPackage : Source!UmlPackage\r\n" +
				"	to	  targetRelationalSchema : Target!RelationalSchema {\r\n" +
				"	\r\n" +
				"	targetRelationalSchema.Name = sourceUmlPackage.Name;\r\n" +
				"}\r\n\r\n";
		
		System.out.print(transformationInConcreteSyntax);

		assertEquals(expected, transformationInConcreteSyntax);
		
		AddRuleWithNameMapping addRuleWithNameMappingMutationOperator2 = mutationOperatorFactory.createAddRuleWithNameMappingMutationOperator();
		List<IMutationOption> mutationOptions2 = addRuleWithNameMappingMutationOperator2.getMutationOptions(transformationInAbtractSyntax);
		
		assertEquals(4, mutationOptions2.size());
	
	}

}
