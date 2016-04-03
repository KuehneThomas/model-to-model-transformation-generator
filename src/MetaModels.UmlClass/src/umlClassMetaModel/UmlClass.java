/**
 */
package umlClassMetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlClassMetaModel.UmlClass#getPackage <em>Package</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlClass#getName <em>Name</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlClass#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlClass#getIncomingRelations <em>Incoming Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlClass()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface UmlClass extends EObject
{
  /**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(UmlPackage)
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlClass_Package()
	 * @see umlClassMetaModel.UmlPackage#getClasses
	 * @model opposite="Classes" required="true" transient="false"
	 * @generated
	 */
  UmlPackage getPackage();

  /**
	 * Sets the value of the '{@link umlClassMetaModel.UmlClass#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
  void setPackage(UmlPackage value);

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
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlClass_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link umlClassMetaModel.UmlClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Outgoing Relations</b></em>' reference list.
	 * The list contents are of type {@link umlClassMetaModel.UmlAssociation}.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outgoing Relations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Relations</em>' reference list.
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlClass_OutgoingRelations()
	 * @see umlClassMetaModel.UmlAssociation#getSource
	 * @model opposite="Source"
	 *        annotation="gmf.link source.decoration='arrow' style='dash'"
	 * @generated
	 */
  EList<UmlAssociation> getOutgoingRelations();

  /**
	 * Returns the value of the '<em><b>Incoming Relations</b></em>' reference list.
	 * The list contents are of type {@link umlClassMetaModel.UmlAssociation}.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incoming Relations</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Relations</em>' reference list.
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlClass_IncomingRelations()
	 * @see umlClassMetaModel.UmlAssociation#getTarget
	 * @model opposite="Target"
	 *        annotation="gmf.link source.decoration='arrow' style='dash'"
	 * @generated
	 */
  EList<UmlAssociation> getIncomingRelations();

} // UmlClass
