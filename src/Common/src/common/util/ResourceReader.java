package common.util;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

import javax.inject.Inject;
import javax.inject.Singleton;

import common.util.interfaces.ILogger;
import common.util.interfaces.IResourceReader;
import common.util.interfaces.IStringResource;

@Singleton
public class ResourceReader implements IResourceReader {
	private final ILogger logger;

	@Inject
	public ResourceReader(ILogger logger) {
		this.logger = logger.initialize(ResourceReader.class);
	}

	@Override
	public File getFile(String fileName) throws URISyntaxException {
		logger.LogTrace("getFile", fileName);
		URI uri = new File(fileName).toURI();
		return new File(uri);
	}

	@Override
	public IStringResource getFileAsStringResource(String fileName) throws URISyntaxException {
		return new StringResource(getFile(fileName));
	}

	@Override
	public IStringResource getJarResourceAsStringResource(String resourceName) {
		logger.LogTrace("getJarResourceAsStringResource", resourceName);

		ClassLoader resourceContainer = ClassLoader.getSystemClassLoader();
		Scanner scanner = new Scanner(resourceContainer.getResourceAsStream(resourceName), "UTF-8");
		String content = scanner.useDelimiter("\\A").next();
		scanner.close();

		return new StringResource(content);
	}

	@Override
	public URI getJarResourceAsUri(String resourceName) throws URISyntaxException {
		logger.LogTrace("getJarResourceAsUri", resourceName);
		ClassLoader resourceContainer = ClassLoader.getSystemClassLoader();
		URI resource = resourceContainer.getResource(resourceName).toURI();
		return resource;
	}

	protected URI replaceBinWithSrcInResourcePath(URI uri) throws URISyntaxException {
		if (uri.toString().indexOf("bin") > -1) {
			return new URI(uri.toString().replaceAll("bin", "src"));
		}
		return uri;
	}
}
