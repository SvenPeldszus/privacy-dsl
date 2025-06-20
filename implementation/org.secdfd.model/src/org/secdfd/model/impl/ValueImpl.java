/**
 */
package org.secdfd.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.secdfd.model.ModelPackage;
import org.secdfd.model.ModelTables;
import org.secdfd.model.Objective;
import org.secdfd.model.Priority;
import org.secdfd.model.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.ValueImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.secdfd.model.impl.ValueImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueImpl extends MinimalEObjectImpl.Container implements Value {
	/**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected static final Objective OBJECTIVE_EDEFAULT = Objective.INTEGRITY;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected Objective objective = OBJECTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.H;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objective getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjective(Objective newObjective) {
		Objective oldObjective = objective;
		objective = newObjective == null ? OBJECTIVE_EDEFAULT : newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__OBJECTIVE, oldObjective, objective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Priority newPriority) {
		Priority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VALUE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint_1(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Value::constraint_1";
		try {
			/**
			 *
			 * inv constraint_1:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[?] = self.Objective = Objective::Privacy implies self.Priority = Priority::H or self.Priority = Priority::L
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Privacy as objective can only have a high or low priority.', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModelPackage.Literals.VALUE___CONSTRAINT_1__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_IF_eq_2;
				try {
					final /*@NonInvalid*/ Priority Priority_0 = this.getPriority();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_Priority_0 = Priority_0 == null ? null : ModelTables.ENUMid_Priority.getEnumerationLiteralId(ClassUtil.nonNullState(Priority_0.getName()));
					final /*@NonInvalid*/ Objective Objective = this.getObjective();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_Objective = Objective == null ? null : ModelTables.ENUMid_Objective.getEnumerationLiteralId(ClassUtil.nonNullState(Objective.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_Objective == ModelTables.ELITid_Privacy;
					final /*@Thrown*/ Boolean status;
					if (!eq) {
						status = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ boolean eq_0 = BOXED_Priority_0 == ModelTables.ELITid_H;
						final /*@NonInvalid*/ Boolean or;
						if (eq_0) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							final /*@NonInvalid*/ boolean eq_1 = BOXED_Priority_0 == ModelTables.ELITid_L;
							if (eq_1) {
								or = ValueUtil.TRUE_VALUE;
							}
							else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
						if (or == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						}
						else {
							if (or == null) {
								status = null;
							}
							else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_2;
					if (eq_2) {
						IF_eq_2 = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(ModelTables.TUPLid_, ModelTables.STR_Privacy_32_as_32_objective_32_can_32_only_32_have_32_a_32_high_32_or_32_low_32_priority, status);
						IF_eq_2 = TUP_;
					}
					CAUGHT_IF_eq_2 = IF_eq_2;
				}
				catch (Exception e) {
					CAUGHT_IF_eq_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_IF_eq_2, ModelTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.VALUE__OBJECTIVE:
				return getObjective();
			case ModelPackage.VALUE__PRIORITY:
				return getPriority();
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
			case ModelPackage.VALUE__OBJECTIVE:
				setObjective((Objective)newValue);
				return;
			case ModelPackage.VALUE__PRIORITY:
				setPriority((Priority)newValue);
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
			case ModelPackage.VALUE__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case ModelPackage.VALUE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case ModelPackage.VALUE__OBJECTIVE:
				return objective != OBJECTIVE_EDEFAULT;
			case ModelPackage.VALUE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.VALUE___CONSTRAINT_1__DIAGNOSTICCHAIN_MAP:
				return constraint_1((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Objective: ");
		result.append(objective);
		result.append(", Priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
