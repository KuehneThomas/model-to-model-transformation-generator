/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolIsTypeOfSourceMofClassFeatureCall;
import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.MofClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Is Type Of Source Mof Class Feature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolIsTypeOfSourceMofClassFeatureCallImpl#getReferencedMofClass <em>Referenced Mof Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolIsTypeOfSourceMofClassFeatureCallImpl extends EolFeatureCallImpl implements EolIsTypeOfSourceMofClassFeatureCall {
	/**
	 * The cached value of the '{@link #getReferencedMofClass() <em>Referenced Mof Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMofClass()
	 * @generated
	 * @ordered
	 */
	protected MofClass referencedMofClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolIsTypeOfSourceMofClassFeatureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass getReferencedMofClass() {
		if (referencedMofClass != null && referencedMofClass.eIsProxy()) {
			InternalEObject oldReferencedMofClass = (InternalEObject)referencedMofClass;
			referencedMofClass = (MofClass)eResolveProxy(oldReferencedMofClass);
			if (referencedMofClass != oldReferencedMofClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS, oldReferencedMofClass, referencedMofClass));
			}
		}
		return referencedMofClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass basicGetReferencedMofClass() {
		return referencedMofClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMofClass(MofClass newReferencedMofClass) {
		MofClass oldReferencedMofClass = referencedMofClass;
		referencedMofClass = newReferencedMofClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS, oldReferencedMofClass, referencedMofClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS:
				if (resolve) return getReferencedMofClass();
				return basicGetReferencedMofClass();
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
			case EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS:
				setReferencedMofClass((MofClass)newValue);
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
			case EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS:
				setReferencedMofClass((MofClass)null);
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
			case EtlMetaModelPackage.EOL_IS_TYPE_OF_SOURCE_MOF_CLASS_FEATURE_CALL__REFERENCED_MOF_CLASS:
				return referencedMofClass != null;
		}
		return super.eIsSet(featureID);
	}

} //EolIsTypeOfSourceMofClassFeatureCallImpl
