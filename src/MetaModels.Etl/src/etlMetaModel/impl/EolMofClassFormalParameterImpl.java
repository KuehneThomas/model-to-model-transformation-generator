/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolMofClassFormalParameter;
import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.MofClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Mof Class Formal Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolMofClassFormalParameterImpl#getReferenced <em>Referenced</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolMofClassFormalParameterImpl#getIsSequence <em>Is Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolMofClassFormalParameterImpl extends EolFormalParameterImpl implements EolMofClassFormalParameter {
	/**
	 * The cached value of the '{@link #getReferenced() <em>Referenced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenced()
	 * @generated
	 * @ordered
	 */
	protected MofClass referenced;

	/**
	 * The default value of the '{@link #getIsSequence() <em>Is Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSequence()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SEQUENCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIsSequence() <em>Is Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSequence()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSequence = IS_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMofClassFormalParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_MOF_CLASS_FORMAL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass getReferenced() {
		if (referenced != null && referenced.eIsProxy()) {
			InternalEObject oldReferenced = (InternalEObject)referenced;
			referenced = (MofClass)eResolveProxy(oldReferenced);
			if (referenced != oldReferenced) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED, oldReferenced, referenced));
			}
		}
		return referenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass basicGetReferenced() {
		return referenced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenced(MofClass newReferenced) {
		MofClass oldReferenced = referenced;
		referenced = newReferenced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED, oldReferenced, referenced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSequence() {
		return isSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSequence(Boolean newIsSequence) {
		Boolean oldIsSequence = isSequence;
		isSequence = newIsSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE, oldIsSequence, isSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED:
				if (resolve) return getReferenced();
				return basicGetReferenced();
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE:
				return getIsSequence();
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
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED:
				setReferenced((MofClass)newValue);
				return;
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE:
				setIsSequence((Boolean)newValue);
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
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED:
				setReferenced((MofClass)null);
				return;
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE:
				setIsSequence(IS_SEQUENCE_EDEFAULT);
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
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__REFERENCED:
				return referenced != null;
			case EtlMetaModelPackage.EOL_MOF_CLASS_FORMAL_PARAMETER__IS_SEQUENCE:
				return IS_SEQUENCE_EDEFAULT == null ? isSequence != null : !IS_SEQUENCE_EDEFAULT.equals(isSequence);
		}
		return super.eIsSet(featureID);
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
		result.append(" (isSequence: ");
		result.append(isSequence);
		result.append(')');
		return result.toString();
	}

} //EolMofClassFormalParameterImpl
