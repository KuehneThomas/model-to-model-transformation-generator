/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolAdditiveExpression;
import etlMetaModel.EolChainedAdditiveExpression;
import etlMetaModel.EolMultiplicativeExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolAdditiveExpressionImpl#getMultiplicativeExpression <em>Multiplicative Expression</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolAdditiveExpressionImpl#getChainedAdditiveExpression <em>Chained Additive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolAdditiveExpressionImpl extends MinimalEObjectImpl.Container implements EolAdditiveExpression {
	/**
	 * The cached value of the '{@link #getMultiplicativeExpression() <em>Multiplicative Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicativeExpression()
	 * @generated
	 * @ordered
	 */
	protected EolMultiplicativeExpression multiplicativeExpression;

	/**
	 * The cached value of the '{@link #getChainedAdditiveExpression() <em>Chained Additive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainedAdditiveExpression()
	 * @generated
	 * @ordered
	 */
	protected EolChainedAdditiveExpression chainedAdditiveExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdditiveExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_ADDITIVE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMultiplicativeExpression getMultiplicativeExpression() {
		return multiplicativeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicativeExpression(EolMultiplicativeExpression newMultiplicativeExpression, NotificationChain msgs) {
		EolMultiplicativeExpression oldMultiplicativeExpression = multiplicativeExpression;
		multiplicativeExpression = newMultiplicativeExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, oldMultiplicativeExpression, newMultiplicativeExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicativeExpression(EolMultiplicativeExpression newMultiplicativeExpression) {
		if (newMultiplicativeExpression != multiplicativeExpression) {
			NotificationChain msgs = null;
			if (multiplicativeExpression != null)
				msgs = ((InternalEObject)multiplicativeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, null, msgs);
			if (newMultiplicativeExpression != null)
				msgs = ((InternalEObject)newMultiplicativeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, null, msgs);
			msgs = basicSetMultiplicativeExpression(newMultiplicativeExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, newMultiplicativeExpression, newMultiplicativeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedAdditiveExpression getChainedAdditiveExpression() {
		return chainedAdditiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainedAdditiveExpression(EolChainedAdditiveExpression newChainedAdditiveExpression, NotificationChain msgs) {
		EolChainedAdditiveExpression oldChainedAdditiveExpression = chainedAdditiveExpression;
		chainedAdditiveExpression = newChainedAdditiveExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION, oldChainedAdditiveExpression, newChainedAdditiveExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainedAdditiveExpression(EolChainedAdditiveExpression newChainedAdditiveExpression) {
		if (newChainedAdditiveExpression != chainedAdditiveExpression) {
			NotificationChain msgs = null;
			if (chainedAdditiveExpression != null)
				msgs = ((InternalEObject)chainedAdditiveExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION, null, msgs);
			if (newChainedAdditiveExpression != null)
				msgs = ((InternalEObject)newChainedAdditiveExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION, null, msgs);
			msgs = basicSetChainedAdditiveExpression(newChainedAdditiveExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION, newChainedAdditiveExpression, newChainedAdditiveExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
				return basicSetMultiplicativeExpression(null, msgs);
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION:
				return basicSetChainedAdditiveExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
				return getMultiplicativeExpression();
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION:
				return getChainedAdditiveExpression();
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
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
				setMultiplicativeExpression((EolMultiplicativeExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION:
				setChainedAdditiveExpression((EolChainedAdditiveExpression)newValue);
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
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
				setMultiplicativeExpression((EolMultiplicativeExpression)null);
				return;
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION:
				setChainedAdditiveExpression((EolChainedAdditiveExpression)null);
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
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
				return multiplicativeExpression != null;
			case EtlMetaModelPackage.EOL_ADDITIVE_EXPRESSION__CHAINED_ADDITIVE_EXPRESSION:
				return chainedAdditiveExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolAdditiveExpressionImpl
