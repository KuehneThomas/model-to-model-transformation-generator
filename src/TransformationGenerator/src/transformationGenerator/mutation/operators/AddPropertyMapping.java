package transformationGenerator.mutation.operators;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.JavaMutation.EolVariableDeclarationWithNewExpressionContainer;
import transformationGenerator.mutation.JavaMutationOperator;
import transformationGenerator.mutation.Mutation.ChainedMofProperty;
import transformationGenerator.mutation.interfaces.IMutationOption;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;

import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;
import etlMetaModel.EolAssignmentStatement;
import etlMetaModel.EolFeatureCall;
import etlMetaModel.EolFor;
import etlMetaModel.EolMofClassFormalParameter;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;
import etlMetaModel.impl.EolAssignmentStatementImpl;
import etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl;
import etlMetaModel.impl.EolMofPropertyFeatureCallImpl;
import etlMetaModel.impl.EtlEquivalentMethodFeatureCallImpl;

public class AddPropertyMapping extends JavaMutationOperator<EtlTransformationRule, AddPropertyMappingMutationOption> {

	@Inject
	public AddPropertyMapping(ILogger logger, IPrettyPrinter prettyPrinter, IResourceReader resourceReader, IEwlExecuterFactory ewlExecuterFactory, IModelFactory modelFactory, IRandomizer randomizer)
			throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer, EtlTransformationRule.class, AddPropertyMappingMutationOption.class);
	}

	@Override
	protected List<IMutationOption> getMutationOptionsInternal(IModel model, EtlTransformationRule etlTransformationRule) throws Exception {
		Optional<EolFor> eolFor = etlTransformationRule.getBody().getStatements().stream()
				.filter(s -> s instanceof EolFor)
				.map(s -> (EolFor) s)
				.findFirst();

		List<IMutationOption> variableOptions = new ArrayList<IMutationOption>();

		if (!eolFor.isPresent()) {
			// possible source and target property mappings are PER RULE (implicitly solved because mutation is restricted to EtlTransformationRule type)
			// store already mapped / possibly mapped in separate cache for performance reasons ... and code reasons... => won't work when generic modifications are introduced

			collectPossiblePropertyMappings(model, etlTransformationRule,
					etlTransformationRule.getSourceParameter().getReferenced(),
					etlTransformationRule.getTargetParameters().get(0).getReferenced(),
					variableOptions,
					null);
		} else {

			EolVariableDeclarationWithNewExpressionContainer targetVariableDeclarationWithNewExpression = javaMutation.getFirstVariableDeclarationInForLoop(eolFor.get());

			// source - forloop target
			collectPossiblePropertyMappings(model, etlTransformationRule,
					etlTransformationRule.getSourceParameter().getReferenced(),
					targetVariableDeclarationWithNewExpression.getEolNewExpression().getInstantiatedMofClass(),
					variableOptions,
					eolFor.get());

			// forloop source - forloop target
			collectPossiblePropertyMappings(model, etlTransformationRule,
					((EolMofClassFormalParameter) eolFor.get().getFormalParameter()).getReferenced(),
					targetVariableDeclarationWithNewExpression.getEolNewExpression().getInstantiatedMofClass(),
					variableOptions,
					eolFor.get());
		}

		// TODO
		// - avoid conflicting mappings (even conflicting with rule mappings!)

		return variableOptions;
	}

	private void collectPossiblePropertyMappings(IModel model, EtlTransformationRule transformationRule, MofClass sourceMofClass, MofClass targetMofClass, List<IMutationOption> variableOptions, EolFor eolFor) {
		// exclude properties in the source property chain that are of the same type as the source property
		// --> causes self-references!

		Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses = javaMutation.getMofPropertyWithGuardedSuperclasses(transformationRule, /* excludeNegated: */true);

		for (List<ChainedMofProperty> chainedMofPropertySourceList : mutation.getChainedProperties(sourceMofClass,
				/* includePrimitivePropertiesAtTheEnd= */true,
				/* includeCollectionPropertiesAtTheEnd= */true,
				/* excludeChainsContainigMofClassSource= */true,
				/* maxDepth= */2,
				mofPropertyWithGuardedSuperclasses)) {
			ChainedMofProperty chainedPropertySource = chainedMofPropertySourceList.get(chainedMofPropertySourceList.size() - 1);
			MofProperty mofPropertySource = chainedPropertySource.getMofProperty();

			for (MofProperty mofPropertyTarget : targetMofClass.getOwnedProperties()) {
				// allow only mappings which are of the same "kind" (primitive type OR reference type):
				if ((mofPropertySource.getAssociation() != null && mofPropertyTarget.getAssociation() != null && ((mofPropertySource.getUpper() == null && mofPropertyTarget.getUpper() == null) || (mofPropertySource.getUpper() != null && mofPropertyTarget.getUpper() != null))) ||
						(mofPropertySource.getAssociation() == null && mofPropertyTarget.getAssociation() == null)) {
					variableOptions.add(new AddPropertyMappingMutationOption(this, model, transformationRule, chainedPropertySource, chainedMofPropertySourceList, mofPropertyTarget, eolFor));
				}
			}

		}
	}

	@SuppressWarnings("serial")
	@Override
	protected void mutate(EtlTransformationRule etlTransformationRule, AddPropertyMappingMutationOption mutationOption) {

		EolAssignmentStatement propertyAssignmentStatement =
				new EolAssignmentStatementImpl() {
					{
						// target.X =
						setLogicalExpressionLeft(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
								new EolFormalParameterReferenceExpressionImpl() {
									{
										setReferencedFormalParameter(etlTransformationRule.getTargetParameters().get(0));
									}
								},
								new EolMofPropertyFeatureCallImpl() {
									{
										setReferencedMofProperty(mutationOption.getSelectedMofPropertyTarget());
									}
								}
								))
						);
						// source.Y;
						setLogicalExpressionRight(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
								new EolFormalParameterReferenceExpressionImpl() {
									{
										setReferencedFormalParameter(etlTransformationRule.getSourceParameter());
									}
								},
								new ArrayList<EolFeatureCall>(mutationOption.getSelectedChainedPropertySourceList().stream().map(chainedMofProperty ->
										new EolMofPropertyFeatureCallImpl() {
											{
												setReferencedMofProperty(chainedMofProperty.getMofProperty());
											}
										}).collect(Collectors.toList())) {
									{
										if (mutationOption.getSelectedChainedPropertySource().getMofProperty().getAssociation() != null) {
											add(new EtlEquivalentMethodFeatureCallImpl());
										}
									}
								}))
						);

					}
				};

		if (mutationOption.getEolFor() == null) {
			javaMutation.removeExistingMofPropertyAssignment(etlTransformationRule.getBody().getStatements(), mutationOption.getSelectedMofPropertyTarget());
			etlTransformationRule.getBody().getStatements().add(propertyAssignmentStatement);
		} else {
			javaMutation.removeExistingMofPropertyAssignment(mutationOption.getEolFor().getStatementBlock().getStatements(), mutationOption.getSelectedMofPropertyTarget());
			mutationOption.getEolFor().getStatementBlock().getStatements().add(propertyAssignmentStatement);
		}
	}

}
