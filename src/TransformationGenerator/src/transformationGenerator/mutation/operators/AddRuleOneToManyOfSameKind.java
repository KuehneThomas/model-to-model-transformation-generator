package transformationGenerator.mutation.operators;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.mutation.JavaMutation.EolVariableDeclarationExpressionContainer;
import transformationGenerator.mutation.JavaMutationOperator;
import transformationGenerator.mutation.Mutation.ChainedMofProperty;
import transformationGenerator.mutation.interfaces.IMutationOption;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;

import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;
import etlMetaModel.EolFor;
import etlMetaModel.EtlModule;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;
import etlMetaModel.impl.EolAssignmentStatementImpl;
import etlMetaModel.impl.EolForImpl;
import etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl;
import etlMetaModel.impl.EolLogicalExpressionStatementImpl;
import etlMetaModel.impl.EolMofClassFormalParameterImpl;
import etlMetaModel.impl.EolMofPropertyFeatureCallImpl;
import etlMetaModel.impl.EolNewExpressionImpl;
import etlMetaModel.impl.EolParameterListImpl;
import etlMetaModel.impl.EolSimpleFeatureCallImpl;
import etlMetaModel.impl.EolStatementBlockImpl;
import etlMetaModel.impl.EolVariableDeclarationExpressionImpl;
import etlMetaModel.impl.EolVariableReferenceExpressionImpl;
import etlMetaModel.impl.EtlTransformationRuleImpl;

public class AddRuleOneToManyOfSameKind extends JavaMutationOperator<EtlModule, AddRuleOneToManyOfSameKindMutationOption> {

	@Inject
	public AddRuleOneToManyOfSameKind(ILogger logger, IPrettyPrinter prettyPrinter, IResourceReader resourceReader, IEwlExecuterFactory ewlExecuterFactory, IModelFactory modelFactory, IRandomizer randomizer) throws URISyntaxException, Exception {
		super(logger, prettyPrinter, modelFactory, randomizer, EtlModule.class, AddRuleOneToManyOfSameKindMutationOption.class);
	}

	@Override
	protected List<IMutationOption> getMutationOptionsInternal(IModel model, EtlModule etlModule) throws Exception {
		List<etlMetaModel.MofClass> mofClassesSourceNotYetMapped = etlModule.getMofClassesSource().stream()
				.filter(mofClassSource -> etlModule.getTransformationRules().stream().noneMatch(transformationRule -> transformationRule.getSourceParameter().getReferenced() == mofClassSource))
				.collect(Collectors.toList());

		List<etlMetaModel.MofClass> mofClassesTargetNotYetMapped = etlModule.getMofClassesTarget().stream()
				.filter(mofClassTarget -> etlModule.getTransformationRules().stream().allMatch(transformationRule -> transformationRule.getTargetParameters().stream().noneMatch(targetParameter -> targetParameter.getReferenced() == mofClassTarget)))
				.collect(Collectors.toList());

		List<IMutationOption> variableOptions = new ArrayList<IMutationOption>();
		for (etlMetaModel.MofClass mofClassSource : mofClassesSourceNotYetMapped) {

			// TODO use the cached toFlatLists() via getFlatLists() and store the ChainedMofProperty globally
			List<ChainedMofProperty> mofSourceAssociationPropertyChains = mutation.getChainedAssociationProperties(mofClassSource, false, /* maxDepth= */1, /* mofPropertyWithGuardedSuperclasses= */null);
			List<ChainedMofProperty> mofSourceAssociationPropertyCollectionChains = mutation.getDirectDescendantCollectionChainedProperties(mofSourceAssociationPropertyChains, /* mofPropertyWithGuardedSuperclasses= */null);

			HashSet<MofClass> excludeChainsEndingIn = new HashSet<MofClass>();
			excludeChainsEndingIn.add(mofClassSource);

			for (etlMetaModel.MofClass mofClassTarget : mofClassesTargetNotYetMapped) {
				// TODO ..and where the type of the collection items is ALSO a (sub-)property type of the mofClassSource (otherwise no mapping is possible)
				// TODO consider also inheritance: must not be of the SAME type ---- the output is of the same type !!!!
				// TODO consider also mapping the sourceMofClass itself ONLY (=null) + all non-collection property chains
				// TODO consider that the collection property chains are based on non-collection property chains, or are direct descendants of the sourceMofClass (may also have intermediate collections, but not for now..)
				// TODO fix name of operator.... remove ofSameKind, replace by BasedOnAssociations..
				// TODO consider also the target properties: the non-collection + collection property type must have equivalent non-collection properties on the target type

				mofSourceAssociationPropertyCollectionChains.forEach(chainedMofProperty -> {
					chainedMofProperty.toFlatLists(/* excludeChainsEndingIn: */excludeChainsEndingIn).forEach(l -> {
						variableOptions.add(new AddRuleOneToManyOfSameKindMutationOption(this, model, etlModule, mofClassSource, mofClassTarget, chainedMofProperty, l, /* existingTransformationRule= */null));
					});
				});

			}
		}

		// create replacement options for non 1:N transformation rules (keep the guards!):
		for (EtlTransformationRule existingTransformationRule : etlModule.getTransformationRules()) {
			Optional<EolFor> eolFor = existingTransformationRule.getBody().getStatements().stream()
					.filter(s -> s instanceof EolFor)
					.map(s -> (EolFor) s)
					.findFirst();

			if (!eolFor.isPresent()) {
				MofClass mofClassSource = existingTransformationRule.getSourceParameter().getReferenced();
				MofClass mofClassTarget = existingTransformationRule.getTargetParameters().get(0).getReferenced();

				Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses = javaMutation.getMofPropertyWithGuardedSuperclasses(existingTransformationRule, /* excludeNegated: */true);

				List<ChainedMofProperty> mofSourceAssociationPropertyChains = mutation.getChainedAssociationProperties(mofClassSource, false, /* maxDepth= */1, /* mofPropertyWithGuardedSuperclasses= */mofPropertyWithGuardedSuperclasses);
				List<ChainedMofProperty> mofSourceAssociationPropertyCollectionChains = mutation.getDirectDescendantCollectionChainedProperties(mofSourceAssociationPropertyChains, /* mofPropertyWithGuardedSuperclasses= */mofPropertyWithGuardedSuperclasses);

				HashSet<MofClass> excludeChainsEndingIn = new HashSet<MofClass>();
				excludeChainsEndingIn.add(mofClassSource);

				mofSourceAssociationPropertyCollectionChains.forEach(chainedMofProperty -> {
					chainedMofProperty.toFlatLists(/* excludeChainsEndingIn: */excludeChainsEndingIn).forEach(l -> {
						variableOptions.add(new AddRuleOneToManyOfSameKindMutationOption(this, model, etlModule, mofClassSource, mofClassTarget, chainedMofProperty, l, existingTransformationRule));
					});
				});
			}
		}

		return variableOptions;
	}

	@Override
	protected void mutate(EtlModule etlModule, AddRuleOneToManyOfSameKindMutationOption option) {

		if (option.getExistingTransformationRule() != null) {
			etlModule.getTransformationRules().remove(option.getExistingTransformationRule());
		}

		etlModule.getTransformationRules().add(new EtlTransformationRuleImpl() {
			{
				setName(option.getSelectedMofClassSource().getName() + "2Many" + option.getSelectedMofClassTarget().getName() + "s");
				EolMofClassFormalParameterImpl sourceParameter;
				setSourceParameter(sourceParameter = new EolMofClassFormalParameterImpl() {
					{
						setName("source" + option.getSelectedMofClassSource().getName());
						setReferenced(option.getSelectedMofClassSource());
					}
				});
				EolMofClassFormalParameterImpl targetParameter;
				getTargetParameters().add(targetParameter = new EolMofClassFormalParameterImpl() {
					{
						setName("target" + option.getSelectedMofClassTarget().getName() + "s");
						setReferenced(option.getSelectedMofClassTarget());
						setIsSequence(true);
					}
				});
				if (option.getExistingTransformationRule() != null && option.getExistingTransformationRule().getGuard() != null) {
					setGuardName(option.getExistingTransformationRule().getGuardName());
					setGuard(EcoreUtil.copy(option.getExistingTransformationRule().getGuard()));
				}
				setBody(new EolStatementBlockImpl() {
					{
						getStatements().add(new EolForImpl() {
							{
								// for(sourceState in sourceTransition.Source.States) ( for(sourceClass in sourceUmlPackage.Classes) )
								setFormalParameter(new EolMofClassFormalParameterImpl() {
									{
										// sourceState ( sourceClass )
										setName("source" + mutation.getSingularOf(option.getSelectedMofClassSourceCollectionProperty().getMofProperty().getName()));
										// select the opposite class of the collection property
										setReferenced(option.getSelectedMofClassSourceCollectionProperty().getType());
										// sourceTransition.Source.States ( sourceUmlPackage.Classes )
										setIteratedSequence(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
												new EolFormalParameterReferenceExpressionImpl() {
													{
														setReferencedFormalParameter(sourceParameter);
													}
												},
												option.getSelectedMofClassSourceCollectionPropertyChain().stream().map(chainedMofProperty ->
														new EolMofPropertyFeatureCallImpl() {
															{
																setReferencedMofProperty(chainedMofProperty.getMofProperty());
															}
														}).collect(Collectors.toList())
												)));
									}
								});
								// var targetTransition = new Target!Transition;
								setStatementBlock(new EolStatementBlockImpl() {
									{
										final EolVariableDeclarationExpressionContainer targetVariableDeclaration = javaMutation.new EolVariableDeclarationExpressionContainer();
										getStatements().add(new EolAssignmentStatementImpl() {
											{
												// var targetTransition ( var target$TargetMofClassName )
												setLogicalExpressionLeft(javaMutation.toLogicalExpression(targetVariableDeclaration.setEolVariableDeclarationExpression(new EolVariableDeclarationExpressionImpl() {
													{
														setName("target" + option.getSelectedMofClassTarget().getName());
													}
												})));
												// new Target!Transition ( new Target!.... )
												setLogicalExpressionRight(javaMutation.toLogicalExpression(new EolNewExpressionImpl() {
													{
														setInstantiatedMofClass(targetParameter.getReferenced());
													}
												}));
											}
										});

										getStatements().add(new EolLogicalExpressionStatementImpl() {
											{
												// targetTransitions.add(targetTransition);
												setLogicalExpression(javaMutation.toLogicalExpression(javaMutation.toItemSelectorAndFeatureCallPostfixExpression(
														new EolFormalParameterReferenceExpressionImpl() {
															{
																setReferencedFormalParameter(targetParameter);
															}
														},
														new EolSimpleFeatureCallImpl() {
															{
																setName("add");
																setParameterList(new EolParameterListImpl() {
																	{
																		getLogicalExpressions().add(
																				javaMutation.toLogicalExpression(new EolVariableReferenceExpressionImpl() {
																					{
																						setReferencedVarableDeclaration(targetVariableDeclaration.getEolVariableDeclarationExpression());
																					}
																				}));
																	}
																});
															}
														}
														)));
											}
										});
									}
								});
							}
						});
					}
				});
			}
		});
	}
}
