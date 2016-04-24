/**
 */
package relationalMetaModel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import relationalMetaModel.RelationalForeignKey;
import relationalMetaModel.RelationalMetaModelPackage;
import relationalMetaModel.RelationalTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link relationalMetaModel.impl.RelationalForeignKeyImpl#getName <em>Name</em>}</li>
 *   <li>{@link relationalMetaModel.impl.RelationalForeignKeyImpl#getOwnedByTable <em>Owned By Table</em>}</li>
 *   <li>{@link relationalMetaModel.impl.RelationalForeignKeyImpl#getReferencedTable <em>Referenced Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalForeignKeyImpl extends EObjectImpl implements RelationalForeignKey
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
	 * The cached value of the '{@link #getReferencedTable() <em>Referenced Table</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getReferencedTable()
	 * @generated
	 * @ordered
	 */
  protected RelationalTable referencedTable;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RelationalForeignKeyImpl()
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
		return RelationalMetaModelPackage.Literals.RELATIONAL_FOREIGN_KEY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalTable getOwnedByTable()
  {
		if (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE) return null;
		return (RelationalTable)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOwnedByTable(RelationalTable newOwnedByTable, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByTable, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOwnedByTable(RelationalTable newOwnedByTable)
  {
		if (newOwnedByTable != eInternalContainer() || (eContainerFeatureID() != RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE && newOwnedByTable != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByTable != null)
				msgs = ((InternalEObject)newOwnedByTable).eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
			msgs = basicSetOwnedByTable(newOwnedByTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE, newOwnedByTable, newOwnedByTable));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalTable getReferencedTable()
  {
		if (referencedTable != null && referencedTable.eIsProxy()) {
			InternalEObject oldReferencedTable = (InternalEObject)referencedTable;
			referencedTable = (RelationalTable)eResolveProxy(oldReferencedTable);
			if (referencedTable != oldReferencedTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, referencedTable));
			}
		}
		return referencedTable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RelationalTable basicGetReferencedTable()
  {
		return referencedTable;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedTable(RelationalTable newReferencedTable, NotificationChain msgs) {
		RelationalTable oldReferencedTable = referencedTable;
		referencedTable = newReferencedTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, oldReferencedTable, newReferencedTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setReferencedTable(RelationalTable newReferencedTable)
  {
		if (newReferencedTable != referencedTable) {
			NotificationChain msgs = null;
			if (referencedTable != null)
				msgs = ((InternalEObject)referencedTable).eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			if (newReferencedTable != null)
				msgs = ((InternalEObject)newReferencedTable).eInverseAdd(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
			msgs = basicSetReferencedTable(newReferencedTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE, newReferencedTable, newReferencedTable));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByTable((RelationalTable)otherEnd, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (referencedTable != null)
					msgs = ((InternalEObject)referencedTable).eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__REFERENCED_BY, RelationalTable.class, msgs);
				return basicSetReferencedTable((RelationalTable)otherEnd, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return basicSetOwnedByTable(null, msgs);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return basicSetReferencedTable(null, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return eInternalContainer().eInverseRemove(this, RelationalMetaModelPackage.RELATIONAL_TABLE__FOREIGN_KEYS, RelationalTable.class, msgs);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return getName();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable();
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				if (resolve) return getReferencedTable();
				return basicGetReferencedTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)newValue);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)newValue);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				setOwnedByTable((RelationalTable)null);
				return;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				setReferencedTable((RelationalTable)null);
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
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__OWNED_BY_TABLE:
				return getOwnedByTable() != null;
			case RelationalMetaModelPackage.RELATIONAL_FOREIGN_KEY__REFERENCED_TABLE:
				return referencedTable != null;
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

} //RelationalForeignKeyImpl
