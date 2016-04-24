/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Chained Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolChainedLogicalExpression#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link etlMetaModel.EolChainedLogicalExpression#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedLogicalExpression()
 * @model
 * @generated
 */
public interface EolChainedLogicalExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link etlMetaModel.EolLogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operator</em>' attribute.
	 * @see etlMetaModel.EolLogicalOperator
	 * @see #setLogicalOperator(EolLogicalOperator)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedLogicalExpression_LogicalOperator()
	 * @model required="true"
	 * @generated
	 */
	EolLogicalOperator getLogicalOperator();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedLogicalExpression#getLogicalOperator <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operator</em>' attribute.
	 * @see etlMetaModel.EolLogicalOperator
	 * @see #getLogicalOperator()
	 * @generated
	 */
	void setLogicalOperator(EolLogicalOperator value);

	/**
	 * Returns the value of the '<em><b>Logical Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expression</em>' containment reference.
	 * @see #setLogicalExpression(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolChainedLogicalExpression_LogicalExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EolLogicalExpression getLogicalExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolChainedLogicalExpression#getLogicalExpression <em>Logical Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Expression</em>' containment reference.
	 * @see #getLogicalExpression()
	 * @generated
	 */
	void setLogicalExpression(EolLogicalExpression value);

} // EolChainedLogicalExpression
