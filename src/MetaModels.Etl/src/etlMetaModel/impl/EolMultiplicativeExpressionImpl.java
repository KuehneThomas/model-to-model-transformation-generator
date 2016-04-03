/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolChainedMultiplicativeExpression;
import etlMetaModel.EolMultiplicativeExpression;
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
 * An implementation of the model object '<em><b>Eol Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolMultiplicativeExpressionImpl#getUnaryExpression <em>Unary Expression</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolMultiplicativeExpressionImpl#getChainedMultiplicativeExpression <em>Chained Multiplicative Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolMultiplicativeExpressionImpl extends MinimalEObjectImpl.Container implements EolMultiplicativeExpression {
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
	 * The cached value of the '{@link #getChainedMultiplicativeExpression() <em>Chained Multiplicative Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainedMultiplicativeExpression()
	 * @generated
	 * @ordered
	 */
	protected EolChainedMultiplicativeExpression chainedMultiplicativeExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMultiplicativeExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_MULTIPLICATIVE_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, oldUnaryExpression, newUnaryExpression);
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
				msgs = ((InternalEObject)unaryExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, null, msgs);
			if (newUnaryExpression != null)
				msgs = ((InternalEObject)newUnaryExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, null, msgs);
			msgs = basicSetUnaryExpression(newUnaryExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION, newUnaryExpression, newUnaryExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedMultiplicativeExpression getChainedMultiplicativeExpression() {
		return chainedMultiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainedMultiplicativeExpression(EolChainedMultiplicativeExpression newChainedMultiplicativeExpression, NotificationChain msgs) {
		EolChainedMultiplicativeExpression oldChainedMultiplicativeExpression = chainedMultiplicativeExpression;
		chainedMultiplicativeExpression = newChainedMultiplicativeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION, oldChainedMultiplicativeExpression, newChainedMultiplicativeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainedMultiplicativeExpression(EolChainedMultiplicativeExpression newChainedMultiplicativeExpression) {
		if (newChainedMultiplicativeExpression != chainedMultiplicativeExpression) {
			NotificationChain msgs = null;
			if (chainedMultiplicativeExpression != null)
				msgs = ((InternalEObject)chainedMultiplicativeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION, null, msgs);
			if (newChainedMultiplicativeExpression != null)
				msgs = ((InternalEObject)newChainedMultiplicativeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION, null, msgs);
			msgs = basicSetChainedMultiplicativeExpression(newChainedMultiplicativeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION, newChainedMultiplicativeExpression, newChainedMultiplicativeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				return basicSetUnaryExpression(null, msgs);
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION:
				return basicSetChainedMultiplicativeExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				return getUnaryExpression();
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION:
				return getChainedMultiplicativeExpression();
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
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				setUnaryExpression((EolUnaryExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION:
				setChainedMultiplicativeExpression((EolChainedMultiplicativeExpression)newValue);
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
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				setUnaryExpression((EolUnaryExpression)null);
				return;
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION:
				setChainedMultiplicativeExpression((EolChainedMultiplicativeExpression)null);
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
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__UNARY_EXPRESSION:
				return unaryExpression != null;
			case EtlMetaModelPackage.EOL_MULTIPLICATIVE_EXPRESSION__CHAINED_MULTIPLICATIVE_EXPRESSION:
				return chainedMultiplicativeExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolMultiplicativeExpressionImpl
