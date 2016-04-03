/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolParameterList;
import etlMetaModel.EtlMetaModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolParameterListImpl#getLogicalExpressions <em>Logical Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolParameterListImpl extends MinimalEObjectImpl.Container implements EolParameterList {
	/**
	 * The cached value of the '{@link #getLogicalExpressions() <em>Logical Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<EolLogicalExpression> logicalExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_PARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EolLogicalExpression> getLogicalExpressions() {
		if (logicalExpressions == null) {
			logicalExpressions = new EObjectContainmentEList<EolLogicalExpression>(EolLogicalExpression.class, this, EtlMetaModelPackage.EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS);
		}
		return logicalExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS:
				return ((InternalEList<?>)getLogicalExpressions()).basicRemove(otherEnd, msgs);
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
			case EtlMetaModelPackage.EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS:
				return getLogicalExpressions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS:
				getLogicalExpressions().clear();
				getLogicalExpressions().addAll((Collection<? extends EolLogicalExpression>)newValue);
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
			case EtlMetaModelPackage.EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS:
				getLogicalExpressions().clear();
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
			case EtlMetaModelPackage.EOL_PARAMETER_LIST__LOGICAL_EXPRESSIONS:
				return logicalExpressions != null && !logicalExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EolParameterListImpl
