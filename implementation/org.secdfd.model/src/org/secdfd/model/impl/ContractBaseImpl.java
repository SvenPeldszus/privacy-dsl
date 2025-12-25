/**
 */
package org.secdfd.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.secdfd.model.Asset;
import org.secdfd.model.ContractBase;
import org.secdfd.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.ContractBaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.secdfd.model.impl.ContractBaseImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.secdfd.model.impl.ContractBaseImpl#getIncomeassets <em>Incomeassets</em>}</li>
 *   <li>{@link org.secdfd.model.impl.ContractBaseImpl#getOutcomeassets <em>Outcomeassets</em>}</li>
 *   <li>{@link org.secdfd.model.impl.ContractBaseImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContractBaseImpl extends MinimalEObjectImpl.Container implements ContractBase {
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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomeassets() <em>Incomeassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomeassets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> incomeassets;

	/**
	 * The cached value of the '{@link #getOutcomeassets() <em>Outcomeassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeassets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> outcomeassets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONTRACT_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTRACT_BASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTRACT_BASE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getIncomeassets() {
		if (incomeassets == null) {
			incomeassets = new EObjectResolvingEList<Asset>(Asset.class, this, ModelPackage.CONTRACT_BASE__INCOMEASSETS);
		}
		return incomeassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getOutcomeassets() {
		if (outcomeassets == null) {
			outcomeassets = new EObjectResolvingEList<Asset>(Asset.class, this, ModelPackage.CONTRACT_BASE__OUTCOMEASSETS);
		}
		return outcomeassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.secdfd.model.Process getProcess() {
		if (eContainerFeatureID() != ModelPackage.CONTRACT_BASE__PROCESS) return null;
		return (org.secdfd.model.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(org.secdfd.model.Process newProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProcess, ModelPackage.CONTRACT_BASE__PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(org.secdfd.model.Process newProcess) {
		if (newProcess != eInternalContainer() || (eContainerFeatureID() != ModelPackage.CONTRACT_BASE__PROCESS && newProcess != null)) {
			if (EcoreUtil.isAncestor(this, newProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, ModelPackage.PROCESS__RESPONSIBILITY, org.secdfd.model.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONTRACT_BASE__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.CONTRACT_BASE__PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProcess((org.secdfd.model.Process)otherEnd, msgs);
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
			case ModelPackage.CONTRACT_BASE__PROCESS:
				return basicSetProcess(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.CONTRACT_BASE__PROCESS:
				return eInternalContainer().eInverseRemove(this, ModelPackage.PROCESS__RESPONSIBILITY, org.secdfd.model.Process.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONTRACT_BASE__NAME:
				return getName();
			case ModelPackage.CONTRACT_BASE__NUMBER:
				return getNumber();
			case ModelPackage.CONTRACT_BASE__INCOMEASSETS:
				return getIncomeassets();
			case ModelPackage.CONTRACT_BASE__OUTCOMEASSETS:
				return getOutcomeassets();
			case ModelPackage.CONTRACT_BASE__PROCESS:
				return getProcess();
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
			case ModelPackage.CONTRACT_BASE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.CONTRACT_BASE__NUMBER:
				setNumber((Integer)newValue);
				return;
			case ModelPackage.CONTRACT_BASE__INCOMEASSETS:
				getIncomeassets().clear();
				getIncomeassets().addAll((Collection<? extends Asset>)newValue);
				return;
			case ModelPackage.CONTRACT_BASE__OUTCOMEASSETS:
				getOutcomeassets().clear();
				getOutcomeassets().addAll((Collection<? extends Asset>)newValue);
				return;
			case ModelPackage.CONTRACT_BASE__PROCESS:
				setProcess((org.secdfd.model.Process)newValue);
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
			case ModelPackage.CONTRACT_BASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.CONTRACT_BASE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ModelPackage.CONTRACT_BASE__INCOMEASSETS:
				getIncomeassets().clear();
				return;
			case ModelPackage.CONTRACT_BASE__OUTCOMEASSETS:
				getOutcomeassets().clear();
				return;
			case ModelPackage.CONTRACT_BASE__PROCESS:
				setProcess((org.secdfd.model.Process)null);
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
			case ModelPackage.CONTRACT_BASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.CONTRACT_BASE__NUMBER:
				return number != NUMBER_EDEFAULT;
			case ModelPackage.CONTRACT_BASE__INCOMEASSETS:
				return incomeassets != null && !incomeassets.isEmpty();
			case ModelPackage.CONTRACT_BASE__OUTCOMEASSETS:
				return outcomeassets != null && !outcomeassets.isEmpty();
			case ModelPackage.CONTRACT_BASE__PROCESS:
				return getProcess() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //ContractBaseImpl
