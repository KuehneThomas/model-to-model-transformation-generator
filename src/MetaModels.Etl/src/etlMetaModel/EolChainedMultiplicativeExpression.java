/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Chained Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolChainedMultiplicativeExpression#getMultiplicativeArithmeticalOperator <em>Multiplicative Arithmetical Operator</em>}</li>
 *   <li>{@link etlMetaModel.EolChainedMultiplicativeExpression#getUnaryExpression <em>Unary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedMultiplicativeExpression()
 * @model
 * @generated
 */
public interface EolChainedMultiplicativeExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicative Arithmetical Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link etlMetaModel.EolMultiplicativeArithmeticalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicative Arithmetical Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicative Arithmetical Operator</em>' attribute.
	 * @see etlMetaModel.EolMultiplicativeArithmeticalOperator
	 * @see #setMultiplicativeArithmeticalOperator(EolMultiplicativeArithmeticalOperator)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedMultiplicativeExpression_MultiplicativeArithmeticalOperator()
	 * @model required="true"
	 * @generated
	 */
	EolMultiplicativeArithmeticalOperator getMultiplicativeArithmeticalOperator();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedMultiplicativeExpression#getMultiplicativeArithmeticalOperator <em>Multiplicative Arithmetical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicative Arithmetical Operator</em>' attribute.
	 * @see etlMetaModel.EolMultiplicativeArithmeticalOperator
	 * @see #getMultiplicativeArithmeticalOperator()
	 * @generated
	 */
	void setMultiplicativeArithmeticalOperator(EolMultiplicativeArithmeticalOperator value);

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
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedMultiplicativeExpression_UnaryExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolUnaryExpression getUnaryExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedMultiplicativeExpression#getUnaryExpression <em>Unary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Expression</em>' containment reference.
	 * @see #getUnaryExpression()
	 * @generated
	 */
	void setUnaryExpression(EolUnaryExpression value);

} // EolChainedMultiplicativeExpression
