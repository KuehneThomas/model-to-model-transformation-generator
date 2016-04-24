/**
 */
package umlClassMetaModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlClassMetaModel.UmlAssociation;
import umlClassMetaModel.UmlClass;
import umlClassMetaModel.UmlClassMetaModelPackage;
import umlClassMetaModel.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlClassMetaModel.impl.UmlPackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlPackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlPackageImpl#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlPackageImpl extends EObjectImpl implements UmlPackage
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
  protected EList<UmlClass> classes;

  /**
	 * The cached value of the '{@link #getAssociations() <em>Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAssociations()
	 * @generated
	 * @ordered
	 */
  protected EList<UmlAssociation> associations;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UmlPackageImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return UmlClassMetaModelPackage.Literals.UML_PACKAGE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_PACKAGE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<UmlClass> getClasses()
  {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<UmlClass>(UmlClass.class, this, UmlClassMetaModelPackage.UML_PACKAGE__CLASSES, UmlClassMetaModelPackage.UML_CLASS__PACKAGE);
		}
		return classes;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<UmlAssociation> getAssociations()
  {
		if (associations == null) {
			associations = new EObjectContainmentWithInverseEList<UmlAssociation>(UmlAssociation.class, this, UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS, UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE);
		}
		return associations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_PACKAGE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS:
				return ((InternalEList<?>)getAssociations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_PACKAGE__NAME:
				return getName();
			case UmlClassMetaModelPackage.UML_PACKAGE__CLASSES:
				return getClasses();
			case UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS:
				return getAssociations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_PACKAGE__NAME:
				setName((String)newValue);
				return;
			case UmlClassMetaModelPackage.UML_PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends UmlClass>)newValue);
				return;
			case UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS:
				getAssociations().clear();
				getAssociations().addAll((Collection<? extends UmlAssociation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlClassMetaModelPackage.UML_PACKAGE__CLASSES:
				getClasses().clear();
				return;
			case UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS:
				getAssociations().clear();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlClassMetaModelPackage.UML_PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS:
				return associations != null && !associations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //UmlPackageImpl
