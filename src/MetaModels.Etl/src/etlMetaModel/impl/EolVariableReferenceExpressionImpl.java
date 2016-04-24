/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolVariableDeclarationExpression;
import etlMetaModel.EolVariableReferenceExpression;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Variable Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolVariableReferenceExpressionImpl#getReferencedVarableDeclaration <em>Referenced Varable Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolVariableReferenceExpressionImpl extends EolReferenceExpressionImpl implements EolVariableReferenceExpression {
	/**
	 * The cached value of the '{@link #getReferencedVarableDeclaration() <em>Referenced Varable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedVarableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EolVariableDeclarationExpression referencedVarableDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolVariableReferenceExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_VARIABLE_REFERENCE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolVariableDeclarationExpression getReferencedVarableDeclaration() {
		if (referencedVarableDeclaration != null && referencedVarableDeclaration.eIsProxy()) {
			InternalEObject oldReferencedVarableDeclaration = (InternalEObject)referencedVarableDeclaration;
			referencedVarableDeclaration = (EolVariableDeclarationExpression)eResolveProxy(oldReferencedVarableDeclaration);
			if (referencedVarableDeclaration != oldReferencedVarableDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION, oldReferencedVarableDeclaration, referencedVarableDeclaration));
			}
		}
		return referencedVarableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolVariableDeclarationExpression basicGetReferencedVarableDeclaration() {
		return referencedVarableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedVarableDeclaration(EolVariableDeclarationExpression newReferencedVarableDeclaration) {
		EolVariableDeclarationExpression oldReferencedVarableDeclaration = referencedVarableDeclaration;
		referencedVarableDeclaration = newReferencedVarableDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION, oldReferencedVarableDeclaration, referencedVarableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION:
				if (resolve) return getReferencedVarableDeclaration();
				return basicGetReferencedVarableDeclaration();
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
			case EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION:
				setReferencedVarableDeclaration((EolVariableDeclarationExpression)newValue);
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
			case EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION:
				setReferencedVarableDeclaration((EolVariableDeclarationExpression)null);
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
			case EtlMetaModelPackage.EOL_VARIABLE_REFERENCE_EXPRESSION__REFERENCED_VARABLE_DECLARATION:
				return referencedVarableDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //EolVariableReferenceExpressionImpl
