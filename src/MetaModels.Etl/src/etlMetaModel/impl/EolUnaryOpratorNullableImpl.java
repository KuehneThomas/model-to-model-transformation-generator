/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolUnaryOprator;
import etlMetaModel.EolUnaryOpratorNullable;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Unary Oprator Nullable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolUnaryOpratorNullableImpl#getUnaryOperator <em>Unary Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolUnaryOpratorNullableImpl extends MinimalEObjectImpl.Container implements EolUnaryOpratorNullable {
	/**
	 * The default value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EolUnaryOprator UNARY_OPERATOR_EDEFAULT = EolUnaryOprator.MINUS_UNARY;

	/**
	 * The cached value of the '{@link #getUnaryOperator() <em>Unary Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperator()
	 * @generated
	 * @ordered
	 */
	protected EolUnaryOprator unaryOperator = UNARY_OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryOpratorNullableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_UNARY_OPRATOR_NULLABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryOprator getUnaryOperator() {
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOperator(EolUnaryOprator newUnaryOperator) {
		EolUnaryOprator oldUnaryOperator = unaryOperator;
		unaryOperator = newUnaryOperator == null ? UNARY_OPERATOR_EDEFAULT : newUnaryOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR, oldUnaryOperator, unaryOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR:
				return getUnaryOperator();
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
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR:
				setUnaryOperator((EolUnaryOprator)newValue);
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
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR:
				setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
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
			case EtlMetaModelPackage.EOL_UNARY_OPRATOR_NULLABLE__UNARY_OPERATOR:
				return unaryOperator != UNARY_OPERATOR_EDEFAULT;
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
		result.append(" (unaryOperator: ");
		result.append(unaryOperator);
		result.append(')');
		return result.toString();
	}

} //EolUnaryOpratorNullableImpl
