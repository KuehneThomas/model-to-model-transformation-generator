package transformationGenerator.mutation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

import etlMetaModel.EolFor;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;
import transformationGenerator.mutation.Mutation.ChainedMofProperty;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;

public abstract class MutationOption implements IMutationOption {
	private IMutationOperator mutationOperator;
	private IModel model;
	private EObject element;

	protected MutationOption(IMutationOperator mutationOperator, IModel model, EObject element) {
		this.mutationOperator = mutationOperator;
		this.model = model;
		this.element = element;
	}

	public IMutationOperator getMutationOperator() {
		return mutationOperator;
	}

	public IModel getModel() {
		return model;
	}

	public EObject getElement() {
		return element;
	}

	@Override
	public abstract Boolean isOptionEquivalentTo(IMutationOption mutationOption);

	protected Boolean areEolForsEqual(EolFor eolFor1, EolFor eolFor2) {
		return (eolFor1 == null && eolFor2 == null) || (eolFor1 != null && eolFor2 != null);
	}

	protected Boolean areChainedMofPropertyListsEqual(List<ChainedMofProperty> chainedPropertySourceList1, List<ChainedMofProperty> chainedPropertySourceList2) {
		return (chainedPropertySourceList1 == null && chainedPropertySourceList2 == null) ||
				chainedPropertySourceList1.size() == chainedPropertySourceList2.size();
	}

	protected Boolean areChainedMofPropertiesEqual(ChainedMofProperty chainedMofProperty1, ChainedMofProperty chainedMofProperty2) {
		return (chainedMofProperty1 == null && chainedMofProperty2 == null) ||
				(chainedMofProperty1 != null && chainedMofProperty2 != null && areMofPropertiesEqual(chainedMofProperty1.getMofProperty(), chainedMofProperty2.getMofProperty()));
	}

	protected Boolean areMofPropertiesEqual(MofProperty mofProperty1, MofProperty mofProperty2) {
		return (mofProperty1 == null && mofProperty2 == null) ||
				(mofProperty1 != null && mofProperty2 != null && mofProperty1.getName().equals(mofProperty2.getName()) && areMofClassesEqual(mofProperty1.getClazz(), mofProperty2.getClazz()));
	}

	protected Boolean areMofClassesEqual(MofClass mofClass1, MofClass mofClass2) {
		return (mofClass1 == null && mofClass2 == null) ||
				(mofClass1 != null && mofClass2 != null && mofClass1.getName().equals(mofClass2.getName()));
	}

	protected boolean areFormalParametersWithSelectedPropertyEqual(FormalParameterWithSelectedProperty sourceParameter1, FormalParameterWithSelectedProperty sourceParameter2) {
		return (sourceParameter1 == null && sourceParameter2 == null) ||
				(sourceParameter1 != null && sourceParameter2 != null &&
						areMofClassesEqual(sourceParameter1.getFormalParameter().getReferenced(), sourceParameter2.getFormalParameter().getReferenced()) &&
						areChainedMofPropertiesEqual(sourceParameter1.getFormalParameterChainedMofProperty(), sourceParameter2.getFormalParameterChainedMofProperty()) &&
				areChainedMofPropertyListsEqual(sourceParameter1.getFormalParameterAssociationPropertyChains(), sourceParameter2.getFormalParameterAssociationPropertyChains()));
	}

	protected boolean areEtlTransformationRulesEqual(EtlTransformationRule existingTransformationRule1, EtlTransformationRule existingTransformationRule2) {
		return (existingTransformationRule1 == null && existingTransformationRule2 == null) ||
				(existingTransformationRule1 != null && existingTransformationRule2 != null &&
						areMofClassesEqual(existingTransformationRule1.getSourceParameter().getReferenced(), existingTransformationRule2.getSourceParameter().getReferenced()) &&
				areMofClassesEqual(existingTransformationRule1.getTargetParameters().get(0).getReferenced(), existingTransformationRule2.getTargetParameters().get(0).getReferenced()));
	}
}