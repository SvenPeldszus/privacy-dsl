package org.secdfd.model.presentation;

import org.secdfd.model.Asset;
import org.secdfd.model.Flow;
import org.secdfd.model.Element;
import org.secdfd.model.EDFD;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import java.util.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;

public class Services extends AbstractHandler implements IExternalJavaAction {
    private static final Set<Asset> highlightedAssets = new HashSet<>();
    private static final Set<Flow> highlightedFlows = new HashSet<>();

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        // Check if this is a call to setMultiValuedEnumValue
        if (parameters.containsKey("object") && parameters.containsKey("feature") && parameters.containsKey("newValue")) {
            Object objectParam = parameters.get("object");
            Object featureParam = parameters.get("feature");
            Object newValueParam = parameters.get("newValue");
            
            if (objectParam instanceof EObject && featureParam instanceof EStructuralFeature) {
                setMultiValuedEnumValue((EObject) objectParam, (EStructuralFeature) featureParam, newValueParam);
                return;
            }
        }
        
        // Otherwise, handle asset highlighting
        Set<Asset> assetsToHighlight = new HashSet<>();

        Object assetParam = parameters.get("asset");
        if (assetParam instanceof Asset) {
            assetsToHighlight.add((Asset) assetParam);
        } else if (assetParam instanceof Collection<?>) {
            for (Object obj : (Collection<?>) assetParam) {
                if (obj instanceof Asset) {
                    assetsToHighlight.add((Asset) obj);
                }
            }
        }

        for (EObject selection : selections) {
            if (selection instanceof Asset) {
                assetsToHighlight.add((Asset) selection);
            }
        }

        setHighlightedAssets(assetsToHighlight);
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return true;
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        clearHighlights();
        return null;
    }

    public void setHighlightedAssets(Collection<Asset> assets) {
        clearHighlights();
        for (Asset asset : assets) {
            highlightedAssets.add(asset);
            highlightedFlows.addAll(getAssetFlowPath(asset));
        }
    }

    private void clearHighlights() {
        if (!highlightedAssets.isEmpty() || !highlightedFlows.isEmpty()) {
            highlightedAssets.clear();
            highlightedFlows.clear();
        }
    }

    private List<Flow> getAssetFlowPath(Asset asset) {
        List<Flow> flowPath = new ArrayList<>();
        if (asset == null) return flowPath;

        EDFD edfd = findEDFDContainer(asset);
        if (edfd != null) {
            for (Element element : edfd.getElements()) {
                if (element instanceof Flow) {
                    Flow flow = (Flow) element;
                    if (flow.getAssets() != null && flow.getAssets().contains(asset)) {
                        flowPath.add(flow);
                    }
                }
                for (Flow flow : element.getOutflows()) {
                    if (flow.getAssets() != null && flow.getAssets().contains(asset)) {
                        flowPath.add(flow);
                    }
                }
            }
        }
        return flowPath;
    }

    private EDFD findEDFDContainer(Asset asset) {
        EObject container = asset.eContainer();
        while (container != null && !(container instanceof EDFD)) {
            container = container.eContainer();
        }
        return (EDFD) container;
    }

    public static boolean isFlowHighlightedEnhancedStatic(Flow flow) {
        return highlightedFlows.contains(flow);
    }

    /**
     * Sets a multi-valued enum attribute value.
     * This service method is used to properly set multi-valued enum attributes in Sirius properties view.
     * It clears the existing values first, then sets the new ones.
     * 
     * @param object The EObject to set the value on
     * @param feature The EStructuralFeature representing the attribute
     * @param newValue The new value (can be a collection of EEnumLiterals or enum instances)
     * @return The object itself for chaining
     */
    public static EObject setMultiValuedEnumValue(EObject object, EStructuralFeature feature, Object newValue) {
        if (object == null || feature == null) {
            return object;
        }

        try {
            // Get the existing EList and clear it
            @SuppressWarnings("unchecked")
            EList<Object> existingList = (EList<Object>) object.eGet(feature);
            
            // Convert newValue to enum instances
            List<Object> enumInstances = new ArrayList<>();
            
            if (newValue != null) {
                if (newValue instanceof Collection<?>) {
                    Collection<?> collection = (Collection<?>) newValue;
                    for (Object item : collection) {
                        if (item instanceof EEnumLiteral) {
                            enumInstances.add(((EEnumLiteral) item).getInstance());
                        } else if (item != null) {
                            // Already an instance
                            enumInstances.add(item);
                        }
                    }
                } else if (newValue instanceof EEnumLiteral) {
                    enumInstances.add(((EEnumLiteral) newValue).getInstance());
                } else if (newValue != null) {
                    enumInstances.add(newValue);
                }
            }
            
            // Clear existing list and add new values
            // Modify the existing list in place to ensure proper EMF notifications
            if (existingList != null) {
                existingList.clear();
                existingList.addAll(enumInstances);
            } else if (!enumInstances.isEmpty()) {
                // If list was null, create a new one
                EList<Object> newList = new BasicEList<>();
                newList.addAll(enumInstances);
                object.eSet(feature, newList);
            }
            
        } catch (Exception e) {
            // Log error but don't throw - allow operation to continue
            System.err.println("Error setting multi-valued enum value: " + e.getMessage());
            e.printStackTrace();
        }
        
        return object;
    }
    
    /**
     * Joins enum literal names from a collection into a comma-separated string.
     * This is used in AQL expressions to display multi-valued enum attributes.
     * 
     * @param enumCollection The collection of enum literals or enum instances
     * @param separator The separator string (default: ", ")
     * @return A comma-separated string of enum names
     */
    public static String joinEnumNames(Object enumCollection, String separator) {
        if (enumCollection == null) {
            return "";
        }
        
        if (separator == null) {
            separator = ", ";
        }
        
        List<String> names = new ArrayList<>();
        
        if (enumCollection instanceof Collection<?>) {
            Collection<?> collection = (Collection<?>) enumCollection;
            for (Object item : collection) {
                if (item instanceof EEnumLiteral) {
                    names.add(((EEnumLiteral) item).getName());
                } else if (item != null) {
                    // Try to get the name via reflection or toString
                    try {
                        String name = item.toString();
                        // Remove package prefix if present
                        if (name.contains("::")) {
                            name = name.substring(name.lastIndexOf("::") + 2);
                        }
                        names.add(name);
                    } catch (Exception e) {
                        names.add(item.toString());
                    }
                }
            }
        } else if (enumCollection instanceof EEnumLiteral) {
            names.add(((EEnumLiteral) enumCollection).getName());
        } else if (enumCollection != null) {
            String name = enumCollection.toString();
            if (name.contains("::")) {
                name = name.substring(name.lastIndexOf("::") + 2);
            }
            names.add(name);
        }
        
        return String.join(separator, names);
    }
    
    /**
     * Overloaded method with default separator.
     */
    public static String joinEnumNames(Object enumCollection) {
        return joinEnumNames(enumCollection, ", ");
    }
}
