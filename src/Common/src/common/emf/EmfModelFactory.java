package common.emf;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.AbstractEmfModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfModelResourceFactory;
import org.eclipse.epsilon.emc.emf.EmfModelResourceSet;
import org.eclipse.epsilon.eol.models.IModel;

import common.emf.interfaces.IModelFactory;
import common.util.interfaces.ILogger;
import common.util.interfaces.IPrettyPrinter;
import common.util.interfaces.IResourceReader;

import etlMetaModel.EtlMetaModelPackage;
import etlMetaModel.EtlModule;

@Singleton
public class EmfModelFactory implements IModelFactory {

	private final ILogger logger;
	protected IResourceReader fileReader;
	private IPrettyPrinter prettyPrinter;

	@Inject
	public EmfModelFactory(ILogger logger, IResourceReader fileReader, IPrettyPrinter prettyPrinter) {
		this.logger = logger.initialize(EmfModelFactory.class);
		this.fileReader = fileReader;
		this.prettyPrinter = prettyPrinter;
	}

	public EtlModule loadEtlModelByURI(String name, URI model, URI metamodel, boolean readOnLoad, boolean storeOnDisposal) throws Exception {
		// register meta model
		EtlMetaModelPackage.eINSTANCE.eClass();

		// register factory to allow loading XMI files
		final Map<String, Object> etfm = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		if (!etfm.containsKey("*")) {
			etfm.put("*", new XMIResourceFactoryImpl());
		}

		ResourceSet resourceSet = new EmfModelResourceSet(); // new ResourceSetImpl()
		Resource resource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(model.toString()), true);

		EtlModule etlModule = (EtlModule) resource.getContents().get(0);
		return etlModule;
	}

	public EtlModule cloneEtlModel(EtlModule etlModule) {

		Resource resource = etlModule.eResource();

		lockGlobalModelRegistry(); // TODO verify
		try {
			ResourceSet resourceSetCloned = new EmfModelResourceSet(); // new ResourceSetImpl()
			Resource resourceCloned = resourceSetCloned.createResource(org.eclipse.emf.common.util.URI.createURI(resource.getURI().toString() + resourceSetCloned.hashCode()));

			resourceCloned.getContents().add(EcoreUtil.copy(resource.getContents().get(0)));

			EtlModule etlModuleCloned = (EtlModule) resourceCloned.getContents().get(0);
			return etlModuleCloned;
		} finally {
			unlockGlobalModelRegistry();// TODO verify
		}
	}

	public IModel convertEtlModelToModel(EtlModule etlModule) throws Exception {

		lockGlobalModelRegistry();
		try {
			Resource resource = etlModule.eResource();

			EmfModel emfModelCloned = new EmfModel();
			StringProperties properties = new StringProperties();
			properties.put(EmfModel.PROPERTY_NAME, "Model");
			properties.put(EmfModel.PROPERTY_METAMODEL_URI, EtlMetaModelPackage.eNS_URI);
			properties.put(EmfModel.PROPERTY_MODEL_URI, resource.getURI().toString() + emfModelCloned.hashCode());
			properties.put(EmfModel.PROPERTY_READONLOAD, false + "");
			properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, false + "");
			emfModelCloned.load(properties, null);

			Resource resourceCloned = emfModelCloned.getResource();

			if (resource.getContents().size() > 0) {
				// transfer only the root element, otherwise there will be
				// duplicates when transferring more than this one:
				// usually first element is root, then there are other, added
				// elements which are referred by the root element graph.
				// if the other elements are also copied they do not stay the
				// same even when using EcoreUtil.copyAll.
				// THIS MAY NOT WORK IN EVERY CASE
				resourceCloned.getContents().add(resource.getContents().get(0)); // EcoreUtil.copy() removed!
			}

			reinitializeCache(emfModelCloned);

			return emfModelCloned;
		} finally {
			unlockGlobalModelRegistry();
		}
	}

	public IModel loadModelByURI(String name, URI model, URI metamodel, boolean readOnLoad, boolean storeOnDisposal) throws Exception {
		logger.LogTrace("createEmfModelByURI", "{} with storeOnDisposal={}", name, storeOnDisposal);

		lockGlobalModelRegistry();
		try {
			EPackage metaModelPackage = registerMetaModel(metamodel);

			EmfModel emfModel = new EmfModel();
			StringProperties properties = new StringProperties();
			properties.put(EmfModel.PROPERTY_NAME, name);
			properties.put(EmfModel.PROPERTY_METAMODEL_URI, metaModelPackage.getNsURI());
			properties.put(EmfModel.PROPERTY_MODEL_URI, model.toString());
			properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
			properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
			emfModel.load(properties, null);

			reinitializeCache(emfModel);

			return emfModel;

		} finally {
			unlockGlobalModelRegistry();
		}
	}

	private EPackage registerMetaModel(URI metamodel) throws Exception {
		if (metamodel.toString().endsWith("etlMetaModel.ecore")) {
			// use generated factory in order to use generated java classes instead of only the Dynamic EMF classes (reflection only!)
			EtlMetaModelPackage.eINSTANCE.eClass();
			return EtlMetaModelPackage.eINSTANCE;
		} else {

			// register factory to allow loading XMI files
			final Map<String, Object> etfm = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
			if (!etfm.containsKey("*")) {
				etfm.put("*", new XMIResourceFactoryImpl());
			}

			// create new resource set for the meta model
			// ResourceSet resourceSet = new ResourceSetImpl();
			ResourceSet resourceSet = new EmfModelResourceSet();

			// set global package registry
			resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);

			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", EmfModelResourceFactory.getInstance());

			// load meta model from file
			Resource r = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(metamodel.toString()), true);
			EObject eObjectRoot = r.getContents().get(0);
			if (!(eObjectRoot instanceof EPackage)) {
				throw new Exception("!(eObject instanceof EPackage)");
			}
			EPackage ePackage = (EPackage) eObjectRoot;

			// register meta model in global package registry
			resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);

			return ePackage;
		}
	}

	public IModel cloneModel(IModel model) throws Exception {

		if (!(model instanceof EmfModel)) {
			throw new Exception("Currently only EmfModels are supported");
		}
		EmfModel emfModel = (EmfModel) model;

		if (((EmfModel) model).getMetamodelUris().size() == 0) {
			throw new Exception("Currently only PROPERTY_METAMODEL_URIs are supported");
		}

		lockGlobalModelRegistry();
		try {
			EmfModel emfModelCloned = new EmfModel();
			StringProperties properties = new StringProperties();
			properties.put(EmfModel.PROPERTY_NAME, model.getName());
			properties.put(EmfModel.PROPERTY_METAMODEL_URI, emfModel.getMetamodelUris().get(0).toString());
			
			String modelFileUri = emfModel.getModelFileUri().toString();
			String hashCode = new Integer(emfModelCloned.hashCode()).toString();
			properties.put(EmfModel.PROPERTY_MODEL_URI, ( modelFileUri.length() > hashCode.length() ? modelFileUri.substring(0,modelFileUri.length() - hashCode.length()) : modelFileUri ) + hashCode);
			properties.put(EmfModel.PROPERTY_READONLOAD, false + "");
			properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, false + "");
			emfModelCloned.load(properties, null);

			Resource resource = ((AbstractEmfModel) model).getResource();
			if (resource == null) {
				throw new Exception("Resource of given model is null");
			}
			Resource resourceCloned = emfModelCloned.getResource();

			if (resource.getContents().size() > 0) {
				// clone only the root element, otherwise there will be
				// duplicates when cloning more than this one:
				// usually first element is root, then there are other, added
				// elements which are referred by the root element graph.
				// if the other elements are also copied they do not stay the
				// same even when using EcoreUtil.copyAll.
				// THIS MAY NOT WORK IN EVERY CASE
				resourceCloned.getContents().add(EcoreUtil.copy(resource.getContents().get(0)));
			}

			reinitializeCache(emfModelCloned);

			// Checks:

			int emfModelAllContentsSize = emfModel.allContents().size();
			// int emfModelGetResourceGetContentsSize = emfModel.getResource().getContents().size();
			// int emfModelGetResourceGetAllContentsSize = emfModel.getResource().getAllContents() => tree iterator !?
			// int emfModelGetResourceGetResourceSetGetAllContentsSize = emfModel.getResource().getResourceSet().getAllContents() => tree iterator !?
			int emfModelGetResourceGetResourceSetGetResourcesSize = emfModel.getResource().getResourceSet().getResources().size();

			int emfModelClonedAllContentsSize = emfModelCloned.allContents().size();
			// int emfModelClonedGetResourceGetContentsSize = emfModelCloned.getResource().getContents().size();
			int emfModelClonedGetResourceGetResourceSetGetResourcesSize = emfModelCloned.getResource().getResourceSet().getResources().size();

			if (emfModelGetResourceGetResourceSetGetResourcesSize != emfModelClonedGetResourceGetResourceSetGetResourcesSize) {
				throw new Exception(String.format("Model clone failed (actual resourceSet size: %s, expected size: %s)", emfModelClonedGetResourceGetResourceSetGetResourcesSize, emfModelGetResourceGetResourceSetGetResourcesSize));
			}

			// this check makes no sense as long as only the root element is cloned (see comment above)
			// if (emfModelGetResourceGetContentsSize != emfModelClonedGetResourceGetContentsSize) {
			// logger.LogDebug("cloneModel", "Model:");
			// for (EObject eObject : resource.getContents()) {
			// logger.LogDebug("cloneModel", "\n" + prettyPrinter.ToStringRecursive(eObject));
			// }
			//
			// logger.LogDebug("cloneModel", "Cloned Objects:");
			// logger.LogDebug("cloneModel", "\n" + prettyPrinter.ToStringRecursive(resource.getContents().get(0)));
			//
			// logger.LogDebug("cloneModel", "Cloned Model:\n");
			// for (EObject eObject : resourceCloned.getContents()) {
			// logger.LogDebug("cloneModel", "\n" + prettyPrinter.ToStringRecursive(eObject));
			// }
			//
			// throw new Exception(String.format("Model clone failed (actual resource content size: %s, expected size: %s)", emfModelClonedGetResourceGetContentsSize, emfModelGetResourceGetContentsSize));
			// }

			if (emfModelAllContentsSize != emfModelClonedAllContentsSize) {
				logger.LogDebug("cloneModel", "Model:");
				for (EObject eObject : emfModel.allContents()) {
					logger.LogDebug("cloneModel", "\n" + prettyPrinter.ToStringRecursive(eObject));
				}

				logger.LogDebug("cloneModel", "Cloned Objects:");
				logger.LogDebug("cloneModel", "\n" + prettyPrinter.ToStringRecursive(resource.getContents().get(0)));

				logger.LogDebug("cloneModel", "Cloned Model:\n");
				for (EObject eObject : emfModelCloned.allContents()) {
					logger.LogDebug("cloneModel", "\n" + prettyPrinter.ToStringRecursive(eObject));
				}

				throw new Exception(String.format("Model clone failed (actual model content size: %s, expected size: %s)", emfModelClonedAllContentsSize, emfModelAllContentsSize));
			}

			if (emfModelCloned.getResource().getResourceSet().getPackageRegistry() == null) {
				throw new Exception();
			}

			return emfModelCloned;
		} finally {
			unlockGlobalModelRegistry();
		}
	}

	private void fillCache(IModel model) throws Exception {
		EmfModel emfModel = (EmfModel) model;
		// trigger caching to avoid concurrency issues
		emfModel.setCachingEnabled(true);
		for (EObject eObject : emfModel.allContents()) {
			emfModel.getAllOfType(eObject.eClass().getName());
		}
	}

	@Override
	public void reinitializeCache(IModel model) throws Exception {
		EmfModel emfModel = (EmfModel) model;

		lockGlobalModelRegistry();
		try {
			emfModel.clearCache();
			fillCache(emfModel);
		} finally {
			unlockGlobalModelRegistry();
		}
	}

	static final Lock globalModelCacheModificationLock = new ReentrantLock();

	@Override
	public void lockGlobalModelRegistry() {
		globalModelCacheModificationLock.lock();
	}

	@Override
	public void unlockGlobalModelRegistry() {
		globalModelCacheModificationLock.unlock();
	}
}
