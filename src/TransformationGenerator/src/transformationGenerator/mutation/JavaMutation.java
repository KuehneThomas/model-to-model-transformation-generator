package transformationGenerator.mutation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import etlMetaModel.EolAdditiveArithmeticalOperator;
import etlMetaModel.EolAssignmentStatement;
import etlMetaModel.EolChainedAdditiveExpression;
import etlMetaModel.EolChainedFeatureCallPostfixExpression;
import etlMetaModel.EolFeatureCall;
import etlMetaModel.EolFor;
import etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall;
import etlMetaModel.EolItemSelectorExpression;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolLogicalOperator;
import etlMetaModel.EolMofPropertyFeatureCall;
import etlMetaModel.EolNewExpression;
import etlMetaModel.EolPostfixExpression;
import etlMetaModel.EolPrimitiveExpression;
import etlMetaModel.EolStatement;
import etlMetaModel.EolUnaryExpression;
import etlMetaModel.EolUnaryOprator;
import etlMetaModel.EolVariableDeclarationExpression;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;
import etlMetaModel.impl.EolAdditiveExpressionImpl;
import etlMetaModel.impl.EolChainedAdditiveExpressionImpl;
import etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl;
import etlMetaModel.impl.EolChainedLogicalExpressionImpl;
import etlMetaModel.impl.EolItemSelectorExpressionImpl;
import etlMetaModel.impl.EolLogicalExpressionImpl;
import etlMetaModel.impl.EolMultiplicativeExpressionImpl;
import etlMetaModel.impl.EolPostfixExpressionImpl;
import etlMetaModel.impl.EolRelationalExpressionImpl;
import etlMetaModel.impl.EolUnaryExpressionImpl;
import etlMetaModel.impl.EolUnaryOpratorNullableImpl;

public class JavaMutation {

	public EolLogicalExpression toLogicalExpression(EolUnaryOprator eolUnaryOperator, EolPostfixExpression eolPostfixExpression) {
		return toLogicalExpression(eolUnaryOperator, eolPostfixExpression, null);
	}

	public EolLogicalExpression toLogicalExpression(EolPostfixExpression eolPostfixExpression) {
		return toLogicalExpression(null, eolPostfixExpression, null);
	}

	public EolLogicalExpression toLogicalExpression(EolPostfixExpression eolPostfixExpression, EolChainedAdditiveExpression chainedAdditiveExpressionParam) {
		return toLogicalExpression(null, eolPostfixExpression, chainedAdditiveExpressionParam);
	}

	public EolLogicalExpression toLogicalExpression(EolUnaryOprator eolUnaryOperator, EolPostfixExpression eolPostfixExpression, EolChainedAdditiveExpression chainedAdditiveExpressionParam) {
		return new EolLogicalExpressionImpl() {
			{
				setRelationalExpression(new EolRelationalExpressionImpl() {
					{
						setAdditiveExpression(new EolAdditiveExpressionImpl() {
							{
								setMultiplicativeExpression(new EolMultiplicativeExpressionImpl() {
									{

										setUnaryExpression(new EolUnaryExpressionImpl() {
											{
												if (eolUnaryOperator != null) {
													setUnaryOperatorNullable(new EolUnaryOpratorNullableImpl() {
														{
															setUnaryOperator(eolUnaryOperator);
														}
													});
												}
												setPostfixExpression(eolPostfixExpression);
											}
										});
									}
								});
								setChainedAdditiveExpression(chainedAdditiveExpressionParam);
							}
						});
					}
				});
			}
		};
	}

	public void chainLogicalExpressions(EolLogicalExpression eolLogicalExpressionRoot, EolLogicalOperator eolLogicalOperator, EolLogicalExpression eolLogicalExpressionLeaf) {
		eolLogicalExpressionRoot.setChainedLogicalExpression(new EolChainedLogicalExpressionImpl() {
			{
				setLogicalOperator(eolLogicalOperator);
				setLogicalExpression(eolLogicalExpressionLeaf);
			}
		});
	}

	public EolChainedAdditiveExpression toChainedAdditiveExpression(EolAdditiveArithmeticalOperator additiveArithmeticalOperator, EolPostfixExpression eolPostfixExpression) {
		return toChainedAdditiveExpression(additiveArithmeticalOperator, eolPostfixExpression, null);
	}

	public EolChainedAdditiveExpression toChainedAdditiveExpression(EolAdditiveArithmeticalOperator additiveArithmeticalOperatorParam, EolPostfixExpression eolPostfixExpression, EolChainedAdditiveExpression chainedAdditiveExpressionParam) {
		return new EolChainedAdditiveExpressionImpl() {
			{
				setAdditiveArithmeticalOperator(additiveArithmeticalOperatorParam);
				setAdditiveExpression(new EolAdditiveExpressionImpl() {
					{
						setMultiplicativeExpression(new EolMultiplicativeExpressionImpl() {
							{
								setUnaryExpression(new EolUnaryExpressionImpl() {
									{
										setPostfixExpression(eolPostfixExpression);
									}
								});
							}
						});
						setChainedAdditiveExpression(chainedAdditiveExpressionParam);
					}
				});
			}
		};
	}

	public EolLogicalExpression toLogicalExpression(EolItemSelectorExpression eolItemSelectorExpression) {
		return toLogicalExpression(new EolPostfixExpressionImpl() {
			{
				setItemSelectorExpression(eolItemSelectorExpression);
			}
		});
	}

	public EolLogicalExpression toLogicalExpression(EolPrimitiveExpression eolPrimitiveExpression) {
		return toLogicalExpression(new EolItemSelectorExpressionImpl() {
			{
				setPrimitiveExpression(eolPrimitiveExpression);
			}
		});
	}

	public EolPostfixExpressionImpl toItemSelectorAndFeatureCallPostfixExpression(EolPrimitiveExpression eolPrimitiveExpression) {
		return toItemSelectorAndFeatureCallPostfixExpression(eolPrimitiveExpression, new ArrayList<EolFeatureCall>());
	}

	@SuppressWarnings("serial")
	public EolPostfixExpressionImpl toItemSelectorAndFeatureCallPostfixExpression(EolPrimitiveExpression eolPrimitiveExpression, EolFeatureCall eolFeatureCall) {
		return toItemSelectorAndFeatureCallPostfixExpression(eolPrimitiveExpression, new ArrayList<EolFeatureCall>() {
			{
				add(eolFeatureCall);
			}
		});
	}

	public EolPostfixExpressionImpl toItemSelectorAndFeatureCallPostfixExpression(EolPrimitiveExpression eolPrimitiveExpression, List<EolFeatureCall> eolFeatureCalls) {
		return new EolPostfixExpressionImpl() {
			{
				setItemSelectorExpression(new EolItemSelectorExpressionImpl() {
					{
						setPrimitiveExpression(eolPrimitiveExpression);
					}
				});

				EolChainedFeatureCallPostfixExpression previousEolChainedFeatureCallPostfixExpression = null;
				for (EolFeatureCall eolFeatureCall : eolFeatureCalls) {
					EolChainedFeatureCallPostfixExpression eolChainedFeatureCallPostfixExpression = new EolChainedFeatureCallPostfixExpressionImpl() {
						{
							setFeatureCall(eolFeatureCall);
						}
					};
					if (previousEolChainedFeatureCallPostfixExpression == null) {
						setChainedFeatureCallPostfixExpression(eolChainedFeatureCallPostfixExpression);
					} else {
						previousEolChainedFeatureCallPostfixExpression.setChainedFeatureCallPostfixExpression(eolChainedFeatureCallPostfixExpression);
					}
					previousEolChainedFeatureCallPostfixExpression = eolChainedFeatureCallPostfixExpression;
				}
			}

		};
	}

	// required to easily create variable references accross enclosing types (variables must be final and cannot be modified directly, hence this "trick" with the container)
	public class EolVariableDeclarationExpressionContainer {
		private EolVariableDeclarationExpression eolVariableDeclarationExpression;

		public EolVariableDeclarationExpression getEolVariableDeclarationExpression() {
			return eolVariableDeclarationExpression;
		}

		public EolVariableDeclarationExpression setEolVariableDeclarationExpression(EolVariableDeclarationExpression eolVariableDeclarationExpression) {
			return this.eolVariableDeclarationExpression = eolVariableDeclarationExpression;
		}
	}

	// reverse queries

	public class EolVariableDeclarationWithNewExpressionContainer {
		private EolVariableDeclarationExpression eolVariableDeclarationExpression;
		private EolNewExpression eolNewExpression;

		public EolVariableDeclarationWithNewExpressionContainer(EolVariableDeclarationExpression eolVariableDeclarationExpression, EolNewExpression eolNewExpression) {
			this.eolVariableDeclarationExpression = eolVariableDeclarationExpression;
			this.eolNewExpression = eolNewExpression;
		}

		public EolVariableDeclarationExpression getEolVariableDeclarationExpression() {
			return eolVariableDeclarationExpression;
		}

		public EolNewExpression getEolNewExpression() {
			return eolNewExpression;
		}

	}

	public EolVariableDeclarationWithNewExpressionContainer getFirstVariableDeclarationInForLoop(EolFor eolFor) {
		Optional<EolAssignmentStatement> firstAssigmentStatement = eolFor.getStatementBlock().getStatements().stream().filter(s -> s instanceof EolAssignmentStatement).map(s -> (EolAssignmentStatement) s).findFirst();

		if (firstAssigmentStatement.isPresent()) {
			EolPrimitiveExpression leftPrimitiveExpression = getPrimitiveExpression(firstAssigmentStatement.get().getLogicalExpressionLeft());
			EolPrimitiveExpression rightPrimitiveExpression = getPrimitiveExpression(firstAssigmentStatement.get().getLogicalExpressionRight());
			if (leftPrimitiveExpression instanceof EolVariableDeclarationExpression &&
					rightPrimitiveExpression instanceof EolNewExpression) {
				return new EolVariableDeclarationWithNewExpressionContainer((EolVariableDeclarationExpression) leftPrimitiveExpression, (EolNewExpression) rightPrimitiveExpression);
			}
		}
		return null;
	}

	public List<EolUnaryExpression> getUnaryExpressions(EolLogicalExpression eolLogicalExpression) {
		List<EolUnaryExpression> eolUnaryExpressions = new ArrayList<EolUnaryExpression>();

		EolLogicalExpression currentEolLogicalExpression = eolLogicalExpression;
		while (currentEolLogicalExpression != null) {
			eolUnaryExpressions.add(getUnaryExpression(currentEolLogicalExpression));
			if (currentEolLogicalExpression.getChainedLogicalExpression() != null) {
				currentEolLogicalExpression = currentEolLogicalExpression.getChainedLogicalExpression().getLogicalExpression();
			} else {
				currentEolLogicalExpression = null;
			}
		}

		return eolUnaryExpressions;
	}

	private EolUnaryExpression getUnaryExpression(EolLogicalExpression eolLogicalExpression) {
		return eolLogicalExpression.getRelationalExpression().getAdditiveExpression().getMultiplicativeExpression().getUnaryExpression();
	}

	private EolPostfixExpression getPostfixExpression(EolLogicalExpression eolLogicalExpression) {
		return eolLogicalExpression.getRelationalExpression().getAdditiveExpression().getMultiplicativeExpression().getUnaryExpression().getPostfixExpression();
	}

	public EolPrimitiveExpression getPrimitiveExpression(EolLogicalExpression eolLogicalExpression) {
		return getPostfixExpression(eolLogicalExpression).getItemSelectorExpression().getPrimitiveExpression();
	}

	public EolMofPropertyFeatureCall getFirstMofPropertyFeatureCall(EolLogicalExpression eolLogicalExpression) {
		EolPostfixExpression postfixExpression = getPostfixExpression(eolLogicalExpression);
		return getFirstMofPropertyFeatureCall(postfixExpression);
	}

	public EolMofPropertyFeatureCall getFirstMofPropertyFeatureCall(EolPostfixExpression postfixExpression) {
		if (postfixExpression.getChainedFeatureCallPostfixExpression() != null && postfixExpression.getChainedFeatureCallPostfixExpression().getFeatureCall() != null) {
			return (EolMofPropertyFeatureCall) postfixExpression.getChainedFeatureCallPostfixExpression().getFeatureCall();
		} else {
			return null;
		}
	}

	public EolIsTypeOfSourceMofClassFeatureCall getFirstIsTypeOfSourceMofClassFeatureCall(EolPostfixExpression postfixExpression) {
		EolChainedFeatureCallPostfixExpression eolChainedFeatureCallPostfixExpression = postfixExpression.getChainedFeatureCallPostfixExpression();

		while (eolChainedFeatureCallPostfixExpression != null && eolChainedFeatureCallPostfixExpression.getFeatureCall() != null) {
			if (eolChainedFeatureCallPostfixExpression.getFeatureCall() instanceof EolIsTypeOfSourceMofClassFeatureCall) {
				return (EolIsTypeOfSourceMofClassFeatureCall) eolChainedFeatureCallPostfixExpression.getFeatureCall();
			} else {
				eolChainedFeatureCallPostfixExpression = postfixExpression.getChainedFeatureCallPostfixExpression().getChainedFeatureCallPostfixExpression();
			}
		}
		return null;
	}

	public Map<MofProperty, List<MofClass>> getMofPropertyWithGuardedSuperclasses(EtlTransformationRule etlTransformationRule, Boolean excludeNegated) {
		Map<MofProperty, List<MofClass>> mofPropertyWithGuardedSuperclasses = new HashMap<MofProperty, List<MofClass>>();
		if (etlTransformationRule.getGuard() != null) {
			mofPropertyWithGuardedSuperclasses = getUnaryExpressions(etlTransformationRule.getGuard()).stream()
					.filter(unaryExpression -> !excludeNegated || unaryExpression.getUnaryOperatorNullable() == null || unaryExpression.getUnaryOperatorNullable().getUnaryOperator() != EolUnaryOprator.NOT)
					.collect(Collectors.groupingBy(
							unaryExpression -> getFirstMofPropertyFeatureCall(unaryExpression.getPostfixExpression()).getReferencedMofProperty(),
							Collectors.mapping(unaryExpression -> getFirstIsTypeOfSourceMofClassFeatureCall(unaryExpression.getPostfixExpression()).getReferencedMofClass(), Collectors.toList())));
		}
		return mofPropertyWithGuardedSuperclasses;
	}

	// modify

	public void removeExistingMofPropertyAssignment(List<EolStatement> existingStatements, MofProperty mofProperty) {
		existingStatements.stream()
				.filter(s -> s instanceof EolAssignmentStatement)
				.map(s -> (EolAssignmentStatement) s)
				.filter(as -> {
					EolMofPropertyFeatureCall eolMofPropertyFeatureCall = getFirstMofPropertyFeatureCall(as.getLogicalExpressionLeft());
					if (eolMofPropertyFeatureCall != null) {
						return eolMofPropertyFeatureCall.getReferencedMofProperty() == mofProperty;
					} else {
						return false;
					}
				})
				.findFirst()
				.ifPresent(as -> existingStatements.remove(as));
	}

}
