/**
 */
package umlClassMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see umlClassMetaModel.UmlClassMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface UmlClassMetaModelPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "umlClassMetaModel";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "umlClassMetaModel";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  UmlClassMetaModelPackage eINSTANCE = umlClassMetaModel.impl.UmlClassMetaModelPackageImpl.init();

  /**
	 * The meta object id for the '{@link umlClassMetaModel.impl.UmlPackageImpl <em>Uml Package</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see umlClassMetaModel.impl.UmlPackageImpl
	 * @see umlClassMetaModel.impl.UmlClassMetaModelPackageImpl#getUmlPackage()
	 * @generated
	 */
  int UML_PACKAGE = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_PACKAGE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_PACKAGE__CLASSES = 1;

  /**
	 * The feature id for the '<em><b>Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_PACKAGE__ASSOCIATIONS = 2;

  /**
	 * The number of structural features of the '<em>Uml Package</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_PACKAGE_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link umlClassMetaModel.impl.UmlClassImpl <em>Uml Class</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see umlClassMetaModel.impl.UmlClassImpl
	 * @see umlClassMetaModel.impl.UmlClassMetaModelPackageImpl#getUmlClass()
	 * @generated
	 */
  int UML_CLASS = 1;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_CLASS__PACKAGE = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_CLASS__NAME = 1;

  /**
	 * The feature id for the '<em><b>Outgoing Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_CLASS__OUTGOING_RELATIONS = 2;

  /**
	 * The feature id for the '<em><b>Incoming Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_CLASS__INCOMING_RELATIONS = 3;

  /**
	 * The number of structural features of the '<em>Uml Class</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_CLASS_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link umlClassMetaModel.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see umlClassMetaModel.impl.UmlAssociationImpl
	 * @see umlClassMetaModel.impl.UmlClassMetaModelPackageImpl#getUmlAssociation()
	 * @generated
	 */
  int UML_ASSOCIATION = 2;

  /**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__PACKAGE = 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_ASSOCIATION__NAME = 1;

  /**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_ASSOCIATION__SOURCE = 2;

  /**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_ASSOCIATION__TARGET = 3;

  /**
	 * The number of structural features of the '<em>Uml Association</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int UML_ASSOCIATION_FEATURE_COUNT = 4;


  /**
	 * Returns the meta object for class '{@link umlClassMetaModel.UmlPackage <em>Uml Package</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Package</em>'.
	 * @see umlClassMetaModel.UmlPackage
	 * @generated
	 */
  EClass getUmlPackage();

  /**
	 * Returns the meta object for the attribute '{@link umlClassMetaModel.UmlPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlClassMetaModel.UmlPackage#getName()
	 * @see #getUmlPackage()
	 * @generated
	 */
  EAttribute getUmlPackage_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link umlClassMetaModel.UmlPackage#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see umlClassMetaModel.UmlPackage#getClasses()
	 * @see #getUmlPackage()
	 * @generated
	 */
  EReference getUmlPackage_Classes();

  /**
	 * Returns the meta object for the containment reference list '{@link umlClassMetaModel.UmlPackage#getAssociations <em>Associations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associations</em>'.
	 * @see umlClassMetaModel.UmlPackage#getAssociations()
	 * @see #getUmlPackage()
	 * @generated
	 */
  EReference getUmlPackage_Associations();

  /**
	 * Returns the meta object for class '{@link umlClassMetaModel.UmlClass <em>Uml Class</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Class</em>'.
	 * @see umlClassMetaModel.UmlClass
	 * @generated
	 */
  EClass getUmlClass();

  /**
	 * Returns the meta object for the container reference '{@link umlClassMetaModel.UmlClass#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see umlClassMetaModel.UmlClass#getPackage()
	 * @see #getUmlClass()
	 * @generated
	 */
  EReference getUmlClass_Package();

  /**
	 * Returns the meta object for the attribute '{@link umlClassMetaModel.UmlClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlClassMetaModel.UmlClass#getName()
	 * @see #getUmlClass()
	 * @generated
	 */
  EAttribute getUmlClass_Name();

  /**
	 * Returns the meta object for the reference list '{@link umlClassMetaModel.UmlClass#getOutgoingRelations <em>Outgoing Relations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Relations</em>'.
	 * @see umlClassMetaModel.UmlClass#getOutgoingRelations()
	 * @see #getUmlClass()
	 * @generated
	 */
  EReference getUmlClass_OutgoingRelations();

  /**
	 * Returns the meta object for the reference list '{@link umlClassMetaModel.UmlClass#getIncomingRelations <em>Incoming Relations</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Relations</em>'.
	 * @see umlClassMetaModel.UmlClass#getIncomingRelations()
	 * @see #getUmlClass()
	 * @generated
	 */
  EReference getUmlClass_IncomingRelations();

  /**
	 * Returns the meta object for class '{@link umlClassMetaModel.UmlAssociation <em>Uml Association</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Association</em>'.
	 * @see umlClassMetaModel.UmlAssociation
	 * @generated
	 */
  EClass getUmlAssociation();

  /**
	 * Returns the meta object for the container reference '{@link umlClassMetaModel.UmlAssociation#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see umlClassMetaModel.UmlAssociation#getPackage()
	 * @see #getUmlAssociation()
	 * @generated
	 */
	EReference getUmlAssociation_Package();

		/**
	 * Returns the meta object for the attribute '{@link umlClassMetaModel.UmlAssociation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see umlClassMetaModel.UmlAssociation#getName()
	 * @see #getUmlAssociation()
	 * @generated
	 */
  EAttribute getUmlAssociation_Name();

  /**
	 * Returns the meta object for the reference '{@link umlClassMetaModel.UmlAssociation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see umlClassMetaModel.UmlAssociation#getSource()
	 * @see #getUmlAssociation()
	 * @generated
	 */
  EReference getUmlAssociation_Source();

  /**
	 * Returns the meta object for the reference '{@link umlClassMetaModel.UmlAssociation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see umlClassMetaModel.UmlAssociation#getTarget()
	 * @see #getUmlAssociation()
	 * @generated
	 */
  EReference getUmlAssociation_Target();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  UmlClassMetaModelFactory getUmlClassMetaModelFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link umlClassMetaModel.impl.UmlPackageImpl <em>Uml Package</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see umlClassMetaModel.impl.UmlPackageImpl
		 * @see umlClassMetaModel.impl.UmlClassMetaModelPackageImpl#getUmlPackage()
		 * @generated
		 */
    EClass UML_PACKAGE = eINSTANCE.getUmlPackage();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute UML_PACKAGE__NAME = eINSTANCE.getUmlPackage_Name();

    /**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UML_PACKAGE__CLASSES = eINSTANCE.getUmlPackage_Classes();

    /**
		 * The meta object literal for the '<em><b>Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UML_PACKAGE__ASSOCIATIONS = eINSTANCE.getUmlPackage_Associations();

    /**
		 * The meta object literal for the '{@link umlClassMetaModel.impl.UmlClassImpl <em>Uml Class</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see umlClassMetaModel.impl.UmlClassImpl
		 * @see umlClassMetaModel.impl.UmlClassMetaModelPackageImpl#getUmlClass()
		 * @generated
		 */
    EClass UML_CLASS = eINSTANCE.getUmlClass();

    /**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UML_CLASS__PACKAGE = eINSTANCE.getUmlClass_Package();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute UML_CLASS__NAME = eINSTANCE.getUmlClass_Name();

    /**
		 * The meta object literal for the '<em><b>Outgoing Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UML_CLASS__OUTGOING_RELATIONS = eINSTANCE.getUmlClass_OutgoingRelations();

    /**
		 * The meta object literal for the '<em><b>Incoming Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UML_CLASS__INCOMING_RELATIONS = eINSTANCE.getUmlClass_IncomingRelations();

    /**
		 * The meta object literal for the '{@link umlClassMetaModel.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see umlClassMetaModel.impl.UmlAssociationImpl
		 * @see umlClassMetaModel.impl.UmlClassMetaModelPackageImpl#getUmlAssociation()
		 * @generated
		 */
    EClass UML_ASSOCIATION = eINSTANCE.getUmlAssociation();

    /**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ASSOCIATION__PACKAGE = eINSTANCE.getUmlAssociation_Package();

				/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute UML_ASSOCIATION__NAME = eINSTANCE.getUmlAssociation_Name();

    /**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UML_ASSOCIATION__SOURCE = eINSTANCE.getUmlAssociation_Source();

    /**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference UML_ASSOCIATION__TARGET = eINSTANCE.getUmlAssociation_Target();

  }

} //UmlClassMetaModelPackage
