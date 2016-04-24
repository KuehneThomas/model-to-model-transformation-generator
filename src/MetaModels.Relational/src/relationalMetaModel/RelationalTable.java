/**
 */
package relationalMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 * </p>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface RelationalTable extends EObject
{
  /**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(RelationalSchema)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable_Schema()
	 * @see relationalMetaModel.RelationalSchema#getTables
	 * @model opposite="Tables" required="true" transient="false"
	 * @generated
	 */
  RelationalSchema getSchema();

  /**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
  void setSchema(RelationalSchema value);

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foreign Keys</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable_ForeignKeys()
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable
	 * @model opposite="OwnedByTable" containment="true"
	 * @generated
	 */
  EList<RelationalForeignKey> getForeignKeys();

		/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
	 * The list contents are of type {@link relationalMetaModel.RelationalForeignKey}.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' reference list.
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalTable_ReferencedBy()
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable
	 * @model opposite="ReferencedTable"
	 * @generated
	 */
	EList<RelationalForeignKey> getReferencedBy();

} // RelationalTable
