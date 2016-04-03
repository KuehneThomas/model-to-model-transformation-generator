/**
 */
package etlMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eol Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link etlMetaModel.EolParameterList#getLogicalExpressions <em>Logical Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see etlMetaModel.EtlMetaModelPackage#getEolParameterList()
 * @model
 * @generated
 */
public interface EolParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link etlMetaModel.EolLogicalExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Expressions</em>' containment reference list.
	 * @see etlMetaModel.EtlMetaModelPackage#getEolParameterList_LogicalExpressions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EolLogicalExpression> getLogicalExpressions();

} // EolParameterList
