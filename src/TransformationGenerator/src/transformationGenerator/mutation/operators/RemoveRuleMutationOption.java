package transformationGenerator.mutation.operators;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

import etlMetaModel.EtlTransformationRule;
import transformationGenerator.mutation.MutationOption;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;

public class RemoveRuleMutationOption extends MutationOption {
	private EtlTransformationRule transformationRule;

	public RemoveRuleMutationOption(IMutationOperator mutationOperator, IModel model, EObject element, EtlTransformationRule transformationRule) {
		super(mutationOperator, model, element);
		this.transformationRule = transformationRule;
	}

	public EtlTransformationRule getTransformationRule() {
		return transformationRule;
	}

	@Override
	public Boolean isOptionEquivalentTo(IMutationOption mutationOption) {
		if (mutationOption == null) {
			return false;
		}
		if (mutationOption.getClass() != this.getClass()) {
			return false;
		}

		RemoveRuleMutationOption otherRemoveRuleMutationOption = (RemoveRuleMutationOption) mutationOption;
		if (areEtlTransformationRulesEqual(transformationRule, otherRemoveRuleMutationOption.getTransformationRule())) {
			return true;
		} else {
			return false;
		}
	}
}