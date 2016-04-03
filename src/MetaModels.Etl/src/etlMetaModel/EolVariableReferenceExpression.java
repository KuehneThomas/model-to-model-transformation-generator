/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Variable Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolVariableReferenceExpression#getReferencedVarableDeclaration <em>Referenced Varable Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolVariableReferenceExpression()
 * @model
 * @generated
 */
public interface EolVariableReferenceExpression extends EolReferenceExpression {
	/**
	 * Returns the value of the '<em><b>Referenced Varable Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Varable Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Varable Declaration</em>' reference.
	 * @see #setReferencedVarableDeclaration(EolVariableDeclarationExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolVariableReferenceExpression_ReferencedVarableDeclaration()
	 * @model required="true"
	 * @generated
	 */
	EolVariableDeclarationExpression getReferencedVarableDeclaration();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolVariableReferenceExpression#getReferencedVarableDeclaration <em>Referenced Varable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Varable Declaration</em>' reference.
	 * @see #getReferencedVarableDeclaration()
	 * @generated
	 */
	void setReferencedVarableDeclaration(EolVariableDeclarationExpression value);

} // EolVariableReferenceExpression
