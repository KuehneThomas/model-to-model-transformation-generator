package transformationGenerator.tests.mutation;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.operators.AddRuleWithNameMapping;
import transformationGenerator.mutation.operators.AddRuleWithNameMappingMutationOption;
import transformationGenerator.mutation.operators.SplitRuleAndAddGuardsForSuperclasses;
import transformationGenerator.mutation.operators.SplitRuleAndAddGuardsForSuperclassesMutationOption;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;
import etlMetaModel.EtlModule;

public class SplitRuleAndAddGuardsForSuperclassesTests extends MutationOperatorTests {

	@Before
	public void setUp() throws Exception {
		setUp(TransformationScenario.ComplexStateMachine2SimpleStateMachine, /* transformationModelFileIsEmpty: */true);

		AddRuleWithNameMapping addRuleWithNameMappingMutationOperator = mutationOperatorFactory.createAddRuleWithNameMappingMutationOperator();
		List<IMutationOption> mutationOptions = addRuleWithNameMappingMutationOperator.getMutationOptions(transformationInAbtractSyntax);
		assertEquals(12, mutationOptions.size());

		IMutationOption mutationOption = mutationOptions.stream()
				.map(o -> (AddRuleWithNameMappingMutationOption) o)
				.filter(o -> o.getSelectedMofClassSource().getName().equals("Transition") && o.getSelectedMofClassTarget().getName().equals("Transition"))
				.findFirst()
				.get();

		addRuleWithNameMappingMutationOperator.mutate(mutationOption);
	}

	@Test
	public void testGetMutationOptions() throws Exception {
		SplitRuleAndAddGuardsForSuperclasses splitRuleAndAddGuardsForSuperclassesMutationOperator = mutationOperatorFactory.createSplitRuleAndAddGuardsForSuperclasses();
		List<IMutationOption> mutationOptions = splitRuleAndAddGuardsForSuperclassesMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		assertEquals(2, mutationOptions.size());
		for (IMutationOption mutationOption : mutationOptions) {
			assertEquals("EtlModule", mutationOption.getElement().eClass().getName());
		}
	}

	@Test
	public void testMutate() throws Exception {
		SplitRuleAndAddGuardsForSuperclasses splitRuleAndAddGuardsForSuperclassesMutationOperator = mutationOperatorFactory.createSplitRuleAndAddGuardsForSuperclasses();
		List<IMutationOption> mutationOptions = splitRuleAndAddGuardsForSuperclassesMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		SplitRuleAndAddGuardsForSuperclassesMutationOption mutationOption = mutationOptions.stream()
				.map(mo -> (SplitRuleAndAddGuardsForSuperclassesMutationOption) mo)
				.filter(mo -> mo.getMofPropertyToBeGuarded().getName().equals("Target") && mo.getSuperClassToBeGuarded().getName().equals("CompositeState"))
				.findFirst().get();

		splitRuleAndAddGuardsForSuperclassesMutationOperator.mutate(mutationOption);

		IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, transformationInAbtractSyntax);
		String transformationInConcreteSyntax = (String) eglExecuter.execute();
		eglExecuter.dispose();

		String expected = "rule Transition2TransitionIncludingTargetAsCompositeState\r\n" +
				"	transform sourceTransition : Source!Transition\r\n" +
				"	to	  targetTransition : Target!Transition {\r\n" +
				"	guard: sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
				"	\r\n" +
				"	targetTransition.Name = sourceTransition.Name;\r\n" +
				"}\r\n\r\n" +
				"rule Transition2TransitionExcludingTargetAsCompositeState\r\n" +
				"	transform sourceTransition : Source!Transition\r\n" +
				"	to	  targetTransition : Target!Transition {\r\n" +
				"	guard: not sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
				"	\r\n" +
				"	targetTransition.Name = sourceTransition.Name;\r\n" +
				"}\r\n\r\n";

		// System.out.println(expected);

		System.out.println(transformationInConcreteSyntax);

		assertEquals(expected, transformationInConcreteSyntax);

		// check if option is now removed:
		List<IMutationOption> mutationOptions2 = splitRuleAndAddGuardsForSuperclassesMutationOperator.getMutationOptions(transformationInAbtractSyntax);
		assertEquals(1, mutationOptions2.size());

		Optional<SplitRuleAndAddGuardsForSuperclassesMutationOption> mutationOption2 = mutationOptions2.stream()
				.map(mo -> (SplitRuleAndAddGuardsForSuperclassesMutationOption) mo)
				.filter(mo -> mo.getMofPropertyToBeGuarded().getName().equals("Target") && mo.getSuperClassToBeGuarded().getName().equals("CompositeState"))
				.findFirst();
		assertFalse(mutationOption2.isPresent());

		// apply a second split:
		splitRuleAndAddGuardsForSuperclassesMutationOperator.mutate(mutationOptions2.get(0));

		IEglExecuter eglExecuter2 = eglExecuterFactory.create(etl2TextSource, transformationInAbtractSyntax);
		String transformationInConcreteSyntax2 = (String) eglExecuter2.execute();
		eglExecuter2.dispose();

		System.out.println(transformationInConcreteSyntax2);

		assertEquals(4, ((EtlModule) transformationInAbtractSyntax.allContents().stream().findFirst().get()).getTransformationRules().size());		
	
		String expected2 = "rule Transition2TransitionIncludingTargetAsCompositeStateIncludingSourceAsCompositeState\r\n" +
				"	transform sourceTransition : Source!Transition\r\n" +
				"	to	  targetTransition : Target!Transition {\r\n" +
				"	guard: sourceTransition.Source.isTypeOf(Source!CompositeState)\r\n" +
				"	       and sourceTransition.Target.isTypeOf(Source!CompositeState)\r\n" +
				"	\r\n" +
				"	targetTransition.Name = sourceTransition.Name;\r\n" +
				"}\r\n\r\n";
		
		assertTrue(transformationInConcreteSyntax2.startsWith(expected2));
	}

}