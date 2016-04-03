/**
 */
package etlMetaModel.impl;

import etlMetaModel.EolFor;
import etlMetaModel.EolFormalParameter;
import etlMetaModel.EolLogicalExpression;
import etlMetaModel.EolStatementBlock;
import etlMetaModel.EtlMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link etlMetaModel.impl.EolForImpl#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolForImpl#getIteratedSequence <em>Iterated Sequence</em>}</li>
 *   <li>{@link etlMetaModel.impl.EolForImpl#getStatementBlock <em>Statement Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolForImpl extends EolStatementImpl implements EolFor {
	/**
	 * The cached value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected EolFormalParameter formalParameter;

	/**
	 * The cached value of the '{@link #getIteratedSequence() <em>Iterated Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteratedSequence()
	 * @generated
	 * @ordered
	 */
	protected EolLogicalExpression iteratedSequence;

	/**
	 * The cached value of the '{@link #getStatementBlock() <em>Statement Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementBlock()
	 * @generated
	 * @ordered
	 */
	protected EolStatementBlock statementBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EtlMetaModelPackage.Literals.EOL_FOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolFormalParameter getFormalParameter() {
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormalParameter(EolFormalParameter newFormalParameter, NotificationChain msgs) {
		EolFormalParameter oldFormalParameter = formalParameter;
		formalParameter = newFormalParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER, oldFormalParameter, newFormalParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalParameter(EolFormalParameter newFormalParameter) {
		if (newFormalParameter != formalParameter) {
			NotificationChain msgs = null;
			if (formalParameter != null)
				msgs = ((InternalEObject)formalParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER, null, msgs);
			if (newFormalParameter != null)
				msgs = ((InternalEObject)newFormalParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER, null, msgs);
			msgs = basicSetFormalParameter(newFormalParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER, newFormalParameter, newFormalParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolLogicalExpression getIteratedSequence() {
		return iteratedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIteratedSequence(EolLogicalExpression newIteratedSequence, NotificationChain msgs) {
		EolLogicalExpression oldIteratedSequence = iteratedSequence;
		iteratedSequence = newIteratedSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE, oldIteratedSequence, newIteratedSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteratedSequence(EolLogicalExpression newIteratedSequence) {
		if (newIteratedSequence != iteratedSequence) {
			NotificationChain msgs = null;
			if (iteratedSequence != null)
				msgs = ((InternalEObject)iteratedSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE, null, msgs);
			if (newIteratedSequence != null)
				msgs = ((InternalEObject)newIteratedSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE, null, msgs);
			msgs = basicSetIteratedSequence(newIteratedSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE, newIteratedSequence, newIteratedSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolStatementBlock getStatementBlock() {
		return statementBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatementBlock(EolStatementBlock newStatementBlock, NotificationChain msgs) {
		EolStatementBlock oldStatementBlock = statementBlock;
		statementBlock = newStatementBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK, oldStatementBlock, newStatementBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementBlock(EolStatementBlock newStatementBlock) {
		if (newStatementBlock != statementBlock) {
			NotificationChain msgs = null;
			if (statementBlock != null)
				msgs = ((InternalEObject)statementBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK, null, msgs);
			if (newStatementBlock != null)
				msgs = ((InternalEObject)newStatementBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK, null, msgs);
			msgs = basicSetStatementBlock(newStatementBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK, newStatementBlock, newStatementBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER:
				return basicSetFormalParameter(null, msgs);
			case EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE:
				return basicSetIteratedSequence(null, msgs);
			case EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK:
				return basicSetStatementBlock(null, msgs);
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
			case EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER:
				return getFormalParameter();
			case EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE:
				return getIteratedSequence();
			case EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK:
				return getStatementBlock();
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
			case EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER:
				setFormalParameter((EolFormalParameter)newValue);
				return;
			case EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE:
				setIteratedSequence((EolLogicalExpression)newValue);
				return;
			case EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK:
				setStatementBlock((EolStatementBlock)newValue);
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
			case EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER:
				setFormalParameter((EolFormalParameter)null);
				return;
			case EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE:
				setIteratedSequence((EolLogicalExpression)null);
				return;
			case EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK:
				setStatementBlock((EolStatementBlock)null);
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
			case EtlMetaModelPackage.EOL_FOR__FORMAL_PARAMETER:
				return formalParameter != null;
			case EtlMetaModelPackage.EOL_FOR__ITERATED_SEQUENCE:
				return iteratedSequence != null;
			case EtlMetaModelPackage.EOL_FOR__STATEMENT_BLOCK:
				return statementBlock != null;
		}
		return super.eIsSet(featureID);
	}

} //EolForImpl
