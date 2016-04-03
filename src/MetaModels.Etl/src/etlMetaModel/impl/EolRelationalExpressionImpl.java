/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolAdditiveExpression;
import etlMetaModel.EolGenericChainedRelationalExpression;
import etlMetaModel.EolRelationalExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolRelationalExpressionImpl#getAdditiveExpression <em>Additive Expression</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolRelationalExpressionImpl#getChainedRelationalExpression <em>Chained Relational Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolRelationalExpressionImpl extends MinimalEObjectImpl.Container implements EolRelationalExpression {
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
	 * The cached value of the '{@link #getChainedRelationalExpression() <em>Chained Relational Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainedRelationalExpression()
	 * @generated
	 * @ordered
	 */
	protected EolGenericChainedRelationalExpression chainedRelationalExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolRelationalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_RELATIONAL_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, oldAdditiveExpression, newAdditiveExpression);
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
				msgs = ((InternalEObject)additiveExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, null, msgs);
			if (newAdditiveExpression != null)
				msgs = ((InternalEObject)newAdditiveExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, null, msgs);
			msgs = basicSetAdditiveExpression(newAdditiveExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, newAdditiveExpression, newAdditiveExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolGenericChainedRelationalExpression getChainedRelationalExpression() {
		return chainedRelationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainedRelationalExpression(EolGenericChainedRelationalExpression newChainedRelationalExpression, NotificationChain msgs) {
		EolGenericChainedRelationalExpression oldChainedRelationalExpression = chainedRelationalExpression;
		chainedRelationalExpression = newChainedRelationalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION, oldChainedRelationalExpression, newChainedRelationalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainedRelationalExpression(EolGenericChainedRelationalExpression newChainedRelationalExpression) {
		if (newChainedRelationalExpression != chainedRelationalExpression) {
			NotificationChain msgs = null;
			if (chainedRelationalExpression != null)
				msgs = ((InternalEObject)chainedRelationalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION, null, msgs);
			if (newChainedRelationalExpression != null)
				msgs = ((InternalEObject)newChainedRelationalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION, null, msgs);
			msgs = basicSetChainedRelationalExpression(newChainedRelationalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION, newChainedRelationalExpression, newChainedRelationalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				return basicSetAdditiveExpression(null, msgs);
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION:
				return basicSetChainedRelationalExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				return getAdditiveExpression();
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION:
				return getChainedRelationalExpression();
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
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				setAdditiveExpression((EolAdditiveExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION:
				setChainedRelationalExpression((EolGenericChainedRelationalExpression)newValue);
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
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				setAdditiveExpression((EolAdditiveExpression)null);
				return;
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION:
				setChainedRelationalExpression((EolGenericChainedRelationalExpression)null);
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
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				return additiveExpression != null;
			case EtlMetaModelPackage.EOL_RELATIONAL_EXPRESSION__CHAINED_RELATIONAL_EXPRESSION:
				return chainedRelationalExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolRelationalExpressionImpl
