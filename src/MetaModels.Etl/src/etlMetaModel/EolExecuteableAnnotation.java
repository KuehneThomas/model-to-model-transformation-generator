/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Executeable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolExecuteableAnnotation#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolExecuteableAnnotation()
 * @model
 * @generated
 */
public interface EolExecuteableAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(EolLogicalExpression)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolExecuteableAnnotation_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EolLogicalExpression getExpression();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolExecuteableAnnotation#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(EolLogicalExpression value);

} // EolExecuteableAnnotation
