/**
 */
package etlMetaModel.impl;

import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.MofAssociation;
import etlMetaModel.MofProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mof Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.MofAssociationImpl#getMemberEnds <em>Member Ends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MofAssociationImpl extends MinimalEObjectImpl.Container implements MofAssociation {
	/**
	 * The cached value of the '{@link #getMemberEnds() <em>Member Ends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<MofProperty> memberEnds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.MOF_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofProperty> getMemberEnds() {
		if (memberEnds == null) {
			memberEnds = new EObjectWithInverseResolvingEList<MofProperty>(MofProperty.class, this, EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS, EtlMetaModelPackage.MOF_PROPERTY__ASSOCIATION);
		}
		return memberEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnds()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS:
				return ((InternalEList<?>)getMemberEnds()).basicRemove(otherEnd, msgs);
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
			case EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS:
				return getMemberEnds();
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
			case EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS:
				getMemberEnds().clear();
				getMemberEnds().addAll((Collection<? extends MofProperty>)newValue);
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
			case EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS:
				getMemberEnds().clear();
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
			case EtlMetaModelPackage.MOF_ASSOCIATION__MEMBER_ENDS:
				return memberEnds != null && !memberEnds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MofAssociationImpl
