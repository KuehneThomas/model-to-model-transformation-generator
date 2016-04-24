/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema()
 * @model
 * @generated
 */
public interface RelationalSchema extends EObject
{
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
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalTable}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalSchema_Tables()
	 * @see relationalMetaModel.RelationalTable#getSchema
	 * @model opposite="Schema" containment="true"
	 * @generated
	 */
  EList<RelationalTable> getTables();

} // RelationalSchema
