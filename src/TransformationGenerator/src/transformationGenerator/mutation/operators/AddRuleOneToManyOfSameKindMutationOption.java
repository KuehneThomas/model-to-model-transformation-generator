package transformationGenerator.mutation.operators;

import java.util.List;

import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.Mutation.ChainedMofProperty;
import transformationGenerator.mutation.MutationOption;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import etlMetaModel.EtlTransformationRule;

public class AddRuleOneToManyOfSameKindMutationOption extends MutationOption {
	private etlMetaModel.MofClass selectedMofClassSource;
	private etlMetaModel.MofClass selectedMofClassTarget;
	private ChainedMofProperty selectedMofClassSourceCollectionProperty;
	private List<ChainedMofProperty> selectedMofClassSourceCollectionPropertyChain;
	private EtlTransformationRule existingTransformationRule;

	AddRuleOneToManyOfSameKindMutationOption(IMutationOperator mutationOperator, IModel model, etlMetaModel.EtlModule etlModule, etlMetaModel.MofClass selectedMofClassSource, etlMetaModel.MofClass selectedMofClassTarget,
			ChainedMofProperty selectedMofClassSourceCollectionProperty, List<ChainedMofProperty> selectedMofClassSourceCollectionPropertyChain, EtlTransformationRule existingTransformationRule) {
		super(mutationOperator, model, etlModule);
		this.selectedMofClassSource = selectedMofClassSource;
		this.selectedMofClassTarget = selectedMofClassTarget;
		this.selectedMofClassSourceCollectionProperty = selectedMofClassSourceCollectionProperty;
		this.selectedMofClassSourceCollectionPropertyChain = selectedMofClassSourceCollectionPropertyChain;
		this.existingTransformationRule = existingTransformationRule;
	}

	public etlMetaModel.MofClass getSelectedMofClassSource() {
		return selectedMofClassSource;
	}

	public etlMetaModel.MofClass getSelectedMofClassTarget() {
		return selectedMofClassTarget;
	}

	public ChainedMofProperty getSelectedMofClassSourceCollectionProperty() {
		return selectedMofClassSourceCollectionProperty;
	}

	public List<ChainedMofProperty> getSelectedMofClassSourceCollectionPropertyChain() {
		return selectedMofClassSourceCollectionPropertyChain;
	}

	public EtlTransformationRule getExistingTransformationRule() {
		return existingTransformationRule;
	}

	@Override
	public String toString() {
		return String.format("Source=%s,Target=%s,CollectionProperty=%s,CollectionPropertyChain=%s", this.getSelectedMofClassSource().getName(), this.getSelectedMofClassTarget().getName(), this.getSelectedMofClassSourceCollectionProperty().toSelfString(),
				getSelectedMofClassSourceCollectionPropertyChain().stream().map(c -> c.getMofProperty() != null ? c.getMofProperty().getName() : "root").reduce("", (c1, c2) -> c1 + "." + c2));
	}

	@Override
	public Boolean isOptionEquivalentTo(IMutationOption mutationOption) {
		if (mutationOption == null) {
			return false;
		}
		if (mutationOption.getClass() != this.getClass()) {
			return false;
		}

		AddRuleOneToManyOfSameKindMutationOption otherAddRuleOneToManyOfSameKindMutationOption = (AddRuleOneToManyOfSameKindMutationOption) mutationOption;
		if (areMofClassesEqual(selectedMofClassSource, otherAddRuleOneToManyOfSameKindMutationOption.getSelectedMofClassSource()) &&
				areMofClassesEqual(selectedMofClassTarget, otherAddRuleOneToManyOfSameKindMutationOption.getSelectedMofClassTarget()) &&
				areChainedMofPropertiesEqual(selectedMofClassSourceCollectionProperty, otherAddRuleOneToManyOfSameKindMutationOption.getSelectedMofClassSourceCollectionProperty()) &&
				areChainedMofPropertyListsEqual(selectedMofClassSourceCollectionPropertyChain, otherAddRuleOneToManyOfSameKindMutationOption.getSelectedMofClassSourceCollectionPropertyChain()) &&
				areEtlTransformationRulesEqual(existingTransformationRule, otherAddRuleOneToManyOfSameKindMutationOption.getExistingTransformationRule())) {
			return true;
		} else {
			return false;
		}
	}
}
