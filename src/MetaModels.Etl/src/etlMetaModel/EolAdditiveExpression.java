/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolAdditiveExpression#getMultiplicativeExpression <em>Multiplicative Expression</em>}</li>
 *   <li>{@link etlMetaModel.EolAdditiveExpression#getChainedAdditiveExpression <em>Chained Additive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolAdditiveExpression()
 * @model
 * @generated
 */
public interface EolAdditiveExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicative Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicative Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicative Expression</em>' containment reference.
	 * @see #setMultiplicativeExpression(EolMultiplicativeExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolAdditiveExpression_MultiplicativeExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolMultiplicativeExpression getMultiplicativeExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolAdditiveExpression#getMultiplicativeExpression <em>Multiplicative Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicative Expression</em>' containment reference.
	 * @see #getMultiplicativeExpression()
	 * @generated
	 */
	void setMultiplicativeExpression(EolMultiplicativeExpression value);

	/**
	 * Returns the value of the '<em><b>Chained Additive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chained Additive Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chained Additive Expression</em>' containment reference.
	 * @see #setChainedAdditiveExpression(EolChainedAdditiveExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolAdditiveExpression_ChainedAdditiveExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolChainedAdditiveExpression getChainedAdditiveExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolAdditiveExpression#getChainedAdditiveExpression <em>Chained Additive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chained Additive Expression</em>' containment reference.
	 * @see #getChainedAdditiveExpression()
	 * @generated
	 */
	void setChainedAdditiveExpression(EolChainedAdditiveExpression value);

} // EolAdditiveExpression
