/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol New Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolNewExpression#getInstantiatedMofClass <em>Instantiated Mof Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolNewExpression()
 * @model
 * @generated
 */
public interface EolNewExpression extends EolPrimitiveExpression {
	/**
	 * Returns the value of the '<em><b>Instantiated Mof Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiated Mof Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Mof Class</em>' reference.
	 * @see #setInstantiatedMofClass(MofClass)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolNewExpression_InstantiatedMofClass()
	 * @model required="true"
	 * @generated
	 */
	MofClass getInstantiatedMofClass();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolNewExpression#getInstantiatedMofClass <em>Instantiated Mof Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Mof Class</em>' reference.
	 * @see #getInstantiatedMofClass()
	 * @generated
	 */
	void setInstantiatedMofClass(MofClass value);

} // EolNewExpression
