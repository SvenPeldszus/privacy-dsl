/**
 */
package traceabilityPLA.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.secdfd.model.NamedEntity;

import pla.Identifiable;

import traceabilityPLA.PLATrace;
import traceabilityPLA.TraceabilityPLAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PLA Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link traceabilityPLA.impl.PLATraceImpl#getEdfdElements <em>Edfd Elements</em>}</li>
 *   <li>{@link traceabilityPLA.impl.PLATraceImpl#getPlaElements <em>Pla Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLATraceImpl extends MinimalEObjectImpl.Container implements PLATrace {
	/**
	 * The cached value of the '{@link #getEdfdElements() <em>Edfd Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdfdElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedEntity> edfdElements;

	/**
	 * The cached value of the '{@link #getPlaElements() <em>Pla Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifiable> plaElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLATraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPLAPackage.Literals.PLA_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedEntity> getEdfdElements() {
		if (edfdElements == null) {
			edfdElements = new EObjectResolvingEList<NamedEntity>(NamedEntity.class, this, TraceabilityPLAPackage.PLA_TRACE__EDFD_ELEMENTS);
		}
		return edfdElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifiable> getPlaElements() {
		if (plaElements == null) {
			plaElements = new EObjectResolvingEList<Identifiable>(Identifiable.class, this, TraceabilityPLAPackage.PLA_TRACE__PLA_ELEMENTS);
		}
		return plaElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPLAPackage.PLA_TRACE__EDFD_ELEMENTS:
				return getEdfdElements();
			case TraceabilityPLAPackage.PLA_TRACE__PLA_ELEMENTS:
				return getPlaElements();
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
			case TraceabilityPLAPackage.PLA_TRACE__EDFD_ELEMENTS:
				getEdfdElements().clear();
				getEdfdElements().addAll((Collection<? extends NamedEntity>)newValue);
				return;
			case TraceabilityPLAPackage.PLA_TRACE__PLA_ELEMENTS:
				getPlaElements().clear();
				getPlaElements().addAll((Collection<? extends Identifiable>)newValue);
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
			case TraceabilityPLAPackage.PLA_TRACE__EDFD_ELEMENTS:
				getEdfdElements().clear();
				return;
			case TraceabilityPLAPackage.PLA_TRACE__PLA_ELEMENTS:
				getPlaElements().clear();
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
			case TraceabilityPLAPackage.PLA_TRACE__EDFD_ELEMENTS:
				return edfdElements != null && !edfdElements.isEmpty();
			case TraceabilityPLAPackage.PLA_TRACE__PLA_ELEMENTS:
				return plaElements != null && !plaElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PLATraceImpl
