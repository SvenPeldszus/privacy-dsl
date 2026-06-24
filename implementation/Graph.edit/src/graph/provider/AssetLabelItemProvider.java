/**
 */
package graph.provider;


import graph.AssetLabel;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.secdfd.model.Level;

/**
 * This is the item provider adapter for a {@link graph.AssetLabel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssetLabelItemProvider extends SecurityLabelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetLabelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns AssetLabel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssetLabel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		AssetLabel assetLabel = (AssetLabel)object;
		String labelValue = assetLabel.getObjective();
		String label = labelValue == null ? null : labelValue.toString();
		
		// Get the level and convert it to Level enum
		// Note: Graph model uses level 0-4 (N=0, L=1, M=2, H=3, C=4)
		// Level enum also uses 0-4 (N=0, L=1, M=2, H=3, C=4), so direct mapping
		int level = assetLabel.getLevel();
		
		// Don't display labels with invalid level (< 0)
		if (level < 0) {
			return getString("_UI_AssetLabel_type") + " (invalid)";
		}
		
		// Direct mapping from graph level (0-4) to Level enum (0-4)
		Level levelEnum = Level.get(level);
		String levelStr = levelEnum != null ? levelEnum.toString() : String.valueOf(level);
		
		if (label == null || label.length() == 0) {
			return getString("_UI_AssetLabel_type") + " (" + levelStr + ")";
		} else {
			return getString("_UI_AssetLabel_type") + " " + label + " (" + levelStr + ")";
		}
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
