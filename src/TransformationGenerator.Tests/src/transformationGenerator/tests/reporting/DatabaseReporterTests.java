package transformationGenerator.tests.reporting;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import transformationGenerator.main.InjectionConfiguration;
import transformationGenerator.population.Individual;
import transformationGenerator.population.Population;
import transformationGenerator.population.Program;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.reporting.interfaces.IReporter;

public class DatabaseReporterTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private IReporter reporter;

	@Before
	public void setUp() throws Exception {
		reporter = InjectionConfiguration.getInjector().getInstance(IReporter.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReportStateOf() throws SQLException {
		Population population = new Population();

		IIndividual individual = new Individual(new Program(), population);
		individual.setFitness(50.);
		//individual.setGeneration(1);
		population.getIndividuals().add(individual);

		reporter.reportStateOf(population);
		assertNotEquals(0, population.getId());
		int populationId = population.getId();
		
		reporter.reportStateOf(population);
		assertEquals(populationId, population.getId());
	}

}
