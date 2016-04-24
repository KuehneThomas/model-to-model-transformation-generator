/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolUnaryExpression#getUnaryOperatorNullable <em>Unary Operator Nullable</em>}</li>
 *   <li>{@link etlMetaModel.EolUnaryExpression#getPostfixExpression <em>Postfix Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolUnaryExpression()
 * @model
 * @generated
 */
public interface EolUnaryExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Unary Operator Nullable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Operator Nullable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator Nullable</em>' containment reference.
	 * @see #setUnaryOperatorNullable(EolUnaryOpratorNullable)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolUnaryExpression_UnaryOperatorNullable()
	 * @model containment="true"
	 * @generated
	 */
	EolUnaryOpratorNullable getUnaryOperatorNullable();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolUnaryExpression#getUnaryOperatorNullable <em>Unary Operator Nullable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operator Nullable</em>' containment reference.
	 * @see #getUnaryOperatorNullable()
	 * @generated
	 */
	void setUnaryOperatorNullable(EolUnaryOpratorNullable value);

	/**
	 * Returns the value of the '<em><b>Postfix Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postfix Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postfix Expression</em>' containment reference.
	 * @see #setPostfixExpression(EolPostfixExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolUnaryExpression_PostfixExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolPostfixExpression getPostfixExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolUnaryExpression#getPostfixExpression <em>Postfix Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postfix Expression</em>' containment reference.
	 * @see #getPostfixExpression()
	 * @generated
	 */
	void setPostfixExpression(EolPostfixExpression value);

} // EolUnaryExpression
