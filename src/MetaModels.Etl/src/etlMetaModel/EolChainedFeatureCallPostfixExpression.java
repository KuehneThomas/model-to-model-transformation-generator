/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Chained Feature Call Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCall <em>Feature Call</em>}</li>
 *   <li>{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCallAdditionalLogicalExpression <em>Feature Call Additional Logical Expression</em>}</li>
 *   <li>{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedFeatureCallPostfixExpression()
 * @model
 * @generated
 */
public interface EolChainedFeatureCallPostfixExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Call</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Call</em>' containment reference.
	 * @see #setFeatureCall(EolFeatureCall)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedFeatureCallPostfixExpression_FeatureCall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolFeatureCall getFeatureCall();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCall <em>Feature Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Call</em>' containment reference.
	 * @see #getFeatureCall()
	 * @generated
	 */
	void setFeatureCall(EolFeatureCall value);

	/**
	 * Returns the value of the '<em><b>Feature Call Additional Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Call Additional Logical Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Call Additional Logical Expression</em>' containment reference.
	 * @see #setFeatureCallAdditionalLogicalExpression(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedFeatureCallPostfixExpression_FeatureCallAdditionalLogicalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolLogicalExpression getFeatureCallAdditionalLogicalExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getFeatureCallAdditionalLogicalExpression <em>Feature Call Additional Logical Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Call Additional Logical Expression</em>' containment reference.
	 * @see #getFeatureCallAdditionalLogicalExpression()
	 * @generated
	 */
	void setFeatureCallAdditionalLogicalExpression(EolLogicalExpression value);

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
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedFeatureCallPostfixExpression_ChainedFeatureCallPostfixExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolChainedFeatureCallPostfixExpression getChainedFeatureCallPostfixExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedFeatureCallPostfixExpression#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chained Feature Call Postfix Expression</em>' containment reference.
	 * @see #getChainedFeatureCallPostfixExpression()
	 * @generated
	 */
	void setChainedFeatureCallPostfixExpression(EolChainedFeatureCallPostfixExpression value);

} // EolChainedFeatureCallPostfixExpression
