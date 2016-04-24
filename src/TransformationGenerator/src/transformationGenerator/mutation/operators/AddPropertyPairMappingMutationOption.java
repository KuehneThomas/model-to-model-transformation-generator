package transformationGenerator.mutation.operators;

import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.FormalParameterWithSelectedProperty;
import transformationGenerator.mutation.MutationOption;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import etlMetaModel.EolFor;
import etlMetaModel.MofProperty;

public class AddPropertyPairMappingMutationOption extends MutationOption {
	private etlMetaModel.EolFor eolFor;
	private MofProperty mofPropertyTarget1;
	private MofProperty mofPropertyTarget2;
	private FormalParameterWithSelectedProperty sourceParameter1;
	private FormalParameterWithSelectedProperty sourceParameter2;

	public AddPropertyPairMappingMutationOption(IMutationOperator mutationOperator, IModel model, etlMetaModel.EtlTransformationRule etlTransformationRule, EolFor eolFor,
			MofProperty mofPropertyTarget1,
			MofProperty mofPropertyTarget2,
			FormalParameterWithSelectedProperty sourceParameter1,
			FormalParameterWithSelectedProperty sourceParameter2) {
		super(mutationOperator, model, etlTransformationRule);
		this.eolFor = eolFor;
		this.mofPropertyTarget1 = mofPropertyTarget1;
		this.mofPropertyTarget2 = mofPropertyTarget2;
		this.sourceParameter1 = sourceParameter1;
		this.sourceParameter2 = sourceParameter2;
	}

	public etlMetaModel.EolFor getEolFor() {
		return eolFor;
	}

	public MofProperty getMofPropertyTarget1() {
		return mofPropertyTarget1;
	}

	public MofProperty getMofPropertyTarget2() {
		return mofPropertyTarget2;
	}

	public FormalParameterWithSelectedProperty getSourceParameter1() {
		return sourceParameter1;
	}

	public FormalParameterWithSelectedProperty getSourceParameter2() {
		return sourceParameter2;
	}

	@Override
	public String toString() {
		return String.format("SourceParameter1:\n%s\n\nSourceParameter2:\n%s",
				this.getSourceParameter1().toString(),
				this.getSourceParameter2().toString());
	}

	@Override
	public Boolean isOptionEquivalentTo(IMutationOption mutationOption) {
		if (mutationOption == null) {
			return false;
		}
		if (mutationOption.getClass() != this.getClass()) {
			return false;
		}

		AddPropertyPairMappingMutationOption otherAddPropertyPairMappingMutationOption = (AddPropertyPairMappingMutationOption) mutationOption;
		if (areEolForsEqual(eolFor, otherAddPropertyPairMappingMutationOption.eolFor) &&
				areMofPropertiesEqual(mofPropertyTarget1, otherAddPropertyPairMappingMutationOption.getMofPropertyTarget1()) &&
				areMofPropertiesEqual(mofPropertyTarget2, otherAddPropertyPairMappingMutationOption.getMofPropertyTarget2()) &&
				areFormalParametersWithSelectedPropertyEqual(sourceParameter1, otherAddPropertyPairMappingMutationOption.getSourceParameter1()) &&
				areFormalParametersWithSelectedPropertyEqual(sourceParameter2, otherAddPropertyPairMappingMutationOption.getSourceParameter2())) {
			return true;
		} else {
			return false;
		}
	}
}
