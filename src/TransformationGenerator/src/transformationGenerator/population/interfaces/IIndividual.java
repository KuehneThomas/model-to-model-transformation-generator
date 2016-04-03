package transformationGenerator.population.interfaces;

import java.util.List;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import common.emf.interfaces.IModelFactory;

public interface IIndividual {
	IPopulation getPopulation();

	void setPopulation(IPopulation population);

	int getGeneration();

	void setGeneration(int generation);

	IModel getGenotype();

	void setGenotype(IModel dna);

	IProgram getPhenotpye();

	void setPhenotpye(IProgram chromosome);

	double getFitness();

	void setFitness(double fitness);

	List<IChangeLogEntry> getChangeLog();

	void killIndividual(IModelFactory modelFactory);

	IIndividual cloneIndividual(IModelFactory modelFactory, Boolean addToPopulation, Boolean cloneChangeLog) throws EolModelLoadingException, Exception;

	IIndividual cloneIndividual(IModelFactory modelFactory) throws EolModelLoadingException, Exception;

	String getLastMutation();

	void setLastMutation(String lastMutation);

	String getLastMutationOperator();

	void setLastMutationOperator(String lastMutationOperator);

	List<IPossibleMutation> getPossibleMutations();
}
