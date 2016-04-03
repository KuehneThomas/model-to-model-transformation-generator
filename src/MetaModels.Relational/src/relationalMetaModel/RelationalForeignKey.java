/**
 */
package relationalMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface RelationalForeignKey extends EObject
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
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Owned By Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned By Table</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Table</em>' container reference.
	 * @see #setOwnedByTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_OwnedByTable()
	 * @see relationalMetaModel.RelationalTable#getForeignKeys
	 * @model opposite="ForeignKeys" required="true" transient="false"
	 * @generated
	 */
  RelationalTable getOwnedByTable();

  /**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Table</em>' container reference.
	 * @see #getOwnedByTable()
	 * @generated
	 */
  void setOwnedByTable(RelationalTable value);

  /**
	 * Returns the value of the '<em><b>Referenced Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Table</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Table</em>' reference.
	 * @see #setReferencedTable(RelationalTable)
	 * @see relationalMetaModel.RelationalMetaModelPackage#getRelationalForeignKey_ReferencedTable()
	 * @see relationalMetaModel.RelationalTable#getReferencedBy
	 * @model opposite="ReferencedBy" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
  RelationalTable getReferencedTable();

  /**
	 * Sets the value of the '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Table</em>' reference.
	 * @see #getReferencedTable()
	 * @generated
	 */
  void setReferencedTable(RelationalTable value);

} // RelationalForeignKey
