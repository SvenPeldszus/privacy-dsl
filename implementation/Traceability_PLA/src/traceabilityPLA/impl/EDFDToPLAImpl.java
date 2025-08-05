/**
 */
package traceabilityPLA.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.secdfd.model.EDFD;
import pla.PLA;
import traceabilityPLA.EDFDToPLA;
import traceabilityPLA.PLATrace;
import traceabilityPLA.TraceabilityPLAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDFD To PLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traceabilityPLA.impl.EDFDToPLAImpl#getPlatraces <em>Platraces</em>}</li>
 *   <li>{@link traceabilityPLA.impl.EDFDToPLAImpl#getEdfds <em>Edfds</em>}</li>
 *   <li>{@link traceabilityPLA.impl.EDFDToPLAImpl#getPla <em>Pla</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDFDToPLAImpl extends MinimalEObjectImpl.Container implements EDFDToPLA {
	/**
	 * The cached value of the '{@link #getPlatraces() <em>Platraces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatraces()
	 * @generated
	 * @ordered
	 */
	protected EList<PLATrace> platraces;

	/**
	 * The cached value of the '{@link #getEdfds() <em>Edfds</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdfds()
	 * @generated
	 * @ordered
	 */
	protected EDFD edfds;

	/**
	 * The cached value of the '{@link #getPla() <em>Pla</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPla()
	 * @generated
	 * @ordered
	 */
	protected PLA pla;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDFDToPLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPLAPackage.Literals.EDFD_TO_PLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PLATrace> getPlatraces() {
		if (platraces == null) {
			platraces = new EObjectContainmentEList<PLATrace>(PLATrace.class, this, TraceabilityPLAPackage.EDFD_TO_PLA__PLATRACES);
		}
		return platraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDFD getEdfds() {
		if (edfds != null && edfds.eIsProxy()) {
			InternalEObject oldEdfds = (InternalEObject)edfds;
			edfds = (EDFD)eResolveProxy(oldEdfds);
			if (edfds != oldEdfds) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPLAPackage.EDFD_TO_PLA__EDFDS, oldEdfds, edfds));
			}
		}
		return edfds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFD basicGetEdfds() {
		return edfds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdfds(EDFD newEdfds) {
		EDFD oldEdfds = edfds;
		edfds = newEdfds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPLAPackage.EDFD_TO_PLA__EDFDS, oldEdfds, edfds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PLA getPla() {
		if (pla != null && pla.eIsProxy()) {
			InternalEObject oldPla = (InternalEObject)pla;
			pla = (PLA)eResolveProxy(oldPla);
			if (pla != oldPla) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPLAPackage.EDFD_TO_PLA__PLA, oldPla, pla));
			}
		}
		return pla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLA basicGetPla() {
		return pla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPla(PLA newPla) {
		PLA oldPla = pla;
		pla = newPla;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPLAPackage.EDFD_TO_PLA__PLA, oldPla, pla));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLATRACES:
				return ((InternalEList<?>)getPlatraces()).basicRemove(otherEnd, msgs);
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
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLATRACES:
				return getPlatraces();
			case TraceabilityPLAPackage.EDFD_TO_PLA__EDFDS:
				if (resolve) return getEdfds();
				return basicGetEdfds();
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLA:
				if (resolve) return getPla();
				return basicGetPla();
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
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLATRACES:
				getPlatraces().clear();
				getPlatraces().addAll((Collection<? extends PLATrace>)newValue);
				return;
			case TraceabilityPLAPackage.EDFD_TO_PLA__EDFDS:
				setEdfds((EDFD)newValue);
				return;
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLA:
				setPla((PLA)newValue);
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
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLATRACES:
				getPlatraces().clear();
				return;
			case TraceabilityPLAPackage.EDFD_TO_PLA__EDFDS:
				setEdfds((EDFD)null);
				return;
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLA:
				setPla((PLA)null);
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
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLATRACES:
				return platraces != null && !platraces.isEmpty();
			case TraceabilityPLAPackage.EDFD_TO_PLA__EDFDS:
				return edfds != null;
			case TraceabilityPLAPackage.EDFD_TO_PLA__PLA:
				return pla != null;
		}
		return super.eIsSet(featureID);
	}

} //EDFDToPLAImpl
