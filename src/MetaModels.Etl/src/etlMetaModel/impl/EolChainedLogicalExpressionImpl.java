/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolChainedLogicalExpression;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolLogicalOperator;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Chained Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolChainedLogicalExpressionImpl#getLogicalOperator <em>Logical Operator</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolChainedLogicalExpressionImpl#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolChainedLogicalExpressionImpl extends MinimalEObjectImpl.Container implements EolChainedLogicalExpression {
	/**
	 * The default value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EolLogicalOperator LOGICAL_OPERATOR_EDEFAULT = EolLogicalOperator.AND;

	/**
	 * The cached value of the '{@link #getLogicalOperator() <em>Logical Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperator()
	 * @generated
	 * @ordered
	 */
	protected EolLogicalOperator logicalOperator = LOGICAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogicalExpression() <em>Logical Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalExpression()
	 * @generated
	 * @ordered
	 */
	protected EolLogicalExpression logicalExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedLogicalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_CHAINED_LOGICAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalOperator getLogicalOperator() {
		return logicalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperator(EolLogicalOperator newLogicalOperator) {
		EolLogicalOperator oldLogicalOperator = logicalOperator;
		logicalOperator = newLogicalOperator == null ? LOGICAL_OPERATOR_EDEFAULT : newLogicalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR, oldLogicalOperator, logicalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpression getLogicalExpression() {
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalExpression(EolLogicalExpression newLogicalExpression, NotificationChain msgs) {
		EolLogicalExpression oldLogicalExpression = logicalExpression;
		logicalExpression = newLogicalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION, oldLogicalExpression, newLogicalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalExpression(EolLogicalExpression newLogicalExpression) {
		if (newLogicalExpression != logicalExpression) {
			NotificationChain msgs = null;
			if (logicalExpression != null)
				msgs = ((InternalEObject)logicalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION, null, msgs);
			if (newLogicalExpression != null)
				msgs = ((InternalEObject)newLogicalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION, null, msgs);
			msgs = basicSetLogicalExpression(newLogicalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION, newLogicalExpression, newLogicalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION:
				return basicSetLogicalExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR:
				return getLogicalOperator();
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION:
				return getLogicalExpression();
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
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR:
				setLogicalOperator((EolLogicalOperator)newValue);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION:
				setLogicalExpression((EolLogicalExpression)newValue);
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
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR:
				setLogicalOperator(LOGICAL_OPERATOR_EDEFAULT);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION:
				setLogicalExpression((EolLogicalExpression)null);
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
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_OPERATOR:
				return logicalOperator != LOGICAL_OPERATOR_EDEFAULT;
			case EtlMetaModelPackage.EOL_CHAINED_LOGICAL_EXPRESSION__LOGICAL_EXPRESSION:
				return logicalExpression != null;
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
		result.append(" (logicalOperator: ");
		result.append(logicalOperator);
		result.append(')');
		return result.toString();
	}

} //EolChainedLogicalExpressionImpl
