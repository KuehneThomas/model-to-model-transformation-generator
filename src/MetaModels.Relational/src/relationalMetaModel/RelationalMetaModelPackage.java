/**
 */
package relationalMetaModel;

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
 * @see relationalMetaModel.RelationalMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface RelationalMetaModelPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "relationalMetaModel";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "relationalMetaModel";

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
  RelationalMetaModelPackage eINSTANCE = relationalMetaModel.impl.RelationalMetaModelPackageImpl.init();

  /**
	 * The meta object id for the '{@link relationalMetaModel.impl.RelationalSchemaImpl <em>Relational Schema</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see relationalMetaModel.impl.RelationalSchemaImpl
	 * @see relationalMetaModel.impl.RelationalMetaModelPackageImpl#getRelationalSchema()
	 * @generated
	 */
  int RELATIONAL_SCHEMA = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_SCHEMA__NAME = 0;

  /**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_SCHEMA__TABLES = 1;

  /**
	 * The number of structural features of the '<em>Relational Schema</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_SCHEMA_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link relationalMetaModel.impl.RelationalTableImpl <em>Relational Table</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see relationalMetaModel.impl.RelationalTableImpl
	 * @see relationalMetaModel.impl.RelationalMetaModelPackageImpl#getRelationalTable()
	 * @generated
	 */
  int RELATIONAL_TABLE = 1;

  /**
	 * The feature id for the '<em><b>Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_TABLE__SCHEMA = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_TABLE__NAME = 1;

  /**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_TABLE__FOREIGN_KEYS = 2;

  /**
	 * The feature id for the '<em><b>Referenced By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_TABLE__REFERENCED_BY = 3;

		/**
	 * The number of structural features of the '<em>Relational Table</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_TABLE_FEATURE_COUNT = 4;

  /**
	 * The meta object id for the '{@link relationalMetaModel.impl.RelationalForeignKeyImpl <em>Relational Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see relationalMetaModel.impl.RelationalForeignKeyImpl
	 * @see relationalMetaModel.impl.RelationalMetaModelPackageImpl#getRelationalForeignKey()
	 * @generated
	 */
  int RELATIONAL_FOREIGN_KEY = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_FOREIGN_KEY__NAME = 0;

  /**
	 * The feature id for the '<em><b>Owned By Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = 1;

  /**
	 * The feature id for the '<em><b>Referenced Table</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = 2;

  /**
	 * The number of structural features of the '<em>Relational Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RELATIONAL_FOREIGN_KEY_FEATURE_COUNT = 3;


  /**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalSchema <em>Relational Schema</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Schema</em>'.
	 * @see relationalMetaModel.RelationalSchema
	 * @generated
	 */
  EClass getRelationalSchema();

  /**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalSchema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalSchema#getName()
	 * @see #getRelationalSchema()
	 * @generated
	 */
  EAttribute getRelationalSchema_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalSchema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see relationalMetaModel.RelationalSchema#getTables()
	 * @see #getRelationalSchema()
	 * @generated
	 */
  EReference getRelationalSchema_Tables();

  /**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalTable <em>Relational Table</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Table</em>'.
	 * @see relationalMetaModel.RelationalTable
	 * @generated
	 */
  EClass getRelationalTable();

  /**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalTable#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Schema</em>'.
	 * @see relationalMetaModel.RelationalTable#getSchema()
	 * @see #getRelationalTable()
	 * @generated
	 */
  EReference getRelationalTable_Schema();

  /**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalTable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalTable#getName()
	 * @see #getRelationalTable()
	 * @generated
	 */
  EAttribute getRelationalTable_Name();

  /**
	 * Returns the meta object for the containment reference list '{@link relationalMetaModel.RelationalTable#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
	 * @see relationalMetaModel.RelationalTable#getForeignKeys()
	 * @see #getRelationalTable()
	 * @generated
	 */
  EReference getRelationalTable_ForeignKeys();

  /**
	 * Returns the meta object for the reference list '{@link relationalMetaModel.RelationalTable#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced By</em>'.
	 * @see relationalMetaModel.RelationalTable#getReferencedBy()
	 * @see #getRelationalTable()
	 * @generated
	 */
	EReference getRelationalTable_ReferencedBy();

		/**
	 * Returns the meta object for class '{@link relationalMetaModel.RelationalForeignKey <em>Relational Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Foreign Key</em>'.
	 * @see relationalMetaModel.RelationalForeignKey
	 * @generated
	 */
  EClass getRelationalForeignKey();

  /**
	 * Returns the meta object for the attribute '{@link relationalMetaModel.RelationalForeignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getName()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
  EAttribute getRelationalForeignKey_Name();

  /**
	 * Returns the meta object for the container reference '{@link relationalMetaModel.RelationalForeignKey#getOwnedByTable <em>Owned By Table</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getOwnedByTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
  EReference getRelationalForeignKey_OwnedByTable();

  /**
	 * Returns the meta object for the reference '{@link relationalMetaModel.RelationalForeignKey#getReferencedTable <em>Referenced Table</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Table</em>'.
	 * @see relationalMetaModel.RelationalForeignKey#getReferencedTable()
	 * @see #getRelationalForeignKey()
	 * @generated
	 */
  EReference getRelationalForeignKey_ReferencedTable();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  RelationalMetaModelFactory getRelationalMetaModelFactory();

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
		 * The meta object literal for the '{@link relationalMetaModel.impl.RelationalSchemaImpl <em>Relational Schema</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see relationalMetaModel.impl.RelationalSchemaImpl
		 * @see relationalMetaModel.impl.RelationalMetaModelPackageImpl#getRelationalSchema()
		 * @generated
		 */
    EClass RELATIONAL_SCHEMA = eINSTANCE.getRelationalSchema();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONAL_SCHEMA__NAME = eINSTANCE.getRelationalSchema_Name();

    /**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATIONAL_SCHEMA__TABLES = eINSTANCE.getRelationalSchema_Tables();

    /**
		 * The meta object literal for the '{@link relationalMetaModel.impl.RelationalTableImpl <em>Relational Table</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see relationalMetaModel.impl.RelationalTableImpl
		 * @see relationalMetaModel.impl.RelationalMetaModelPackageImpl#getRelationalTable()
		 * @generated
		 */
    EClass RELATIONAL_TABLE = eINSTANCE.getRelationalTable();

    /**
		 * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATIONAL_TABLE__SCHEMA = eINSTANCE.getRelationalTable_Schema();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONAL_TABLE__NAME = eINSTANCE.getRelationalTable_Name();

    /**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATIONAL_TABLE__FOREIGN_KEYS = eINSTANCE.getRelationalTable_ForeignKeys();

    /**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_TABLE__REFERENCED_BY = eINSTANCE.getRelationalTable_ReferencedBy();

				/**
		 * The meta object literal for the '{@link relationalMetaModel.impl.RelationalForeignKeyImpl <em>Relational Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see relationalMetaModel.impl.RelationalForeignKeyImpl
		 * @see relationalMetaModel.impl.RelationalMetaModelPackageImpl#getRelationalForeignKey()
		 * @generated
		 */
    EClass RELATIONAL_FOREIGN_KEY = eINSTANCE.getRelationalForeignKey();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RELATIONAL_FOREIGN_KEY__NAME = eINSTANCE.getRelationalForeignKey_Name();

    /**
		 * The meta object literal for the '<em><b>Owned By Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE = eINSTANCE.getRelationalForeignKey_OwnedByTable();

    /**
		 * The meta object literal for the '<em><b>Referenced Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE = eINSTANCE.getRelationalForeignKey_ReferencedTable();

  }

} //RelationalMetaModelPackage
