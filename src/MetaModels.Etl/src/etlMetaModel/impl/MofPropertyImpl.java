/**
 */
package etlMetaModel.impl;

import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.MofAssociation;
import etlMetaModel.MofClass;
import etlMetaModel.MofMultiplicityElement;
import etlMetaModel.MofProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mof Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.MofPropertyImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link etlMetaModel.impl.MofPropertyImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link etlMetaModel.impl.MofPropertyImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link etlMetaModel.impl.MofPropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link etlMetaModel.impl.MofPropertyImpl#getIsComposite <em>Is Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MofPropertyImpl extends MofTypedElementImpl implements MofProperty {
	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Integer upper = UPPER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Integer lower = LOWER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected MofAssociation association;

	/**
	 * The default value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COMPOSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected Boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.MOF_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Integer newUpper) {
		Integer oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.MOF_PROPERTY__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Integer newLower) {
		Integer oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.MOF_PROPERTY__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass getClazz() {
		if (eContainerFeatureID() != EtlMetaModelPackage.MOF_PROPERTY__CLAZZ) return null;
		return (MofClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClazz(MofClass newClazz, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClazz, EtlMetaModelPackage.MOF_PROPERTY__CLAZZ, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(MofClass newClazz) {
		if (newClazz != eInternalContainer() || (eContainerFeatureID() != EtlMetaModelPackage.MOF_PROPERTY__CLAZZ && newClazz != null)) {
			if (EcoreUtil.isAncestor(this, newClazz))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClazz != null)
				msgs = ((InternalEObject)newClazz).eInverseAdd(this, EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES, MofClass.class, msgs);
			msgs = basicSetClazz(newClazz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.MOF_PROPERTY__CLAZZ, newClazz, newClazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofAssociation getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (MofAssociation)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofAssociation basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(MofAssociation newAssociation, NotificationChain msgs) {
		MofAssociation oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(MofAssociation newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject)association).eInverseRemove(this, EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS, MofAssociation.class, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS, MofAssociation.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(Boolean newIsComposite) {
		Boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.MOF_PROPERTY__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_PROPERTY__CLAZZ:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClazz((MofClass)otherEnd, msgs);
			case EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION:
				if (association != null)
					msgs = ((InternalEObject)association).eInverseRemove(this, EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS, MofAssociation.class, msgs);
				return basicSetAssociation((MofAssociation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_PROPERTY__CLAZZ:
				return basicSetClazz(null, msgs);
			case EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION:
				return basicSetAssociation(null, msgs);
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
			case EtlMetaModelPackage.MOF_PROPERTY__CLAZZ:
				return eInternalContainer().eInverseRemove(this, EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES, MofClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_PROPERTY__UPPER:
				return getUpper();
			case EtlMetaModelPackage.MOF_PROPERTY__LOWER:
				return getLower();
			case EtlMetaModelPackage.MOF_PROPERTY__CLAZZ:
				return getClazz();
			case EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case EtlMetaModelPackage.MOF_PROPERTY__IS_COMPOSITE:
				return getIsComposite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_PROPERTY__UPPER:
				setUpper((Integer)newValue);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__LOWER:
				setLower((Integer)newValue);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__CLAZZ:
				setClazz((MofClass)newValue);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION:
				setAssociation((MofAssociation)newValue);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_PROPERTY__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__CLAZZ:
				setClazz((MofClass)null);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION:
				setAssociation((MofAssociation)null);
				return;
			case EtlMetaModelPackage.MOF_PROPERTY__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_PROPERTY__UPPER:
				return UPPER_EDEFAULT == null ? upper != null : !UPPER_EDEFAULT.equals(upper);
			case EtlMetaModelPackage.MOF_PROPERTY__LOWER:
				return LOWER_EDEFAULT == null ? lower != null : !LOWER_EDEFAULT.equals(lower);
			case EtlMetaModelPackage.MOF_PROPERTY__CLAZZ:
				return getClazz() != null;
			case EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION:
				return association != null;
			case EtlMetaModelPackage.MOF_PROPERTY__IS_COMPOSITE:
				return IS_COMPOSITE_EDEFAULT == null ? isComposite != null : !IS_COMPOSITE_EDEFAULT.equals(isComposite);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MofMultiplicityElement.class) {
			switch (derivedFeatureID) {
				case EtlMetaModelPackage.MOF_PROPERTY__UPPER: return EtlMetaModelPackage.MOF_MULTIPLICITY_ELEMENT__UPPER;
				case EtlMetaModelPackage.MOF_PROPERTY__LOWER: return EtlMetaModelPackage.MOF_MULTIPLICITY_ELEMENT__LOWER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MofMultiplicityElement.class) {
			switch (baseFeatureID) {
				case EtlMetaModelPackage.MOF_MULTIPLICITY_ELEMENT__UPPER: return EtlMetaModelPackage.MOF_PROPERTY__UPPER;
				case EtlMetaModelPackage.MOF_MULTIPLICITY_ELEMENT__LOWER: return EtlMetaModelPackage.MOF_PROPERTY__LOWER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (upper: ");
		result.append(upper);
		result.append(", lower: ");
		result.append(lower);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(')');
		return result.toString();
	}

} //MofPropertyImpl
