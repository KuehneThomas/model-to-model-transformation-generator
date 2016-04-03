/**
 */
package umlClassMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlClassMetaModel.UmlPackage#getName <em>Name</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlPackage#getClasses <em>Classes</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlPackage#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlPackage()
 * @model
 * @generated
 */
public interface UmlPackage extends EObject
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
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlPackage_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link umlClassMetaModel.UmlPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link umlClassMetaModel.UmlClass}.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlPackage_Classes()
	 * @see umlClassMetaModel.UmlClass#getPackage
	 * @model opposite="Package" containment="true"
	 * @generated
	 */
  EList<UmlClass> getClasses();

  /**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference list.
	 * The list contents are of type {@link umlClassMetaModel.UmlAssociation}.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlAssociation#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Associations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference list.
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlPackage_Associations()
	 * @see umlClassMetaModel.UmlAssociation#getPackage
	 * @model opposite="Package" containment="true"
	 * @generated
	 */
  EList<UmlAssociation> getAssociations();

} // UmlPackage
