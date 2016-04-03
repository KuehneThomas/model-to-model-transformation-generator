/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Variable Declaration Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolVariableDeclarationExpression#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolVariableDeclarationExpression()
 * @model
 * @generated
 */
public interface EolVariableDeclarationExpression extends EolPrimitiveExpression {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolVariableDeclarationExpression_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolVariableDeclarationExpression#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EolVariableDeclarationExpression
