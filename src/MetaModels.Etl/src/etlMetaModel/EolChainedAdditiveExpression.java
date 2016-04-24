/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Chained Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolChainedAdditiveExpression#getAdditiveArithmeticalOperator <em>Additive Arithmetical Operator</em>}</li>
 *   <li>{@link etlMetaModel.EolChainedAdditiveExpression#getAdditiveExpression <em>Additive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedAdditiveExpression()
 * @model
 * @generated
 */
public interface EolChainedAdditiveExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Additive Arithmetical Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link etlMetaModel.EolAdditiveArithmeticalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Arithmetical Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Arithmetical Operator</em>' attribute.
	 * @see etlMetaModel.EolAdditiveArithmeticalOperator
	 * @see #setAdditiveArithmeticalOperator(EolAdditiveArithmeticalOperator)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedAdditiveExpression_AdditiveArithmeticalOperator()
	 * @model required="true"
	 * @generated
	 */
	EolAdditiveArithmeticalOperator getAdditiveArithmeticalOperator();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedAdditiveExpression#getAdditiveArithmeticalOperator <em>Additive Arithmetical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Arithmetical Operator</em>' attribute.
	 * @see etlMetaModel.EolAdditiveArithmeticalOperator
	 * @see #getAdditiveArithmeticalOperator()
	 * @generated
	 */
	void setAdditiveArithmeticalOperator(EolAdditiveArithmeticalOperator value);

	/**
	 * Returns the value of the '<em><b>Additive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Expression</em>' containment reference.
	 * @see #setAdditiveExpression(EolAdditiveExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedAdditiveExpression_AdditiveExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolAdditiveExpression getAdditiveExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedAdditiveExpression#getAdditiveExpression <em>Additive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Expression</em>' containment reference.
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	void setAdditiveExpression(EolAdditiveExpression value);

} // EolChainedAdditiveExpression
