/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolPostfixExpression;
import etlMetaModel.EolUnaryExpression;
import etlMetaModel.EolUnaryOpratorNullable;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolUnaryExpressionImpl#getUnaryOperatorNullable <em>Unary Operator Nullable</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolUnaryExpressionImpl#getPostfixExpression <em>Postfix Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolUnaryExpressionImpl extends MinimalEObjectImpl.Container implements EolUnaryExpression {
	/**
	 * The cached value of the '{@link #getUnaryOperatorNullable() <em>Unary Operator Nullable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperatorNullable()
	 * @generated
	 * @ordered
	 */
	protected EolUnaryOpratorNullable unaryOperatorNullable;

	/**
	 * The cached value of the '{@link #getPostfixExpression() <em>Postfix Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfixExpression()
	 * @generated
	 * @ordered
	 */
	protected EolPostfixExpression postfixExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_UNARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolUnaryOpratorNullable getUnaryOperatorNullable() {
		return unaryOperatorNullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryOperatorNullable(EolUnaryOpratorNullable newUnaryOperatorNullable, NotificationChain msgs) {
		EolUnaryOpratorNullable oldUnaryOperatorNullable = unaryOperatorNullable;
		unaryOperatorNullable = newUnaryOperatorNullable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE, oldUnaryOperatorNullable, newUnaryOperatorNullable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOperatorNullable(EolUnaryOpratorNullable newUnaryOperatorNullable) {
		if (newUnaryOperatorNullable != unaryOperatorNullable) {
			NotificationChain msgs = null;
			if (unaryOperatorNullable != null)
				msgs = ((InternalEObject)unaryOperatorNullable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE, null, msgs);
			if (newUnaryOperatorNullable != null)
				msgs = ((InternalEObject)newUnaryOperatorNullable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE, null, msgs);
			msgs = basicSetUnaryOperatorNullable(newUnaryOperatorNullable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE, newUnaryOperatorNullable, newUnaryOperatorNullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolPostfixExpression getPostfixExpression() {
		return postfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostfixExpression(EolPostfixExpression newPostfixExpression, NotificationChain msgs) {
		EolPostfixExpression oldPostfixExpression = postfixExpression;
		postfixExpression = newPostfixExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION, oldPostfixExpression, newPostfixExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostfixExpression(EolPostfixExpression newPostfixExpression) {
		if (newPostfixExpression != postfixExpression) {
			NotificationChain msgs = null;
			if (postfixExpression != null)
				msgs = ((InternalEObject)postfixExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION, null, msgs);
			if (newPostfixExpression != null)
				msgs = ((InternalEObject)newPostfixExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION, null, msgs);
			msgs = basicSetPostfixExpression(newPostfixExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION, newPostfixExpression, newPostfixExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE:
				return basicSetUnaryOperatorNullable(null, msgs);
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION:
				return basicSetPostfixExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE:
				return getUnaryOperatorNullable();
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION:
				return getPostfixExpression();
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
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE:
				setUnaryOperatorNullable((EolUnaryOpratorNullable)newValue);
				return;
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION:
				setPostfixExpression((EolPostfixExpression)newValue);
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
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE:
				setUnaryOperatorNullable((EolUnaryOpratorNullable)null);
				return;
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION:
				setPostfixExpression((EolPostfixExpression)null);
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
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__UNARY_OPERATOR_NULLABLE:
				return unaryOperatorNullable != null;
			case EtlMetaModelPackage.EOL_UNARY_EXPRESSION__POSTFIX_EXPRESSION:
				return postfixExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolUnaryExpressionImpl
