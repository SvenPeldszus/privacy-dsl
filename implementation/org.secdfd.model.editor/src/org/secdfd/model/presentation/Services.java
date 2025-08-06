package org.secdfd.model.presentation;

import org.secdfd.model.Asset;
import org.secdfd.model.Flow;
import org.secdfd.model.Element;
import org.secdfd.model.EDFD;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import java.util.*;

public class Services extends AbstractHandler implements IExternalJavaAction {
    private static final Set<Asset> highlightedAssets = new HashSet<>();
    private static final Set<Flow> highlightedFlows = new HashSet<>();

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
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
}
