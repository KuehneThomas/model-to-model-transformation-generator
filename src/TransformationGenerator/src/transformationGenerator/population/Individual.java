package transformationGenerator.population;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import com.google.inject.Key;

import common.emf.interfaces.IModelFactory;
import transformationGenerator.main.InjectionConfiguration;
import transformationGenerator.population.interfaces.IChangeLogEntry;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPopulation;
import transformationGenerator.population.interfaces.IPossibleMutation;
import transformationGenerator.population.interfaces.IProgram;

@Entity
@Table(name = "Individual")
public class Individual implements IIndividual {
	private int id;
	private IPopulation population;
	private int generation;
	private IModel genotype;
	private IProgram phenotype;
	private double fitness;
	private String lastMutation;
	private String lastMutationOperator;
	private final List<IChangeLogEntry> changeLog;
	private List<IPossibleMutation> possibleMutations;

	public Individual() {
		// for Hibernate
		this.changeLog = new ArrayList<IChangeLogEntry>();
		this.possibleMutations = new ArrayList<IPossibleMutation>();
	}

	@Inject
	public Individual(IProgram phenotype) {
		this();
		this.phenotype = phenotype;
	}

	public Individual(IProgram phenotype, IPopulation population) {
		this(phenotype);
		this.population = population;
	}

	public Individual(IModel genotype, IProgram phenotype) {
		this(phenotype);
		this.genotype = genotype;
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

	@ManyToOne(targetEntity = Population.class)
	@JoinColumn(name = "PopulationId")
	// @Column(name = "PopulationId")
	public IPopulation getPopulation() {
		return population;
	}

	public void setPopulation(IPopulation population) {
		this.population = population;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	@Transient
	public IModel getGenotype() {
		return genotype;
	}

	public void setGenotype(IModel genotype) {
		this.genotype = genotype;
	}

	@Transient
	public IProgram getPhenotpye() {
		return phenotype;
	}

	public void setPhenotpye(IProgram phenotype) {
		this.phenotype = phenotype;
	}

	public double getFitness() {
		return fitness;
	}

	public void setFitness(double fitness) {
		this.fitness = fitness;
	}

	@Transient
	@Override
	public List<IChangeLogEntry> getChangeLog() {
		return changeLog;
	}

	public int getIndividual() {
		// for hibernate
		return hashCode();
	}

	public void setIndividual(int individual) {
		// for hibernate
	}

	@Override
	public void killIndividual(IModelFactory modelFactory) {
		modelFactory.lockGlobalModelRegistry();
		try {
			this.getGenotype().dispose();
		} finally {
			modelFactory.unlockGlobalModelRegistry();
		}
		if (population != null) {
			population.getIndividuals().remove(this);
		}
	}

	@Override
	public IIndividual cloneIndividual(IModelFactory modelFactory) throws EolModelLoadingException, Exception {
		return cloneIndividual(modelFactory, /* addToPopulation */true, /* cloneChangeLog: */true);
	}

	@Override
	public IIndividual cloneIndividual(IModelFactory modelFactory, Boolean addToPopulation, Boolean cloneChangeLog) throws EolModelLoadingException, Exception {
		IIndividual individualBlueprint = this;
		IIndividual clonedIndividual = InjectionConfiguration.getInjector().getInstance(new Key<IIndividual>() {});

		clonedIndividual.setGenotype(modelFactory.cloneModel(individualBlueprint.getGenotype()));

		if (addToPopulation) {
			clonedIndividual.setPopulation(individualBlueprint.getPopulation());
		}
		clonedIndividual.setGeneration(individualBlueprint.getPopulation().getGeneration());
		clonedIndividual.getPhenotpye().setSourceCode(individualBlueprint.getPhenotpye().getSourceCode());
		clonedIndividual.setFitness(individualBlueprint.getFitness());
		if (cloneChangeLog) {
			for (IChangeLogEntry changeLogEntry : individualBlueprint.getChangeLog()) {
				clonedIndividual.getChangeLog().add(changeLogEntry);
			}
			clonedIndividual.getChangeLog().add(new ChangeLogEntry(String.format("Cloned from individual %s", individualBlueprint.hashCode())));
		}
		if (addToPopulation) {
			population.getIndividuals().add(clonedIndividual);
		}
		return clonedIndividual;
	}

	@Transient
	@Override
	public String getLastMutation() {
		return lastMutation;
	}

	@Transient
	@Override
	public void setLastMutation(String lastMutation) {
		this.lastMutation = lastMutation;
	}

	@Transient
	@Override
	public String getLastMutationOperator() {
		return lastMutationOperator;
	}

	@Transient
	@Override
	public void setLastMutationOperator(String lastMutationOperator) {
		this.lastMutationOperator = lastMutationOperator;
	}

	@Transient
	@Override
	public List<IPossibleMutation> getPossibleMutations() {
		return possibleMutations;
	}

	@Override
	public String toString() {
		String changeLogString = "ChangeLog:\n";
		for (IChangeLogEntry changeLogEntry : changeLog) {
			changeLogString += changeLogEntry.toString() + "\n";
		}
		return String.format("Individual %s with fitness %s\n\n%s\n\n%s", this.hashCode(), this.fitness, this.getPhenotpye().toString(), changeLogString);
	}
}
