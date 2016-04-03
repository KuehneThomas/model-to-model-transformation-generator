/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolMofPropertyFeatureCall;
import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.MofProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Mof Property Feature Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolMofPropertyFeatureCallImpl#getReferencedMofProperty <em>Referenced Mof Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolMofPropertyFeatureCallImpl extends EolFeatureCallImpl implements EolMofPropertyFeatureCall {
	/**
	 * The cached value of the '{@link #getReferencedMofProperty() <em>Referenced Mof Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedMofProperty()
	 * @generated
	 * @ordered
	 */
	protected MofProperty referencedMofProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMofPropertyFeatureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_MOF_PROPERTY_FEATURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofProperty getReferencedMofProperty() {
		if (referencedMofProperty != null && referencedMofProperty.eIsProxy()) {
			InternalEObject oldReferencedMofProperty = (InternalEObject)referencedMofProperty;
			referencedMofProperty = (MofProperty)eResolveProxy(oldReferencedMofProperty);
			if (referencedMofProperty != oldReferencedMofProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY, oldReferencedMofProperty, referencedMofProperty));
			}
		}
		return referencedMofProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofProperty basicGetReferencedMofProperty() {
		return referencedMofProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedMofProperty(MofProperty newReferencedMofProperty) {
		MofProperty oldReferencedMofProperty = referencedMofProperty;
		referencedMofProperty = newReferencedMofProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY, oldReferencedMofProperty, referencedMofProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY:
				if (resolve) return getReferencedMofProperty();
				return basicGetReferencedMofProperty();
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
			case EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY:
				setReferencedMofProperty((MofProperty)newValue);
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
			case EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY:
				setReferencedMofProperty((MofProperty)null);
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
			case EtlMetaModelPackage.EOL_MOF_PROPERTY_FEATURE_CALL__REFERENCED_MOF_PROPERTY:
				return referencedMofProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //EolMofPropertyFeatureCallImpl
