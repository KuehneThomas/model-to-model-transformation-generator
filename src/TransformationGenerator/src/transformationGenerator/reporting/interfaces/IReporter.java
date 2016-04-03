package transformationGenerator.reporting.interfaces;

import java.sql.SQLException;

import transformationGenerator.population.interfaces.IConfiguration;
import transformationGenerator.population.interfaces.IPopulation;

public interface IReporter {
	void reportStateOf(IPopulation population) throws SQLException;
	void complete(IPopulation population) throws SQLException;
	IConfiguration getOrCreateConfiguration(IConfiguration configuration);
	void updateConfigurationStatistics(IConfiguration configuration);
}
