package transformationGenerator.mutation.operators;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.FormalParameterWithSelectedProperty;
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
import etlMetaModel.EolAdditiveArithmeticalOperator;
import etlMetaModel.EolFeatureCall;
import etlMetaModel.EolFor;
import etlMetaModel.EolMofClassFormalParameter;
import etlMetaModel.EolPrimitiveExpression;
import etlMetaModel.EolStatement;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;
import etlMetaModel.impl.EolAssignmentStatementImpl;
import etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl;
import etlMetaModel.impl.EolMofPropertyFeatureCallImpl;
import etlMetaModel.impl.EolStringLiteralImpl;
import etlMetaModel.impl.EolVariableReferenceExpressionImpl;
import etlMetaModel.impl.EtlEquivalentMethodFeatureCallImpl;

public class AddPropertyPairMapping extends JavaMutationOperator<EtlTransformationRule, AddPropertyPairMappingMutationOption> {

	@Inject
	public AddPropertyPairMapping(ILogger logger, IPrettyPrinter prettyPrinter, IResourceReader resourceReader, IEwlExecuterFactory ewlExecuterFactory, IModelFactory modelFactory, IRandomizer randomizer)
			throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer, EtlTransformationRule.class, AddPropertyPairMappingMutationOption.class);
	}

	@Override
	protected List<IMutationOption> getMutationOptionsInternal(IModel model, EtlTransformationRule etlTransformationRule) throws Exception {

		Optional<EolFor> eolFor = etlTransformationRule.getBody().getStatements().stream()
				.filter(s -> s instanceof EolFor)
				.map(s -> (EolFor) s)
				.findFirst();

		if (!eolFor.isPresent()) {
			EolMofClassFormalParameter sourceFormalParameter1 = etlTransformationRule.getSourceParameter();
			EolMofClassFormalParameter sourceFormalParameter2 = etlTransformationRule.getSourceParameter();

			List<IMutationOption> variableOptions = collectVariableOptionsForAllPossiblePairs(model, etlTransformationRule, null, etlTransformationRule.getTargetParameters().get(0).getReferenced(), sourceFormalParameter1, sourceFormalParameter2);

			return variableOptions;
		} else {

			EolVariableDeclarationWithNewExpressionContainer targetVariableDeclarationWithNewExpression = javaMutation.getFirstVariableDeclarationInForLoop(eolFor.get());

			EolMofClassFormalParameter sourceFormalParameter1 = (EolMofClassFormalParameter) eolFor.get().getFormalParameter();
			EolMofClassFormalParameter sourceFormalParameter2 = etlTransformationRule.getSourceParameter();

			List<IMutationOption> variableOptions = collectVariableOptionsForAllPossiblePairs(model, etlTransformationRule, eolFor.get(), targetVariableDeclarationWithNewExpression.getEolNewExpression().getInstantiatedMofClass(), sourceFormalParameter1, sourceFormalParameter2);

			return variableOptions;
		}
	}

	private List<IMutationOption> collectVariableOptionsForAllPossiblePairs(IModel model, EtlTransformationRule etlTransformationRule, EolFor eolFor, MofClass targetMofClass, EolMofClassFormalParameter sourceFormalParameter1, EolMofClassFormalParameter sourceFormalParameter2) {
		Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses = javaMutation.getMofPropertyWithGuardedSuperclasses(etlTransformationRule, /* excludeNegated: */true);

		List<ChainedMofProperty> sourceFormalParameter1AssociationPropertyChains = mutation.getChainedAssociationProperties(sourceFormalParameter1.getReferenced(), /* collectionProperties= */false, /* maxDepth= */2, mofPropertyWithGuardedSuperclasses);
		List<ChainedMofProperty> sourceFormalParameter2AssociationPropertyChains = mutation.getChainedAssociationProperties(sourceFormalParameter2.getReferenced(), /* collectionProperties= */false, /* maxDepth= */2, mofPropertyWithGuardedSuperclasses);

		HashSet<MofClass> subAndSuperClassesOfSourceFormalParameter2 = mutation.getSubClasses(sourceFormalParameter2.getReferenced(), /* includeself: */true);
		// add guarded = allowed superclasses:
		if (mofPropertyWithGuardedSuperclasses.containsKey(sourceFormalParameter2.getReferenced())) {
			subAndSuperClassesOfSourceFormalParameter2.addAll(mofPropertyWithGuardedSuperclasses.get(sourceFormalParameter2));
		}

		List<IMutationOption> variableOptions = new ArrayList<IMutationOption>();

		for (MofProperty mofPropertyTarget1 : targetMofClass.getOwnedProperties()) {
			for (MofProperty mofPropertyTarget2 : targetMofClass.getOwnedProperties()) {

				if (mofPropertyTarget1 != mofPropertyTarget2 && mofPropertyTarget1.getAssociation() != null && mofPropertyTarget2.getAssociation() != null) {

					List<IMutationOption> variableOptionsForMofPropertyTarget1and2 = sourceFormalParameter1AssociationPropertyChains.stream()
							// Avoid self-references:
							// exclude properties in the source property chain that are of the same type as the source property via excludeChainsEndingIn
							// exclude also mappings which would result in an equivalent call to the source to avoid self-references:
							.filter(chainedMofProperty1 -> chainedMofProperty1.getPrevious().size() > 0 ||
									(chainedMofProperty1.getMofProperty() == null && chainedMofProperty1.getType() != sourceFormalParameter2.getReferenced()) ||
									(chainedMofProperty1.getMofProperty() != null && chainedMofProperty1.getMofProperty().getClazz() != sourceFormalParameter2.getReferenced()))
							.flatMap(chainedMofProperty1 -> chainedMofProperty1.toFlatLists(/* excludeChainsEndingIn= */subAndSuperClassesOfSourceFormalParameter2).stream()

									.flatMap(formalParameter1AssociationPropertyChains -> sourceFormalParameter2AssociationPropertyChains.stream()
											// exclude mappings which END in the same property
											.filter(chainedMofProperty2 -> chainedMofProperty2.getMofProperty() != chainedMofProperty1.getMofProperty())
											// exclude also mappings which would result in an equivalent call to the source to avoid self-references:
											.filter(chainedMofProperty2 -> chainedMofProperty2.getPrevious().size() > 0 ||
													(chainedMofProperty2.getMofProperty() == null && chainedMofProperty2.getType() != sourceFormalParameter2.getReferenced()) ||
													(chainedMofProperty2.getMofProperty() != null && chainedMofProperty2.getMofProperty().getClazz() != sourceFormalParameter2.getReferenced()))
											.flatMap(chainedMofProperty2 ->
													chainedMofProperty2.toFlatLists(/* excludeChainsEndingIn= */subAndSuperClassesOfSourceFormalParameter2).stream().map(formalParameter2AssociationPropertyChains -> {

														FormalParameterWithSelectedProperty formalParameterWithSelectedProperty1 = new FormalParameterWithSelectedProperty(
																sourceFormalParameter1,
																chainedMofProperty1,
																formalParameter1AssociationPropertyChains);
														FormalParameterWithSelectedProperty formalParameterWithSelectedProperty2 = new FormalParameterWithSelectedProperty(
																sourceFormalParameter2,
																chainedMofProperty2,
																formalParameter2AssociationPropertyChains);

														return new AddPropertyPairMappingMutationOption(this, model, etlTransformationRule, eolFor, mofPropertyTarget1, mofPropertyTarget2, formalParameterWithSelectedProperty1, formalParameterWithSelectedProperty2);
													}

															).collect(Collectors.toList()).stream()
											).collect(Collectors.toList()).stream()

									).collect(Collectors.toList()).stream()

							).collect(Collectors.toList());

					variableOptions.addAll(variableOptionsForMofPropertyTarget1and2);

				}

			}
		}
		return variableOptions;
	}

	interface TargetVariableDeclarationExpression {
		public EolPrimitiveExpression createTargetVariableDeclarationExpression();
	}

	@Override
	protected void mutate(EtlTransformationRule etlTransformationRule, AddPropertyPairMappingMutationOption option) {

		if (option.getEolFor() == null) {
			etlTransformationRule.getBody().getStatements().addAll(createPropertyPairMapping(
					etlTransformationRule.getBody().getStatements(),
					() -> new EolFormalParameterReferenceExpressionImpl() {
						{
							setReferencedFormalParameter(etlTransformationRule.getTargetParameters().get(0));
						}
					},
					etlTransformationRule.getTargetParameters().get(0).getReferenced(),
					option.getMofPropertyTarget1(),
					option.getMofPropertyTarget2(),
					option.getSourceParameter1(),
					option.getSourceParameter2()
					));
		} else {
			EolVariableDeclarationWithNewExpressionContainer targetVariableDeclarationWithNewExpression = javaMutation.getFirstVariableDeclarationInForLoop(option.getEolFor());

			option.getEolFor().getStatementBlock().getStatements().addAll(createPropertyPairMapping(
					option.getEolFor().getStatementBlock().getStatements(),
					() -> new EolVariableReferenceExpressionImpl() {
						{
							setReferencedVarableDeclaration(targetVariableDeclarationWithNewExpression.getEolVariableDeclarationExpression());
						}
					},
					targetVariableDeclarationWithNewExpression.getEolNewExpression().getInstantiatedMofClass(),
					option.getMofPropertyTarget1(),
					option.getMofPropertyTarget2(),
					option.getSourceParameter1(), // (EolMofClassFormalParameter) option.getEolFor().getFormalParameter()
					option.getSourceParameter2() // etlTransformationRule.getSourceParameter()
					));
		}
	}

	@SuppressWarnings("serial")
	private List<EolStatement> createPropertyPairMapping(List<EolStatement> existingStatements, TargetVariableDeclarationExpression targetVariableDeclarationExpression, MofClass targetVariableTypeMofClass, MofProperty mofPropertyTarget1, MofProperty mofPropertyTarget2,
			FormalParameterWithSelectedProperty sourceParameter1,
			FormalParameterWithSelectedProperty sourceParameter2) {

		AddPropertyPairMapping self = this;
		return new ArrayList<EolStatement>() {
			{
				// targetTransition.Name = sourceState.Name + " -> " + sourceTransition.Target.Name;
				self.javaMutation.removeExistingMofPropertyAssignment(existingStatements, mutation.getNameProperty(targetVariableTypeMofClass));
				add(new EolAssignmentStatementImpl() {
					{
						// targetTransition.Name =
						setLogicalExpressionLeft(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
								targetVariableDeclarationExpression.createTargetVariableDeclarationExpression(),
								new EolMofPropertyFeatureCallImpl() {
									{
										setReferencedMofProperty(mutation.getNameProperty(targetVariableTypeMofClass));
									}
								}
								)));
						// sourceState.Name + " -> " + sourceTransition.Target.Name;
						setLogicalExpressionRight(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
								new EolFormalParameterReferenceExpressionImpl() {
									{
										setReferencedFormalParameter(sourceParameter1.getFormalParameter());
									}
								},
								selectNamePropertyAsLastPropertyInChain(sourceParameter1).stream().map(chainedMofProperty ->
										new EolMofPropertyFeatureCallImpl() {
											{
												setReferencedMofProperty(chainedMofProperty.getMofProperty());
											}
										}).collect(Collectors.toList())
								),
								javaMutation.toChainedAdditiveExpression(
										EolAdditiveArithmeticalOperator.PLUS,
										javaMutation.toItemSelectorAndFeatureCallPostfixExpression(new EolStringLiteralImpl() {
											{
												setValue(" -> ");
											}
										}),
										javaMutation.toChainedAdditiveExpression(
												EolAdditiveArithmeticalOperator.PLUS,
												javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
														new EolFormalParameterReferenceExpressionImpl() {
															{
																setReferencedFormalParameter(sourceParameter2.getFormalParameter());
															}
														},
														selectNamePropertyAsLastPropertyInChain(sourceParameter2).stream().map(chainedMofProperty ->
																new EolMofPropertyFeatureCallImpl() {
																	{
																		setReferencedMofProperty(chainedMofProperty.getMofProperty());
																	}
																}).collect(Collectors.toList())
														)
												)
										)));

					}
				});

				// targetTransition.Source = sourceState.equivalent();
				self.javaMutation.removeExistingMofPropertyAssignment(existingStatements, mofPropertyTarget1);
				add(createChainedAssociationPropertyMapping(targetVariableDeclarationExpression.createTargetVariableDeclarationExpression(), targetVariableTypeMofClass, mofPropertyTarget1, sourceParameter1));

				// targetTransition.Target = sourceTransition.Target.equivalent();
				self.javaMutation.removeExistingMofPropertyAssignment(existingStatements, mofPropertyTarget2);
				add(createChainedAssociationPropertyMapping(targetVariableDeclarationExpression.createTargetVariableDeclarationExpression(), targetVariableTypeMofClass, mofPropertyTarget2, sourceParameter2));
			}

		};
	}

	@SuppressWarnings("serial")
	private EolAssignmentStatementImpl createChainedAssociationPropertyMapping(EolPrimitiveExpression targetVariableDeclarationExpression, MofClass targetVariableTypeMofClass, MofProperty mofPropertyTarget, FormalParameterWithSelectedProperty sourceParameter) {
		return new EolAssignmentStatementImpl() {
			{
				// targetTransition.X =
				setLogicalExpressionLeft(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
						targetVariableDeclarationExpression,
						new EolMofPropertyFeatureCallImpl() {
							{
								setReferencedMofProperty(mofPropertyTarget);
							}
						}
						)));
				// sourceState.Y.equivalent();
				setLogicalExpressionRight(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
						new EolFormalParameterReferenceExpressionImpl() {
							{
								setReferencedFormalParameter(sourceParameter.getFormalParameter());
							}
						},
						new ArrayList<EolFeatureCall>(sourceParameter.getFormalParameterAssociationPropertyChains().stream().map(chainedMofProperty ->
								new EolMofPropertyFeatureCallImpl() {
									{
										setReferencedMofProperty(chainedMofProperty.getMofProperty());
									}
								}).collect(Collectors.toList())) {
							{
								add(new EtlEquivalentMethodFeatureCallImpl());
							}
						}

						)));
			}
		};
	}

	private List<ChainedMofProperty> selectNamePropertyAsLastPropertyInChain(FormalParameterWithSelectedProperty sourceParameter) {
		ChainedMofProperty nameProperty = null;
		if (sourceParameter.getFormalParameterAssociationPropertyChains().size() > 0) {
			ChainedMofProperty lastPropertyInSource1ChainedMofProperty = sourceParameter.getFormalParameterAssociationPropertyChains().get(sourceParameter.getFormalParameterAssociationPropertyChains().size() - 1);
			MofProperty namePropertyOfLastPropertyInSource1ChainedMofProperty = mutation.getNameProperty(lastPropertyInSource1ChainedMofProperty.getType());
			nameProperty = mutation.new ChainedMofProperty(namePropertyOfLastPropertyInSource1ChainedMofProperty, lastPropertyInSource1ChainedMofProperty, lastPropertyInSource1ChainedMofProperty.getDepth() + 1, lastPropertyInSource1ChainedMofProperty.getMaxDepth());
		} else {
			MofProperty namePropertyOfsource1MofProperty = mutation.getNameProperty(sourceParameter.getFormalParameter().getReferenced());
			nameProperty = mutation.new ChainedMofProperty(namePropertyOfsource1MofProperty, null, 0, -1);
		}

		List<ChainedMofProperty> clonedPropertyChain = new ArrayList<ChainedMofProperty>(sourceParameter.getFormalParameterAssociationPropertyChains());
		clonedPropertyChain.add(nameProperty);

		return clonedPropertyChain;
	}
}
