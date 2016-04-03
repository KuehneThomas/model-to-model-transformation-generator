/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mof Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.MofTypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getMofTypedElement()
 * @model
 * @generated
 */
public interface MofTypedElement extends MofNamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofType#getTypedElements <em>Typed Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(MofType)
	 * @see etlMetaModel.EtlMetaModelPackage#getMofTypedElement_Type()
	 * @see etlMetaModel.MofType#getTypedElements
	 * @model opposite="typedElements" transient="false"
	 * @generated
	 */
	MofType getType();

	/**
	 * Sets the value of the '{@link etlMetaModel.MofTypedElement#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MofType value);

} // MofTypedElement
