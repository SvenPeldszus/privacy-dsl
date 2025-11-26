/**
 */
package org.secdfd.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

import org.secdfd.model.MLResponsibility;
import org.secdfd.model.MLResponsibilityType;
import org.secdfd.model.ModelPackage;
import org.secdfd.model.ModelTables;
import org.secdfd.model.ResponsibilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ML Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.secdfd.model.impl.MLResponsibilityImpl#getMlAction <em>Ml Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MLResponsibilityImpl extends ResponsibilityImpl implements MLResponsibility {
	/**
	 * The cached value of the '{@link #getMlAction() <em>Ml Action</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlAction()
	 * @generated
	 * @ordered
	 */
	protected EList<MLResponsibilityType> mlAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MLResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ML_RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MLResponsibilityType> getMlAction() {
		if (mlAction == null) {
			mlAction = new EDataTypeUniqueEList<MLResponsibilityType>(MLResponsibilityType.class, this, ModelPackage.ML_RESPONSIBILITY__ML_ACTION);
		}
		return mlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean constraint_ml_responsibility(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "MLResponsibility::constraint_ml_responsibility";
		try {
			/**
			 *
			 * inv constraint_ml_responsibility:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.Action->includes(ResponsibilityType::ML)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'MLResponsibility can only be used when ML is selected as a ResponsibilityType in Action.', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ModelPackage.Literals.ML_RESPONSIBILITY___CONSTRAINT_ML_RESPONSIBILITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ List<ResponsibilityType> Action = this.getAction();
				final /*@NonInvalid*/ OrderedSetValue BOXED_Action = idResolver.createOrderedSetOfAll(ModelTables.ORD_ENUMid_ResponsibilityType, Action);
				final /*@NonInvalid*/ boolean status = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_Action, ModelTables.ELITid_ML).booleanValue();
				/*@NonInvalid*/ Object IF_status;
				if (status) {
					IF_status = ValueUtil.TRUE_VALUE;
				}
				else {
					final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(ModelTables.TUPLid_, ModelTables.STR_MLResponsibility_32_can_32_only_32_be_32_used_32_when_32_ML_32_is_32_selected_32_as_32_a_32_Respo, status);
					IF_status = TUP_;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, IF_status, ModelTables.INT_0).booleanValue();
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
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				return getMlAction();
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
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				getMlAction().clear();
				getMlAction().addAll((Collection<? extends MLResponsibilityType>)newValue);
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
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				getMlAction().clear();
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
			case ModelPackage.ML_RESPONSIBILITY__ML_ACTION:
				return mlAction != null && !mlAction.isEmpty();
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
			case ModelPackage.ML_RESPONSIBILITY___CONSTRAINT_ML_RESPONSIBILITY__DIAGNOSTICCHAIN_MAP:
				return constraint_ml_responsibility((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (mlAction: ");
		result.append(mlAction);
		result.append(')');
		return result.toString();
	}

} //MLResponsibilityImpl
