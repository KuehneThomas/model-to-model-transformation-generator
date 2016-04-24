package transformationGenerator.tests.mutation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.operators.AddPropertyMapping;
import transformationGenerator.mutation.operators.AddPropertyMappingMutationOption;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;

public class AddPropertyMappingInForLoopTests extends MutationOperatorTests {

	@Before
	public void setUp() throws Exception {
		setUp(TransformationScenario.ComplexStateMachine2SimpleStateMachine, /* transformationModelFileIsEmpty: */true);

		AddRuleOneToManyOfSameKindTests addRuleOneToManyOfSameKindTests = new AddRuleOneToManyOfSameKindTests();
		addRuleOneToManyOfSameKindTests.setUp();
		addRuleOneToManyOfSameKindTests.testMutate();
		transformationInAbtractSyntax = addRuleOneToManyOfSameKindTests.transformationInAbtractSyntax;
	}

	@Test
	public void testGetMutationOptions() throws Exception {
		AddPropertyMapping addPropertyMapping = mutationOperatorFactory.createAddPropertyMappingMutationOperator();

		List<IMutationOption> mutationOptions = addPropertyMapping.getMutationOptions(transformationInAbtractSyntax);
		// mutationOptions.sort((a, b) -> a.toString().compareTo(b.toString()));
		// for (IMutationOption mutationOption : mutationOptions) {
		// System.out.println(mutationOption);
		// }

		assertEquals(172, mutationOptions.size()); // 29 -> 240 after considering property chains with depth limit 2 --> 268 after also including Name properties (again) --> 73 after excluding collection to normal property mappings --> 48 after excluding source chains using the source property -->
													// 72 after bugfix after adding rule replacement & changing the test setup: 156 --> after adding properties allowed through guards: 172
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
				.filter(mo -> 
						mo.getEolFor() != null &&
						mo.getSelectedMofPropertyTarget().getName().equals("SimpleStateMachine") &&
						mo.getSelectedChainedPropertySource().getMofProperty().getName().equals("ComplexStateMachine") &&
						mo.getSelectedChainedPropertySourceList().size() == 1).findFirst().get();

		addPropertyMapping.mutate(mutationOption);

		IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, transformationInAbtractSyntax);
		String transformationInConcreteSyntax = (String) eglExecuter.execute();
		eglExecuter.dispose();

		String expected = "rule Transition2ManyTransitionsIncludingTargetAsCompositeStateIncludingSourceAsCompositeState\r\n" +
				"	transform sourceTransition : Source!Transition\r\n" +
				"	to	  targetTransitions : Sequence(Target!Transition) {\r\n" +
				"	guard: sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
				"	       and sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
				"	\r\n" +
				"	for(sourceState in sourceTransition.Source.States) {\r\n" +
				"	  		var targetTransition = new Target!Transition;\r\n" +
				"	  		targetTransitions.add(targetTransition);\r\n" +
				"	  		targetTransitions.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
				"	}\r\n" +
				"}\r\n\r\n";

		System.out.print(transformationInConcreteSyntax);

		assertTrue(transformationInConcreteSyntax.contains(expected));
	}

}