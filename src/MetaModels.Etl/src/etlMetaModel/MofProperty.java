/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mof Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.MofProperty#getClazz <em>Clazz</em>}</li>
 *   <li>{@link etlMetaModel.MofProperty#getAssociation <em>Association</em>}</li>
 *   <li>{@link etlMetaModel.MofProperty#getIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getMofProperty()
 * @model
 * @generated
 */
public interface MofProperty extends MofTypedElement, MofMultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofClass#getOwnedProperties <em>Owned Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' container reference.
	 * @see #setClazz(MofClass)
	 * @see etlMetaModel.EtlMetaModelPackage#getMofProperty_Clazz()
	 * @see etlMetaModel.MofClass#getOwnedProperties
	 * @model opposite="ownedProperties" transient="false"
	 * @generated
	 */
	MofClass getClazz();

	/**
	 * Sets the value of the '{@link etlMetaModel.MofProperty#getClazz <em>Clazz</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' container reference.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(MofClass value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link etlMetaModel.MofAssociation#getMemberEnds <em>Member Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(MofAssociation)
	 * @see etlMetaModel.EtlMetaModelPackage#getMofProperty_Association()
	 * @see etlMetaModel.MofAssociation#getMemberEnds
	 * @model opposite="memberEnds"
	 * @generated
	 */
	MofAssociation getAssociation();

	/**
	 * Sets the value of the '{@link etlMetaModel.MofProperty#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(MofAssociation value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Composite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(Boolean)
	 * @see etlMetaModel.EtlMetaModelPackage#getMofProperty_IsComposite()
	 * @model
	 * @generated
	 */
	Boolean getIsComposite();

	/**
	 * Sets the value of the '{@link etlMetaModel.MofProperty#getIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #getIsComposite()
	 * @generated
	 */
	void setIsComposite(Boolean value);

} // MofProperty
