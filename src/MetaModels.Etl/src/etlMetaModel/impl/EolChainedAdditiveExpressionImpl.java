/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolAdditiveArithmeticalOperator;
import etlMetaModel.EolAdditiveExpression;
import etlMetaModel.EolChainedAdditiveExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Chained Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolChainedAdditiveExpressionImpl#getAdditiveArithmeticalOperator <em>Additive Arithmetical Operator</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolChainedAdditiveExpressionImpl#getAdditiveExpression <em>Additive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolChainedAdditiveExpressionImpl extends MinimalEObjectImpl.Container implements EolChainedAdditiveExpression {
	/**
	 * The default value of the '{@link #getAdditiveArithmeticalOperator() <em>Additive Arithmetical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveArithmeticalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EolAdditiveArithmeticalOperator ADDITIVE_ARITHMETICAL_OPERATOR_EDEFAULT = EolAdditiveArithmeticalOperator.PLUS;

	/**
	 * The cached value of the '{@link #getAdditiveArithmeticalOperator() <em>Additive Arithmetical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveArithmeticalOperator()
	 * @generated
	 * @ordered
	 */
	protected EolAdditiveArithmeticalOperator additiveArithmeticalOperator = ADDITIVE_ARITHMETICAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdditiveExpression() <em>Additive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveExpression()
	 * @generated
	 * @ordered
	 */
	protected EolAdditiveExpression additiveExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedAdditiveExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_CHAINED_ADDITIVE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdditiveArithmeticalOperator getAdditiveArithmeticalOperator() {
		return additiveArithmeticalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveArithmeticalOperator(EolAdditiveArithmeticalOperator newAdditiveArithmeticalOperator) {
		EolAdditiveArithmeticalOperator oldAdditiveArithmeticalOperator = additiveArithmeticalOperator;
		additiveArithmeticalOperator = newAdditiveArithmeticalOperator == null ? ADDITIVE_ARITHMETICAL_OPERATOR_EDEFAULT : newAdditiveArithmeticalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR, oldAdditiveArithmeticalOperator, additiveArithmeticalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdditiveExpression getAdditiveExpression() {
		return additiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditiveExpression(EolAdditiveExpression newAdditiveExpression, NotificationChain msgs) {
		EolAdditiveExpression oldAdditiveExpression = additiveExpression;
		additiveExpression = newAdditiveExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION, oldAdditiveExpression, newAdditiveExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveExpression(EolAdditiveExpression newAdditiveExpression) {
		if (newAdditiveExpression != additiveExpression) {
			NotificationChain msgs = null;
			if (additiveExpression != null)
				msgs = ((InternalEObject)additiveExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION, null, msgs);
			if (newAdditiveExpression != null)
				msgs = ((InternalEObject)newAdditiveExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION, null, msgs);
			msgs = basicSetAdditiveExpression(newAdditiveExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION, newAdditiveExpression, newAdditiveExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION:
				return basicSetAdditiveExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR:
				return getAdditiveArithmeticalOperator();
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION:
				return getAdditiveExpression();
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
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR:
				setAdditiveArithmeticalOperator((EolAdditiveArithmeticalOperator)newValue);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION:
				setAdditiveExpression((EolAdditiveExpression)newValue);
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
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR:
				setAdditiveArithmeticalOperator(ADDITIVE_ARITHMETICAL_OPERATOR_EDEFAULT);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION:
				setAdditiveExpression((EolAdditiveExpression)null);
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
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_ARITHMETICAL_OPERATOR:
				return additiveArithmeticalOperator != ADDITIVE_ARITHMETICAL_OPERATOR_EDEFAULT;
			case EtlMetaModelPackage.EOL_CHAINED_ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION:
				return additiveExpression != null;
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
		result.append(" (additiveArithmeticalOperator: ");
		result.append(additiveArithmeticalOperator);
		result.append(')');
		return result.toString();
	}

} //EolChainedAdditiveExpressionImpl
