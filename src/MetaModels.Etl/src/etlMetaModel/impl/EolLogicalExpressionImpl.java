/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolChainedLogicalExpression;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolRelationalExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolLogicalExpressionImpl#getRelationalExpression <em>Relational Expression</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolLogicalExpressionImpl#getChainedLogicalExpression <em>Chained Logical Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolLogicalExpressionImpl extends EolExpressionOrStatementBlockImpl implements EolLogicalExpression {
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
	 * The cached value of the '{@link #getChainedLogicalExpression() <em>Chained Logical Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainedLogicalExpression()
	 * @generated
	 * @ordered
	 */
	protected EolChainedLogicalExpression chainedLogicalExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_LOGICAL_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION, oldRelationalExpression, newRelationalExpression);
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
				msgs = ((InternalEObject)relationalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION, null, msgs);
			if (newRelationalExpression != null)
				msgs = ((InternalEObject)newRelationalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION, null, msgs);
			msgs = basicSetRelationalExpression(newRelationalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION, newRelationalExpression, newRelationalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolChainedLogicalExpression getChainedLogicalExpression() {
		return chainedLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainedLogicalExpression(EolChainedLogicalExpression newChainedLogicalExpression, NotificationChain msgs) {
		EolChainedLogicalExpression oldChainedLogicalExpression = chainedLogicalExpression;
		chainedLogicalExpression = newChainedLogicalExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION, oldChainedLogicalExpression, newChainedLogicalExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainedLogicalExpression(EolChainedLogicalExpression newChainedLogicalExpression) {
		if (newChainedLogicalExpression != chainedLogicalExpression) {
			NotificationChain msgs = null;
			if (chainedLogicalExpression != null)
				msgs = ((InternalEObject)chainedLogicalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION, null, msgs);
			if (newChainedLogicalExpression != null)
				msgs = ((InternalEObject)newChainedLogicalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION, null, msgs);
			msgs = basicSetChainedLogicalExpression(newChainedLogicalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION, newChainedLogicalExpression, newChainedLogicalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION:
				return basicSetRelationalExpression(null, msgs);
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION:
				return basicSetChainedLogicalExpression(null, msgs);
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION:
				return getRelationalExpression();
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION:
				return getChainedLogicalExpression();
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION:
				setRelationalExpression((EolRelationalExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION:
				setChainedLogicalExpression((EolChainedLogicalExpression)newValue);
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION:
				setRelationalExpression((EolRelationalExpression)null);
				return;
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION:
				setChainedLogicalExpression((EolChainedLogicalExpression)null);
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__RELATIONAL_EXPRESSION:
				return relationalExpression != null;
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION__CHAINED_LOGICAL_EXPRESSION:
				return chainedLogicalExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolLogicalExpressionImpl
