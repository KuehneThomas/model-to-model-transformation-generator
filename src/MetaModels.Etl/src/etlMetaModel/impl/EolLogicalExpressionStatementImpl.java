/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolLogicalExpressionStatement;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Logical Expression Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolLogicalExpressionStatementImpl#getLogicalExpression <em>Logical Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolLogicalExpressionStatementImpl extends EolExpressionStatementImpl implements EolLogicalExpressionStatement {
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
	public EolLogicalExpressionStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_LOGICAL_EXPRESSION_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION, oldLogicalExpression, newLogicalExpression);
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
				msgs = ((InternalEObject)logicalExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION, null, msgs);
			if (newLogicalExpression != null)
				msgs = ((InternalEObject)newLogicalExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION, null, msgs);
			msgs = basicSetLogicalExpression(newLogicalExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION, newLogicalExpression, newLogicalExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION:
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
			case EtlMetaModelPackage.EOL_LOGICAL_EXPRESSION_STATEMENT__LOGICAL_EXPRESSION:
				return logicalExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //EolLogicalExpressionStatementImpl
