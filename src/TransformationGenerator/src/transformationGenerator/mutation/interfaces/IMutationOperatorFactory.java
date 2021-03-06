package transformationGenerator.mutation.interfaces;
import transformationGenerator.mutation.operators.AddPropertyMapping;
import transformationGenerator.mutation.operators.AddPropertyPairMapping;
import transformationGenerator.mutation.operators.AddRuleOneToManyOfSameKind;
import transformationGenerator.mutation.operators.AddRuleWithNameMapping;
import transformationGenerator.mutation.operators.RemoveRule;
import transformationGenerator.mutation.operators.SplitRuleAndAddGuardsForSuperclasses;

public interface IMutationOperatorFactory {
	AddRuleWithNameMapping createAddRuleWithNameMappingMutationOperator () throws Exception;
	RemoveRule createRemoveRuleMutationOperator() throws Exception;
	AddPropertyMapping createAddPropertyMappingMutationOperator () throws Exception;
	AddRuleOneToManyOfSameKind createAddRuleOneToManyOfSameKindMutationOperator() throws Exception;
	AddPropertyPairMapping createAddPropertyPairMappingToOneToManyOfSameKindRule() throws Exception;
	SplitRuleAndAddGuardsForSuperclasses createSplitRuleAndAddGuardsForSuperclasses() throws Exception;
}
