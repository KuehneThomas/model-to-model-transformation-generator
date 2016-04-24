/**
 */
package etlMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Unary Oprator Nullable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolUnaryOpratorNullable#getUnaryOperator <em>Unary Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolUnaryOpratorNullable()
 * @model
 * @generated
 */
public interface EolUnaryOpratorNullable extends EObject {
	/**
	 * Returns the value of the '<em><b>Unary Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link etlMetaModel.EolUnaryOprator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unary Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator</em>' attribute.
	 * @see etlMetaModel.EolUnaryOprator
	 * @see #setUnaryOperator(EolUnaryOprator)
	 * @see etlMetaModel.EtlMetaModelPackage#getEolUnaryOpratorNullable_UnaryOperator()
	 * @model required="true"
	 * @generated
	 */
	EolUnaryOprator getUnaryOperator();

	/**
	 * Sets the value of the '{@link etlMetaModel.EolUnaryOpratorNullable#getUnaryOperator <em>Unary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operator</em>' attribute.
	 * @see etlMetaModel.EolUnaryOprator
	 * @see #getUnaryOperator()
	 * @generated
	 */
	void setUnaryOperator(EolUnaryOprator value);

} // EolUnaryOpratorNullable
