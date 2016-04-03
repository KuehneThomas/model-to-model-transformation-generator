/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolMultiplicativeExpression#getUnaryExpression <em>Unary Expression</em>}</li>
 *   <li>{@link etlMetaModel.EolMultiplicativeExpression#getChainedMultiplicativeExpression <em>Chained Multiplicative Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolMultiplicativeExpression()
 * @model
 * @generated
 */
public interface EolMultiplicativeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Expression</em>' containment reference.
	 * @see #setUnaryExpression(EolUnaryExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolMultiplicativeExpression_UnaryExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolUnaryExpression getUnaryExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolMultiplicativeExpression#getUnaryExpression <em>Unary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Expression</em>' containment reference.
	 * @see #getUnaryExpression()
	 * @generated
	 */
	void setUnaryExpression(EolUnaryExpression value);

	/**
	 * Returns the value of the '<em><b>Chained Multiplicative Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chained Multiplicative Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chained Multiplicative Expression</em>' containment reference.
	 * @see #setChainedMultiplicativeExpression(EolChainedMultiplicativeExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolMultiplicativeExpression_ChainedMultiplicativeExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolChainedMultiplicativeExpression getChainedMultiplicativeExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolMultiplicativeExpression#getChainedMultiplicativeExpression <em>Chained Multiplicative Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chained Multiplicative Expression</em>' containment reference.
	 * @see #getChainedMultiplicativeExpression()
	 * @generated
	 */
	void setChainedMultiplicativeExpression(EolChainedMultiplicativeExpression value);

} // EolMultiplicativeExpression
