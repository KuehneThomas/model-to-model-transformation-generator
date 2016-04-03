/**
 */
package umlClassMetaModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlClassMetaModel.UmlAssociation#getPackage <em>Package</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlAssociation#getName <em>Name</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlAssociation#getSource <em>Source</em>}</li>
 *   <li>{@link umlClassMetaModel.UmlAssociation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlAssociation()
 * @model annotation="gmf.node label='Name'"
 * @generated
 */
public interface UmlAssociation extends EObject
{
  /**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlPackage#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(UmlPackage)
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlAssociation_Package()
	 * @see umlClassMetaModel.UmlPackage#getAssociations
	 * @model opposite="Associations" required="true" transient="false"
	 * @generated
	 */
	UmlPackage getPackage();

	/**
	 * Sets the value of the '{@link umlClassMetaModel.UmlAssociation#getPackage <em>Package</em>}' container reference.
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
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlAssociation_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link umlClassMetaModel.UmlAssociation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UmlClass)
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlAssociation_Source()
	 * @see umlClassMetaModel.UmlClass#getOutgoingRelations
	 * @model opposite="outgoingRelations" required="true"
	 * @generated
	 */
  UmlClass getSource();

  /**
	 * Sets the value of the '{@link umlClassMetaModel.UmlAssociation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(UmlClass value);

  /**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlClassMetaModel.UmlClass#getIncomingRelations <em>Incoming Relations</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UmlClass)
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#getUmlAssociation_Target()
	 * @see umlClassMetaModel.UmlClass#getIncomingRelations
	 * @model opposite="incomingRelations" required="true"
	 * @generated
	 */
  UmlClass getTarget();

  /**
	 * Sets the value of the '{@link umlClassMetaModel.UmlAssociation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
  void setTarget(UmlClass value);

} // UmlAssociation
