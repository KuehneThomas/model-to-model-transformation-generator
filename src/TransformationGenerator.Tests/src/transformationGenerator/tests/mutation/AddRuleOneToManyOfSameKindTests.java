package transformationGenerator.tests.mutation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAttribute;
import org.junit.Before;
import org.junit.Test;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.operators.AddRuleOneToManyOfSameKind;
import transformationGenerator.mutation.operators.AddRuleOneToManyOfSameKindMutationOption;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;

public class AddRuleOneToManyOfSameKindTests extends MutationOperatorTests {

	@Before
	public void setUp() throws Exception {
		setUp(TransformationScenario.ComplexStateMachine2SimpleStateMachine, /* transformationModelFileIsEmpty: */true);

		SplitRuleAndAddGuardsForSuperclassesTests splitRuleAndAddGuardsForSuperclassesTests = new SplitRuleAndAddGuardsForSuperclassesTests();
		splitRuleAndAddGuardsForSuperclassesTests.setUp();
		splitRuleAndAddGuardsForSuperclassesTests.testMutate();
		transformationInAbtractSyntax = splitRuleAndAddGuardsForSuperclassesTests.transformationInAbtractSyntax;
	}

	@Test
	public void testGetMutationOptions() throws Exception {
		AddRuleOneToManyOfSameKind addRuleOneToManyOfSameKindMutationOperator = mutationOperatorFactory.createAddRuleOneToManyOfSameKindMutationOperator();

		List<IMutationOption> mutationOptions = addRuleOneToManyOfSameKindMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		List<IMutationOption> mutationOptionsWithoutExistingTransformationRule = mutationOptions.stream().map(mo -> (AddRuleOneToManyOfSameKindMutationOption) mo)
				.filter(mo -> mo.getExistingTransformationRule() == null)
				.collect(Collectors.toList());
		
		List<IMutationOption> mutationOptionsWithExistingTransformationRule = mutationOptions.stream().map(mo -> (AddRuleOneToManyOfSameKindMutationOption) mo)
				.filter(mo -> mo.getExistingTransformationRule() != null)
				.collect(Collectors.toList());
		
		assertEquals(54, mutationOptionsWithoutExistingTransformationRule.size());
		assertEquals(26, mutationOptionsWithExistingTransformationRule.size()); //--> after fixing guard usage: 26
		assertEquals(80, mutationOptions.size()); // 735 -> 159 after depth limit of 1 + collection = 2 --> after removing superclasses: 129 --> after adding rule replacement: 114 .... --> after fixing guard usage: 80

		
		for (IMutationOption mutationOption : mutationOptions) {
			assertEquals("EtlModule", mutationOption.getElement().eClass().getName());
		}
	}

	@Test
	public void testMutate() throws Exception {
		AddRuleOneToManyOfSameKind addRuleOneToManyOfSameKindMutationOperator = mutationOperatorFactory.createAddRuleOneToManyOfSameKindMutationOperator();
		List<IMutationOption> mutationOptions = addRuleOneToManyOfSameKindMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		List<AddRuleOneToManyOfSameKindMutationOption> mutationOptionsWithStates = mutationOptions.stream().map(mo -> (AddRuleOneToManyOfSameKindMutationOption) mo)
				.filter(mo -> mo.getSelectedMofClassSource().getName().equals("Transition") &&
						mo.getSelectedMofClassTarget().getName().equals("Transition")) // CompositeState.States : State
				.collect(Collectors.toList());

		assertEquals(26, mutationOptionsWithStates.size()); // 12 --> after removing superclasses: 10 --> after adding rule replacement: 48 -> exclude chains ending in source: 28 --> after fixing guard usage: 26

		AddRuleOneToManyOfSameKindMutationOption mutationOption = mutationOptionsWithStates.stream()
				.filter(mo -> mo.toString()
						.equals("Source=Transition,Target=Transition,CollectionProperty=CompositeState.States : State,CollectionPropertyChain=.Source.States")).findFirst().get();

		EAttribute nameAttribute = ((AddRuleOneToManyOfSameKindMutationOption) mutationOption).getSelectedMofClassSource().eClass().getEAllAttributes().get(0);
		assertEquals("Transition", ((AddRuleOneToManyOfSameKindMutationOption) mutationOption).getSelectedMofClassSource().eGet(nameAttribute));
		assertEquals("Transition", ((AddRuleOneToManyOfSameKindMutationOption) mutationOption).getSelectedMofClassTarget().eGet(nameAttribute));

		addRuleOneToManyOfSameKindMutationOperator.mutate(mutationOption);

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
				"	}\r\n" +
				"}\r\n\r\n";

		System.out.print(transformationInConcreteSyntax);

		assertTrue(transformationInConcreteSyntax.contains(expected));
	}

}