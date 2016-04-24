/**
 */
package umlClassMetaModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import umlClassMetaModel.UmlAssociation;
import umlClassMetaModel.UmlClass;
import umlClassMetaModel.UmlClassMetaModelPackage;
import umlClassMetaModel.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlClassMetaModel.impl.UmlAssociationImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlAssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlAssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link umlClassMetaModel.impl.UmlAssociationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UmlAssociationImpl extends EObjectImpl implements UmlAssociation
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
  protected UmlClass source;

  /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
  protected UmlClass target;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UmlAssociationImpl()
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
		return UmlClassMetaModelPackage.Literals.UML_ASSOCIATION;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage getPackage() {
		if (eContainerFeatureID() != UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE) return null;
		return (UmlPackage)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(UmlPackage newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(UmlPackage newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS, UmlPackage.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE, newPackage, newPackage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_ASSOCIATION__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClass getSource()
  {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (UmlClass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClass basicGetSource()
  {
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSource(UmlClass newSource, NotificationChain msgs)
  {
		UmlClass oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSource(UmlClass newSource)
  {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS, UmlClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS, UmlClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE, newSource, newSource));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClass getTarget()
  {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (UmlClass)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public UmlClass basicGetTarget()
  {
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTarget(UmlClass newTarget, NotificationChain msgs)
  {
		UmlClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTarget(UmlClass newTarget)
  {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS, UmlClass.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS, UmlClass.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET, newTarget, newTarget));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((UmlPackage)otherEnd, msgs);
			case UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, UmlClassMetaModelPackage.UML_CLASS__OUTGOING_RELATIONS, UmlClass.class, msgs);
				return basicSetSource((UmlClass)otherEnd, msgs);
			case UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, UmlClassMetaModelPackage.UML_CLASS__INCOMING_RELATIONS, UmlClass.class, msgs);
				return basicSetTarget((UmlClass)otherEnd, msgs);
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
			case UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE:
				return basicSetPackage(null, msgs);
			case UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE:
				return basicSetSource(null, msgs);
			case UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE:
				return eInternalContainer().eInverseRemove(this, UmlClassMetaModelPackage.UML_PACKAGE__ASSOCIATIONS, UmlPackage.class, msgs);
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
			case UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE:
				return getPackage();
			case UmlClassMetaModelPackage.UML_ASSOCIATION__NAME:
				return getName();
			case UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE:
				setPackage((UmlPackage)newValue);
				return;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE:
				setSource((UmlClass)newValue);
				return;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET:
				setTarget((UmlClass)newValue);
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
			case UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE:
				setPackage((UmlPackage)null);
				return;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE:
				setSource((UmlClass)null);
				return;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET:
				setTarget((UmlClass)null);
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
			case UmlClassMetaModelPackage.UML_ASSOCIATION__PACKAGE:
				return getPackage() != null;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlClassMetaModelPackage.UML_ASSOCIATION__SOURCE:
				return source != null;
			case UmlClassMetaModelPackage.UML_ASSOCIATION__TARGET:
				return target != null;
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

} //UmlAssociationImpl
