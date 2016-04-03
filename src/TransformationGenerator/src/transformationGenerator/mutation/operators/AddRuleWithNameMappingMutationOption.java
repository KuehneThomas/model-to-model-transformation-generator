package transformationGenerator.mutation.operators;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import transformationGenerator.mutation.MutationOption;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;

public class AddRuleWithNameMappingMutationOption extends MutationOption {
	private MofClass selectedMofClassSource;
	private MofClass selectedMofClassTarget;
	private EtlTransformationRule existingTransformationRule;

	public AddRuleWithNameMappingMutationOption(IMutationOperator mutationOperator, IModel model, EObject etlModule, MofClass selectedMofClassSource, MofClass selectedMofClassTarget, EtlTransformationRule existingTransformationRule) {
		super(mutationOperator, model, etlModule);
		this.selectedMofClassSource = selectedMofClassSource;
		this.selectedMofClassTarget = selectedMofClassTarget;
		this.existingTransformationRule = existingTransformationRule;
	}

	public MofClass getSelectedMofClassSource() {
		return selectedMofClassSource;
	}

	public MofClass getSelectedMofClassTarget() {
		return selectedMofClassTarget;
	}

	public EtlTransformationRule getExistingTransformationRule() {
		return existingTransformationRule;
	}

	@Override
	public Boolean isOptionEquivalentTo(IMutationOption mutationOption) {
		if (mutationOption == null) {
			return false;
		}
		if (mutationOption.getClass() != this.getClass()) {
			return false;
		}

		AddRuleWithNameMappingMutationOption otherAddRuleWithNameMappingMutationOption = (AddRuleWithNameMappingMutationOption) mutationOption;
		if (areMofClassesEqual(selectedMofClassSource, otherAddRuleWithNameMappingMutationOption.getSelectedMofClassSource()) &&
				areMofClassesEqual(selectedMofClassTarget, otherAddRuleWithNameMappingMutationOption.getSelectedMofClassTarget()) &&
				areEtlTransformationRulesEqual(existingTransformationRule, otherAddRuleWithNameMappingMutationOption.getExistingTransformationRule())) {
			return true;
		} else {
			return false;
		}
	}
}
