/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolChainedMultiplicativeExpression;
import etlMetaModel.EolMultiplicativeArithmeticalOperator;
import etlMetaModel.EolUnaryExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Chained Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolChainedMultiplicativeExpressionImpl#getMultiplicativeArithmeticalOperator <em>Multiplicative Arithmetical Operator</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolChainedMultiplicativeExpressionImpl#getUnaryExpression <em>Unary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolChainedMultiplicativeExpressionImpl extends MinimalEObjectImpl.Container implements EolChainedMultiplicativeExpression {
	/**
	 * The default value of the '{@link #getMultiplicativeArithmeticalOperator() <em>Multiplicative Arithmetical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicativeArithmeticalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EolMultiplicativeArithmeticalOperator MULTIPLICATIVE_ARITHMETICAL_OPERATOR_EDEFAULT = EolMultiplicativeArithmeticalOperator.MULTIPLY;

	/**
	 * The cached value of the '{@link #getMultiplicativeArithmeticalOperator() <em>Multiplicative Arithmetical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicativeArithmeticalOperator()
	 * @generated
	 * @ordered
	 */
	protected EolMultiplicativeArithmeticalOperator multiplicativeArithmeticalOperator = MULTIPLICATIVE_ARITHMETICAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnaryExpression() <em>Unary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryExpression()
	 * @generated
	 * @ordered
	 */
	protected EolUnaryExpression unaryExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedMultiplicativeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMultiplicativeArithmeticalOperator getMultiplicativeArithmeticalOperator() {
		return multiplicativeArithmeticalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicativeArithmeticalOperator(EolMultiplicativeArithmeticalOperator newMultiplicativeArithmeticalOperator) {
		EolMultiplicativeArithmeticalOperator oldMultiplicativeArithmeticalOperator = multiplicativeArithmeticalOperator;
		multiplicativeArithmeticalOperator = newMultiplicativeArithmeticalOperator == null ? MULTIPLICATIVE_ARITHMETICAL_OPERATOR_EDEFAULT : newMultiplicativeArithmeticalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR, oldMultiplicativeArithmeticalOperator, multiplicativeArithmeticalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryExpression getUnaryExpression() {
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryExpression(EolUnaryExpression newUnaryExpression, NotificationChain msgs) {
		EolUnaryExpression oldUnaryExpression = unaryExpression;
		unaryExpression = newUnaryExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, oldUnaryExpression, newUnaryExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryExpression(EolUnaryExpression newUnaryExpression) {
		if (newUnaryExpression != unaryExpression) {
			NotificationChain msgs = null;
			if (unaryExpression != null)
				msgs = ((InternalEObject)unaryExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, null, msgs);
			if (newUnaryExpression != null)
				msgs = ((InternalEObject)newUnaryExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, null, msgs);
			msgs = basicSetUnaryExpression(newUnaryExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, newUnaryExpression, newUnaryExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				return basicSetUnaryExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR:
				return getMultiplicativeArithmeticalOperator();
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				return getUnaryExpression();
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
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR:
				setMultiplicativeArithmeticalOperator((EolMultiplicativeArithmeticalOperator)newValue);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				setUnaryExpression((EolUnaryExpression)newValue);
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
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR:
				setMultiplicativeArithmeticalOperator(MULTIPLICATIVE_ARITHMETICAL_OPERATOR_EDEFAULT);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				setUnaryExpression((EolUnaryExpression)null);
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
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_ARITHMETICAL_OPERATOR:
				return multiplicativeArithmeticalOperator != MULTIPLICATIVE_ARITHMETICAL_OPERATOR_EDEFAULT;
			case EtlMetaModelPackage.EOL_CHAINED_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				return unaryExpression != null;
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
		result.append(" (multiplicativeArithmeticalOperator: ");
		result.append(multiplicativeArithmeticalOperator);
		result.append(')');
		return result.toString();
	}

} //EolChainedMultiplicativeExpressionImpl
