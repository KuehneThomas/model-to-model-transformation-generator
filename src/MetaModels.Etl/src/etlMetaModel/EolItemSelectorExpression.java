/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Item Selector Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolItemSelectorExpression#getPrimitiveExpression <em>Primitive Expression</em>}</li>
 *   <li>{@link etlMetaModel.EolItemSelectorExpression#getAdditionalPrimitiveExpression <em>Additional Primitive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolItemSelectorExpression()
 * @model
 * @generated
 */
public interface EolItemSelectorExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Expression</em>' containment reference.
	 * @see #setPrimitiveExpression(EolPrimitiveExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolItemSelectorExpression_PrimitiveExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolPrimitiveExpression getPrimitiveExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolItemSelectorExpression#getPrimitiveExpression <em>Primitive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Expression</em>' containment reference.
	 * @see #getPrimitiveExpression()
	 * @generated
	 */
	void setPrimitiveExpression(EolPrimitiveExpression value);

	/**
	 * Returns the value of the '<em><b>Additional Primitive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Primitive Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Primitive Expression</em>' containment reference.
	 * @see #setAdditionalPrimitiveExpression(EolPrimitiveExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolItemSelectorExpression_AdditionalPrimitiveExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolPrimitiveExpression getAdditionalPrimitiveExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolItemSelectorExpression#getAdditionalPrimitiveExpression <em>Additional Primitive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Primitive Expression</em>' containment reference.
	 * @see #getAdditionalPrimitiveExpression()
	 * @generated
	 */
	void setAdditionalPrimitiveExpression(EolPrimitiveExpression value);

} // EolItemSelectorExpression
