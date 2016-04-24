/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolChainedFeatureCallPostfixExpression;
import etlMetaModel.EolFeatureCall;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Chained Feature Call Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl#getFeatureCall <em>Feature Call</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl#getFeatureCallAdditionalLogicalExpression <em>Feature Call Additional Logical Expression</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolChainedFeatureCallPostfixExpressionImpl#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolChainedFeatureCallPostfixExpressionImpl extends MinimalEObjectImpl.Container implements EolChainedFeatureCallPostfixExpression {
	/**
	 * The cached value of the '{@link #getFeatureCall() <em>Feature Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCall()
	 * @generated
	 * @ordered
	 */
	protected EolFeatureCall featureCall;

	/**
	 * The cached value of the '{@link #getFeatureCallAdditionalLogicalExpression() <em>Feature Call Additional Logical Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCallAdditionalLogicalExpression()
	 * @generated
	 * @ordered
	 */
	protected EolLogicalExpression featureCallAdditionalLogicalExpression;

	/**
	 * The cached value of the '{@link #getChainedFeatureCallPostfixExpression() <em>Chained Feature Call Postfix Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainedFeatureCallPostfixExpression()
	 * @generated
	 * @ordered
	 */
	protected EolChainedFeatureCallPostfixExpression chainedFeatureCallPostfixExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedFeatureCallPostfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolFeatureCall getFeatureCall() {
		return featureCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCall(EolFeatureCall newFeatureCall, NotificationChain msgs) {
		EolFeatureCall oldFeatureCall = featureCall;
		featureCall = newFeatureCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL, oldFeatureCall, newFeatureCall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureCall(EolFeatureCall newFeatureCall) {
		if (newFeatureCall != featureCall) {
			NotificationChain msgs = null;
			if (featureCall != null)
				msgs = ((InternalEObject)featureCall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL, null, msgs);
			if (newFeatureCall != null)
				msgs = ((InternalEObject)newFeatureCall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL, null, msgs);
			msgs = basicSetFeatureCall(newFeatureCall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL, newFeatureCall, newFeatureCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpression getFeatureCallAdditionalLogicalExpression() {
		return featureCallAdditionalLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCallAdditionalLogicalExpression(EolLogicalExpression newFeatureCallAdditionalLogicalExpression, NotificationChain msgs) {
		EolLogicalExpression oldFeatureCallAdditionalLogicalExpression = featureCallAdditionalLogicalExpression;
		featureCallAdditionalLogicalExpression = newFeatureCallAdditionalLogicalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION, oldFeatureCallAdditionalLogicalExpression, newFeatureCallAdditionalLogicalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureCallAdditionalLogicalExpression(EolLogicalExpression newFeatureCallAdditionalLogicalExpression) {
		if (newFeatureCallAdditionalLogicalExpression != featureCallAdditionalLogicalExpression) {
			NotificationChain msgs = null;
			if (featureCallAdditionalLogicalExpression != null)
				msgs = ((InternalEObject)featureCallAdditionalLogicalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION, null, msgs);
			if (newFeatureCallAdditionalLogicalExpression != null)
				msgs = ((InternalEObject)newFeatureCallAdditionalLogicalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION, null, msgs);
			msgs = basicSetFeatureCallAdditionalLogicalExpression(newFeatureCallAdditionalLogicalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION, newFeatureCallAdditionalLogicalExpression, newFeatureCallAdditionalLogicalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedFeatureCallPostfixExpression getChainedFeatureCallPostfixExpression() {
		return chainedFeatureCallPostfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainedFeatureCallPostfixExpression(EolChainedFeatureCallPostfixExpression newChainedFeatureCallPostfixExpression, NotificationChain msgs) {
		EolChainedFeatureCallPostfixExpression oldChainedFeatureCallPostfixExpression = chainedFeatureCallPostfixExpression;
		chainedFeatureCallPostfixExpression = newChainedFeatureCallPostfixExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, oldChainedFeatureCallPostfixExpression, newChainedFeatureCallPostfixExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainedFeatureCallPostfixExpression(EolChainedFeatureCallPostfixExpression newChainedFeatureCallPostfixExpression) {
		if (newChainedFeatureCallPostfixExpression != chainedFeatureCallPostfixExpression) {
			NotificationChain msgs = null;
			if (chainedFeatureCallPostfixExpression != null)
				msgs = ((InternalEObject)chainedFeatureCallPostfixExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, null, msgs);
			if (newChainedFeatureCallPostfixExpression != null)
				msgs = ((InternalEObject)newChainedFeatureCallPostfixExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, null, msgs);
			msgs = basicSetChainedFeatureCallPostfixExpression(newChainedFeatureCallPostfixExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, newChainedFeatureCallPostfixExpression, newChainedFeatureCallPostfixExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL:
				return basicSetFeatureCall(null, msgs);
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION:
				return basicSetFeatureCallAdditionalLogicalExpression(null, msgs);
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
				return basicSetChainedFeatureCallPostfixExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL:
				return getFeatureCall();
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION:
				return getFeatureCallAdditionalLogicalExpression();
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
				return getChainedFeatureCallPostfixExpression();
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
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL:
				setFeatureCall((EolFeatureCall)newValue);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION:
				setFeatureCallAdditionalLogicalExpression((EolLogicalExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
				setChainedFeatureCallPostfixExpression((EolChainedFeatureCallPostfixExpression)newValue);
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
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL:
				setFeatureCall((EolFeatureCall)null);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION:
				setFeatureCallAdditionalLogicalExpression((EolLogicalExpression)null);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
				setChainedFeatureCallPostfixExpression((EolChainedFeatureCallPostfixExpression)null);
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
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL:
				return featureCall != null;
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__FEATURE_CALL_ADDITIONAL_LOGICAL_EXPRESSION:
				return featureCallAdditionalLogicalExpression != null;
			case EtlMetaModelPackage.EOL_CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
				return chainedFeatureCallPostfixExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolChainedFeatureCallPostfixExpressionImpl
