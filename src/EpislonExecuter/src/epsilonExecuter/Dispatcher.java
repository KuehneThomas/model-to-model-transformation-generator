package epsilonExecuter;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import common.emf.EmfModelFactory;
import common.emf.interfaces.IModelFactory;
import common.util.PrettyPrinter;
import common.util.ResourceReader;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IResourceReader;
import epsilonExecuter.executers.eol.EolExecuter;
import epsilonExecuter.executers.eol.interfaces.IEolExecuter;
import epsilonExecuter.executers.eol.interfaces.IEolExecuterFactory;
import epsilonExecuter.executers.etl.EtlExecuter;
import epsilonExecuter.executers.etl.interfaces.IEtlExecuter;
import epsilonExecuter.executers.etl.interfaces.IEtlExecuterFactory;
import epsilonExecuter.executers.ewl.EwlExecuter;
import epsilonExecuter.executers.ewl.interfaces.IEwlExecuter;
import epsilonExecuter.executers.ewl.interfaces.IEwlExecuterFactory;

public class Dispatcher extends AbstractModule {

	@Override
	protected void configure() {

		install(new FactoryModuleBuilder().implement(IEwlExecuter.class, EwlExecuter.class).build(IEwlExecuterFactory.class));
		install(new FactoryModuleBuilder().implement(IEolExecuter.class, EolExecuter.class).build(IEolExecuterFactory.class));
		install(new FactoryModuleBuilder().implement(IEtlExecuter.class, EtlExecuter.class).build(IEtlExecuterFactory.class));

		// TODO add logger
		// bind(TransactionLog.class).to(DatabaseTransactionLog.class);
		bind(IResourceReader.class).to(ResourceReader.class);
		bind(IPrettyPrinter.class).to(PrettyPrinter.class);
		bind(IModelFactory.class).to(EmfModelFactory.class);
	}

	public static void main(String[] args) throws Exception {
		List<String> testList = new ArrayList<String>();
		testList.add("bla");
		
		testList.forEach(s -> {System.out.println(s);});
		
		
//		Injector injector = Guice.createInjector(new Dispatcher());
//
//		IEmfModelFactory emfModelFactory = injector.getInstance(EmfModelFactory.class);
//		String transformationModelFile = "../ExampleModels/etl/001_umlclass2relational_generated.model";
//		String transformationMetaModelFile = "../MetaModels.Etl/etlMetaModel.ecore";
//		EmfModel emfModel = emfModelFactory.createEmfModel("Model", transformationModelFile, transformationMetaModelFile, true, true);
//		
//		File templateRealLocation = new File("../Transformations/etl2text/etl2text.egl");
//		
//		new EglExecuter().execute(emfModel);
		
		// if (args.length == 0) {
		// new EwlExecuter("../ExampleModels/etl/demo.model",
		// "../MetaModels/etl/etlMetaModel.ecore",
		// "../Transformations/etl2etl/addEmptyRule.ewl").execute();
		//
		// // new EtlExecuter("../ExampleModels/umlClass/001_umlClass.model",
		// // "../MetaModels/umlClass/umlClassMetaModel.ecore",
		// // "../ExampleModels/relational/001_relational_generated.model",
		// // "../MetaModels/relational/relationalMetaModel.ecore",
		// //
		// "../Transformations/umlclass2relational/001_umlclass2relational.etl").execute();
		// } else {
		//
		// if (args[0] == "ETL") {
		// new EtlExecuter(args[1], args[2], args[3], args[4],
		// args[5]).execute();
		// } else if (args[0] == "EWL") {
		// new EwlExecuter(args[1], args[2], args[3]).execute();
		// } else if (args[0] == "EOL") {
		// new EolExecuter(args[1], args[2], args[3]);
		// } else {
		// throw new Exception(args[0]);
		// }
		// }
	}

}
