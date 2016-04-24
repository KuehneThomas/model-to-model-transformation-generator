/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolFormalParameter;
import etlMetaModel.EolFormalParameterReferenceExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Formal Parameter Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolFormalParameterReferenceExpressionImpl#getReferencedFormalParameter <em>Referenced Formal Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolFormalParameterReferenceExpressionImpl extends EolReferenceExpressionImpl implements EolFormalParameterReferenceExpression {
	/**
	 * The cached value of the '{@link #getReferencedFormalParameter() <em>Referenced Formal Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected EolFormalParameter referencedFormalParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolFormalParameterReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolFormalParameter getReferencedFormalParameter() {
		if (referencedFormalParameter != null && referencedFormalParameter.eIsProxy()) {
			InternalEObject oldReferencedFormalParameter = (InternalEObject)referencedFormalParameter;
			referencedFormalParameter = (EolFormalParameter)eResolveProxy(oldReferencedFormalParameter);
			if (referencedFormalParameter != oldReferencedFormalParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER, oldReferencedFormalParameter, referencedFormalParameter));
			}
		}
		return referencedFormalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolFormalParameter basicGetReferencedFormalParameter() {
		return referencedFormalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedFormalParameter(EolFormalParameter newReferencedFormalParameter) {
		EolFormalParameter oldReferencedFormalParameter = referencedFormalParameter;
		referencedFormalParameter = newReferencedFormalParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER, oldReferencedFormalParameter, referencedFormalParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER:
				if (resolve) return getReferencedFormalParameter();
				return basicGetReferencedFormalParameter();
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
			case EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER:
				setReferencedFormalParameter((EolFormalParameter)newValue);
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
			case EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER:
				setReferencedFormalParameter((EolFormalParameter)null);
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
			case EtlMetaModelPackage.EOL_FORMAL_PARAMETER_REFERENCE_EXPRESSION__REFERENCED_FORMAL_PARAMETER:
				return referencedFormalParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //EolFormalParameterReferenceExpressionImpl
