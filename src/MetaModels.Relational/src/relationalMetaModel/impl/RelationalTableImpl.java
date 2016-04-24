/**
 */
package relationalMetaModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import relationalMetaModel.RelationalForeignKey;
import relationalMetaModel.RelationalMetaModelPackage;
import relationalMetaModel.RelationalSchema;
import relationalMetaModel.RelationalTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link relationalMetaModel.impl.RelationalTableImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link relationalMetaModel.impl.RelationalTableImpl#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.impl.RelationalTableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link relationalMetaModel.impl.RelationalTableImpl#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalTableImpl extends EObjectImpl implements RelationalTable
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
  protected EList<RelationalForeignKey> foreignKeys;

  /**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationalForeignKey> referencedBy;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RelationalTableImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return RelationalMetaModelPackage.Literals.RELATIONAL_TABLE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalSchema getSchema()
  {
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA) return null;
		return (RelationalSchema)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSchema(RelationalSchema newSchema, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newSchema, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSchema(RelationalSchema newSchema)
  {
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA, newSchema, newSchema));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_TABLE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<RelationalForeignKey> getForeignKeys()
  {
		if (foreignKeys == null) {
			foreignKeys = new EObjectContainmentWithInverseEList<RelationalForeignKey>(RelationalForeignKey.class, this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE);
		}
		return foreignKeys;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationalForeignKey> getReferencedBy() {
		if (referencedBy == null) {
			referencedBy = new EObjectWithInverseResolvingEList<RelationalForeignKey>(RelationalForeignKey.class, this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE);
		}
		return referencedBy;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((RelationalSchema)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForeignKeys()).basicAdd(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferencedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return ((InternalEList<?>)getForeignKeys()).basicRemove(otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_SCHEMA__TABLES, RelationalSchema.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return getForeignKeys();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return getReferencedBy();
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
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				getForeignKeys().addAll((Collection<? extends RelationalForeignKey>)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends RelationalForeignKey>)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				setSchema((RelationalSchema)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				getForeignKeys().clear();
				return;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				getReferencedBy().clear();
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_TABLE__SCHEMA:
				return getSchema() != null;
			case RelationalMetaModelPackage.RELATIONAL_TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS:
				return foreignKeys != null && !foreignKeys.isEmpty();
			case RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelationalTableImpl
