/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Logical Expression Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolLogicalExpressionStatement#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolLogicalExpressionStatement()
 * @model
 * @generated
 */
public interface EolLogicalExpressionStatement extends EolExpressionStatement {
	/**
	 * Returns the value of the '<em><b>Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expression</em>' containment reference.
	 * @see #setLogicalExpression(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolLogicalExpressionStatement_LogicalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolLogicalExpression getLogicalExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolLogicalExpressionStatement#getLogicalExpression <em>Logical Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Expression</em>' containment reference.
	 * @see #getLogicalExpression()
	 * @generated
	 */
	void setLogicalExpression(EolLogicalExpression value);

} // EolLogicalExpressionStatement
