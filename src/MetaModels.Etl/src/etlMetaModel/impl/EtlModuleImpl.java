/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolOperation;
import etlMetaModel.ErlNamedRule;
import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.EtlModule;
import etlMetaModel.EtlTransformationRule;
import etlMetaModel.MofAssociation;
import etlMetaModel.MofClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etl Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getMofClassesSource <em>Mof Classes Source</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getMofAssociationsSource <em>Mof Associations Source</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getMofClassesTarget <em>Mof Classes Target</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getMofAssociationsTarget <em>Mof Associations Target</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getTransformationRules <em>Transformation Rules</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getPost <em>Post</em>}</li>
 *   <li>{@link etlMetaModel.impl.EtlModuleImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EtlModuleImpl extends EolLibraryModuleImpl implements EtlModule {
	/**
	 * The cached value of the '{@link #getMofClassesSource() <em>Mof Classes Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofClassesSource()
	 * @generated
	 * @ordered
	 */
	protected EList<MofClass> mofClassesSource;

	/**
	 * The cached value of the '{@link #getMofAssociationsSource() <em>Mof Associations Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofAssociationsSource()
	 * @generated
	 * @ordered
	 */
	protected EList<MofAssociation> mofAssociationsSource;

	/**
	 * The cached value of the '{@link #getMofClassesTarget() <em>Mof Classes Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofClassesTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<MofClass> mofClassesTarget;

	/**
	 * The cached value of the '{@link #getMofAssociationsTarget() <em>Mof Associations Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMofAssociationsTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<MofAssociation> mofAssociationsTarget;

	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected ErlNamedRule pre;

	/**
	 * The cached value of the '{@link #getTransformationRules() <em>Transformation Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationRules()
	 * @generated
	 * @ordered
	 */
	protected EList<EtlTransformationRule> transformationRules;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected ErlNamedRule post;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<EolOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.ETL_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofClass> getMofClassesSource() {
		if (mofClassesSource == null) {
			mofClassesSource = new EObjectContainmentEList<MofClass>(MofClass.class, this, EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_SOURCE);
		}
		return mofClassesSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofAssociation> getMofAssociationsSource() {
		if (mofAssociationsSource == null) {
			mofAssociationsSource = new EObjectContainmentEList<MofAssociation>(MofAssociation.class, this, EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_SOURCE);
		}
		return mofAssociationsSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofClass> getMofClassesTarget() {
		if (mofClassesTarget == null) {
			mofClassesTarget = new EObjectContainmentEList<MofClass>(MofClass.class, this, EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_TARGET);
		}
		return mofClassesTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MofAssociation> getMofAssociationsTarget() {
		if (mofAssociationsTarget == null) {
			mofAssociationsTarget = new EObjectContainmentEList<MofAssociation>(MofAssociation.class, this, EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_TARGET);
		}
		return mofAssociationsTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErlNamedRule getPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPre(ErlNamedRule newPre, NotificationChain msgs) {
		ErlNamedRule oldPre = pre;
		pre = newPre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_MODULE__PRE, oldPre, newPre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(ErlNamedRule newPre) {
		if (newPre != pre) {
			NotificationChain msgs = null;
			if (pre != null)
				msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_MODULE__PRE, null, msgs);
			if (newPre != null)
				msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_MODULE__PRE, null, msgs);
			msgs = basicSetPre(newPre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_MODULE__PRE, newPre, newPre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EtlTransformationRule> getTransformationRules() {
		if (transformationRules == null) {
			transformationRules = new EObjectContainmentEList<EtlTransformationRule>(EtlTransformationRule.class, this, EtlMetaModelPackage.ETL_MODULE__TRANSFORMATION_RULES);
		}
		return transformationRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErlNamedRule getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(ErlNamedRule newPost, NotificationChain msgs) {
		ErlNamedRule oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_MODULE__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(ErlNamedRule newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_MODULE__POST, null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.ETL_MODULE__POST, null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.ETL_MODULE__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EolOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<EolOperation>(EolOperation.class, this, EtlMetaModelPackage.ETL_MODULE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_SOURCE:
				return ((InternalEList<?>)getMofClassesSource()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_SOURCE:
				return ((InternalEList<?>)getMofAssociationsSource()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_TARGET:
				return ((InternalEList<?>)getMofClassesTarget()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_TARGET:
				return ((InternalEList<?>)getMofAssociationsTarget()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.ETL_MODULE__PRE:
				return basicSetPre(null, msgs);
			case EtlMetaModelPackage.ETL_MODULE__TRANSFORMATION_RULES:
				return ((InternalEList<?>)getTransformationRules()).basicRemove(otherEnd, msgs);
			case EtlMetaModelPackage.ETL_MODULE__POST:
				return basicSetPost(null, msgs);
			case EtlMetaModelPackage.ETL_MODULE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_SOURCE:
				return getMofClassesSource();
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_SOURCE:
				return getMofAssociationsSource();
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_TARGET:
				return getMofClassesTarget();
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_TARGET:
				return getMofAssociationsTarget();
			case EtlMetaModelPackage.ETL_MODULE__PRE:
				return getPre();
			case EtlMetaModelPackage.ETL_MODULE__TRANSFORMATION_RULES:
				return getTransformationRules();
			case EtlMetaModelPackage.ETL_MODULE__POST:
				return getPost();
			case EtlMetaModelPackage.ETL_MODULE__OPERATIONS:
				return getOperations();
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
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_SOURCE:
				getMofClassesSource().clear();
				getMofClassesSource().addAll((Collection<? extends MofClass>)newValue);
				return;
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_SOURCE:
				getMofAssociationsSource().clear();
				getMofAssociationsSource().addAll((Collection<? extends MofAssociation>)newValue);
				return;
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_TARGET:
				getMofClassesTarget().clear();
				getMofClassesTarget().addAll((Collection<? extends MofClass>)newValue);
				return;
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_TARGET:
				getMofAssociationsTarget().clear();
				getMofAssociationsTarget().addAll((Collection<? extends MofAssociation>)newValue);
				return;
			case EtlMetaModelPackage.ETL_MODULE__PRE:
				setPre((ErlNamedRule)newValue);
				return;
			case EtlMetaModelPackage.ETL_MODULE__TRANSFORMATION_RULES:
				getTransformationRules().clear();
				getTransformationRules().addAll((Collection<? extends EtlTransformationRule>)newValue);
				return;
			case EtlMetaModelPackage.ETL_MODULE__POST:
				setPost((ErlNamedRule)newValue);
				return;
			case EtlMetaModelPackage.ETL_MODULE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends EolOperation>)newValue);
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
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_SOURCE:
				getMofClassesSource().clear();
				return;
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_SOURCE:
				getMofAssociationsSource().clear();
				return;
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_TARGET:
				getMofClassesTarget().clear();
				return;
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_TARGET:
				getMofAssociationsTarget().clear();
				return;
			case EtlMetaModelPackage.ETL_MODULE__PRE:
				setPre((ErlNamedRule)null);
				return;
			case EtlMetaModelPackage.ETL_MODULE__TRANSFORMATION_RULES:
				getTransformationRules().clear();
				return;
			case EtlMetaModelPackage.ETL_MODULE__POST:
				setPost((ErlNamedRule)null);
				return;
			case EtlMetaModelPackage.ETL_MODULE__OPERATIONS:
				getOperations().clear();
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
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_SOURCE:
				return mofClassesSource != null && !mofClassesSource.isEmpty();
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_SOURCE:
				return mofAssociationsSource != null && !mofAssociationsSource.isEmpty();
			case EtlMetaModelPackage.ETL_MODULE__MOF_CLASSES_TARGET:
				return mofClassesTarget != null && !mofClassesTarget.isEmpty();
			case EtlMetaModelPackage.ETL_MODULE__MOF_ASSOCIATIONS_TARGET:
				return mofAssociationsTarget != null && !mofAssociationsTarget.isEmpty();
			case EtlMetaModelPackage.ETL_MODULE__PRE:
				return pre != null;
			case EtlMetaModelPackage.ETL_MODULE__TRANSFORMATION_RULES:
				return transformationRules != null && !transformationRules.isEmpty();
			case EtlMetaModelPackage.ETL_MODULE__POST:
				return post != null;
			case EtlMetaModelPackage.ETL_MODULE__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EtlModuleImpl
