/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Mof Class Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolMofClassFormalParameter#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link etlMetaModel.EolMofClassFormalParameter#getIsSequence <em>Is Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolMofClassFormalParameter()
 * @model
 * @generated
 */
public interface EolMofClassFormalParameter extends EolFormalParameter {
	/**
	 * Returns the value of the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced</em>' reference.
	 * @see #setReferenced(MofClass)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolMofClassFormalParameter_Referenced()
	 * @model
	 * @generated
	 */
	MofClass getReferenced();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolMofClassFormalParameter#getReferenced <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced</em>' reference.
	 * @see #getReferenced()
	 * @generated
	 */
	void setReferenced(MofClass value);

	/**
	 * Returns the value of the '<em><b>Is Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Sequence</em>' attribute.
	 * @see #setIsSequence(Boolean)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolMofClassFormalParameter_IsSequence()
	 * @model
	 * @generated
	 */
	Boolean getIsSequence();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolMofClassFormalParameter#getIsSequence <em>Is Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Sequence</em>' attribute.
	 * @see #getIsSequence()
	 * @generated
	 */
	void setIsSequence(Boolean value);

} // EolMofClassFormalParameter
