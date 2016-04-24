/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolChainedFeatureCallPostfixExpression;
import etlMetaModel.EolItemSelectorExpression;
import etlMetaModel.EolPostfixExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Postfix Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolPostfixExpressionImpl#getItemSelectorExpression <em>Item Selector Expression</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolPostfixExpressionImpl#getChainedFeatureCallPostfixExpression <em>Chained Feature Call Postfix Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolPostfixExpressionImpl extends MinimalEObjectImpl.Container implements EolPostfixExpression {
	/**
	 * The cached value of the '{@link #getItemSelectorExpression() <em>Item Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSelectorExpression()
	 * @generated
	 * @ordered
	 */
	protected EolItemSelectorExpression itemSelectorExpression;

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
	public EolPostfixExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_POSTFIX_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolItemSelectorExpression getItemSelectorExpression() {
		return itemSelectorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemSelectorExpression(EolItemSelectorExpression newItemSelectorExpression, NotificationChain msgs) {
		EolItemSelectorExpression oldItemSelectorExpression = itemSelectorExpression;
		itemSelectorExpression = newItemSelectorExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION, oldItemSelectorExpression, newItemSelectorExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSelectorExpression(EolItemSelectorExpression newItemSelectorExpression) {
		if (newItemSelectorExpression != itemSelectorExpression) {
			NotificationChain msgs = null;
			if (itemSelectorExpression != null)
				msgs = ((InternalEObject)itemSelectorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION, null, msgs);
			if (newItemSelectorExpression != null)
				msgs = ((InternalEObject)newItemSelectorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION, null, msgs);
			msgs = basicSetItemSelectorExpression(newItemSelectorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION, newItemSelectorExpression, newItemSelectorExpression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, oldChainedFeatureCallPostfixExpression, newChainedFeatureCallPostfixExpression);
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
				msgs = ((InternalEObject)chainedFeatureCallPostfixExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, null, msgs);
			if (newChainedFeatureCallPostfixExpression != null)
				msgs = ((InternalEObject)newChainedFeatureCallPostfixExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, null, msgs);
			msgs = basicSetChainedFeatureCallPostfixExpression(newChainedFeatureCallPostfixExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION, newChainedFeatureCallPostfixExpression, newChainedFeatureCallPostfixExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION:
				return basicSetItemSelectorExpression(null, msgs);
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION:
				return getItemSelectorExpression();
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION:
				setItemSelectorExpression((EolItemSelectorExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION:
				setItemSelectorExpression((EolItemSelectorExpression)null);
				return;
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__ITEM_SELECTOR_EXPRESSION:
				return itemSelectorExpression != null;
			case EtlMetaModelPackage.EOL_POSTFIX_EXPRESSION__CHAINED_FEATURE_CALL_POSTFIX_EXPRESSION:
				return chainedFeatureCallPostfixExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolPostfixExpressionImpl
