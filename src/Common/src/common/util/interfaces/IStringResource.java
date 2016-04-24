package common.util.interfaces;

import java.io.File;
import java.io.IOException;

public interface IStringResource {
	File getFile();
	String getContent() throws IOException;
}
