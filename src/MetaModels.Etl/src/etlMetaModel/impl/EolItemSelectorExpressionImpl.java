/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolItemSelectorExpression;
import etlMetaModel.EolPrimitiveExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Item Selector Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolItemSelectorExpressionImpl#getPrimitiveExpression <em>Primitive Expression</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolItemSelectorExpressionImpl#getAdditionalPrimitiveExpression <em>Additional Primitive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolItemSelectorExpressionImpl extends MinimalEObjectImpl.Container implements EolItemSelectorExpression {
	/**
	 * The cached value of the '{@link #getPrimitiveExpression() <em>Primitive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveExpression()
	 * @generated
	 * @ordered
	 */
	protected EolPrimitiveExpression primitiveExpression;

	/**
	 * The cached value of the '{@link #getAdditionalPrimitiveExpression() <em>Additional Primitive Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalPrimitiveExpression()
	 * @generated
	 * @ordered
	 */
	protected EolPrimitiveExpression additionalPrimitiveExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolItemSelectorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_ITEM_SELECTOR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolPrimitiveExpression getPrimitiveExpression() {
		return primitiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveExpression(EolPrimitiveExpression newPrimitiveExpression, NotificationChain msgs) {
		EolPrimitiveExpression oldPrimitiveExpression = primitiveExpression;
		primitiveExpression = newPrimitiveExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION, oldPrimitiveExpression, newPrimitiveExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveExpression(EolPrimitiveExpression newPrimitiveExpression) {
		if (newPrimitiveExpression != primitiveExpression) {
			NotificationChain msgs = null;
			if (primitiveExpression != null)
				msgs = ((InternalEObject)primitiveExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION, null, msgs);
			if (newPrimitiveExpression != null)
				msgs = ((InternalEObject)newPrimitiveExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION, null, msgs);
			msgs = basicSetPrimitiveExpression(newPrimitiveExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION, newPrimitiveExpression, newPrimitiveExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolPrimitiveExpression getAdditionalPrimitiveExpression() {
		return additionalPrimitiveExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalPrimitiveExpression(EolPrimitiveExpression newAdditionalPrimitiveExpression, NotificationChain msgs) {
		EolPrimitiveExpression oldAdditionalPrimitiveExpression = additionalPrimitiveExpression;
		additionalPrimitiveExpression = newAdditionalPrimitiveExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION, oldAdditionalPrimitiveExpression, newAdditionalPrimitiveExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalPrimitiveExpression(EolPrimitiveExpression newAdditionalPrimitiveExpression) {
		if (newAdditionalPrimitiveExpression != additionalPrimitiveExpression) {
			NotificationChain msgs = null;
			if (additionalPrimitiveExpression != null)
				msgs = ((InternalEObject)additionalPrimitiveExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION, null, msgs);
			if (newAdditionalPrimitiveExpression != null)
				msgs = ((InternalEObject)newAdditionalPrimitiveExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION, null, msgs);
			msgs = basicSetAdditionalPrimitiveExpression(newAdditionalPrimitiveExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION, newAdditionalPrimitiveExpression, newAdditionalPrimitiveExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION:
				return basicSetPrimitiveExpression(null, msgs);
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION:
				return basicSetAdditionalPrimitiveExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION:
				return getPrimitiveExpression();
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION:
				return getAdditionalPrimitiveExpression();
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
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION:
				setPrimitiveExpression((EolPrimitiveExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION:
				setAdditionalPrimitiveExpression((EolPrimitiveExpression)newValue);
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
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION:
				setPrimitiveExpression((EolPrimitiveExpression)null);
				return;
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION:
				setAdditionalPrimitiveExpression((EolPrimitiveExpression)null);
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
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__PRIMITIVE_EXPRESSION:
				return primitiveExpression != null;
			case EtlMetaModelPackage.EOL_ITEM_SELECTOR_EXPRESSION__ADDITIONAL_PRIMITIVE_EXPRESSION:
				return additionalPrimitiveExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolItemSelectorExpressionImpl
