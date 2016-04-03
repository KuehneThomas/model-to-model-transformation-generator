/**
 */
package umlClassMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see umlClassMetaModel.UmlClassMetaModelPackage
 * @generated
 */
public interface UmlClassMetaModelFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  UmlClassMetaModelFactory eINSTANCE = umlClassMetaModel.impl.UmlClassMetaModelFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Uml Package</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Package</em>'.
	 * @generated
	 */
  UmlPackage createUmlPackage();

  /**
	 * Returns a new object of class '<em>Uml Class</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Class</em>'.
	 * @generated
	 */
  UmlClass createUmlClass();

  /**
	 * Returns a new object of class '<em>Uml Association</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Association</em>'.
	 * @generated
	 */
  UmlAssociation createUmlAssociation();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  UmlClassMetaModelPackage getUmlClassMetaModelPackage();

} //UmlClassMetaModelFactory
