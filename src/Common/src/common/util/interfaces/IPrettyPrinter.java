package common.util.interfaces;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

public interface IPrettyPrinter {
	String ToString(EObject eObject);

	String ToStringRecursive(EObject eObject);

	String ToStringRecursive(Collection<EObject> eObjects);

	String ToStringRecursive(EObject[] eObjects);

	String ToStringRecursive(IModel model);
}
