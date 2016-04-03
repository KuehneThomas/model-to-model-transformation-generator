package transformationGenerator.reporting;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;

import common.util.interfaces.ILogger;

import transformationGenerator.population.interfaces.IConfiguration;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPopulation;
import transformationGenerator.population.interfaces.IPossibleMutation;
import transformationGenerator.reporting.interfaces.IReporter;

public class DatabaseReporter implements IReporter {

	private final ILogger logger;
	private static ServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;

	private static SessionFactory configureSessionFactory() throws HibernateException {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration().configure();
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.configure().buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}

	// private static void closeSessionFactory() {
	// sessionFactory.close();
	// }

	@Inject
	public DatabaseReporter(ILogger logger) throws SQLException {
		this.logger = logger;
		this.logger.initialize(DatabaseReporter.class);
		configureSessionFactory();
	}

	@Override
	public IConfiguration getOrCreateConfiguration(IConfiguration configuration) {
		SessionFactory sessionFactory = configureSessionFactory();

		Session session = sessionFactory.openSession();

		@SuppressWarnings("rawtypes")
		List result = session.createSQLQuery(String.format("SELECT Id FROM Configuration WHERE FitnessFunction='%s' AND InputMetaModel='%s' AND MaximumNumberOfGenerations=%s AND MutationOperatorSelection='%s' AND OutputMetaModel='%s' AND PopulationSize=%s AND SelectionAndReplicationAlgorithm='%s'",
				configuration.getFitnessFunction(), configuration.getInputMetaModel(), configuration.getMaximumNumberOfGenerations(), configuration.getMutationOperatorSelection(),
				configuration.getOutputMetaModel(), configuration.getPopulationSize(), configuration.getSelectionAndReplicationAlgorithm())).list();

		if (result.size() > 0) {
			logger.LogDebug("DatabaseReporter", "retrieving existing configuration from database...");
			IConfiguration existingConfiguration = (IConfiguration) session.get(transformationGenerator.population.Configuration.class, (int) result.get(0));
			configuration = existingConfiguration;
		} else {
			logger.LogDebug("DatabaseReporter", "creating a new configuration in the database...");
			session.beginTransaction();
			session.save(configuration);
			session.getTransaction().commit();
		}

		session.close();

		return configuration;
	}

	@Override
	public void reportStateOf(IPopulation population) throws SQLException {
		// String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER11;" +
		// "databaseName=TransformationGenerator;integratedSecurity=true;";
		// Connection con = DriverManager.getConnection(connectionUrl);
		SessionFactory sessionFactory = configureSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		if (population.getId() == 0) {
			session.save(population);
		}

		for (IIndividual individual : population.getIndividuals()) {
			session.save(individual);
			for (IPossibleMutation possibleMutation : individual.getPossibleMutations()) {
				session.save(possibleMutation);
			}
			individual.getPossibleMutations().clear();
		}

		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void complete(IPopulation population) throws SQLException {
		population.setResultSourceCode(population.getFittestIndividuals().size() > 0 ? population.getFittestIndividuals().get(0).getPhenotpye().getSourceCode() : "");
		population.setCompletedAt(new Date());
		population.setCompleted(true);

		SessionFactory sessionFactory = configureSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(population);

		session.getTransaction().commit();
		session.close();

		updateConfigurationStatistics(population.getConfiguration());
	}

	@Override
	public void updateConfigurationStatistics(IConfiguration configuration) {
		SessionFactory sessionFactory = configureSessionFactory();

		Session session = sessionFactory.openSession();

		// session.createSQLQuery(String.format("[UpdateConfigurationStatisticsPerGeneration] %s", configuration.getId()));

		session.beginTransaction();
		
		session.doWork(
				new Work() {
					public void execute(Connection connection) throws SQLException
					{
						logger.LogDebug("updateConfigurationStatistics", "updating general configuration statistics...");
						CallableStatement callableStatementUpdateConfigurationStatistics = connection.prepareCall("{call dbo.UpdateConfigurationStatistics( ? )}");
						callableStatementUpdateConfigurationStatistics.setInt(1, configuration.getId());
						callableStatementUpdateConfigurationStatistics.execute();
						callableStatementUpdateConfigurationStatistics.close();

						logger.LogDebug("updateConfigurationStatistics", "updating per generation configuration statistics...");
						CallableStatement callableStatementUpdateConfigurationStatisticsPerGeneration = connection.prepareCall("{call dbo.UpdateConfigurationStatisticsPerGeneration( ? )}");
						callableStatementUpdateConfigurationStatisticsPerGeneration.setInt(1, configuration.getId());
						callableStatementUpdateConfigurationStatisticsPerGeneration.execute();
						callableStatementUpdateConfigurationStatisticsPerGeneration.close();

						logger.LogDebug("updateConfigurationStatistics", "finished");					
					}
				});

		session.getTransaction().commit();
		session.close();
	}
}
