

import transformationGenerator.fitness.FitnessEvaluator;
import transformationGenerator.fitness.interfaces.IFitnessEvaluator;
import transformationGenerator.mutation.MutationExecuter;
import transformationGenerator.mutation.interfaces.IMutationExecuter;
import transformationGenerator.mutation.interfaces.IMutationOperatorFactory;
import transformationGenerator.population.Individual;
import transformationGenerator.population.Population;
import transformationGenerator.population.Program;
import transformationGenerator.population.interfaces.IIndividual;
import transformationGenerator.population.interfaces.IPopulation;
import transformationGenerator.population.interfaces.IProgram;
import transformationGenerator.reporting.DatabaseReporter;
import transformationGenerator.reporting.interfaces.IReporter;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import common.emf.EmfModelFactory;
import common.emf.interfaces.IModelFactory;
import common.util.Logger;
import common.util.ParallelExecuter;
import common.util.PrettyPrinter;
import common.util.Randomizer;
import common.util.ResourceReader;
import common.util.interfaces.ILogger;
import common.util.interfaces.IParallelExecuter;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IRandomizer;
import common.util.interfaces.IResourceReader;

import epsilonExecuter.executers.egl.EglExecuter;
import epsilonExecuter.executers.egl.interfaces.IEglExecuter;
import epsilonExecuter.executers.egl.interfaces.IEglExecuterFactory;
import epsilonExecuter.executers.eol.EolExecuter;
import epsilonExecuter.executers.eol.interfaces.IEolExecuter;
import epsilonExecuter.executers.eol.interfaces.IEolExecuterFactory;
import epsilonExecuter.executers.etl.EtlExecuter;
import epsilonExecuter.executers.etl.interfaces.IEtlExecuter;
import epsilonExecuter.executers.etl.interfaces.IEtlExecuterFactory;
import epsilonExecuter.executers.ewl.EwlExecuter;
import epsilonExecuter.executers.ewl.interfaces.IEwlExecuter;
import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;

public class InjectionConfiguration extends AbstractModule {

	private static Injector injector;

	@Override
	protected void configure() {

		install(new FactoryModuleBuilder().implement(IEwlExecuter.class, EwlExecuter.class).build(IEwlExecuterFactory.class));
		install(new FactoryModuleBuilder().implement(IEolExecuter.class, EolExecuter.class).build(IEolExecuterFactory.class));
		install(new FactoryModuleBuilder().implement(IEtlExecuter.class, EtlExecuter.class).build(IEtlExecuterFactory.class));
		install(new FactoryModuleBuilder().implement(IEglExecuter.class, EglExecuter.class).build(IEglExecuterFactory.class));

		install(new FactoryModuleBuilder().build(IMutationOperatorFactory.class));

		// no interface:
		// bind(TransformationGenerationOrchestrator.class).to(TransformationGenerationOrchestrator.class);

		bind(ILogger.class).to(Logger.class);
		bind(IResourceReader.class).to(ResourceReader.class);
		bind(IPrettyPrinter.class).to(PrettyPrinter.class);
		bind(IRandomizer.class).to(Randomizer.class);
		bind(IParallelExecuter.class).to(ParallelExecuter.class);
		bind(IModelFactory.class).to(EmfModelFactory.class);
		
		bind(IPopulation.class).to(Population.class);
		bind(IIndividual.class).to(Individual.class);
		bind(IProgram.class).to(Program.class);
		bind(IFitnessEvaluator.class).to(FitnessEvaluator.class);
		bind(IMutationExecuter.class).to(MutationExecuter.class);
		bind(IReporter.class).to(DatabaseReporter.class);
	}

	public static Injector getInjector() {
		if (injector == null) {
			injector = Guice.createInjector(new InjectionConfiguration());
		}
		return injector;
	}
}
