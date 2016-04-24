/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Is Type Of Source Mof Class Feature Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall#getReferencedMofClass <em>Referenced Mof Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolIsTypeOfSourceMofClassFeatureCall()
 * @model
 * @generated
 */
public interface EolIsTypeOfSourceMofClassFeatureCall extends EolFeatureCall {
	/**
	 * Returns the value of the '<em><b>Referenced Mof Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Mof Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Mof Class</em>' reference.
	 * @see #setReferencedMofClass(MofClass)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolIsTypeOfSourceMofClassFeatureCall_ReferencedMofClass()
	 * @model
	 * @generated
	 */
	MofClass getReferencedMofClass();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall#getReferencedMofClass <em>Referenced Mof Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Mof Class</em>' reference.
	 * @see #getReferencedMofClass()
	 * @generated
	 */
	void setReferencedMofClass(MofClass value);

} // EolIsTypeOfSourceMofClassFeatureCall
