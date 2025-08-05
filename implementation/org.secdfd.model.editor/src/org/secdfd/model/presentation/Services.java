package org.secdfd.model.presentation;

import org.secdfd.model.Asset;
import org.secdfd.model.Flow;
import org.secdfd.model.Element;
import org.secdfd.model.EDFD;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import java.util.*;

public class Services extends AbstractHandler implements IExternalJavaAction {
    private static final Set<Asset> highlightedAssets = new HashSet<>();
    private static final Set<Flow> highlightedFlows = new HashSet<>();

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        Object assetParam = parameters.get("asset");
        setHighlightedAsset(assetParam instanceof Asset ? (Asset) assetParam :
                           !selections.isEmpty() && selections.iterator().next() instanceof Asset ? 
                           (Asset) selections.iterator().next() : null);
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

    public void setHighlightedAsset(Asset asset) {
        clearHighlights();
        if (asset != null) {
            highlightedAssets.add(asset);
            highlightedFlows.addAll(getAssetFlowPath(asset));
            //refreshDiagram(asset);
        }
    }

    private void clearHighlights() {
        if (!highlightedAssets.isEmpty() || !highlightedFlows.isEmpty()) {
            highlightedAssets.clear();
            highlightedFlows.clear();
            //refreshDiagram(null);
        }
    }

    private void refreshDiagram(EObject context) {
        Session session = context != null ? SessionManager.INSTANCE.getSession(context) :
                         SessionManager.INSTANCE.getSessions().stream().findFirst().orElse(null);
        
        if (session != null) {
            session.getTransactionalEditingDomain().getCommandStack().execute(
                new org.eclipse.emf.common.command.AbstractCommand() {
                    protected boolean prepare() { return true; }
                    public void execute() {}
                    public void redo() { execute(); }
                }
            );
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