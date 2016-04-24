/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Chained Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolChainedRelationalExpression#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link etlMetaModel.EolChainedRelationalExpression#getRelationalExpression <em>Relational Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedRelationalExpression()
 * @model
 * @generated
 */
public interface EolChainedRelationalExpression extends EolGenericChainedRelationalExpression {
	/**
	 * Returns the value of the '<em><b>Relational Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link etlMetaModel.EolRelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relational Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relational Operator</em>' attribute.
	 * @see etlMetaModel.EolRelationalOperator
	 * @see #setRelationalOperator(EolRelationalOperator)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedRelationalExpression_RelationalOperator()
	 * @model required="true"
	 * @generated
	 */
	EolRelationalOperator getRelationalOperator();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedRelationalExpression#getRelationalOperator <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Operator</em>' attribute.
	 * @see etlMetaModel.EolRelationalOperator
	 * @see #getRelationalOperator()
	 * @generated
	 */
	void setRelationalOperator(EolRelationalOperator value);

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
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedRelationalExpression_RelationalExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolRelationalExpression getRelationalExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedRelationalExpression#getRelationalExpression <em>Relational Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relational Expression</em>' containment reference.
	 * @see #getRelationalExpression()
	 * @generated
	 */
	void setRelationalExpression(EolRelationalExpression value);

} // EolChainedRelationalExpression
