/**
 */
package etlMetaModel.impl;

import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.MofClass;
import etlMetaModel.MofProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mof Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.MofClassImpl#getOwnedProperties <em>Owned Properties</em>}</li>
 *   <li>{@link etlMetaModel.impl.MofClassImpl#getSuperclasses <em>Superclasses</em>}</li>
 *   <li>{@link etlMetaModel.impl.MofClassImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MofClassImpl extends MofTypeImpl implements MofClass {
	/**
	 * The cached value of the '{@link #getOwnedProperties() <em>Owned Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MofProperty> ownedProperties;

	/**
	 * The cached value of the '{@link #getSuperclasses() <em>Superclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<MofClass> superclasses;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected EList<MofClass> clazz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.MOF_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofProperty> getOwnedProperties() {
		if (ownedProperties == null) {
			ownedProperties = new EObjectContainmentWithInverseEList<MofProperty>(MofProperty.class, this, EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES, EtlMetaModelPackage.MOF_PROPERTY__CLAZZ);
		}
		return ownedProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofClass> getSuperclasses() {
		if (superclasses == null) {
			superclasses = new EObjectWithInverseResolvingEList.ManyInverse<MofClass>(MofClass.class, this, EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES, EtlMetaModelPackage.MOF_CLASS__CLAZZ);
		}
		return superclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofClass> getClazz() {
		if (clazz == null) {
			clazz = new EObjectWithInverseResolvingEList.ManyInverse<MofClass>(MofClass.class, this, EtlMetaModelPackage.MOF_CLASS__CLAZZ, EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES);
		}
		return clazz;
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
			case EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedProperties()).basicAdd(otherEnd, msgs);
			case EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperclasses()).basicAdd(otherEnd, msgs);
			case EtlMetaModelPackage.MOF_CLASS__CLAZZ:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClazz()).basicAdd(otherEnd, msgs);
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
			case EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES:
				return ((InternalEList<?>)getOwnedProperties()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES:
				return ((InternalEList<?>)getSuperclasses()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.MOF_CLASS__CLAZZ:
				return ((InternalEList<?>)getClazz()).basicRemove(otherEnd, msgs);
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
			case EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES:
				return getOwnedProperties();
			case EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES:
				return getSuperclasses();
			case EtlMetaModelPackage.MOF_CLASS__CLAZZ:
				return getClazz();
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
			case EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				getOwnedProperties().addAll((Collection<? extends MofProperty>)newValue);
				return;
			case EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES:
				getSuperclasses().clear();
				getSuperclasses().addAll((Collection<? extends MofClass>)newValue);
				return;
			case EtlMetaModelPackage.MOF_CLASS__CLAZZ:
				getClazz().clear();
				getClazz().addAll((Collection<? extends MofClass>)newValue);
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
			case EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES:
				getOwnedProperties().clear();
				return;
			case EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES:
				getSuperclasses().clear();
				return;
			case EtlMetaModelPackage.MOF_CLASS__CLAZZ:
				getClazz().clear();
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
			case EtlMetaModelPackage.MOF_CLASS__OWNED_PROPERTIES:
				return ownedProperties != null && !ownedProperties.isEmpty();
			case EtlMetaModelPackage.MOF_CLASS__SUPERCLASSES:
				return superclasses != null && !superclasses.isEmpty();
			case EtlMetaModelPackage.MOF_CLASS__CLAZZ:
				return clazz != null && !clazz.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MofClassImpl
