/**
 */
package umlClassMetaModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import umlClassMetaModel.UmlAssociation;
import umlClassMetaModel.UmlClass;
import umlClassMetaModel.UmlClassMetaModelFactory;
import umlClassMetaModel.UmlClassMetaModelPackage;
import umlClassMetaModel.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlClassMetaModelPackageImpl extends EPackageImpl implements UmlClassMetaModelPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass umlPackageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass umlClassEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass umlAssociationEClass = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see umlClassMetaModel.UmlClassMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private UmlClassMetaModelPackageImpl()
  {
		super(eNS_URI, UmlClassMetaModelFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UmlClassMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static UmlClassMetaModelPackage init()
  {
		if (isInited) return (UmlClassMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(UmlClassMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		UmlClassMetaModelPackageImpl theUmlClassMetaModelPackage = (UmlClassMetaModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmlClassMetaModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmlClassMetaModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUmlClassMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theUmlClassMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmlClassMetaModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlClassMetaModelPackage.eNS_URI, theUmlClassMetaModelPackage);
		return theUmlClassMetaModelPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getUmlPackage()
  {
		return umlPackageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getUmlPackage_Name()
  {
		return (EAttribute)umlPackageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getUmlPackage_Classes()
  {
		return (EReference)umlPackageEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getUmlPackage_Associations()
  {
		return (EReference)umlPackageEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getUmlClass()
  {
		return umlClassEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getUmlClass_Package()
  {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getUmlClass_Name()
  {
		return (EAttribute)umlClassEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getUmlClass_OutgoingRelations()
  {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getUmlClass_IncomingRelations()
  {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getUmlAssociation()
  {
		return umlAssociationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUmlAssociation_Package() {
		return (EReference)umlAssociationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getUmlAssociation_Name()
  {
		return (EAttribute)umlAssociationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getUmlAssociation_Source()
  {
		return (EReference)umlAssociationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getUmlAssociation_Target()
  {
		return (EReference)umlAssociationEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClassMetaModelFactory getUmlClassMetaModelFactory()
  {
		return (UmlClassMetaModelFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		umlPackageEClass = createEClass(UML_PACKAGE);
		createEAttribute(umlPackageEClass, UML_PACKAGE__NAME);
		createEReference(umlPackageEClass, UML_PACKAGE__CLASSES);
		createEReference(umlPackageEClass, UML_PACKAGE__ASSOCIATIONS);

		umlClassEClass = createEClass(UML_CLASS);
		createEReference(umlClassEClass, UML_CLASS__PACKAGE);
		createEAttribute(umlClassEClass, UML_CLASS__NAME);
		createEReference(umlClassEClass, UML_CLASS__OUTGOING_RELATIONS);
		createEReference(umlClassEClass, UML_CLASS__INCOMING_RELATIONS);

		umlAssociationEClass = createEClass(UML_ASSOCIATION);
		createEReference(umlAssociationEClass, UML_ASSOCIATION__PACKAGE);
		createEAttribute(umlAssociationEClass, UML_ASSOCIATION__NAME);
		createEReference(umlAssociationEClass, UML_ASSOCIATION__SOURCE);
		createEReference(umlAssociationEClass, UML_ASSOCIATION__TARGET);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(umlPackageEClass, UmlPackage.class, "UmlPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlPackage_Name(), ecorePackage.getEString(), "Name", null, 0, 1, UmlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage_Classes(), this.getUmlClass(), this.getUmlClass_Package(), "Classes", null, 0, -1, UmlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlPackage_Associations(), this.getUmlAssociation(), this.getUmlAssociation_Package(), "Associations", null, 0, -1, UmlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClassEClass, UmlClass.class, "UmlClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlClass_Package(), this.getUmlPackage(), this.getUmlPackage_Classes(), "Package", null, 1, 1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUmlClass_Name(), ecorePackage.getEString(), "Name", null, 0, 1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClass_OutgoingRelations(), this.getUmlAssociation(), this.getUmlAssociation_Source(), "outgoingRelations", null, 0, -1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlClass_IncomingRelations(), this.getUmlAssociation(), this.getUmlAssociation_Target(), "incomingRelations", null, 0, -1, UmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlAssociationEClass, UmlAssociation.class, "UmlAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlAssociation_Package(), this.getUmlPackage(), this.getUmlPackage_Associations(), "Package", null, 1, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUmlAssociation_Name(), ecorePackage.getEString(), "Name", null, 0, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlAssociation_Source(), this.getUmlClass(), this.getUmlClass_OutgoingRelations(), "Source", null, 1, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUmlAssociation_Target(), this.getUmlClass(), this.getUmlClass_IncomingRelations(), "Target", null, 1, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

  /**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmfAnnotations()
  {
		String source = "gmf";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_1Annotations()
  {
		String source = "gmf.diagram";	
		addAnnotation
		  (umlPackageEClass, 
		   source, 
		   new String[] {
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_2Annotations()
  {
		String source = "gmf.node";	
		addAnnotation
		  (umlClassEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });	
		addAnnotation
		  (umlAssociationEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_3Annotations()
  {
		String source = "gmf.link";	
		addAnnotation
		  (getUmlClass_OutgoingRelations(), 
		   source, 
		   new String[] {
			 "source.decoration", "arrow",
			 "style", "dash"
		   });	
		addAnnotation
		  (getUmlClass_IncomingRelations(), 
		   source, 
		   new String[] {
			 "source.decoration", "arrow",
			 "style", "dash"
		   });
	}

} //UmlClassMetaModelPackageImpl
