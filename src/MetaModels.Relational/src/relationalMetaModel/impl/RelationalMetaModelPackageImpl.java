/**
 */
package relationalMetaModel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import relationalMetaModel.RelationalForeignKey;
import relationalMetaModel.RelationalMetaModelFactory;
import relationalMetaModel.RelationalMetaModelPackage;
import relationalMetaModel.RelationalSchema;
import relationalMetaModel.RelationalTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalMetaModelPackageImpl extends EPackageImpl implements RelationalMetaModelPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass relationalSchemaEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass relationalTableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass relationalForeignKeyEClass = null;

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
	 * @see relationalMetaModel.RelationalMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private RelationalMetaModelPackageImpl()
  {
		super(eNS_URI, RelationalMetaModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationalMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static RelationalMetaModelPackage init()
  {
		if (isInited) return (RelationalMetaModelPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		RelationalMetaModelPackageImpl theRelationalMetaModelPackage = (RelationalMetaModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RelationalMetaModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RelationalMetaModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRelationalMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalMetaModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalMetaModelPackage.eNS_URI, theRelationalMetaModelPackage);
		return theRelationalMetaModelPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRelationalSchema()
  {
		return relationalSchemaEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationalSchema_Name()
  {
		return (EAttribute)relationalSchemaEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationalSchema_Tables()
  {
		return (EReference)relationalSchemaEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRelationalTable()
  {
		return relationalTableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationalTable_Schema()
  {
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationalTable_Name()
  {
		return (EAttribute)relationalTableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationalTable_ForeignKeys()
  {
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalTable_ReferencedBy() {
		return (EReference)relationalTableEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRelationalForeignKey()
  {
		return relationalForeignKeyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationalForeignKey_Name()
  {
		return (EAttribute)relationalForeignKeyEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationalForeignKey_OwnedByTable()
  {
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationalForeignKey_ReferencedTable()
  {
		return (EReference)relationalForeignKeyEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalMetaModelFactory getRelationalMetaModelFactory()
  {
		return (RelationalMetaModelFactory)getEFactoryInstance();
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
		relationalSchemaEClass = createEClass(RELATIONAL_SCHEMA);
		createEAttribute(relationalSchemaEClass, RELATIONAL_SCHEMA__NAME);
		createEReference(relationalSchemaEClass, RELATIONAL_SCHEMA__TABLES);

		relationalTableEClass = createEClass(RELATIONAL_TABLE);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__SCHEMA);
		createEAttribute(relationalTableEClass, RELATIONAL_TABLE__NAME);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__FOREIGN_KEYS);
		createEReference(relationalTableEClass, RELATIONAL_TABLE__REFERENCED_BY);

		relationalForeignKeyEClass = createEClass(RELATIONAL_FOREIGN_KEY);
		createEAttribute(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__NAME);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		createEReference(relationalForeignKeyEClass, RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
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
		initEClass(relationalSchemaEClass, RelationalSchema.class, "RelationalSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalSchema_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalSchema_Tables(), this.getRelationalTable(), this.getRelationalTable_Schema(), "Tables", null, 0, -1, RelationalSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalTableEClass, RelationalTable.class, "RelationalTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalTable_Schema(), this.getRelationalSchema(), this.getRelationalSchema_Tables(), "Schema", null, 1, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationalTable_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ForeignKeys(), this.getRelationalForeignKey(), this.getRelationalForeignKey_OwnedByTable(), "ForeignKeys", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalTable_ReferencedBy(), this.getRelationalForeignKey(), this.getRelationalForeignKey_ReferencedTable(), "ReferencedBy", null, 0, -1, RelationalTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalForeignKeyEClass, RelationalForeignKey.class, "RelationalForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalForeignKey_Name(), ecorePackage.getEString(), "Name", null, 0, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_OwnedByTable(), this.getRelationalTable(), this.getRelationalTable_ForeignKeys(), "OwnedByTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationalForeignKey_ReferencedTable(), this.getRelationalTable(), this.getRelationalTable_ReferencedBy(), "ReferencedTable", null, 1, 1, RelationalForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
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
		  (relationalSchemaEClass, 
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
		  (relationalTableEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });	
		addAnnotation
		  (relationalForeignKeyEClass, 
		   source, 
		   new String[] {
			 "label", "Name"
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_3Annotations()
  {
		String source = "gmf.compartment";	
		addAnnotation
		  (getRelationalTable_ForeignKeys(), 
		   source, 
		   new String[] {
		   });
	}

  /**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createGmf_4Annotations()
  {
		String source = "gmf.link";	
		addAnnotation
		  (getRelationalForeignKey_ReferencedTable(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });
	}

} //RelationalMetaModelPackageImpl
