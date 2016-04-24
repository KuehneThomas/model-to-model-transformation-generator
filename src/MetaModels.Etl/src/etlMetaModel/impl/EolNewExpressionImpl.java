/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolNewExpression;
import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.MofClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol New Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolNewExpressionImpl#getInstantiatedMofClass <em>Instantiated Mof Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolNewExpressionImpl extends EolPrimitiveExpressionImpl implements EolNewExpression {
	/**
	 * The cached value of the '{@link #getInstantiatedMofClass() <em>Instantiated Mof Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedMofClass()
	 * @generated
	 * @ordered
	 */
	protected MofClass instantiatedMofClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolNewExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_NEW_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass getInstantiatedMofClass() {
		if (instantiatedMofClass != null && instantiatedMofClass.eIsProxy()) {
			InternalEObject oldInstantiatedMofClass = (InternalEObject)instantiatedMofClass;
			instantiatedMofClass = (MofClass)eResolveProxy(oldInstantiatedMofClass);
			if (instantiatedMofClass != oldInstantiatedMofClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlMetaModelPackage.EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS, oldInstantiatedMofClass, instantiatedMofClass));
			}
		}
		return instantiatedMofClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClass basicGetInstantiatedMofClass() {
		return instantiatedMofClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiatedMofClass(MofClass newInstantiatedMofClass) {
		MofClass oldInstantiatedMofClass = instantiatedMofClass;
		instantiatedMofClass = newInstantiatedMofClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS, oldInstantiatedMofClass, instantiatedMofClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS:
				if (resolve) return getInstantiatedMofClass();
				return basicGetInstantiatedMofClass();
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
			case EtlMetaModelPackage.EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS:
				setInstantiatedMofClass((MofClass)newValue);
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
			case EtlMetaModelPackage.EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS:
				setInstantiatedMofClass((MofClass)null);
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
			case EtlMetaModelPackage.EOL_NEW_EXPRESSION__INSTANTIATED_MOF_CLASS:
				return instantiatedMofClass != null;
		}
		return super.eIsSet(featureID);
	}

} //EolNewExpressionImpl
