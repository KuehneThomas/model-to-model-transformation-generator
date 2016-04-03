package common.util.interfaces;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public interface IResourceReader {
	File getFile(String fileName) throws URISyntaxException;

	IStringResource getFileAsStringResource(String fileName) throws URISyntaxException;

	IStringResource getJarResourceAsStringResource(String resourceName);

	URI getJarResourceAsUri(String string) throws URISyntaxException;
}
