/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolRelationalExpression#getAdditiveExpression <em>Additive Expression</em>}</li>
 *   <li>{@link etlMetaModel.EolRelationalExpression#getChainedRelationalExpression <em>Chained Relational Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolRelationalExpression()
 * @model
 * @generated
 */
public interface EolRelationalExpression extends EObject {
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
	 * @see etlMetaModel.EtlMetaModelPackage#getEolRelationalExpression_AdditiveExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolAdditiveExpression getAdditiveExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolRelationalExpression#getAdditiveExpression <em>Additive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Expression</em>' containment reference.
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	void setAdditiveExpression(EolAdditiveExpression value);

	/**
	 * Returns the value of the '<em><b>Chained Relational Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chained Relational Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chained Relational Expression</em>' containment reference.
	 * @see #setChainedRelationalExpression(EolGenericChainedRelationalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolRelationalExpression_ChainedRelationalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolGenericChainedRelationalExpression getChainedRelationalExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolRelationalExpression#getChainedRelationalExpression <em>Chained Relational Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chained Relational Expression</em>' containment reference.
	 * @see #getChainedRelationalExpression()
	 * @generated
	 */
	void setChainedRelationalExpression(EolGenericChainedRelationalExpression value);

} // EolRelationalExpression
