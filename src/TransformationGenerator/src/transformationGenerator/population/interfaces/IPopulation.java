package transformationGenerator.population.interfaces;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IPopulation {
	int getId();

	IConfiguration getConfiguration();

	void setConfiguration(IConfiguration configuration);

	Date getCreatedAt();

	List<IIndividual> getIndividuals();

	int getMaximumSize();

	void setMaximumSize(int maximumSize);

	double getMaximumFitness();

	List<IIndividual> getFittestIndividuals();

	void nextGeneration();

	int getGeneration();

	void setIndividuals(List<IIndividual> individuals);

	void setGeneration(int generation);

	Boolean getCompleted();

	void setCompleted(Boolean completed);

	Date getCompletedAt();

	void setCompletedAt(Date completedAt);

	String getResultSourceCode();

	void setResultSourceCode(String resultSourceCode);

	Map<String, Set<String>> getSourceCodeToDestroyingMutationOperators();

	Map<String, Double> getSourceCodeToFitness();
}
