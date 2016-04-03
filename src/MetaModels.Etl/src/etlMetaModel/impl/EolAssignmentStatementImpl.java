/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolAssignmentStatement;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolAssignmentStatementImpl#getIsSpecial <em>Is Special</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolAssignmentStatementImpl#getLogicalExpressionLeft <em>Logical Expression Left</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolAssignmentStatementImpl#getLogicalExpressionRight <em>Logical Expression Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolAssignmentStatementImpl extends EolStatementImpl implements EolAssignmentStatement {
	/**
	 * The default value of the '{@link #getIsSpecial() <em>Is Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpecial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SPECIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSpecial() <em>Is Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpecial()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSpecial = IS_SPECIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalExpressionLeft() <em>Logical Expression Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalExpressionLeft()
	 * @generated
	 * @ordered
	 */
	protected EolLogicalExpression logicalExpressionLeft;

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
	public EolAssignmentStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_ASSIGNMENT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSpecial() {
		return isSpecial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpecial(Boolean newIsSpecial) {
		Boolean oldIsSpecial = isSpecial;
		isSpecial = newIsSpecial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL, oldIsSpecial, isSpecial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpression getLogicalExpressionLeft() {
		return logicalExpressionLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalExpressionLeft(EolLogicalExpression newLogicalExpressionLeft, NotificationChain msgs) {
		EolLogicalExpression oldLogicalExpressionLeft = logicalExpressionLeft;
		logicalExpressionLeft = newLogicalExpressionLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT, oldLogicalExpressionLeft, newLogicalExpressionLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalExpressionLeft(EolLogicalExpression newLogicalExpressionLeft) {
		if (newLogicalExpressionLeft != logicalExpressionLeft) {
			NotificationChain msgs = null;
			if (logicalExpressionLeft != null)
				msgs = ((InternalEObject)logicalExpressionLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT, null, msgs);
			if (newLogicalExpressionLeft != null)
				msgs = ((InternalEObject)newLogicalExpressionLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT, null, msgs);
			msgs = basicSetLogicalExpressionLeft(newLogicalExpressionLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT, newLogicalExpressionLeft, newLogicalExpressionLeft));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT, oldLogicalExpressionRight, newLogicalExpressionRight);
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
				msgs = ((InternalEObject)logicalExpressionRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT, null, msgs);
			if (newLogicalExpressionRight != null)
				msgs = ((InternalEObject)newLogicalExpressionRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT, null, msgs);
			msgs = basicSetLogicalExpressionRight(newLogicalExpressionRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT, newLogicalExpressionRight, newLogicalExpressionRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT:
				return basicSetLogicalExpressionLeft(null, msgs);
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL:
				return getIsSpecial();
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT:
				return getLogicalExpressionLeft();
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL:
				setIsSpecial((Boolean)newValue);
				return;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT:
				setLogicalExpressionLeft((EolLogicalExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL:
				setIsSpecial(IS_SPECIAL_EDEFAULT);
				return;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT:
				setLogicalExpressionLeft((EolLogicalExpression)null);
				return;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
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
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__IS_SPECIAL:
				return IS_SPECIAL_EDEFAULT == null ? isSpecial != null : !IS_SPECIAL_EDEFAULT.equals(isSpecial);
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_LEFT:
				return logicalExpressionLeft != null;
			case EtlMetaModelPackage.EOL_ASSIGNMENT_STATEMENT__LOGICAL_EXPRESSION_RIGHT:
				return logicalExpressionRight != null;
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
		result.append(" (isSpecial: ");
		result.append(isSpecial);
		result.append(')');
		return result.toString();
	}

} //EolAssignmentStatementImpl
