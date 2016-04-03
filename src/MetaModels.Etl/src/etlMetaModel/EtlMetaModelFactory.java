/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see etlMetaModel.EtlMetaModelPackage
 * @generated
 */
public interface EtlMetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EtlMetaModelFactory eINSTANCE = etlMetaModel.impl.EtlMetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mof Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Named Element</em>'.
	 * @generated
	 */
	MofNamedElement createMofNamedElement();

	/**
	 * Returns a new object of class '<em>Mof Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Type</em>'.
	 * @generated
	 */
	MofType createMofType();

	/**
	 * Returns a new object of class '<em>Mof Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Class</em>'.
	 * @generated
	 */
	MofClass createMofClass();

	/**
	 * Returns a new object of class '<em>Mof Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Typed Element</em>'.
	 * @generated
	 */
	MofTypedElement createMofTypedElement();

	/**
	 * Returns a new object of class '<em>Mof Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Multiplicity Element</em>'.
	 * @generated
	 */
	MofMultiplicityElement createMofMultiplicityElement();

	/**
	 * Returns a new object of class '<em>Mof Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Property</em>'.
	 * @generated
	 */
	MofProperty createMofProperty();

	/**
	 * Returns a new object of class '<em>Mof Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Association</em>'.
	 * @generated
	 */
	MofAssociation createMofAssociation();

	/**
	 * Returns a new object of class '<em>Mof Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Primitive Type</em>'.
	 * @generated
	 */
	MofPrimitiveType createMofPrimitiveType();

	/**
	 * Returns a new object of class '<em>Mof Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Boolean</em>'.
	 * @generated
	 */
	MofBoolean createMofBoolean();

	/**
	 * Returns a new object of class '<em>Mof Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Integer</em>'.
	 * @generated
	 */
	MofInteger createMofInteger();

	/**
	 * Returns a new object of class '<em>Mof String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof String</em>'.
	 * @generated
	 */
	MofString createMofString();

	/**
	 * Returns a new object of class '<em>Etl Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etl Module</em>'.
	 * @generated
	 */
	EtlModule createEtlModule();

	/**
	 * Returns a new object of class '<em>Erl Named Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Erl Named Rule</em>'.
	 * @generated
	 */
	ErlNamedRule createErlNamedRule();

	/**
	 * Returns a new object of class '<em>Etl Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etl Transformation Rule</em>'.
	 * @generated
	 */
	EtlTransformationRule createEtlTransformationRule();

	/**
	 * Returns a new object of class '<em>Eol Library Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Library Module</em>'.
	 * @generated
	 */
	EolLibraryModule createEolLibraryModule();

	/**
	 * Returns a new object of class '<em>Eol Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Operation</em>'.
	 * @generated
	 */
	EolOperation createEolOperation();

	/**
	 * Returns a new object of class '<em>Eol Mof Class Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Mof Class Formal Parameter</em>'.
	 * @generated
	 */
	EolMofClassFormalParameter createEolMofClassFormalParameter();

	/**
	 * Returns a new object of class '<em>Eol Executeable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Executeable Annotation</em>'.
	 * @generated
	 */
	EolExecuteableAnnotation createEolExecuteableAnnotation();

	/**
	 * Returns a new object of class '<em>Simple Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Annotation</em>'.
	 * @generated
	 */
	SimpleAnnotation createSimpleAnnotation();

	/**
	 * Returns a new object of class '<em>Model Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Type</em>'.
	 * @generated
	 */
	ModelElementType createModelElementType();

	/**
	 * Returns a new object of class '<em>Eol Native</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Native</em>'.
	 * @generated
	 */
	EolNative createEolNative();

	/**
	 * Returns a new object of class '<em>Eol Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Boolean Type</em>'.
	 * @generated
	 */
	EolBooleanType createEolBooleanType();

	/**
	 * Returns a new object of class '<em>Eol Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Real Type</em>'.
	 * @generated
	 */
	EolRealType createEolRealType();

	/**
	 * Returns a new object of class '<em>Eol Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Integer Type</em>'.
	 * @generated
	 */
	EolIntegerType createEolIntegerType();

	/**
	 * Returns a new object of class '<em>Eol String Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol String Type</em>'.
	 * @generated
	 */
	EolStringType createEolStringType();

	/**
	 * Returns a new object of class '<em>Eol Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Map Type</em>'.
	 * @generated
	 */
	EolMapType createEolMapType();

	/**
	 * Returns a new object of class '<em>Eol Ordered Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Ordered Set Type</em>'.
	 * @generated
	 */
	EolOrderedSetType createEolOrderedSetType();

	/**
	 * Returns a new object of class '<em>Eol Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Set Type</em>'.
	 * @generated
	 */
	EolSetType createEolSetType();

	/**
	 * Returns a new object of class '<em>Eol Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Bag Type</em>'.
	 * @generated
	 */
	EolBagType createEolBagType();

	/**
	 * Returns a new object of class '<em>Eol Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Sequence Type</em>'.
	 * @generated
	 */
	EolSequenceType createEolSequenceType();

	/**
	 * Returns a new object of class '<em>Eol Expression Or Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Expression Or Statement Block</em>'.
	 * @generated
	 */
	EolExpressionOrStatementBlock createEolExpressionOrStatementBlock();

	/**
	 * Returns a new object of class '<em>Eol Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Logical Expression</em>'.
	 * @generated
	 */
	EolLogicalExpression createEolLogicalExpression();

	/**
	 * Returns a new object of class '<em>Eol Chained Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Chained Logical Expression</em>'.
	 * @generated
	 */
	EolChainedLogicalExpression createEolChainedLogicalExpression();

	/**
	 * Returns a new object of class '<em>Eol Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Relational Expression</em>'.
	 * @generated
	 */
	EolRelationalExpression createEolRelationalExpression();

	/**
	 * Returns a new object of class '<em>Eol Chained Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Chained Relational Expression</em>'.
	 * @generated
	 */
	EolChainedRelationalExpression createEolChainedRelationalExpression();

	/**
	 * Returns a new object of class '<em>Eol Comparing To Additive Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Comparing To Additive Relational Expression</em>'.
	 * @generated
	 */
	EolComparingToAdditiveRelationalExpression createEolComparingToAdditiveRelationalExpression();

	/**
	 * Returns a new object of class '<em>Eol Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Additive Expression</em>'.
	 * @generated
	 */
	EolAdditiveExpression createEolAdditiveExpression();

	/**
	 * Returns a new object of class '<em>Eol Chained Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Chained Additive Expression</em>'.
	 * @generated
	 */
	EolChainedAdditiveExpression createEolChainedAdditiveExpression();

	/**
	 * Returns a new object of class '<em>Eol Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Multiplicative Expression</em>'.
	 * @generated
	 */
	EolMultiplicativeExpression createEolMultiplicativeExpression();

	/**
	 * Returns a new object of class '<em>Eol Chained Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Chained Multiplicative Expression</em>'.
	 * @generated
	 */
	EolChainedMultiplicativeExpression createEolChainedMultiplicativeExpression();

	/**
	 * Returns a new object of class '<em>Eol Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Unary Expression</em>'.
	 * @generated
	 */
	EolUnaryExpression createEolUnaryExpression();

	/**
	 * Returns a new object of class '<em>Eol Unary Oprator Nullable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Unary Oprator Nullable</em>'.
	 * @generated
	 */
	EolUnaryOpratorNullable createEolUnaryOpratorNullable();

	/**
	 * Returns a new object of class '<em>Eol Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Postfix Expression</em>'.
	 * @generated
	 */
	EolPostfixExpression createEolPostfixExpression();

	/**
	 * Returns a new object of class '<em>Eol Chained Feature Call Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Chained Feature Call Postfix Expression</em>'.
	 * @generated
	 */
	EolChainedFeatureCallPostfixExpression createEolChainedFeatureCallPostfixExpression();

	/**
	 * Returns a new object of class '<em>Eol Item Selector Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Item Selector Expression</em>'.
	 * @generated
	 */
	EolItemSelectorExpression createEolItemSelectorExpression();

	/**
	 * Returns a new object of class '<em>Eol Simple Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Simple Feature Call</em>'.
	 * @generated
	 */
	EolSimpleFeatureCall createEolSimpleFeatureCall();

	/**
	 * Returns a new object of class '<em>Eol Mof Property Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Mof Property Feature Call</em>'.
	 * @generated
	 */
	EolMofPropertyFeatureCall createEolMofPropertyFeatureCall();

	/**
	 * Returns a new object of class '<em>Etl Equivalent Method Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etl Equivalent Method Feature Call</em>'.
	 * @generated
	 */
	EtlEquivalentMethodFeatureCall createEtlEquivalentMethodFeatureCall();

	/**
	 * Returns a new object of class '<em>Eol Is Type Of Source Mof Class Feature Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Is Type Of Source Mof Class Feature Call</em>'.
	 * @generated
	 */
	EolIsTypeOfSourceMofClassFeatureCall createEolIsTypeOfSourceMofClassFeatureCall();

	/**
	 * Returns a new object of class '<em>Eol Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Parameter List</em>'.
	 * @generated
	 */
	EolParameterList createEolParameterList();

	/**
	 * Returns a new object of class '<em>Eol New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol New Expression</em>'.
	 * @generated
	 */
	EolNewExpression createEolNewExpression();

	/**
	 * Returns a new object of class '<em>Eol Variable Declaration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Variable Declaration Expression</em>'.
	 * @generated
	 */
	EolVariableDeclarationExpression createEolVariableDeclarationExpression();

	/**
	 * Returns a new object of class '<em>Eol String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol String Literal</em>'.
	 * @generated
	 */
	EolStringLiteral createEolStringLiteral();

	/**
	 * Returns a new object of class '<em>Eol Formal Parameter Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Formal Parameter Reference Expression</em>'.
	 * @generated
	 */
	EolFormalParameterReferenceExpression createEolFormalParameterReferenceExpression();

	/**
	 * Returns a new object of class '<em>Eol Variable Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Variable Reference Expression</em>'.
	 * @generated
	 */
	EolVariableReferenceExpression createEolVariableReferenceExpression();

	/**
	 * Returns a new object of class '<em>Eol Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Statement Block</em>'.
	 * @generated
	 */
	EolStatementBlock createEolStatementBlock();

	/**
	 * Returns a new object of class '<em>Eol Assignment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Assignment Statement</em>'.
	 * @generated
	 */
	EolAssignmentStatement createEolAssignmentStatement();

	/**
	 * Returns a new object of class '<em>Eol Assignment Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Assignment Expression Statement</em>'.
	 * @generated
	 */
	EolAssignmentExpressionStatement createEolAssignmentExpressionStatement();

	/**
	 * Returns a new object of class '<em>Eol Logical Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Logical Expression Statement</em>'.
	 * @generated
	 */
	EolLogicalExpressionStatement createEolLogicalExpressionStatement();

	/**
	 * Returns a new object of class '<em>Eol For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol For</em>'.
	 * @generated
	 */
	EolFor createEolFor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EtlMetaModelPackage getEtlMetaModelPackage();

} //EtlMetaModelFactory
