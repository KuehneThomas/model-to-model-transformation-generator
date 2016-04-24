/**
 */
package relationalMetaModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import relationalMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationalMetaModelFactoryImpl extends EFactoryImpl implements RelationalMetaModelFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RelationalMetaModelFactory init()
  {
		try {
			RelationalMetaModelFactory theRelationalMetaModelFactory = (RelationalMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalMetaModelPackage.eNS_URI);
			if (theRelationalMetaModelFactory != null) {
				return theRelationalMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalMetaModelFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalMetaModelFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case RelationalMetaModelPackage.RELATIONAL_SCHEMA: return createRelationalSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE: return createRelationalTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY: return createRelationalForeignKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalSchema createRelationalSchema()
  {
		RelationalSchemaImpl relationalSchema = new RelationalSchemaImpl();
		return relationalSchema;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalTable createRelationalTable()
  {
		RelationalTableImpl relationalTable = new RelationalTableImpl();
		return relationalTable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalForeignKey createRelationalForeignKey()
  {
		RelationalForeignKeyImpl relationalForeignKey = new RelationalForeignKeyImpl();
		return relationalForeignKey;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalMetaModelPackage getRelationalMetaModelPackage()
  {
		return (RelationalMetaModelPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static RelationalMetaModelPackage getPackage()
  {
		return RelationalMetaModelPackage.eINSTANCE;
	}

} //RelationalMetaModelFactoryImpl
