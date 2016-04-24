package transformationGenerator.mutation.operators;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.MutationOption;
import transformationGenerator.mutation.interfaces.IMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;

public class SplitRuleAndAddGuardsForSuperclassesMutationOption extends MutationOption {
	private List<EtlTransformationRule> transformationRulesWithSameSourceType;
	private MofClass superClassToBeGuarded;
	private MofProperty mofPropertyToBeGuarded;

	SplitRuleAndAddGuardsForSuperclassesMutationOption(IMutationOperator mutationOperator, IModel model, EObject element, List<EtlTransformationRule> transformationRulesWithSameSourceType, MofClass superClassToBeGuarded, MofProperty mofPropertyToBeGuarded) {
		super(mutationOperator, model, element);
		this.transformationRulesWithSameSourceType = transformationRulesWithSameSourceType;
		this.superClassToBeGuarded = superClassToBeGuarded;
		this.mofPropertyToBeGuarded = mofPropertyToBeGuarded;
	}

	public List<EtlTransformationRule> getTransformationRulesWithSameSourceType() {
		return transformationRulesWithSameSourceType;
	}

	public MofClass getSuperClassToBeGuarded() {
		return superClassToBeGuarded;
	}

	public MofProperty getMofPropertyToBeGuarded() {
		return mofPropertyToBeGuarded;
	}

	@Override
	public String toString() {
		return String.format("transformationRuleSourceMofClass=%s,superClassToBeGuarded=%s,mofPropertyToBeGuarded=%s",
				getTransformationRulesWithSameSourceType().get(0).getSourceParameter().getReferenced().getName(),
				getSuperClassToBeGuarded(),
				getMofPropertyToBeGuarded());
	}

	@Override
	public Boolean isOptionEquivalentTo(IMutationOption mutationOption) {
		if (mutationOption == null) {
			return false;
		}
		if (mutationOption.getClass() != this.getClass()) {
			return false;
		}

		SplitRuleAndAddGuardsForSuperclassesMutationOption otherSplitRuleAndAddGuardsForSuperclassesMutationOption = (SplitRuleAndAddGuardsForSuperclassesMutationOption) mutationOption;
		if (areMofClassesEqual(transformationRulesWithSameSourceType.get(0).getSourceParameter().getReferenced(), otherSplitRuleAndAddGuardsForSuperclassesMutationOption.getTransformationRulesWithSameSourceType().get(0).getSourceParameter().getReferenced()) &&
				areMofClassesEqual(superClassToBeGuarded, otherSplitRuleAndAddGuardsForSuperclassesMutationOption.getSuperClassToBeGuarded()) &&
				areMofPropertiesEqual(mofPropertyToBeGuarded, otherSplitRuleAndAddGuardsForSuperclassesMutationOption.getMofPropertyToBeGuarded())) {
			return true;
		} else {
			return false;
		}
	}

}
