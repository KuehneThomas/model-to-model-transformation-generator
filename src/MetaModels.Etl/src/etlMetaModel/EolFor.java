/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolFor#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link etlMetaModel.EolFor#getIteratedSequence <em>Iterated Sequence</em>}</li>
 *   <li>{@link etlMetaModel.EolFor#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolFor()
 * @model
 * @generated
 */
public interface EolFor extends EolStatement {
	/**
	 * Returns the value of the '<em><b>Formal Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameter</em>' containment reference.
	 * @see #setFormalParameter(EolFormalParameter)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolFor_FormalParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolFormalParameter getFormalParameter();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolFor#getFormalParameter <em>Formal Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formal Parameter</em>' containment reference.
	 * @see #getFormalParameter()
	 * @generated
	 */
	void setFormalParameter(EolFormalParameter value);

	/**
	 * Returns the value of the '<em><b>Iterated Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterated Sequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterated Sequence</em>' containment reference.
	 * @see #setIteratedSequence(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolFor_IteratedSequence()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolLogicalExpression getIteratedSequence();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolFor#getIteratedSequence <em>Iterated Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterated Sequence</em>' containment reference.
	 * @see #getIteratedSequence()
	 * @generated
	 */
	void setIteratedSequence(EolLogicalExpression value);

	/**
	 * Returns the value of the '<em><b>Statement Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Block</em>' containment reference.
	 * @see #setStatementBlock(EolStatementBlock)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolFor_StatementBlock()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolStatementBlock getStatementBlock();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolFor#getStatementBlock <em>Statement Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement Block</em>' containment reference.
	 * @see #getStatementBlock()
	 * @generated
	 */
	void setStatementBlock(EolStatementBlock value);

} // EolFor
