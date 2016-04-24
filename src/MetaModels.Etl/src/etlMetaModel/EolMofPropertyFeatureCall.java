/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Mof Property Feature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolMofPropertyFeatureCall#getReferencedMofProperty <em>Referenced Mof Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolMofPropertyFeatureCall()
 * @model
 * @generated
 */
public interface EolMofPropertyFeatureCall extends EolFeatureCall {
	/**
	 * Returns the value of the '<em><b>Referenced Mof Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Mof Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Mof Property</em>' reference.
	 * @see #setReferencedMofProperty(MofProperty)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolMofPropertyFeatureCall_ReferencedMofProperty()
	 * @model required="true"
	 * @generated
	 */
	MofProperty getReferencedMofProperty();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolMofPropertyFeatureCall#getReferencedMofProperty <em>Referenced Mof Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Mof Property</em>' reference.
	 * @see #getReferencedMofProperty()
	 * @generated
	 */
	void setReferencedMofProperty(MofProperty value);

} // EolMofPropertyFeatureCall
