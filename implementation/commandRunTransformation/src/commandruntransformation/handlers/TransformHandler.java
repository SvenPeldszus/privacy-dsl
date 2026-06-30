package commandruntransformation.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;

import edfdtosimplegraph.eDFDToGraphTransformation;
import traceability.EDFDToGraph;

public class TransformHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);

		EDFDToGraph tracemodel = (EDFDToGraph) selection.getFirstElement();

		try {
			var engine = ViatraQueryEngine.on(new EMFScope(tracemodel.eResource().getResourceSet()));
			var transformation = new eDFDToGraphTransformation(tracemodel, engine) {
			};

			transformation.execute();
		} catch (ViatraQueryException e) {
			throw new ExecutionException(e.getMessage(), e);
		}

		return null;
	}
}
