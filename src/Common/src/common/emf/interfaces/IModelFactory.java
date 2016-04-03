package common.emf.interfaces;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import etlMetaModel.EtlModule;

public interface IModelFactory {
	EtlModule loadEtlModelByURI(String name, URI model, URI metamodel, boolean readOnLoad, boolean storeOnDisposal) throws Exception;
	
	EtlModule cloneEtlModel(EtlModule etlModule);
	
	IModel convertEtlModelToModel(EtlModule etlModule) throws Exception;
	
	IModel loadModelByURI(String name, URI model, URI metamodel, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException, Exception;

	IModel cloneModel(IModel model) throws EolModelLoadingException, Exception;

	void lockGlobalModelRegistry();

	void unlockGlobalModelRegistry();

	void reinitializeCache(IModel model) throws Exception;
}
