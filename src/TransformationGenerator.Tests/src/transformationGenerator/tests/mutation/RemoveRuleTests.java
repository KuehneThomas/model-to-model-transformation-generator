package transformationGenerator.tests.mutation;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import transformationGenerator.mutation.interfaces.IMutationOption;
import transformationGenerator.mutation.operators.RemoveRule;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;

public class RemoveRuleTests extends MutationOperatorTests {

	@Before
	public void setUp() throws Exception {
		setUp(TransformationScenario.UmlClass2Relational, /* transformationModelFileIsEmpty: */false);
	}

	@Test
	public void testGetMutationOptions() throws Exception {
		RemoveRule removeRuleMutationOperator = mutationOperatorFactory.createRemoveRuleMutationOperator();

		List<IMutationOption> mutationOptions = removeRuleMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		assertEquals(3, mutationOptions.size());
	}

	@Test
	public void testMutate() throws Exception {
		RemoveRule removeRuleMutationOperator = mutationOperatorFactory.createRemoveRuleMutationOperator();
		List<IMutationOption> mutationOptions = removeRuleMutationOperator.getMutationOptions(transformationInAbtractSyntax);

		for(IMutationOption mutationOption : mutationOptions) {
			removeRuleMutationOperator.mutate(mutationOption);
		}

		IEglExecuter eglExecuter = eglExecuterFactory.create(etl2TextSource, transformationInAbtractSyntax);
		String transformationInConcreteSyntax = (String) eglExecuter.execute();
		eglExecuter.dispose();

		String expected = "";

		assertEquals(expected, transformationInConcreteSyntax);

		// may not fail:
		modelFactory.cloneModel(transformationInAbtractSyntax);

		// EmfModel transformationInAbtractSyntaxEmfModel = (EmfModel) transformationInAbtractSyntax;

		// int eObjectContentSize = transformationInAbtractSyntaxEmfModel.allContents().size();
		// int eObjectResourceSize = transformationInAbtractSyntaxEmfModel.getResource().getContents().size();
		//
		// String eObjectPrettyPrint = prettyPrinter.ToStringRecursive(transformationInAbtractSyntaxEmfModel.allContents());
		// String eObjectResourcePrettyPrint = prettyPrinter.ToStringRecursive(transformationInAbtractSyntaxEmfModel.getResource().getContents());
		//
		// assertEquals(eObjectContentSize, eObjectResourceSize);
		// assertEquals(eObjectPrettyPrint, eObjectResourcePrettyPrint);
	}

}
