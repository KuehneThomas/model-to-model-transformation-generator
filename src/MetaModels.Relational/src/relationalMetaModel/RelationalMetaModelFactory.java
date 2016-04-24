/**
 */
package relationalMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see relationalMetaModel.RelationalMetaModelPackage
 * @generated
 */
public interface RelationalMetaModelFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  RelationalMetaModelFactory eINSTANCE = relationalMetaModel.impl.RelationalMetaModelFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Relational Schema</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Schema</em>'.
	 * @generated
	 */
  RelationalSchema createRelationalSchema();

  /**
	 * Returns a new object of class '<em>Relational Table</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Table</em>'.
	 * @generated
	 */
  RelationalTable createRelationalTable();

  /**
	 * Returns a new object of class '<em>Relational Foreign Key</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Foreign Key</em>'.
	 * @generated
	 */
  RelationalForeignKey createRelationalForeignKey();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  RelationalMetaModelPackage getRelationalMetaModelPackage();

} //RelationalMetaModelFactory
