package transformationGenerator.mutation.operators;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.Mutation.ChainedMofProperty;
import transformationGenerator.mutation.MutationOption;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import etlMetaModel.EolFor;
import etlMetaModel.MofProperty;

public class AddPropertyMappingMutationOption extends MutationOption {
	private ChainedMofProperty selectedChainedPropertySource;
	private List<ChainedMofProperty> selectedChainedPropertySourceList;
	private MofProperty selectedMofPropertyTarget;
	private EolFor eolFor;

	AddPropertyMappingMutationOption(IMutationOperator mutationOperator, IModel model, EObject element, ChainedMofProperty selectedChainedPropertySource, List<ChainedMofProperty> selectedChainedPropertySourceList, MofProperty selectedMofPropertyTarget, EolFor eolFor) {
		super(mutationOperator, model, element);
		this.selectedChainedPropertySource = selectedChainedPropertySource;
		this.selectedChainedPropertySourceList = selectedChainedPropertySourceList;
		this.selectedMofPropertyTarget = selectedMofPropertyTarget;
		this.eolFor = eolFor;
	}

	public ChainedMofProperty getSelectedChainedPropertySource() {
		return selectedChainedPropertySource;
	}

	public List<ChainedMofProperty> getSelectedChainedPropertySourceList() {
		return selectedChainedPropertySourceList;
	}

	public MofProperty getSelectedMofPropertyTarget() {
		return selectedMofPropertyTarget;
	}

	public EolFor getEolFor() {
		return eolFor;
	}

	@Override
	public String toString() {
		return String.format("selectedChainedPropertySourceList=%s,selectedChainedPropertySource=%s.%s,selectedMofPropertyTarget=%s.%s,eolFor=%s",
				getSelectedChainedPropertySourceList().stream().map(c -> c.getMofProperty() != null ? c.getMofProperty().getName() : "root").reduce("", (c1, c2) -> c1 + "." + c2),
				this.getSelectedChainedPropertySource().getMofProperty().getClazz().getName(), this.getSelectedChainedPropertySource().getMofProperty().getName(),
				this.getSelectedMofPropertyTarget().getClazz().getName(), this.getSelectedMofPropertyTarget().getName(),
				this.getEolFor() != null);
	}

	@Override
	public Boolean isOptionEquivalentTo(IMutationOption mutationOption) {
		if (mutationOption == null) {
			return false;
		}
		if (mutationOption.getClass() != this.getClass()) {
			return false;
		}

		AddPropertyMappingMutationOption otherAddPropertyMappingMutationOption = (AddPropertyMappingMutationOption) mutationOption;
		if (areChainedMofPropertiesEqual(selectedChainedPropertySource, otherAddPropertyMappingMutationOption.getSelectedChainedPropertySource()) &&
				areChainedMofPropertyListsEqual(selectedChainedPropertySourceList, otherAddPropertyMappingMutationOption.getSelectedChainedPropertySourceList()) &&
				areMofPropertiesEqual(selectedMofPropertyTarget, otherAddPropertyMappingMutationOption.getSelectedMofPropertyTarget()) &&
				areEolForsEqual(eolFor, otherAddPropertyMappingMutationOption.eolFor)) {
			return true;
		} else {
			return false;
		}

	}
}
