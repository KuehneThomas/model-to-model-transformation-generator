/**
 */
package umlClassMetaModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import umlClassMetaModel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlClassMetaModelFactoryImpl extends EFactoryImpl implements UmlClassMetaModelFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static UmlClassMetaModelFactory init()
  {
		try {
			UmlClassMetaModelFactory theUmlClassMetaModelFactory = (UmlClassMetaModelFactory)EPackage.Registry.INSTANCE.getEFactory(UmlClassMetaModelPackage.eNS_URI);
			if (theUmlClassMetaModelFactory != null) {
				return theUmlClassMetaModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlClassMetaModelFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClassMetaModelFactoryImpl()
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
			case UmlClassMetaModelPackage.UML_PACKAGE: return createUmlPackage();
			case UmlClassMetaModelPackage.UML_CLASS: return createUmlClass();
			case UmlClassMetaModelPackage.UML_ASSOCIATION: return createUmlAssociation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlPackage createUmlPackage()
  {
		UmlPackageImpl umlPackage = new UmlPackageImpl();
		return umlPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClass createUmlClass()
  {
		UmlClassImpl umlClass = new UmlClassImpl();
		return umlClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlAssociation createUmlAssociation()
  {
		UmlAssociationImpl umlAssociation = new UmlAssociationImpl();
		return umlAssociation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClassMetaModelPackage getUmlClassMetaModelPackage()
  {
		return (UmlClassMetaModelPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static UmlClassMetaModelPackage getPackage()
  {
		return UmlClassMetaModelPackage.eINSTANCE;
	}

} //UmlClassMetaModelFactoryImpl
