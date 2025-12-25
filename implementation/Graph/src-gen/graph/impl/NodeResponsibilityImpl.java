/**
 */
package graph.impl;

import graph.AssetLabel;
import graph.GraphAsset;
import graph.GraphPackage;
import graph.GraphTables;
import graph.NodeResponsibility;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionMaxOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionMinOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

import org.secdfd.model.MLContractType;
import org.secdfd.model.SecurityContractType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Responsibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getID <em>ID</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getTask <em>Task</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getMlTask <em>Ml Task</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getOutgoingassets <em>Outgoingassets</em>}</li>
 *   <li>{@link graph.impl.NodeResponsibilityImpl#getIncomingassets <em>Incomingassets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeResponsibilityImpl extends MinimalEObjectImpl.Container implements NodeResponsibility {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = -1;

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
	 * The cached value of the '{@link #getTask() <em>Task</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityContractType> task;

	/**
	 * The cached value of the '{@link #getMlTask() <em>Ml Task</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlTask()
	 * @generated
	 * @ordered
	 */
	protected EList<MLContractType> mlTask;

	/**
	 * The cached value of the '{@link #getOutgoingassets() <em>Outgoingassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingassets()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphAsset> outgoingassets;

	/**
	 * The cached value of the '{@link #getIncomingassets() <em>Incomingassets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingassets()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphAsset> incomingassets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeResponsibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.NODE_RESPONSIBILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE_RESPONSIBILITY__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.NODE_RESPONSIBILITY__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityContractType> getTask() {
		if (task == null) {
			task = new EDataTypeUniqueEList<SecurityContractType>(SecurityContractType.class, this, GraphPackage.NODE_RESPONSIBILITY__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MLContractType> getMlTask() {
		if (mlTask == null) {
			mlTask = new EDataTypeUniqueEList<MLContractType>(MLContractType.class, this, GraphPackage.NODE_RESPONSIBILITY__ML_TASK);
		}
		return mlTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphAsset> getOutgoingassets() {
		if (outgoingassets == null) {
			outgoingassets = new EObjectResolvingEList<GraphAsset>(GraphAsset.class, this, GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS);
		}
		return outgoingassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphAsset> getIncomingassets() {
		if (incomingassets == null) {
			incomingassets = new EObjectResolvingEList<GraphAsset>(GraphAsset.class, this, GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS);
		}
		return incomingassets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger findMostRestrictiveLabel() {
		/**
		 * self.incomingassets.assetlabel.level->max()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<GraphAsset> incomingassets = this.getIncomingassets();
		final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(GraphTables.SEQ_CLSSid_AssetLabel);
		Iterator<Object> ITERATOR__1 = BOXED_incomingassets.iterator();
		/*@NonInvalid*/ SequenceValue collect_0;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect_0 = accumulator;
				break;
			}
			/*@NonInvalid*/ GraphAsset _1 = (GraphAsset)ITERATOR__1.next();
			/**
			 * assetlabel
			 */
			final /*@NonInvalid*/ List<AssetLabel> assetlabel = _1.getAssetlabel();
			final /*@NonInvalid*/ OrderedSetValue BOXED_assetlabel = idResolver.createOrderedSetOfAll(GraphTables.ORD_CLSSid_AssetLabel, assetlabel);
			//
			for (Object value : BOXED_assetlabel.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(GraphTables.SEQ_DATAid_EInt);
		Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				collect = accumulator_0;
				break;
			}
			/*@NonInvalid*/ AssetLabel _1_0 = (AssetLabel)ITERATOR__1_0.next();
			/**
			 * level
			 */
			final /*@NonInvalid*/ int level = _1_0.getLevel();
			final /*@NonInvalid*/ IntegerValue BOXED_level = ValueUtil.integerValueOf(level);
			//
			accumulator_0.add(BOXED_level);
		}
		final /*@NonInvalid*/ IntegerValue max = (IntegerValue)CollectionMaxOperation.INSTANCE.evaluate(collect);
		final BigInteger ECORE_max = ValueUtil.bigIntegerValueOf(max);
		return ECORE_max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger findLeastRestrictiveLabel() {
		/**
		 * self.incomingassets.assetlabel.level->min()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<GraphAsset> incomingassets = this.getIncomingassets();
		final /*@NonInvalid*/ OrderedSetValue BOXED_incomingassets = idResolver.createOrderedSetOfAll(GraphTables.ORD_CLSSid_GraphAsset, incomingassets);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(GraphTables.SEQ_CLSSid_AssetLabel);
		Iterator<Object> ITERATOR__1 = BOXED_incomingassets.iterator();
		/*@NonInvalid*/ SequenceValue collect_0;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect_0 = accumulator;
				break;
			}
			/*@NonInvalid*/ GraphAsset _1 = (GraphAsset)ITERATOR__1.next();
			/**
			 * assetlabel
			 */
			final /*@NonInvalid*/ List<AssetLabel> assetlabel = _1.getAssetlabel();
			final /*@NonInvalid*/ OrderedSetValue BOXED_assetlabel = idResolver.createOrderedSetOfAll(GraphTables.ORD_CLSSid_AssetLabel, assetlabel);
			//
			for (Object value : BOXED_assetlabel.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(GraphTables.SEQ_DATAid_EInt);
		Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				collect = accumulator_0;
				break;
			}
			/*@NonInvalid*/ AssetLabel _1_0 = (AssetLabel)ITERATOR__1_0.next();
			/**
			 * level
			 */
			final /*@NonInvalid*/ int level = _1_0.getLevel();
			final /*@NonInvalid*/ IntegerValue BOXED_level = ValueUtil.integerValueOf(level);
			//
			accumulator_0.add(BOXED_level);
		}
		final /*@NonInvalid*/ IntegerValue min = (IntegerValue)CollectionMinOperation.INSTANCE.evaluate(collect);
		final BigInteger ECORE_min = ValueUtil.bigIntegerValueOf(min);
		return ECORE_min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.NODE_RESPONSIBILITY__ID:
				return getID();
			case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
				return getNumber();
			case GraphPackage.NODE_RESPONSIBILITY__TASK:
				return getTask();
			case GraphPackage.NODE_RESPONSIBILITY__ML_TASK:
				return getMlTask();
			case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
				return getOutgoingassets();
			case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
				return getIncomingassets();
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
			case GraphPackage.NODE_RESPONSIBILITY__ID:
				setID((String)newValue);
				return;
			case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
				setNumber((Integer)newValue);
				return;
			case GraphPackage.NODE_RESPONSIBILITY__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends SecurityContractType>)newValue);
				return;
			case GraphPackage.NODE_RESPONSIBILITY__ML_TASK:
				getMlTask().clear();
				getMlTask().addAll((Collection<? extends MLContractType>)newValue);
				return;
			case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
				getOutgoingassets().clear();
				getOutgoingassets().addAll((Collection<? extends GraphAsset>)newValue);
				return;
			case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
				getIncomingassets().clear();
				getIncomingassets().addAll((Collection<? extends GraphAsset>)newValue);
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
			case GraphPackage.NODE_RESPONSIBILITY__ID:
				setID(ID_EDEFAULT);
				return;
			case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case GraphPackage.NODE_RESPONSIBILITY__TASK:
				getTask().clear();
				return;
			case GraphPackage.NODE_RESPONSIBILITY__ML_TASK:
				getMlTask().clear();
				return;
			case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
				getOutgoingassets().clear();
				return;
			case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
				getIncomingassets().clear();
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
			case GraphPackage.NODE_RESPONSIBILITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GraphPackage.NODE_RESPONSIBILITY__NUMBER:
				return number != NUMBER_EDEFAULT;
			case GraphPackage.NODE_RESPONSIBILITY__TASK:
				return task != null && !task.isEmpty();
			case GraphPackage.NODE_RESPONSIBILITY__ML_TASK:
				return mlTask != null && !mlTask.isEmpty();
			case GraphPackage.NODE_RESPONSIBILITY__OUTGOINGASSETS:
				return outgoingassets != null && !outgoingassets.isEmpty();
			case GraphPackage.NODE_RESPONSIBILITY__INCOMINGASSETS:
				return incomingassets != null && !incomingassets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphPackage.NODE_RESPONSIBILITY___FIND_MOST_RESTRICTIVE_LABEL:
				return findMostRestrictiveLabel();
			case GraphPackage.NODE_RESPONSIBILITY___FIND_LEAST_RESTRICTIVE_LABEL:
				return findLeastRestrictiveLabel();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", number: ");
		result.append(number);
		result.append(", task: ");
		result.append(task);
		result.append(", mlTask: ");
		result.append(mlTask);
		result.append(')');
		return result.toString();
	}

} //NodeResponsibilityImpl
