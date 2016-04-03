/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Formal Parameter Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolFormalParameterReferenceExpression#getReferencedFormalParameter <em>Referenced Formal Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolFormalParameterReferenceExpression()
 * @model
 * @generated
 */
public interface EolFormalParameterReferenceExpression extends EolReferenceExpression {
	/**
	 * Returns the value of the '<em><b>Referenced Formal Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Formal Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Formal Parameter</em>' reference.
	 * @see #setReferencedFormalParameter(EolFormalParameter)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolFormalParameterReferenceExpression_ReferencedFormalParameter()
	 * @model required="true"
	 * @generated
	 */
	EolFormalParameter getReferencedFormalParameter();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolFormalParameterReferenceExpression#getReferencedFormalParameter <em>Referenced Formal Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Formal Parameter</em>' reference.
	 * @see #getReferencedFormalParameter()
	 * @generated
	 */
	void setReferencedFormalParameter(EolFormalParameter value);

} // EolFormalParameterReferenceExpression
