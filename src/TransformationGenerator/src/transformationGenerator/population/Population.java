package transformationGenerator.population;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import transformationGenerator.population.interfaces.IConfiguration;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPopulation;

@Entity
@Table(name = "Population")
public class Population implements IPopulation {
	private int id;
	private IConfiguration configuration;
	private Date createdAt;
	private List<IIndividual> individuals;
	private int maximumSize;
	private int generation;
	private String resultSourceCode;
	private Boolean completed;
	private Date completedAt;
	private Map<String, Set<String>> sourceCodeToDestroyingMutationOperators;
	private Map<String, Double> sourceCodeToFitness;

	@Inject
	public Population() {
		createdAt = new Date();
		individuals = Collections.synchronizedList(new ArrayList<IIndividual>());
		sourceCodeToDestroyingMutationOperators = new HashMap<String, Set<String>>();
		sourceCodeToFitness = Collections.synchronizedMap(new HashMap<String, Double>());
	}

	@Id
	@GeneratedValue
	// @GeneratedValue(generator="increment")
	// @GenericGenerator(name="increment", strategy = "increment")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(targetEntity = Configuration.class)
	@JoinColumn(name = "ConfigurationId")
	// @Column(name = "PopulationId")
	public IConfiguration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(IConfiguration configuration) {
		this.configuration = configuration;
	}

	@Override
	public void setIndividuals(List<IIndividual> individuals) {
		this.individuals = individuals;
	}

	@Override
	public void setGeneration(int generation) {
		this.generation = generation;
	}

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Transient
	@Override
	public List<IIndividual> getIndividuals() {
		return individuals;
	}

	@Transient
	@Override
	public int getMaximumSize() {
		return maximumSize;
	}

	@Override
	public void setMaximumSize(int maximumSize) {
		this.maximumSize = maximumSize;
	}

	@Transient
	@Override
	public double getMaximumFitness() {
		if (getIndividuals().size() == 0) {
			return 0;
		}

		double maximumFitness = getIndividuals().get(0).getFitness();
		for (IIndividual individual : getIndividuals()) {
			if (individual.getFitness() > maximumFitness) {
				maximumFitness = individual.getFitness();
			}
		}
		return maximumFitness;
	}

	@Transient
	@Override
	public List<IIndividual> getFittestIndividuals() {
		double maximumFitness = getMaximumFitness();
		List<IIndividual> fittestIndividuals = new ArrayList<IIndividual>();
		for (IIndividual individual : getIndividuals()) {
			if (individual.getFitness() == maximumFitness) {
				fittestIndividuals.add(individual);
			}
		}
		return fittestIndividuals;
	}

	@Transient
	@Override
	public void nextGeneration() {
		this.generation++;
		for (IIndividual individual : this.getIndividuals()) {
			individual.setGeneration(this.getGeneration());
			individual.getChangeLog().add(new ChangeLogEntry(String.format("Moved to next generation %s", this.getGeneration())));
		}
	}

	@Transient
	@Override
	public int getGeneration() {
		return generation;
	}

	@Override
	public Boolean getCompleted() {
		return completed;
	}

	@Override
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	@Override
	public Date getCompletedAt() {
		return completedAt;
	}

	@Override
	public void setCompletedAt(Date completedAt) {
		this.completedAt = completedAt;
	}

	@Override
	public String getResultSourceCode() {
		return resultSourceCode;
	}

	@Override
	public void setResultSourceCode(String resultSourceCode) {
		this.resultSourceCode = resultSourceCode;
	}

	@Transient
	@Override
	public Map<String, Set<String>> getSourceCodeToDestroyingMutationOperators() {
		return sourceCodeToDestroyingMutationOperators;
	}

	@Transient
	@Override
	public Map<String, Double> getSourceCodeToFitness() {
		return sourceCodeToFitness;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		DoubleSummaryStatistics populationStatistics = getIndividuals().stream().mapToDouble(i -> i.getFitness()).summaryStatistics();
		return String.format("%s \nFitness Statistics:\n- max	= %s\n- avg	= %s\n- min	= %s\n", getConfiguration(), df.format(populationStatistics.getMax()), df.format(populationStatistics.getAverage()), df.format(populationStatistics.getMin()));
	}

}
