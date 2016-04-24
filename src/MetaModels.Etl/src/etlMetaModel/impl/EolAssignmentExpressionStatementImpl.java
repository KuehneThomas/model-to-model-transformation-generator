/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolAssignmentExpressionStatement;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolPostfixExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Assignment Expression Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolAssignmentExpressionStatementImpl#getPostfixExpressionLeft <em>Postfix Expression Left</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolAssignmentExpressionStatementImpl#getLogicalExpressionRight <em>Logical Expression Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolAssignmentExpressionStatementImpl extends EolExpressionStatementImpl implements EolAssignmentExpressionStatement {
	/**
	 * The cached value of the '{@link #getPostfixExpressionLeft() <em>Postfix Expression Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfixExpressionLeft()
	 * @generated
	 * @ordered
	 */
	protected EolPostfixExpression postfixExpressionLeft;

	/**
	 * The cached value of the '{@link #getLogicalExpressionRight() <em>Logical Expression Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalExpressionRight()
	 * @generated
	 * @ordered
	 */
	protected EolLogicalExpression logicalExpressionRight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAssignmentExpressionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_ASSIGNMENT_EXPRESSION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolPostfixExpression getPostfixExpressionLeft() {
		return postfixExpressionLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostfixExpressionLeft(EolPostfixExpression newPostfixExpressionLeft, NotificationChain msgs) {
		EolPostfixExpression oldPostfixExpressionLeft = postfixExpressionLeft;
		postfixExpressionLeft = newPostfixExpressionLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT, oldPostfixExpressionLeft, newPostfixExpressionLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostfixExpressionLeft(EolPostfixExpression newPostfixExpressionLeft) {
		if (newPostfixExpressionLeft != postfixExpressionLeft) {
			NotificationChain msgs = null;
			if (postfixExpressionLeft != null)
				msgs = ((InternalEObject)postfixExpressionLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT, null, msgs);
			if (newPostfixExpressionLeft != null)
				msgs = ((InternalEObject)newPostfixExpressionLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT, null, msgs);
			msgs = basicSetPostfixExpressionLeft(newPostfixExpressionLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT, newPostfixExpressionLeft, newPostfixExpressionLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpression getLogicalExpressionRight() {
		return logicalExpressionRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalExpressionRight(EolLogicalExpression newLogicalExpressionRight, NotificationChain msgs) {
		EolLogicalExpression oldLogicalExpressionRight = logicalExpressionRight;
		logicalExpressionRight = newLogicalExpressionRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT, oldLogicalExpressionRight, newLogicalExpressionRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalExpressionRight(EolLogicalExpression newLogicalExpressionRight) {
		if (newLogicalExpressionRight != logicalExpressionRight) {
			NotificationChain msgs = null;
			if (logicalExpressionRight != null)
				msgs = ((InternalEObject)logicalExpressionRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT, null, msgs);
			if (newLogicalExpressionRight != null)
				msgs = ((InternalEObject)newLogicalExpressionRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT, null, msgs);
			msgs = basicSetLogicalExpressionRight(newLogicalExpressionRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT, newLogicalExpressionRight, newLogicalExpressionRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT:
				return basicSetPostfixExpressionLeft(null, msgs);
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
				return basicSetLogicalExpressionRight(null, msgs);
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT:
				return getPostfixExpressionLeft();
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
				return getLogicalExpressionRight();
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT:
				setPostfixExpressionLeft((EolPostfixExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
				setLogicalExpressionRight((EolLogicalExpression)newValue);
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT:
				setPostfixExpressionLeft((EolPostfixExpression)null);
				return;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
				setLogicalExpressionRight((EolLogicalExpression)null);
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__POSTFIX_EXPRESSION_LEFT:
				return postfixExpressionLeft != null;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
				return logicalExpressionRight != null;
		}
		return super.eIsSet(featureID);
	}

} //EolAssignmentExpressionStatementImpl
