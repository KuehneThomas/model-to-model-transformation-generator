package transformationGenerator.tests.mutation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.operators.AddPropertyPairMapping;
import transformationGenerator.mutation.operators.AddPropertyPairMappingMutationOption;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;
import etlMetaModel.EtlTransformationRule;

public class AddPropertyPairMappingToOneToManyOfSameKindRuleTests extends MutationOperatorTests {

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
		AddPropertyPairMapping addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator = mutationOperatorFactory.createAddPropertyPairMappingToOneToManyOfSameKindRule();

		List<IMutationOption> mutationOptions = addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		mutationOptions.stream()
				.forEach(mo -> {
					List<IMutationOption> duplicates = mutationOptions.stream().filter(mos -> mos != mo && ((AddPropertyPairMappingMutationOption) mo).getElement() != ((AddPropertyPairMappingMutationOption) mo).getElement() && mos.isOptionEquivalentTo(mo)).collect(Collectors.toList());
					if (duplicates.size() > 0) {
						System.out.println(mo + " has " + duplicates.size() + " duplicates");
					}
				});

		assertEquals(1434, mutationOptions.size()); // 19 -> 342 --> with Target1&2: 2052 --> 432 after depth limit of 2 --> 378 after exclusion of duplicate property ends --> 498 after bugfix --> after adding rule replacement & changing the test setup: 1500 --> after excluding elements which would
													// result in a source equivalent call: 1182 --> after adding properties allowed through guards: 1434
		for (IMutationOption mutationOption : mutationOptions) {
			assertEquals("EtlTransformationRule", mutationOption.getElement().eClass().getName());
		}
	}

	@Test
	public void testMutate() throws Exception {
		AddPropertyPairMapping addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator = mutationOperatorFactory.createAddPropertyPairMappingToOneToManyOfSameKindRule();
		List<IMutationOption> mutationOptions = addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		AddPropertyPairMappingMutationOption mutationOption = mutationOptions.stream()
				.map(mo -> (AddPropertyPairMappingMutationOption) mo)
				.filter(mo -> mo.getMofPropertyTarget1().getName().equals("Source") &&
						mo.getMofPropertyTarget2().getName().equals("Target") &&
						mo.toString().equals("SourceParameter1:\nCollectionProperty=null.null : State,CollectionPropertyChain=\n\nSourceParameter2:\nCollectionProperty=Transition.Target : State,CollectionPropertyChain=.Target")).findFirst().get();

		addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator.mutate(mutationOption);

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
				"	  		targetTransition.Name = sourceState.Name + \" -> \" + sourceTransition.Target.Name;\r\n" +
				"	  		targetTransition.Source = sourceState.equivalent();\r\n" +
				"	  		targetTransition.Target = sourceTransition.Target.equivalent();\r\n" +
				"	}\r\n" +
				"}\r\n\r\n";

		System.out.print(transformationInConcreteSyntax);

		assertTrue(transformationInConcreteSyntax.contains(expected));
	}

	@Test
	public void testMutate2() throws Exception {
		AddPropertyPairMapping addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator = mutationOperatorFactory.createAddPropertyPairMappingToOneToManyOfSameKindRule();
		List<IMutationOption> mutationOptions = addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator.getMutationOptions(transformationInAbtractSyntax);

//		List<AddPropertyPairMappingMutationOption> optionsFiltered1 = mutationOptions.stream()
//				.map(mo -> (AddPropertyPairMappingMutationOption) mo)
//				.filter(mo ->
//						((EtlTransformationRule) mo.getElement()).getName().equals("Transition2Transition")
//								&& ((EtlTransformationRule) mo.getElement()).getGuardName().equals("IncludingTargetAsCompositeStateExcludingSourceAsCompositeState")
//								&& mo.getMofPropertyTarget1().getName().equals("Source")
//								&& mo.getMofPropertyTarget2().getName().equals("Target")
//								&& mo.getSourceParameter1().toString().equals("CollectionProperty=Transition.Source : State,CollectionPropertyChain=.Source")
//				)
//				.collect(Collectors.toList());
		
		List<AddPropertyPairMappingMutationOption> optionsFiltered2 = mutationOptions.stream()
				.map(mo -> (AddPropertyPairMappingMutationOption) mo)
				.filter(mo ->
						((EtlTransformationRule) mo.getElement()).getName().equals("Transition2Transition")
								&& ((EtlTransformationRule) mo.getElement()).getGuardName().equals("IncludingTargetAsCompositeStateExcludingSourceAsCompositeState")
								&& mo.getMofPropertyTarget1().getName().equals("Source")
								&& mo.getMofPropertyTarget2().getName().equals("Target")
								&& mo.getSourceParameter1().toString().equals("CollectionProperty=Transition.Source : State,CollectionPropertyChain=.Source")
								&& mo.getSourceParameter2().toString().equals("CollectionProperty=CompositeState.InitialState : State,CollectionPropertyChain=.Target.InitialState")
				)
				.collect(Collectors.toList());		

		AddPropertyPairMappingMutationOption mutationOption = optionsFiltered2.get(0);

		addPropertyPairMappingToOneToManyOfSameKindRuleMutationOperator.mutate(mutationOption);

		IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, transformationInAbtractSyntax);
		String transformationInConcreteSyntax = (String) eglExecuter.execute();
		eglExecuter.dispose();

		String expected = "rule Transition2TransitionIncludingTargetAsCompositeStateExcludingSourceAsCompositeState\r\n" +
				"	transform sourceTransition : Source!Transition\r\n" +
				"	to	  targetTransition : Target!Transition {\r\n" +
				"	guard: not sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
				"	       and sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
				"	\r\n" +
				"	targetTransition.Name = sourceTransition.Source.Name + \" -> \" + sourceTransition.Target.InitialState.Name;\r\n" +
				"	targetTransition.Source = sourceTransition.Source.equivalent();\r\n" +
				"	targetTransition.Target = sourceTransition.Target.InitialState.equivalent();\r\n" +
				// "	targetTransition.SimpleStateMachine = sourceTransition.ComplexStateMachine.equivalent();\r\n" +
				"}\r\n\r\n";

		System.out.print(transformationInConcreteSyntax);

		assertTrue(transformationInConcreteSyntax.contains(expected));
	}

}