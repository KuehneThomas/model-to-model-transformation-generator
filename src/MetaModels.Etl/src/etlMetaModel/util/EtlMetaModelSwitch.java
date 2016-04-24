/**
 */
package etlMetaModel.util;

import etlMetaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see etlMetaModel.EtlMetaModelPackage
 * @generated
 */
public class EtlMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EtlMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = EtlMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EtlMetaModelPackage.MOF_NAMED_ELEMENT: {
				MofNamedElement mofNamedElement = (MofNamedElement)theEObject;
				T result = caseMofNamedElement(mofNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_TYPE: {
				MofType mofType = (MofType)theEObject;
				T result = caseMofType(mofType);
				if (result == null) result = caseMofNamedElement(mofType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_CLASS: {
				MofClass mofClass = (MofClass)theEObject;
				T result = caseMofClass(mofClass);
				if (result == null) result = caseMofType(mofClass);
				if (result == null) result = caseMofNamedElement(mofClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_TYPED_ELEMENT: {
				MofTypedElement mofTypedElement = (MofTypedElement)theEObject;
				T result = caseMofTypedElement(mofTypedElement);
				if (result == null) result = caseMofNamedElement(mofTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_MULTIPLICITY_ELEMENT: {
				MofMultiplicityElement mofMultiplicityElement = (MofMultiplicityElement)theEObject;
				T result = caseMofMultiplicityElement(mofMultiplicityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_PROPERTY: {
				MofProperty mofProperty = (MofProperty)theEObject;
				T result = caseMofProperty(mofProperty);
				if (result == null) result = caseMofTypedElement(mofProperty);
				if (result == null) result = caseMofMultiplicityElement(mofProperty);
				if (result == null) result = caseMofNamedElement(mofProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_ASSOCIATION: {
				MofAssociation mofAssociation = (MofAssociation)theEObject;
				T result = caseMofAssociation(mofAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_PRIMITIVE_TYPE: {
				MofPrimitiveType mofPrimitiveType = (MofPrimitiveType)theEObject;
				T result = caseMofPrimitiveType(mofPrimitiveType);
				if (result == null) result = caseMofType(mofPrimitiveType);
				if (result == null) result = caseMofNamedElement(mofPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_BOOLEAN: {
				MofBoolean mofBoolean = (MofBoolean)theEObject;
				T result = caseMofBoolean(mofBoolean);
				if (result == null) result = caseMofPrimitiveType(mofBoolean);
				if (result == null) result = caseMofType(mofBoolean);
				if (result == null) result = caseMofNamedElement(mofBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_INTEGER: {
				MofInteger mofInteger = (MofInteger)theEObject;
				T result = caseMofInteger(mofInteger);
				if (result == null) result = caseMofPrimitiveType(mofInteger);
				if (result == null) result = caseMofType(mofInteger);
				if (result == null) result = caseMofNamedElement(mofInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MOF_STRING: {
				MofString mofString = (MofString)theEObject;
				T result = caseMofString(mofString);
				if (result == null) result = caseMofPrimitiveType(mofString);
				if (result == null) result = caseMofType(mofString);
				if (result == null) result = caseMofNamedElement(mofString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.ETL_MODULE: {
				EtlModule etlModule = (EtlModule)theEObject;
				T result = caseEtlModule(etlModule);
				if (result == null) result = caseEolLibraryModule(etlModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.ERL_NAMED_RULE: {
				ErlNamedRule erlNamedRule = (ErlNamedRule)theEObject;
				T result = caseErlNamedRule(erlNamedRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE: {
				EtlTransformationRule etlTransformationRule = (EtlTransformationRule)theEObject;
				T result = caseEtlTransformationRule(etlTransformationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_LIBRARY_MODULE: {
				EolLibraryModule eolLibraryModule = (EolLibraryModule)theEObject;
				T result = caseEolLibraryModule(eolLibraryModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_OPERATION: {
				EolOperation eolOperation = (EolOperation)theEObject;
				T result = caseEolOperation(eolOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_FORMAL_PARAMETER: {
				EolFormalParameter eolFormalParameter = (EolFormalParameter)theEObject;
				T result = caseEolFormalParameter(eolFormalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER: {
				EolMofClassFormalParameter eolMofClassFormalParameter = (EolMofClassFormalParameter)theEObject;
				T result = caseEolMofClassFormalParameter(eolMofClassFormalParameter);
				if (result == null) result = caseEolFormalParameter(eolMofClassFormalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_ANNOTATION: {
				EolAnnotation eolAnnotation = (EolAnnotation)theEObject;
				T result = caseEolAnnotation(eolAnnotation);
				if (result == null) result = caseEolExecuteableAnnotation(eolAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_EXECUTEABLE_ANNOTATION: {
				EolExecuteableAnnotation eolExecuteableAnnotation = (EolExecuteableAnnotation)theEObject;
				T result = caseEolExecuteableAnnotation(eolExecuteableAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.SIMPLE_ANNOTATION: {
				SimpleAnnotation simpleAnnotation = (SimpleAnnotation)theEObject;
				T result = caseSimpleAnnotation(simpleAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_TYPE: {
				EolType eolType = (EolType)theEObject;
				T result = caseEolType(eolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_ANY_TYPE: {
				EolAnyType eolAnyType = (EolAnyType)theEObject;
				T result = caseEolAnyType(eolAnyType);
				if (result == null) result = caseEolType(eolAnyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.MODEL_ELEMENT_TYPE: {
				ModelElementType modelElementType = (ModelElementType)theEObject;
				T result = caseModelElementType(modelElementType);
				if (result == null) result = caseEolType(modelElementType);
				if (result == null) result = caseEolPrimitiveExpression(modelElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_NATIVE: {
				EolNative eolNative = (EolNative)theEObject;
				T result = caseEolNative(eolNative);
				if (result == null) result = caseEolType(eolNative);
				if (result == null) result = caseEolPrimitiveExpression(eolNative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_PRIMITIVE_TYPE: {
				EolPrimitiveType eolPrimitiveType = (EolPrimitiveType)theEObject;
				T result = caseEolPrimitiveType(eolPrimitiveType);
				if (result == null) result = caseEolType(eolPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_BOOLEAN_TYPE: {
				EolBooleanType eolBooleanType = (EolBooleanType)theEObject;
				T result = caseEolBooleanType(eolBooleanType);
				if (result == null) result = caseEolPrimitiveType(eolBooleanType);
				if (result == null) result = caseEolType(eolBooleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_REAL_TYPE: {
				EolRealType eolRealType = (EolRealType)theEObject;
				T result = caseEolRealType(eolRealType);
				if (result == null) result = caseEolPrimitiveType(eolRealType);
				if (result == null) result = caseEolType(eolRealType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_INTEGER_TYPE: {
				EolIntegerType eolIntegerType = (EolIntegerType)theEObject;
				T result = caseEolIntegerType(eolIntegerType);
				if (result == null) result = caseEolRealType(eolIntegerType);
				if (result == null) result = caseEolPrimitiveType(eolIntegerType);
				if (result == null) result = caseEolType(eolIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_STRING_TYPE: {
				EolStringType eolStringType = (EolStringType)theEObject;
				T result = caseEolStringType(eolStringType);
				if (result == null) result = caseEolPrimitiveType(eolStringType);
				if (result == null) result = caseEolType(eolStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_MAP_TYPE: {
				EolMapType eolMapType = (EolMapType)theEObject;
				T result = caseEolMapType(eolMapType);
				if (result == null) result = caseEolType(eolMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_COLLECTION_TYPE: {
				EolCollectionType eolCollectionType = (EolCollectionType)theEObject;
				T result = caseEolCollectionType(eolCollectionType);
				if (result == null) result = caseEolType(eolCollectionType);
				if (result == null) result = caseEolPrimitiveExpression(eolCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_ORDERED_SET_TYPE: {
				EolOrderedSetType eolOrderedSetType = (EolOrderedSetType)theEObject;
				T result = caseEolOrderedSetType(eolOrderedSetType);
				if (result == null) result = caseEolCollectionType(eolOrderedSetType);
				if (result == null) result = caseEolType(eolOrderedSetType);
				if (result == null) result = caseEolPrimitiveExpression(eolOrderedSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_SET_TYPE: {
				EolSetType eolSetType = (EolSetType)theEObject;
				T result = caseEolSetType(eolSetType);
				if (result == null) result = caseEolCollectionType(eolSetType);
				if (result == null) result = caseEolType(eolSetType);
				if (result == null) result = caseEolPrimitiveExpression(eolSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_BAG_TYPE: {
				EolBagType eolBagType = (EolBagType)theEObject;
				T result = caseEolBagType(eolBagType);
				if (result == null) result = caseEolCollectionType(eolBagType);
				if (result == null) result = caseEolType(eolBagType);
				if (result == null) result = caseEolPrimitiveExpression(eolBagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_SEQUENCE_TYPE: {
				EolSequenceType eolSequenceType = (EolSequenceType)theEObject;
				T result = caseEolSequenceType(eolSequenceType);
				if (result == null) result = caseEolCollectionType(eolSequenceType);
				if (result == null) result = caseEolType(eolSequenceType);
				if (result == null) result = caseEolPrimitiveExpression(eolSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_EXPRESSION_OR_STATEMENT_BLOCK: {
				EolExpressionOrStatementBlock eolExpressionOrStatementBlock = (EolExpressionOrStatementBlock)theEObject;
				T result = caseEolExpressionOrStatementBlock(eolExpressionOrStatementBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION: {
				EolLogicalExpression eolLogicalExpression = (EolLogicalExpression)theEObject;
				T result = caseEolLogicalExpression(eolLogicalExpression);
				if (result == null) result = caseEolExpressionOrStatementBlock(eolLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION: {
				EolChainedLogicalExpression eolChainedLogicalExpression = (EolChainedLogicalExpression)theEObject;
				T result = caseEolChainedLogicalExpression(eolChainedLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION: {
				EolRelationalExpression eolRelationalExpression = (EolRelationalExpression)theEObject;
				T result = caseEolRelationalExpression(eolRelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_GENERIC_CHAINED_RELATIONAL_EXPRESSION: {
				EolGenericChainedRelationalExpression eolGenericChainedRelationalExpression = (EolGenericChainedRelationalExpression)theEObject;
				T result = caseEolGenericChainedRelationalExpression(eolGenericChainedRelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION: {
				EolChainedRelationalExpression eolChainedRelationalExpression = (EolChainedRelationalExpression)theEObject;
				T result = caseEolChainedRelationalExpression(eolChainedRelationalExpression);
				if (result == null) result = caseEolGenericChainedRelationalExpression(eolChainedRelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION: {
				EolComparingToAdditiveRelationalExpression eolComparingToAdditiveRelationalExpression = (EolComparingToAdditiveRelationalExpression)theEObject;
				T result = caseEolComparingToAdditiveRelationalExpression(eolComparingToAdditiveRelationalExpression);
				if (result == null) result = caseEolGenericChainedRelationalExpression(eolComparingToAdditiveRelationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION: {
				EolAdditiveExpression eolAdditiveExpression = (EolAdditiveExpression)theEObject;
				T result = caseEolAdditiveExpression(eolAdditiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION: {
				EolChainedAdditiveExpression eolChainedAdditiveExpression = (EolChainedAdditiveExpression)theEObject;
				T result = caseEolChainedAdditiveExpression(eolChainedAdditiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION: {
				EolMultiplicativeExpression eolMultiplicativeExpression = (EolMultiplicativeExpression)theEObject;
				T result = caseEolMultiplicativeExpression(eolMultiplicativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION: {
				EolChainedMultiplicativeExpression eolChainedMultiplicativeExpression = (EolChainedMultiplicativeExpression)theEObject;
				T result = caseEolChainedMultiplicativeExpression(eolChainedMultiplicativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION: {
				EolUnaryExpression eolUnaryExpression = (EolUnaryExpression)theEObject;
				T result = caseEolUnaryExpression(eolUnaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR_NULLABLE: {
				EolUnaryOpratorNullable eolUnaryOpratorNullable = (EolUnaryOpratorNullable)theEObject;
				T result = caseEolUnaryOpratorNullable(eolUnaryOpratorNullable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION: {
				EolPostfixExpression eolPostfixExpression = (EolPostfixExpression)theEObject;
				T result = caseEolPostfixExpression(eolPostfixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION: {
				EolChainedFeatureCallPostfixExpression eolChainedFeatureCallPostfixExpression = (EolChainedFeatureCallPostfixExpression)theEObject;
				T result = caseEolChainedFeatureCallPostfixExpression(eolChainedFeatureCallPostfixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION: {
				EolItemSelectorExpression eolItemSelectorExpression = (EolItemSelectorExpression)theEObject;
				T result = caseEolItemSelectorExpression(eolItemSelectorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_FEATURE_CALL: {
				EolFeatureCall eolFeatureCall = (EolFeatureCall)theEObject;
				T result = caseEolFeatureCall(eolFeatureCall);
				if (result == null) result = caseEolPrimitiveExpression(eolFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_SIMPLE_FEATURE_CALL: {
				EolSimpleFeatureCall eolSimpleFeatureCall = (EolSimpleFeatureCall)theEObject;
				T result = caseEolSimpleFeatureCall(eolSimpleFeatureCall);
				if (result == null) result = caseEolFeatureCall(eolSimpleFeatureCall);
				if (result == null) result = caseEolPrimitiveExpression(eolSimpleFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL: {
				EolMofPropertyFeatureCall eolMofPropertyFeatureCall = (EolMofPropertyFeatureCall)theEObject;
				T result = caseEolMofPropertyFeatureCall(eolMofPropertyFeatureCall);
				if (result == null) result = caseEolFeatureCall(eolMofPropertyFeatureCall);
				if (result == null) result = caseEolPrimitiveExpression(eolMofPropertyFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.ETL_EQUIVALENT_METHOD_FEATURE_CALL: {
				EtlEquivalentMethodFeatureCall etlEquivalentMethodFeatureCall = (EtlEquivalentMethodFeatureCall)theEObject;
				T result = caseEtlEquivalentMethodFeatureCall(etlEquivalentMethodFeatureCall);
				if (result == null) result = caseEolFeatureCall(etlEquivalentMethodFeatureCall);
				if (result == null) result = caseEolPrimitiveExpression(etlEquivalentMethodFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL: {
				EolIsTypeOfSourceMofClassFeatureCall eolIsTypeOfSourceMofClassFeatureCall = (EolIsTypeOfSourceMofClassFeatureCall)theEObject;
				T result = caseEolIsTypeOfSourceMofClassFeatureCall(eolIsTypeOfSourceMofClassFeatureCall);
				if (result == null) result = caseEolFeatureCall(eolIsTypeOfSourceMofClassFeatureCall);
				if (result == null) result = caseEolPrimitiveExpression(eolIsTypeOfSourceMofClassFeatureCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_PARAMETER_LIST: {
				EolParameterList eolParameterList = (EolParameterList)theEObject;
				T result = caseEolParameterList(eolParameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_NEW_EXPRESSION: {
				EolNewExpression eolNewExpression = (EolNewExpression)theEObject;
				T result = caseEolNewExpression(eolNewExpression);
				if (result == null) result = caseEolPrimitiveExpression(eolNewExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_VARIABLE_DECLARATION_EXPRESSION: {
				EolVariableDeclarationExpression eolVariableDeclarationExpression = (EolVariableDeclarationExpression)theEObject;
				T result = caseEolVariableDeclarationExpression(eolVariableDeclarationExpression);
				if (result == null) result = caseEolPrimitiveExpression(eolVariableDeclarationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_PRIMITIVE_EXPRESSION: {
				EolPrimitiveExpression eolPrimitiveExpression = (EolPrimitiveExpression)theEObject;
				T result = caseEolPrimitiveExpression(eolPrimitiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_LITERAL: {
				EolLiteral eolLiteral = (EolLiteral)theEObject;
				T result = caseEolLiteral(eolLiteral);
				if (result == null) result = caseEolPrimitiveExpression(eolLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_STRING_LITERAL: {
				EolStringLiteral eolStringLiteral = (EolStringLiteral)theEObject;
				T result = caseEolStringLiteral(eolStringLiteral);
				if (result == null) result = caseEolPrimitiveExpression(eolStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_REFERENCE_EXPRESSION: {
				EolReferenceExpression eolReferenceExpression = (EolReferenceExpression)theEObject;
				T result = caseEolReferenceExpression(eolReferenceExpression);
				if (result == null) result = caseEolPrimitiveExpression(eolReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION: {
				EolFormalParameterReferenceExpression eolFormalParameterReferenceExpression = (EolFormalParameterReferenceExpression)theEObject;
				T result = caseEolFormalParameterReferenceExpression(eolFormalParameterReferenceExpression);
				if (result == null) result = caseEolReferenceExpression(eolFormalParameterReferenceExpression);
				if (result == null) result = caseEolPrimitiveExpression(eolFormalParameterReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION: {
				EolVariableReferenceExpression eolVariableReferenceExpression = (EolVariableReferenceExpression)theEObject;
				T result = caseEolVariableReferenceExpression(eolVariableReferenceExpression);
				if (result == null) result = caseEolReferenceExpression(eolVariableReferenceExpression);
				if (result == null) result = caseEolPrimitiveExpression(eolVariableReferenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_STATEMENT_BLOCK: {
				EolStatementBlock eolStatementBlock = (EolStatementBlock)theEObject;
				T result = caseEolStatementBlock(eolStatementBlock);
				if (result == null) result = caseEolExpressionOrStatementBlock(eolStatementBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_STATEMENT: {
				EolStatement eolStatement = (EolStatement)theEObject;
				T result = caseEolStatement(eolStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT: {
				EolAssignmentStatement eolAssignmentStatement = (EolAssignmentStatement)theEObject;
				T result = caseEolAssignmentStatement(eolAssignmentStatement);
				if (result == null) result = caseEolStatement(eolAssignmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_EXPRESSION_STATEMENT: {
				EolExpressionStatement eolExpressionStatement = (EolExpressionStatement)theEObject;
				T result = caseEolExpressionStatement(eolExpressionStatement);
				if (result == null) result = caseEolStatement(eolExpressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT: {
				EolAssignmentExpressionStatement eolAssignmentExpressionStatement = (EolAssignmentExpressionStatement)theEObject;
				T result = caseEolAssignmentExpressionStatement(eolAssignmentExpressionStatement);
				if (result == null) result = caseEolExpressionStatement(eolAssignmentExpressionStatement);
				if (result == null) result = caseEolStatement(eolAssignmentExpressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT: {
				EolLogicalExpressionStatement eolLogicalExpressionStatement = (EolLogicalExpressionStatement)theEObject;
				T result = caseEolLogicalExpressionStatement(eolLogicalExpressionStatement);
				if (result == null) result = caseEolExpressionStatement(eolLogicalExpressionStatement);
				if (result == null) result = caseEolStatement(eolLogicalExpressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EtlMetaModelPackage.EOL_FOR: {
				EolFor eolFor = (EolFor)theEObject;
				T result = caseEolFor(eolFor);
				if (result == null) result = caseEolStatement(eolFor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofNamedElement(MofNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofType(MofType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofClass(MofClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofTypedElement(MofTypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofMultiplicityElement(MofMultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofProperty(MofProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofAssociation(MofAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofPrimitiveType(MofPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofBoolean(MofBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofInteger(MofInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofString(MofString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etl Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etl Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtlModule(EtlModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Erl Named Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Erl Named Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErlNamedRule(ErlNamedRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etl Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etl Transformation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtlTransformationRule(EtlTransformationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Library Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Library Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolLibraryModule(EolLibraryModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolOperation(EolOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolFormalParameter(EolFormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Mof Class Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Mof Class Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolMofClassFormalParameter(EolMofClassFormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolAnnotation(EolAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Executeable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Executeable Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolExecuteableAnnotation(EolExecuteableAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAnnotation(SimpleAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolType(EolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Any Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Any Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolAnyType(EolAnyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementType(ModelElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Native</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Native</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolNative(EolNative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolPrimitiveType(EolPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolBooleanType(EolBooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolRealType(EolRealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolIntegerType(EolIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolStringType(EolStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolMapType(EolMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolCollectionType(EolCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Ordered Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Ordered Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolOrderedSetType(EolOrderedSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolSetType(EolSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolBagType(EolBagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolSequenceType(EolSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Expression Or Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Expression Or Statement Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolExpressionOrStatementBlock(EolExpressionOrStatementBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolLogicalExpression(EolLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Chained Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Chained Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolChainedLogicalExpression(EolChainedLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolRelationalExpression(EolRelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Generic Chained Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Generic Chained Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolGenericChainedRelationalExpression(EolGenericChainedRelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Chained Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Chained Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolChainedRelationalExpression(EolChainedRelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Comparing To Additive Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Comparing To Additive Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolComparingToAdditiveRelationalExpression(EolComparingToAdditiveRelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Additive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolAdditiveExpression(EolAdditiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Chained Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Chained Additive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolChainedAdditiveExpression(EolChainedAdditiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Multiplicative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolMultiplicativeExpression(EolMultiplicativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Chained Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Chained Multiplicative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolChainedMultiplicativeExpression(EolChainedMultiplicativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolUnaryExpression(EolUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Unary Oprator Nullable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Unary Oprator Nullable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolUnaryOpratorNullable(EolUnaryOpratorNullable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Postfix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolPostfixExpression(EolPostfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Chained Feature Call Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Chained Feature Call Postfix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolChainedFeatureCallPostfixExpression(EolChainedFeatureCallPostfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Item Selector Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Item Selector Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolItemSelectorExpression(EolItemSelectorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolFeatureCall(EolFeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Simple Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Simple Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolSimpleFeatureCall(EolSimpleFeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Mof Property Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Mof Property Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolMofPropertyFeatureCall(EolMofPropertyFeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etl Equivalent Method Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etl Equivalent Method Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtlEquivalentMethodFeatureCall(EtlEquivalentMethodFeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Is Type Of Source Mof Class Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Is Type Of Source Mof Class Feature Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolIsTypeOfSourceMofClassFeatureCall(EolIsTypeOfSourceMofClassFeatureCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolParameterList(EolParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol New Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolNewExpression(EolNewExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Variable Declaration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Variable Declaration Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolVariableDeclarationExpression(EolVariableDeclarationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Primitive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Primitive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolPrimitiveExpression(EolPrimitiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolLiteral(EolLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolStringLiteral(EolStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolReferenceExpression(EolReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Formal Parameter Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Formal Parameter Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolFormalParameterReferenceExpression(EolFormalParameterReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Variable Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Variable Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolVariableReferenceExpression(EolVariableReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Statement Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolStatementBlock(EolStatementBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolStatement(EolStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Assignment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolAssignmentStatement(EolAssignmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolExpressionStatement(EolExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Assignment Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Assignment Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolAssignmentExpressionStatement(EolAssignmentExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol Logical Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol Logical Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolLogicalExpressionStatement(EolLogicalExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eol For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eol For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEolFor(EolFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EtlMetaModelSwitch
