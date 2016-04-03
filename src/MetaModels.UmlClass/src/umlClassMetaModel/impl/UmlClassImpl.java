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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import umlClassMetaModel.UmlAssociation;
import umlClassMetaModel.UmlClass;
import umlClassMetaModel.UmlClassMetaModelPackage;
import umlClassMetaModel.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlClassMetaModel.impl.UmlClassImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlClassImpl#getOutgoingRelations <em>Outgoing Relations</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlClassImpl#getIncomingRelations <em>Incoming Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlClassImpl extends EObjectImpl implements UmlClass
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
	 * The cached value of the '{@link #getOutgoingRelations() <em>Outgoing Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOutgoingRelations()
	 * @generated
	 * @ordered
	 */
  protected EList<UmlAssociation> outgoingRelations;

  /**
	 * The cached value of the '{@link #getIncomingRelations() <em>Incoming Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIncomingRelations()
	 * @generated
	 * @ordered
	 */
  protected EList<UmlAssociation> incomingRelations;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UmlClassImpl()
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
		return UmlClassMetaModelPackage.Literals.UML_CLASS;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlPackage getPackage()
  {
		if (eContainerFeatureID() != UmlClassMetaModelPackage.UML_CLASS__PACKAGE) return null;
		return (UmlPackage)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPackage(UmlPackage newPackage, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newPackage, UmlClassMetaModelPackage.UML_CLASS__PACKAGE, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPackage(UmlPackage newPackage)
  {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != UmlClassMetaModelPackage.UML_CLASS__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, UmlClassMetaModelPackage.UML_PACKAGE__CLASSES, UmlPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_CLASS__PACKAGE, newPackage, newPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_CLASS__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<UmlAssociation> getOutgoingRelations()
  {
		if (outgoingRelations == null) {
			outgoingRelations = new EObjectWithInverseResolvingEList<UmlAssociation>(UmlAssociation.class, this, UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS, UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE);
		}
		return outgoingRelations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<UmlAssociation> getIncomingRelations()
  {
		if (incomingRelations == null) {
			incomingRelations = new EObjectWithInverseResolvingEList<UmlAssociation>(UmlAssociation.class, this, UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS, UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET);
		}
		return incomingRelations;
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
			case UmlClassMetaModelPackage.UML_CLASS__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((UmlPackage)otherEnd, msgs);
			case UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingRelations()).basicAdd(otherEnd, msgs);
			case UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingRelations()).basicAdd(otherEnd, msgs);
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
			case UmlClassMetaModelPackage.UML_CLASS__PACKAGE:
				return basicSetPackage(null, msgs);
			case UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS:
				return ((InternalEList<?>)getOutgoingRelations()).basicRemove(otherEnd, msgs);
			case UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS:
				return ((InternalEList<?>)getIncomingRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case UmlClassMetaModelPackage.UML_CLASS__PACKAGE:
				return eInternalContainer().eInverseRemove(this, UmlClassMetaModelPackage.UML_PACKAGE__CLASSES, UmlPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case UmlClassMetaModelPackage.UML_CLASS__PACKAGE:
				return getPackage();
			case UmlClassMetaModelPackage.UML_CLASS__NAME:
				return getName();
			case UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS:
				return getOutgoingRelations();
			case UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS:
				return getIncomingRelations();
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
			case UmlClassMetaModelPackage.UML_CLASS__PACKAGE:
				setPackage((UmlPackage)newValue);
				return;
			case UmlClassMetaModelPackage.UML_CLASS__NAME:
				setName((String)newValue);
				return;
			case UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
				getOutgoingRelations().addAll((Collection<? extends UmlAssociation>)newValue);
				return;
			case UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS:
				getIncomingRelations().clear();
				getIncomingRelations().addAll((Collection<? extends UmlAssociation>)newValue);
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
			case UmlClassMetaModelPackage.UML_CLASS__PACKAGE:
				setPackage((UmlPackage)null);
				return;
			case UmlClassMetaModelPackage.UML_CLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS:
				getOutgoingRelations().clear();
				return;
			case UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS:
				getIncomingRelations().clear();
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
			case UmlClassMetaModelPackage.UML_CLASS__PACKAGE:
				return getPackage() != null;
			case UmlClassMetaModelPackage.UML_CLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS:
				return outgoingRelations != null && !outgoingRelations.isEmpty();
			case UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS:
				return incomingRelations != null && !incomingRelations.isEmpty();
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

} //UmlClassImpl
