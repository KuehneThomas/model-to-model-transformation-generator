/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolAdditiveComparisonOperator;
import etlMetaModel.EolAdditiveExpression;
import etlMetaModel.EolComparingToAdditiveRelationalExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Comparing To Additive Relational Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolComparingToAdditiveRelationalExpressionImpl#getAdditiveComparisonOperator <em>Additive Comparison Operator</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolComparingToAdditiveRelationalExpressionImpl#getAdditiveExpression <em>Additive Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolComparingToAdditiveRelationalExpressionImpl extends EolGenericChainedRelationalExpressionImpl implements EolComparingToAdditiveRelationalExpression {
	/**
	 * The default value of the '{@link #getAdditiveComparisonOperator() <em>Additive Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EolAdditiveComparisonOperator ADDITIVE_COMPARISON_OPERATOR_EDEFAULT = EolAdditiveComparisonOperator.NOT_EQUAL;

	/**
	 * The cached value of the '{@link #getAdditiveComparisonOperator() <em>Additive Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditiveComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected EolAdditiveComparisonOperator additiveComparisonOperator = ADDITIVE_COMPARISON_OPERATOR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolComparingToAdditiveRelationalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolAdditiveComparisonOperator getAdditiveComparisonOperator() {
		return additiveComparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditiveComparisonOperator(EolAdditiveComparisonOperator newAdditiveComparisonOperator) {
		EolAdditiveComparisonOperator oldAdditiveComparisonOperator = additiveComparisonOperator;
		additiveComparisonOperator = newAdditiveComparisonOperator == null ? ADDITIVE_COMPARISON_OPERATOR_EDEFAULT : newAdditiveComparisonOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR, oldAdditiveComparisonOperator, additiveComparisonOperator));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, oldAdditiveExpression, newAdditiveExpression);
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
				msgs = ((InternalEObject)additiveExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, null, msgs);
			if (newAdditiveExpression != null)
				msgs = ((InternalEObject)newAdditiveExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, null, msgs);
			msgs = basicSetAdditiveExpression(newAdditiveExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION, newAdditiveExpression, newAdditiveExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				return basicSetAdditiveExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR:
				return getAdditiveComparisonOperator();
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				return getAdditiveExpression();
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
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR:
				setAdditiveComparisonOperator((EolAdditiveComparisonOperator)newValue);
				return;
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				setAdditiveExpression((EolAdditiveExpression)newValue);
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
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR:
				setAdditiveComparisonOperator(ADDITIVE_COMPARISON_OPERATOR_EDEFAULT);
				return;
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				setAdditiveExpression((EolAdditiveExpression)null);
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
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_COMPARISON_OPERATOR:
				return additiveComparisonOperator != ADDITIVE_COMPARISON_OPERATOR_EDEFAULT;
			case EtlMetaModelPackage.EOL_COMPARING_TO_ADDITIVE_RELATIONAL_EXPRESSION__ADDITIVE_EXPRESSION:
				return additiveExpression != null;
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
		result.append(" (additiveComparisonOperator: ");
		result.append(additiveComparisonOperator);
		result.append(')');
		return result.toString();
	}

} //EolComparingToAdditiveRelationalExpressionImpl
