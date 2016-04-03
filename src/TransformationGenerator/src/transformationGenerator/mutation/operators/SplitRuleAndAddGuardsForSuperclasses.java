package transformationGenerator.mutation.operators;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.JavaMutationOperator;
import transformationGenerator.mutation.interfaces.IMutationOption;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;

import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;
import etlMetaModel.EolFeatureCall;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolLogicalOperator;
import etlMetaModel.EolPostfixExpression;
import etlMetaModel.EolUnaryOprator;
import etlMetaModel.EtlModule;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;
import etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl;
import etlMetaModel.impl.EolIsTypeOfSourceMofClassFeatureCallImpl;
import etlMetaModel.impl.EolMofPropertyFeatureCallImpl;

public class SplitRuleAndAddGuardsForSuperclasses extends JavaMutationOperator<EtlModule, SplitRuleAndAddGuardsForSuperclassesMutationOption> {

	@Inject
	public SplitRuleAndAddGuardsForSuperclasses(ILogger logger, IPrettyPrinter prettyPrinter, IResourceReader resourceReader, IEwlExecuterFactory ewlExecuterFactory, IModelFactory modelFactory, IRandomizer randomizer)
			throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer, EtlModule.class, SplitRuleAndAddGuardsForSuperclassesMutationOption.class);
	}

	@Override
	protected List<IMutationOption> getMutationOptionsInternal(IModel model, EtlModule etlModule) throws Exception {

		Map<MofClass, List<EtlTransformationRule>> transformationRulesBySourceMofClass = etlModule.getTransformationRules().stream().collect(Collectors.groupingBy(t -> t.getSourceParameter().getReferenced()));

		List<IMutationOption> variableOptions = transformationRulesBySourceMofClass.entrySet().stream().flatMap(sourceMofClassToTransformationRules ->
				collectMutationOptionsBasedOnPossibleSuperclassGuards(model, etlModule, sourceMofClassToTransformationRules.getValue(), sourceMofClassToTransformationRules.getKey()).stream()).collect(Collectors.toList());

		return variableOptions;
	}

	private List<SplitRuleAndAddGuardsForSuperclassesMutationOption> collectMutationOptionsBasedOnPossibleSuperclassGuards(IModel model, EtlModule etlModule, List<EtlTransformationRule> transformationRules, MofClass sourceMofClass) {

		List<MofProperty> sourceMofProperties = this.mutation.getMofAssociationProperties(sourceMofClass, /* collectionProperties: */false);

		List<SplitRuleAndAddGuardsForSuperclassesMutationOption> mutationOptions = sourceMofProperties.stream()
				.flatMap(mofProperty -> mutation.getSuperClasses(this.mutation.getTypeOf(mofProperty), /* includeself: */false).stream()
						.map(superClassOfPropertyType -> new SplitRuleAndAddGuardsForSuperclassesMutationOption(this, model, etlModule, transformationRules, superClassOfPropertyType, mofProperty))
						.collect(Collectors.toList()).stream())
				.collect(Collectors.toList());

		// remove already realized guards from options
		Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses = javaMutation.getMofPropertyWithGuardedSuperclasses(transformationRules.get(0),/* excludeNegated: */false);
		mofPropertyWithGuardedSuperclasses
				.entrySet().forEach(group ->
						group.getValue().forEach(guardedByMofClass ->
								mutationOptions.removeIf(o -> o.getMofPropertyToBeGuarded() == group.getKey() && o.getSuperClassToBeGuarded() == guardedByMofClass)));

		return mutationOptions;

	}

	@Override
	protected void mutate(EtlModule etlModule, SplitRuleAndAddGuardsForSuperclassesMutationOption mutationOption) {

		mutationOption.getTransformationRulesWithSameSourceType().forEach(etlTransformationRule -> {

			EtlTransformationRule clonedEtlTransformationRule = EcoreUtil.copy(etlTransformationRule);
			etlModule.getTransformationRules().add(clonedEtlTransformationRule);

			etlTransformationRule.setGuardName((etlTransformationRule.getGuardName() != null ? etlTransformationRule.getGuardName() : "") + "Including" + mutationOption.getMofPropertyToBeGuarded().getName() + "As" + mutationOption.getSuperClassToBeGuarded().getName());
			appendLogicalExpressionToGuardWithAnd(etlTransformationRule, javaMutation.toLogicalExpression(createIsTypeOfCondition(etlTransformationRule, mutationOption)));

			clonedEtlTransformationRule.setGuardName((clonedEtlTransformationRule.getGuardName() != null ? clonedEtlTransformationRule.getGuardName() : "") + "Excluding" + mutationOption.getMofPropertyToBeGuarded().getName() + "As" + mutationOption.getSuperClassToBeGuarded().getName());
			appendLogicalExpressionToGuardWithAnd(clonedEtlTransformationRule, javaMutation.toLogicalExpression(EolUnaryOprator.NOT, createIsTypeOfCondition(etlTransformationRule, mutationOption)));

		});

	}

	private void appendLogicalExpressionToGuardWithAnd(EtlTransformationRule etlTransformationRule, EolLogicalExpression eolLogicalExpression) {
		if (etlTransformationRule.getGuard() != null) {
			javaMutation.chainLogicalExpressions(eolLogicalExpression, EolLogicalOperator.AND, etlTransformationRule.getGuard());
		}

		etlTransformationRule.setGuard(eolLogicalExpression);
	}

	@SuppressWarnings("serial")
	private EolPostfixExpression createIsTypeOfCondition(EtlTransformationRule etlTransformationRule, SplitRuleAndAddGuardsForSuperclassesMutationOption mutationOption) {
		// sourceTransition.Target.isTypeOf(Source!CompositeState)
		EolPostfixExpression eolPostfixExpression = javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
				new EolFormalParameterReferenceExpressionImpl() {
					{
						setReferencedFormalParameter(etlTransformationRule.getSourceParameter());
					}
				},
				new ArrayList<EolFeatureCall>() {
					{
						add(new EolMofPropertyFeatureCallImpl() {

							{
								setReferencedMofProperty(mutationOption.getMofPropertyToBeGuarded());
							}
						});

						add(new EolIsTypeOfSourceMofClassFeatureCallImpl() {
							{
								setReferencedMofClass(mutationOption.getSuperClassToBeGuarded());
							}
						});
					}
				});
		return eolPostfixExpression;
	}
}
