package transformationGenerator.mutation.interfaces;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.eol.models.IModel;

import transformationGenerator.population.interfaces.IChangeLogEntry;

public interface IMutationOperator {
	List<IMutationOption> getMutationOptions(IModel model) throws Exception;

	List<IMutationOption> getMutationOptions(IModel model, EObject element) throws Exception;

	IChangeLogEntry mutate(IMutationOption mutationOption) throws Exception;

	void dispose();
}
