/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolAssignmentStatement#getIsSpecial <em>Is Special</em>}</li>
 *   <li>{@link etlMetaModel.EolAssignmentStatement#getLogicalExpressionLeft <em>Logical Expression Left</em>}</li>
 *   <li>{@link etlMetaModel.EolAssignmentStatement#getLogicalExpressionRight <em>Logical Expression Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolAssignmentStatement()
 * @model
 * @generated
 */
public interface EolAssignmentStatement extends EolStatement {
	/**
	 * Returns the value of the '<em><b>Is Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Special</em>' attribute.
	 * @see #setIsSpecial(Boolean)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolAssignmentStatement_IsSpecial()
	 * @model
	 * @generated
	 */
	Boolean getIsSpecial();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolAssignmentStatement#getIsSpecial <em>Is Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Special</em>' attribute.
	 * @see #getIsSpecial()
	 * @generated
	 */
	void setIsSpecial(Boolean value);

	/**
	 * Returns the value of the '<em><b>Logical Expression Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expression Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expression Left</em>' containment reference.
	 * @see #setLogicalExpressionLeft(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolAssignmentStatement_LogicalExpressionLeft()
	 * @model containment="true"
	 * @generated
	 */
	EolLogicalExpression getLogicalExpressionLeft();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolAssignmentStatement#getLogicalExpressionLeft <em>Logical Expression Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Expression Left</em>' containment reference.
	 * @see #getLogicalExpressionLeft()
	 * @generated
	 */
	void setLogicalExpressionLeft(EolLogicalExpression value);

	/**
	 * Returns the value of the '<em><b>Logical Expression Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expression Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expression Right</em>' containment reference.
	 * @see #setLogicalExpressionRight(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolAssignmentStatement_LogicalExpressionRight()
	 * @model containment="true"
	 * @generated
	 */
	EolLogicalExpression getLogicalExpressionRight();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolAssignmentStatement#getLogicalExpressionRight <em>Logical Expression Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Expression Right</em>' containment reference.
	 * @see #getLogicalExpressionRight()
	 * @generated
	 */
	void setLogicalExpressionRight(EolLogicalExpression value);

} // EolAssignmentStatement
