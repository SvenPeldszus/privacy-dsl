/**
 */
package pla.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import pla.PlaPackage;
import pla.Purpose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pla.impl.PurposeImpl#getID <em>ID</em>}</li>
 *   <li>{@link pla.impl.PurposeImpl#getName <em>Name</em>}</li>
 *   <li>{@link pla.impl.PurposeImpl#getPurposeText <em>Purpose Text</em>}</li>
 *   <li>{@link pla.impl.PurposeImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PurposeImpl extends MinimalEObjectImpl.Container implements Purpose {
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
	 * The default value of the '{@link #getPurposeText() <em>Purpose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeText()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeText() <em>Purpose Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeText()
	 * @generated
	 * @ordered
	 */
	protected String purposeText = PURPOSE_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaPackage.Literals.PURPOSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PURPOSE__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PURPOSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurposeText() {
		return purposeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurposeText(String newPurposeText) {
		String oldPurposeText = purposeText;
		purposeText = newPurposeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaPackage.PURPOSE__PURPOSE_TEXT, oldPurposeText, purposeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getActions() {
		if (actions == null) {
			actions = new EDataTypeUniqueEList<String>(String.class, this, PlaPackage.PURPOSE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaPackage.PURPOSE__ID:
				return getID();
			case PlaPackage.PURPOSE__NAME:
				return getName();
			case PlaPackage.PURPOSE__PURPOSE_TEXT:
				return getPurposeText();
			case PlaPackage.PURPOSE__ACTIONS:
				return getActions();
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
			case PlaPackage.PURPOSE__ID:
				setID((String)newValue);
				return;
			case PlaPackage.PURPOSE__NAME:
				setName((String)newValue);
				return;
			case PlaPackage.PURPOSE__PURPOSE_TEXT:
				setPurposeText((String)newValue);
				return;
			case PlaPackage.PURPOSE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends String>)newValue);
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
			case PlaPackage.PURPOSE__ID:
				setID(ID_EDEFAULT);
				return;
			case PlaPackage.PURPOSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PlaPackage.PURPOSE__PURPOSE_TEXT:
				setPurposeText(PURPOSE_TEXT_EDEFAULT);
				return;
			case PlaPackage.PURPOSE__ACTIONS:
				getActions().clear();
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
			case PlaPackage.PURPOSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PlaPackage.PURPOSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PlaPackage.PURPOSE__PURPOSE_TEXT:
				return PURPOSE_TEXT_EDEFAULT == null ? purposeText != null : !PURPOSE_TEXT_EDEFAULT.equals(purposeText);
			case PlaPackage.PURPOSE__ACTIONS:
				return actions != null && !actions.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", purposeText: ");
		result.append(purposeText);
		result.append(", actions: ");
		result.append(actions);
		result.append(')');
		return result.toString();
	}

} //PurposeImpl
