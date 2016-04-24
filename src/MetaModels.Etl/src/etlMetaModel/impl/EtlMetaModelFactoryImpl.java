/**
 */
package etlMetaModel.impl;

import etlMetaModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtlMetaModelFactoryImpl extends EFactoryImpl implements EtlMetaModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EtlMetaModelFactory init() {
		try {
			EtlMetaModelFactory theEtlMetaModelFactory = (EtlMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(EtlMetaModelPackage.eNS_URI);
			if (theEtlMetaModelFactory != null) {
				return theEtlMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EtlMetaModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlMetaModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EtlMetaModelPackage.MOF_NAMED_ELEMENT: return createMofNamedElement();
			case EtlMetaModelPackage.MOF_TYPE: return createMofType();
			case EtlMetaModelPackage.MOF_CLASS: return createMofClass();
			case EtlMetaModelPackage.MOF_TYPED_ELEMENT: return createMofTypedElement();
			case EtlMetaModelPackage.MOF_MULTIPLICITY_ELEMENT: return createMofMultiplicityElement();
			case EtlMetaModelPackage.MOF_PROPERTY: return createMofProperty();
			case EtlMetaModelPackage.MOF_ASSOCIATION: return createMofAssociation();
			case EtlMetaModelPackage.MOF_PRIMITIVE_TYPE: return createMofPrimitiveType();
			case EtlMetaModelPackage.MOF_BOOLEAN: return createMofBoolean();
			case EtlMetaModelPackage.MOF_INTEGER: return createMofInteger();
			case EtlMetaModelPackage.MOF_STRING: return createMofString();
			case EtlMetaModelPackage.ETL_MODULE: return createEtlModule();
			case EtlMetaModelPackage.ERL_NAMED_RULE: return createErlNamedRule();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE: return createEtlTransformationRule();
			case EtlMetaModelPackage.EOL_LIBRARY_MODULE: return createEolLibraryModule();
			case EtlMetaModelPackage.EOL_OPERATION: return createEolOperation();
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER: return createEolMofClassFormalParameter();
			case EtlMetaModelPackage.EOL_EXECUTEABLE_ANNOTATION: return createEolExecuteableAnnotation();
			case EtlMetaModelPackage.SIMPLE_ANNOTATION: return createSimpleAnnotation();
			case EtlMetaModelPackage.MODEL_ELEMENT_TYPE: return createModelElementType();
			case EtlMetaModelPackage.EOL_NATIVE: return createEolNative();
			case EtlMetaModelPackage.EOL_BOOLEAN_TYPE: return createEolBooleanType();
			case EtlMetaModelPackage.EOL_REAL_TYPE: return createEolRealType();
			case EtlMetaModelPackage.EOL_INTEGER_TYPE: return createEolIntegerType();
			case EtlMetaModelPackage.EOL_STRING_TYPE: return createEolStringType();
			case EtlMetaModelPackage.EOL_MAP_TYPE: return createEolMapType();
			case EtlMetaModelPackage.EOL_ORDERED_SET_TYPE: return createEolOrderedSetType();
			case EtlMetaModelPackage.EOL_SET_TYPE: return createEolSetType();
			case EtlMetaModelPackage.EOL_BAG_TYPE: return createEolBagType();
			case EtlMetaModelPackage.EOL_SEQUENCE_TYPE: return createEolSequenceType();
			case EtlMetaModelPackage.EOL_EXPRESSION_OR_STATEMENT_BLOCK: return createEolExpressionOrStatementBlock();
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION: return createEolLogicalExpression();
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION: return createEolChainedLogicalExpression();
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION: return createEolRelationalExpression();
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION: return createEolChainedRelationalExpression();
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION: return createEolComparingToAdditiveRelationalExpression();
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION: return createEolAdditiveExpression();
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION: return createEolChainedAdditiveExpression();
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION: return createEolMultiplicativeExpression();
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION: return createEolChainedMultiplicativeExpression();
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION: return createEolUnaryExpression();
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR_NULLABLE: return createEolUnaryOpratorNullable();
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION: return createEolPostfixExpression();
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION: return createEolChainedFeatureCallPostfixExpression();
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION: return createEolItemSelectorExpression();
			case EtlMetaModelPackage.EOL_SIMPLE_FEATURE_CALL: return createEolSimpleFeatureCall();
			case EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL: return createEolMofPropertyFeatureCall();
			case EtlMetaModelPackage.ETL_EQUIVALENT_METHOD_FEATURE_CALL: return createEtlEquivalentMethodFeatureCall();
			case EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL: return createEolIsTypeOfSourceMofClassFeatureCall();
			case EtlMetaModelPackage.EOL_PARAMETER_LIST: return createEolParameterList();
			case EtlMetaModelPackage.EOL_NEW_EXPRESSION: return createEolNewExpression();
			case EtlMetaModelPackage.EOL_VARIABLE_DECLARATION_EXPRESSION: return createEolVariableDeclarationExpression();
			case EtlMetaModelPackage.EOL_STRING_LITERAL: return createEolStringLiteral();
			case EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION: return createEolFormalParameterReferenceExpression();
			case EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION: return createEolVariableReferenceExpression();
			case EtlMetaModelPackage.EOL_STATEMENT_BLOCK: return createEolStatementBlock();
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT: return createEolAssignmentStatement();
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT: return createEolAssignmentExpressionStatement();
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT: return createEolLogicalExpressionStatement();
			case EtlMetaModelPackage.EOL_FOR: return createEolFor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EtlMetaModelPackage.EOL_LOGICAL_OPERATOR:
				return createEolLogicalOperatorFromString(eDataType, initialValue);
			case EtlMetaModelPackage.EOL_RELATIONAL_OPERATOR:
				return createEolRelationalOperatorFromString(eDataType, initialValue);
			case EtlMetaModelPackage.EOL_ADDITIVE_COMPARISON_OPERATOR:
				return createEolAdditiveComparisonOperatorFromString(eDataType, initialValue);
			case EtlMetaModelPackage.EOL_ADDITIVE_ARITHMETICAL_OPERATOR:
				return createEolAdditiveArithmeticalOperatorFromString(eDataType, initialValue);
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_ARITHMETICAL_OPERATOR:
				return createEolMultiplicativeArithmeticalOperatorFromString(eDataType, initialValue);
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR:
				return createEolUnaryOpratorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EtlMetaModelPackage.EOL_LOGICAL_OPERATOR:
				return convertEolLogicalOperatorToString(eDataType, instanceValue);
			case EtlMetaModelPackage.EOL_RELATIONAL_OPERATOR:
				return convertEolRelationalOperatorToString(eDataType, instanceValue);
			case EtlMetaModelPackage.EOL_ADDITIVE_COMPARISON_OPERATOR:
				return convertEolAdditiveComparisonOperatorToString(eDataType, instanceValue);
			case EtlMetaModelPackage.EOL_ADDITIVE_ARITHMETICAL_OPERATOR:
				return convertEolAdditiveArithmeticalOperatorToString(eDataType, instanceValue);
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_ARITHMETICAL_OPERATOR:
				return convertEolMultiplicativeArithmeticalOperatorToString(eDataType, instanceValue);
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR:
				return convertEolUnaryOpratorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofNamedElement createMofNamedElement() {
		MofNamedElementImpl mofNamedElement = new MofNamedElementImpl();
		return mofNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofType createMofType() {
		MofTypeImpl mofType = new MofTypeImpl();
		return mofType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass createMofClass() {
		MofClassImpl mofClass = new MofClassImpl();
		return mofClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofTypedElement createMofTypedElement() {
		MofTypedElementImpl mofTypedElement = new MofTypedElementImpl();
		return mofTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofMultiplicityElement createMofMultiplicityElement() {
		MofMultiplicityElementImpl mofMultiplicityElement = new MofMultiplicityElementImpl();
		return mofMultiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofProperty createMofProperty() {
		MofPropertyImpl mofProperty = new MofPropertyImpl();
		return mofProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofAssociation createMofAssociation() {
		MofAssociationImpl mofAssociation = new MofAssociationImpl();
		return mofAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofPrimitiveType createMofPrimitiveType() {
		MofPrimitiveTypeImpl mofPrimitiveType = new MofPrimitiveTypeImpl();
		return mofPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofBoolean createMofBoolean() {
		MofBooleanImpl mofBoolean = new MofBooleanImpl();
		return mofBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofInteger createMofInteger() {
		MofIntegerImpl mofInteger = new MofIntegerImpl();
		return mofInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofString createMofString() {
		MofStringImpl mofString = new MofStringImpl();
		return mofString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlModule createEtlModule() {
		EtlModuleImpl etlModule = new EtlModuleImpl();
		return etlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErlNamedRule createErlNamedRule() {
		ErlNamedRuleImpl erlNamedRule = new ErlNamedRuleImpl();
		return erlNamedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlTransformationRule createEtlTransformationRule() {
		EtlTransformationRuleImpl etlTransformationRule = new EtlTransformationRuleImpl();
		return etlTransformationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLibraryModule createEolLibraryModule() {
		EolLibraryModuleImpl eolLibraryModule = new EolLibraryModuleImpl();
		return eolLibraryModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolOperation createEolOperation() {
		EolOperationImpl eolOperation = new EolOperationImpl();
		return eolOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMofClassFormalParameter createEolMofClassFormalParameter() {
		EolMofClassFormalParameterImpl eolMofClassFormalParameter = new EolMofClassFormalParameterImpl();
		return eolMofClassFormalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolExecuteableAnnotation createEolExecuteableAnnotation() {
		EolExecuteableAnnotationImpl eolExecuteableAnnotation = new EolExecuteableAnnotationImpl();
		return eolExecuteableAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleAnnotation createSimpleAnnotation() {
		SimpleAnnotationImpl simpleAnnotation = new SimpleAnnotationImpl();
		return simpleAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementType createModelElementType() {
		ModelElementTypeImpl modelElementType = new ModelElementTypeImpl();
		return modelElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolNative createEolNative() {
		EolNativeImpl eolNative = new EolNativeImpl();
		return eolNative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolBooleanType createEolBooleanType() {
		EolBooleanTypeImpl eolBooleanType = new EolBooleanTypeImpl();
		return eolBooleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolRealType createEolRealType() {
		EolRealTypeImpl eolRealType = new EolRealTypeImpl();
		return eolRealType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolIntegerType createEolIntegerType() {
		EolIntegerTypeImpl eolIntegerType = new EolIntegerTypeImpl();
		return eolIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolStringType createEolStringType() {
		EolStringTypeImpl eolStringType = new EolStringTypeImpl();
		return eolStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMapType createEolMapType() {
		EolMapTypeImpl eolMapType = new EolMapTypeImpl();
		return eolMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolOrderedSetType createEolOrderedSetType() {
		EolOrderedSetTypeImpl eolOrderedSetType = new EolOrderedSetTypeImpl();
		return eolOrderedSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolSetType createEolSetType() {
		EolSetTypeImpl eolSetType = new EolSetTypeImpl();
		return eolSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolBagType createEolBagType() {
		EolBagTypeImpl eolBagType = new EolBagTypeImpl();
		return eolBagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolSequenceType createEolSequenceType() {
		EolSequenceTypeImpl eolSequenceType = new EolSequenceTypeImpl();
		return eolSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolExpressionOrStatementBlock createEolExpressionOrStatementBlock() {
		EolExpressionOrStatementBlockImpl eolExpressionOrStatementBlock = new EolExpressionOrStatementBlockImpl();
		return eolExpressionOrStatementBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpression createEolLogicalExpression() {
		EolLogicalExpressionImpl eolLogicalExpression = new EolLogicalExpressionImpl();
		return eolLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedLogicalExpression createEolChainedLogicalExpression() {
		EolChainedLogicalExpressionImpl eolChainedLogicalExpression = new EolChainedLogicalExpressionImpl();
		return eolChainedLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolRelationalExpression createEolRelationalExpression() {
		EolRelationalExpressionImpl eolRelationalExpression = new EolRelationalExpressionImpl();
		return eolRelationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedRelationalExpression createEolChainedRelationalExpression() {
		EolChainedRelationalExpressionImpl eolChainedRelationalExpression = new EolChainedRelationalExpressionImpl();
		return eolChainedRelationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolComparingToAdditiveRelationalExpression createEolComparingToAdditiveRelationalExpression() {
		EolComparingToAdditiveRelationalExpressionImpl eolComparingToAdditiveRelationalExpression = new EolComparingToAdditiveRelationalExpressionImpl();
		return eolComparingToAdditiveRelationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdditiveExpression createEolAdditiveExpression() {
		EolAdditiveExpressionImpl eolAdditiveExpression = new EolAdditiveExpressionImpl();
		return eolAdditiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedAdditiveExpression createEolChainedAdditiveExpression() {
		EolChainedAdditiveExpressionImpl eolChainedAdditiveExpression = new EolChainedAdditiveExpressionImpl();
		return eolChainedAdditiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMultiplicativeExpression createEolMultiplicativeExpression() {
		EolMultiplicativeExpressionImpl eolMultiplicativeExpression = new EolMultiplicativeExpressionImpl();
		return eolMultiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedMultiplicativeExpression createEolChainedMultiplicativeExpression() {
		EolChainedMultiplicativeExpressionImpl eolChainedMultiplicativeExpression = new EolChainedMultiplicativeExpressionImpl();
		return eolChainedMultiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryExpression createEolUnaryExpression() {
		EolUnaryExpressionImpl eolUnaryExpression = new EolUnaryExpressionImpl();
		return eolUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryOpratorNullable createEolUnaryOpratorNullable() {
		EolUnaryOpratorNullableImpl eolUnaryOpratorNullable = new EolUnaryOpratorNullableImpl();
		return eolUnaryOpratorNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolPostfixExpression createEolPostfixExpression() {
		EolPostfixExpressionImpl eolPostfixExpression = new EolPostfixExpressionImpl();
		return eolPostfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedFeatureCallPostfixExpression createEolChainedFeatureCallPostfixExpression() {
		EolChainedFeatureCallPostfixExpressionImpl eolChainedFeatureCallPostfixExpression = new EolChainedFeatureCallPostfixExpressionImpl();
		return eolChainedFeatureCallPostfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolItemSelectorExpression createEolItemSelectorExpression() {
		EolItemSelectorExpressionImpl eolItemSelectorExpression = new EolItemSelectorExpressionImpl();
		return eolItemSelectorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolSimpleFeatureCall createEolSimpleFeatureCall() {
		EolSimpleFeatureCallImpl eolSimpleFeatureCall = new EolSimpleFeatureCallImpl();
		return eolSimpleFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMofPropertyFeatureCall createEolMofPropertyFeatureCall() {
		EolMofPropertyFeatureCallImpl eolMofPropertyFeatureCall = new EolMofPropertyFeatureCallImpl();
		return eolMofPropertyFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlEquivalentMethodFeatureCall createEtlEquivalentMethodFeatureCall() {
		EtlEquivalentMethodFeatureCallImpl etlEquivalentMethodFeatureCall = new EtlEquivalentMethodFeatureCallImpl();
		return etlEquivalentMethodFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolIsTypeOfSourceMofClassFeatureCall createEolIsTypeOfSourceMofClassFeatureCall() {
		EolIsTypeOfSourceMofClassFeatureCallImpl eolIsTypeOfSourceMofClassFeatureCall = new EolIsTypeOfSourceMofClassFeatureCallImpl();
		return eolIsTypeOfSourceMofClassFeatureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolParameterList createEolParameterList() {
		EolParameterListImpl eolParameterList = new EolParameterListImpl();
		return eolParameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolNewExpression createEolNewExpression() {
		EolNewExpressionImpl eolNewExpression = new EolNewExpressionImpl();
		return eolNewExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolVariableDeclarationExpression createEolVariableDeclarationExpression() {
		EolVariableDeclarationExpressionImpl eolVariableDeclarationExpression = new EolVariableDeclarationExpressionImpl();
		return eolVariableDeclarationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolStringLiteral createEolStringLiteral() {
		EolStringLiteralImpl eolStringLiteral = new EolStringLiteralImpl();
		return eolStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolFormalParameterReferenceExpression createEolFormalParameterReferenceExpression() {
		EolFormalParameterReferenceExpressionImpl eolFormalParameterReferenceExpression = new EolFormalParameterReferenceExpressionImpl();
		return eolFormalParameterReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolVariableReferenceExpression createEolVariableReferenceExpression() {
		EolVariableReferenceExpressionImpl eolVariableReferenceExpression = new EolVariableReferenceExpressionImpl();
		return eolVariableReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolStatementBlock createEolStatementBlock() {
		EolStatementBlockImpl eolStatementBlock = new EolStatementBlockImpl();
		return eolStatementBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAssignmentStatement createEolAssignmentStatement() {
		EolAssignmentStatementImpl eolAssignmentStatement = new EolAssignmentStatementImpl();
		return eolAssignmentStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAssignmentExpressionStatement createEolAssignmentExpressionStatement() {
		EolAssignmentExpressionStatementImpl eolAssignmentExpressionStatement = new EolAssignmentExpressionStatementImpl();
		return eolAssignmentExpressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpressionStatement createEolLogicalExpressionStatement() {
		EolLogicalExpressionStatementImpl eolLogicalExpressionStatement = new EolLogicalExpressionStatementImpl();
		return eolLogicalExpressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolFor createEolFor() {
		EolForImpl eolFor = new EolForImpl();
		return eolFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalOperator createEolLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		EolLogicalOperator result = EolLogicalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEolLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolRelationalOperator createEolRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		EolRelationalOperator result = EolRelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEolRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdditiveComparisonOperator createEolAdditiveComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		EolAdditiveComparisonOperator result = EolAdditiveComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEolAdditiveComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdditiveArithmeticalOperator createEolAdditiveArithmeticalOperatorFromString(EDataType eDataType, String initialValue) {
		EolAdditiveArithmeticalOperator result = EolAdditiveArithmeticalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEolAdditiveArithmeticalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMultiplicativeArithmeticalOperator createEolMultiplicativeArithmeticalOperatorFromString(EDataType eDataType, String initialValue) {
		EolMultiplicativeArithmeticalOperator result = EolMultiplicativeArithmeticalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEolMultiplicativeArithmeticalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryOprator createEolUnaryOpratorFromString(EDataType eDataType, String initialValue) {
		EolUnaryOprator result = EolUnaryOprator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEolUnaryOpratorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlMetaModelPackage getEtlMetaModelPackage() {
		return (EtlMetaModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EtlMetaModelPackage getPackage() {
		return EtlMetaModelPackage.eINSTANCE;
	}

} //EtlMetaModelFactoryImpl
