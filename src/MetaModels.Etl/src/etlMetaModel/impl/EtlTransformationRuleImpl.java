/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolMofClassFormalParameter;
import etlMetaModel.EolStatementBlock;
import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.EtlTransformationRule;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etl Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getGuardName <em>Guard Name</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getExtendsRules <em>Extends Rules</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getTargetParameters <em>Target Parameters</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getBody <em>Body</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getAbstractt <em>Abstractt</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getLazy <em>Lazy</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlTransformationRuleImpl#getGreedy <em>Greedy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EtlTransformationRuleImpl extends MinimalEObjectImpl.Container implements EtlTransformationRule {
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
	 * The default value of the '{@link #getGuardName() <em>Guard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardName()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardName() <em>Guard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardName()
	 * @generated
	 * @ordered
	 */
	protected String guardName = GUARD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendsRules() <em>Extends Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendsRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EtlTransformationRule> extendsRules;

	/**
	 * The cached value of the '{@link #getSourceParameter() <em>Source Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceParameter()
	 * @generated
	 * @ordered
	 */
	protected EolMofClassFormalParameter sourceParameter;

	/**
	 * The cached value of the '{@link #getTargetParameters() <em>Target Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EolMofClassFormalParameter> targetParameters;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected EolLogicalExpression guard;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EolStatementBlock body;

	/**
	 * The default value of the '{@link #getAbstractt() <em>Abstractt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractt()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACTT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstractt() <em>Abstractt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractt()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstractt = ABSTRACTT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LAZY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazy()
	 * @generated
	 * @ordered
	 */
	protected Boolean lazy = LAZY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected Boolean primary = PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreedy() <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreedy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GREEDY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreedy() <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreedy()
	 * @generated
	 * @ordered
	 */
	protected Boolean greedy = GREEDY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlTransformationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.ETL_TRANSFORMATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardName() {
		return guardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardName(String newGuardName) {
		String oldGuardName = guardName;
		guardName = newGuardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD_NAME, oldGuardName, guardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EtlTransformationRule> getExtendsRules() {
		if (extendsRules == null) {
			extendsRules = new EObjectResolvingEList<EtlTransformationRule>(EtlTransformationRule.class, this, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__EXTENDS_RULES);
		}
		return extendsRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolMofClassFormalParameter getSourceParameter() {
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceParameter(EolMofClassFormalParameter newSourceParameter, NotificationChain msgs) {
		EolMofClassFormalParameter oldSourceParameter = sourceParameter;
		sourceParameter = newSourceParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER, oldSourceParameter, newSourceParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceParameter(EolMofClassFormalParameter newSourceParameter) {
		if (newSourceParameter != sourceParameter) {
			NotificationChain msgs = null;
			if (sourceParameter != null)
				msgs = ((InternalEObject)sourceParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER, null, msgs);
			if (newSourceParameter != null)
				msgs = ((InternalEObject)newSourceParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER, null, msgs);
			msgs = basicSetSourceParameter(newSourceParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER, newSourceParameter, newSourceParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EolMofClassFormalParameter> getTargetParameters() {
		if (targetParameters == null) {
			targetParameters = new EObjectContainmentEList<EolMofClassFormalParameter>(EolMofClassFormalParameter.class, this, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS);
		}
		return targetParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpression getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(EolLogicalExpression newGuard, NotificationChain msgs) {
		EolLogicalExpression oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(EolLogicalExpression newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolStatementBlock getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(EolStatementBlock newBody, NotificationChain msgs) {
		EolStatementBlock oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(EolStatementBlock newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstractt() {
		return abstractt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractt(Boolean newAbstractt) {
		Boolean oldAbstractt = abstractt;
		abstractt = newAbstractt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__ABSTRACTT, oldAbstractt, abstractt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(Boolean newLazy) {
		Boolean oldLazy = lazy;
		lazy = newLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__LAZY, oldLazy, lazy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(Boolean newPrimary) {
		Boolean oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__PRIMARY, oldPrimary, primary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGreedy() {
		return greedy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreedy(Boolean newGreedy) {
		Boolean oldGreedy = greedy;
		greedy = newGreedy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GREEDY, oldGreedy, greedy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER:
				return basicSetSourceParameter(null, msgs);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS:
				return ((InternalEList<?>)getTargetParameters()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD:
				return basicSetGuard(null, msgs);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY:
				return basicSetBody(null, msgs);
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
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__NAME:
				return getName();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD_NAME:
				return getGuardName();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__EXTENDS_RULES:
				return getExtendsRules();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER:
				return getSourceParameter();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS:
				return getTargetParameters();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD:
				return getGuard();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY:
				return getBody();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__ABSTRACTT:
				return getAbstractt();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__LAZY:
				return getLazy();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__PRIMARY:
				return getPrimary();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GREEDY:
				return getGreedy();
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
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__NAME:
				setName((String)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD_NAME:
				setGuardName((String)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__EXTENDS_RULES:
				getExtendsRules().clear();
				getExtendsRules().addAll((Collection<? extends EtlTransformationRule>)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER:
				setSourceParameter((EolMofClassFormalParameter)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS:
				getTargetParameters().clear();
				getTargetParameters().addAll((Collection<? extends EolMofClassFormalParameter>)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD:
				setGuard((EolLogicalExpression)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY:
				setBody((EolStatementBlock)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__ABSTRACTT:
				setAbstractt((Boolean)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__LAZY:
				setLazy((Boolean)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__PRIMARY:
				setPrimary((Boolean)newValue);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GREEDY:
				setGreedy((Boolean)newValue);
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
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD_NAME:
				setGuardName(GUARD_NAME_EDEFAULT);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__EXTENDS_RULES:
				getExtendsRules().clear();
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER:
				setSourceParameter((EolMofClassFormalParameter)null);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS:
				getTargetParameters().clear();
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD:
				setGuard((EolLogicalExpression)null);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY:
				setBody((EolStatementBlock)null);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__ABSTRACTT:
				setAbstractt(ABSTRACTT_EDEFAULT);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__PRIMARY:
				setPrimary(PRIMARY_EDEFAULT);
				return;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GREEDY:
				setGreedy(GREEDY_EDEFAULT);
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
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD_NAME:
				return GUARD_NAME_EDEFAULT == null ? guardName != null : !GUARD_NAME_EDEFAULT.equals(guardName);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__EXTENDS_RULES:
				return extendsRules != null && !extendsRules.isEmpty();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__SOURCE_PARAMETER:
				return sourceParameter != null;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__TARGET_PARAMETERS:
				return targetParameters != null && !targetParameters.isEmpty();
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GUARD:
				return guard != null;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__BODY:
				return body != null;
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__ABSTRACTT:
				return ABSTRACTT_EDEFAULT == null ? abstractt != null : !ABSTRACTT_EDEFAULT.equals(abstractt);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__LAZY:
				return LAZY_EDEFAULT == null ? lazy != null : !LAZY_EDEFAULT.equals(lazy);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__PRIMARY:
				return PRIMARY_EDEFAULT == null ? primary != null : !PRIMARY_EDEFAULT.equals(primary);
			case EtlMetaModelPackage.ETL_TRANSFORMATION_RULE__GREEDY:
				return GREEDY_EDEFAULT == null ? greedy != null : !GREEDY_EDEFAULT.equals(greedy);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", guardName: ");
		result.append(guardName);
		result.append(", abstractt: ");
		result.append(abstractt);
		result.append(", lazy: ");
		result.append(lazy);
		result.append(", primary: ");
		result.append(primary);
		result.append(", greedy: ");
		result.append(greedy);
		result.append(')');
		return result.toString();
	}

} //EtlTransformationRuleImpl
