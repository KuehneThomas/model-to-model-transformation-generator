/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolChainedRelationalExpression;
import etlMetaModel.EolRelationalExpression;
import etlMetaModel.EolRelationalOperator;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Chained Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolChainedRelationalExpressionImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolChainedRelationalExpressionImpl#getRelationalExpression <em>Relational Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolChainedRelationalExpressionImpl extends EolGenericChainedRelationalExpressionImpl implements EolChainedRelationalExpression {
	/**
	 * The default value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EolRelationalOperator RELATIONAL_OPERATOR_EDEFAULT = EolRelationalOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalOperator()
	 * @generated
	 * @ordered
	 */
	protected EolRelationalOperator relationalOperator = RELATIONAL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationalExpression() <em>Relational Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationalExpression()
	 * @generated
	 * @ordered
	 */
	protected EolRelationalExpression relationalExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedRelationalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_CHAINED_RELATIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolRelationalOperator getRelationalOperator() {
		return relationalOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationalOperator(EolRelationalOperator newRelationalOperator) {
		EolRelationalOperator oldRelationalOperator = relationalOperator;
		relationalOperator = newRelationalOperator == null ? RELATIONAL_OPERATOR_EDEFAULT : newRelationalOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR, oldRelationalOperator, relationalOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolRelationalExpression getRelationalExpression() {
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationalExpression(EolRelationalExpression newRelationalExpression, NotificationChain msgs) {
		EolRelationalExpression oldRelationalExpression = relationalExpression;
		relationalExpression = newRelationalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION, oldRelationalExpression, newRelationalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationalExpression(EolRelationalExpression newRelationalExpression) {
		if (newRelationalExpression != relationalExpression) {
			NotificationChain msgs = null;
			if (relationalExpression != null)
				msgs = ((InternalEObject)relationalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION, null, msgs);
			if (newRelationalExpression != null)
				msgs = ((InternalEObject)newRelationalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION, null, msgs);
			msgs = basicSetRelationalExpression(newRelationalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION, newRelationalExpression, newRelationalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION:
				return basicSetRelationalExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				return getRelationalOperator();
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION:
				return getRelationalExpression();
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
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator((EolRelationalOperator)newValue);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION:
				setRelationalExpression((EolRelationalExpression)newValue);
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
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				setRelationalOperator(RELATIONAL_OPERATOR_EDEFAULT);
				return;
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION:
				setRelationalExpression((EolRelationalExpression)null);
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
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR:
				return relationalOperator != RELATIONAL_OPERATOR_EDEFAULT;
			case EtlMetaModelPackage.EOL_CHAINED_RELATIONAL_EXPRESSION__RELATIONAL_EXPRESSION:
				return relationalExpression != null;
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
		result.append(" (relationalOperator: ");
		result.append(relationalOperator);
		result.append(')');
		return result.toString();
	}

} //EolChainedRelationalExpressionImpl
