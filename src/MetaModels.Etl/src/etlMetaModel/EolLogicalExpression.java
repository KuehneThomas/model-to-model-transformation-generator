/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolLogicalExpression#getRelationalExpression <em>Relational Expression</em>}</li>
 *   <li>{@link etlMetaModel.EolLogicalExpression#getChainedLogicalExpression <em>Chained Logical Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolLogicalExpression()
 * @model
 * @generated
 */
public interface EolLogicalExpression extends EolExpressionOrStatementBlock {
	/**
	 * Returns the value of the '<em><b>Relational Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relational Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Expression</em>' containment reference.
	 * @see #setRelationalExpression(EolRelationalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolLogicalExpression_RelationalExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolRelationalExpression getRelationalExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolLogicalExpression#getRelationalExpression <em>Relational Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Expression</em>' containment reference.
	 * @see #getRelationalExpression()
	 * @generated
	 */
	void setRelationalExpression(EolRelationalExpression value);

	/**
	 * Returns the value of the '<em><b>Chained Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chained Logical Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chained Logical Expression</em>' containment reference.
	 * @see #setChainedLogicalExpression(EolChainedLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolLogicalExpression_ChainedLogicalExpression()
	 * @model containment="true"
	 * @generated
	 */
	EolChainedLogicalExpression getChainedLogicalExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolLogicalExpression#getChainedLogicalExpression <em>Chained Logical Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chained Logical Expression</em>' containment reference.
	 * @see #getChainedLogicalExpression()
	 * @generated
	 */
	void setChainedLogicalExpression(EolChainedLogicalExpression value);

} // EolLogicalExpression
