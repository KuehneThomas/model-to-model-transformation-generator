/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Assignment Expression Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolAssignmentExpressionStatement#getPostfixExpressionLeft <em>Postfix Expression Left</em>}</li>
 *   <li>{@link etlMetaModel.EolAssignmentExpressionStatement#getLogicalExpressionRight <em>Logical Expression Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolAssignmentExpressionStatement()
 * @model
 * @generated
 */
public interface EolAssignmentExpressionStatement extends EolExpressionStatement {
	/**
	 * Returns the value of the '<em><b>Postfix Expression Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postfix Expression Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postfix Expression Left</em>' containment reference.
	 * @see #setPostfixExpressionLeft(EolPostfixExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolAssignmentExpressionStatement_PostfixExpressionLeft()
	 * @model containment="true"
	 * @generated
	 */
	EolPostfixExpression getPostfixExpressionLeft();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolAssignmentExpressionStatement#getPostfixExpressionLeft <em>Postfix Expression Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfix Expression Left</em>' containment reference.
	 * @see #getPostfixExpressionLeft()
	 * @generated
	 */
	void setPostfixExpressionLeft(EolPostfixExpression value);

	/**
	 * Returns the value of the '<em><b>Logical Expression Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expression Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expression Right</em>' containment reference.
	 * @see #setLogicalExpressionRight(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolAssignmentExpressionStatement_LogicalExpressionRight()
	 * @model containment="true"
	 * @generated
	 */
	EolLogicalExpression getLogicalExpressionRight();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolAssignmentExpressionStatement#getLogicalExpressionRight <em>Logical Expression Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Expression Right</em>' containment reference.
	 * @see #getLogicalExpressionRight()
	 * @generated
	 */
	void setLogicalExpressionRight(EolLogicalExpression value);

} // EolAssignmentExpressionStatement
