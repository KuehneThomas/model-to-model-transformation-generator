package transformationGenerator.mutation.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

public interface IMutationOption {
	IMutationOperator getMutationOperator();

	IModel getModel();

	EObject getElement();

	Boolean isOptionEquivalentTo(IMutationOption mutationOption);
}
