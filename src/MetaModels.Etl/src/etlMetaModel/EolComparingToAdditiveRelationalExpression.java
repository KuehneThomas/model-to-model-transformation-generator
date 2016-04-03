/**
 */
package etlMetaModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Comparing To Additive Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveComparisonOperator <em>Additive Comparison Operator</em>}</li>
 *   <li>{@link etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveExpression <em>Additive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolComparingToAdditiveRelationalExpression()
 * @model
 * @generated
 */
public interface EolComparingToAdditiveRelationalExpression extends EolGenericChainedRelationalExpression {
	/**
	 * Returns the value of the '<em><b>Additive Comparison Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link etlMetaModel.EolAdditiveComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Comparison Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Comparison Operator</em>' attribute.
	 * @see etlMetaModel.EolAdditiveComparisonOperator
	 * @see #setAdditiveComparisonOperator(EolAdditiveComparisonOperator)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolComparingToAdditiveRelationalExpression_AdditiveComparisonOperator()
	 * @model required="true"
	 * @generated
	 */
	EolAdditiveComparisonOperator getAdditiveComparisonOperator();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveComparisonOperator <em>Additive Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Comparison Operator</em>' attribute.
	 * @see etlMetaModel.EolAdditiveComparisonOperator
	 * @see #getAdditiveComparisonOperator()
	 * @generated
	 */
	void setAdditiveComparisonOperator(EolAdditiveComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Additive Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additive Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additive Expression</em>' containment reference.
	 * @see #setAdditiveExpression(EolAdditiveExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolComparingToAdditiveRelationalExpression_AdditiveExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolAdditiveExpression getAdditiveExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolComparingToAdditiveRelationalExpression#getAdditiveExpression <em>Additive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additive Expression</em>' containment reference.
	 * @see #getAdditiveExpression()
	 * @generated
	 */
	void setAdditiveExpression(EolAdditiveExpression value);

} // EolComparingToAdditiveRelationalExpression
