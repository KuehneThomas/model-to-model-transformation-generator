/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolPostfixExpression#getItemSelectorExpression <em>Item Selector Expression</em>}</li>
 *   <li>{@link etlMetaModel.EolPostfixExpression#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolPostfixExpression()
 * @model
 * @generated
 */
public interface EolPostfixExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Selector Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Selector Expression</em>' containment reference.
	 * @see #setItemSelectorExpression(EolItemSelectorExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolPostfixExpression_ItemSelectorExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolItemSelectorExpression getItemSelectorExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolPostfixExpression#getItemSelectorExpression <em>Item Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Selector Expression</em>' containment reference.
	 * @see #getItemSelectorExpression()
	 * @generated
	 */
	void setItemSelectorExpression(EolItemSelectorExpression value);

	/**
	 * Returns the value of the '<em><b>Chained Feature Call Postfix Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chained Feature Call Postfix Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chained Feature Call Postfix Expression</em>' containment reference.
	 * @see #setChainedFeatureCallPostfixExpression(EolChainedFeatureCallPostfixExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolPostfixExpression_ChainedFeatureCallPostfixExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolChainedFeatureCallPostfixExpression getChainedFeatureCallPostfixExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolPostfixExpression#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chained Feature Call Postfix Expression</em>' containment reference.
	 * @see #getChainedFeatureCallPostfixExpression()
	 * @generated
	 */
	void setChainedFeatureCallPostfixExpression(EolChainedFeatureCallPostfixExpression value);

} // EolPostfixExpression
