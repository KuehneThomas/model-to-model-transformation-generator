package common.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import common.util.interfaces.IStringResource;

public class StringResource implements IStringResource {
	private File file;
	private String content;

	public StringResource(File file) {
		this.file = file;
	}
	
	public StringResource(String content) {
		this.content = content;
	}
	
	@Override
	public File getFile() {
		return file;
	}

	@Override
	public String getContent() throws IOException {
		if (content == null) {
			FileReader reader = new FileReader(file);
			try {
				char[] chars = new char[(int) file.length()];
				reader.read(chars);
				content = new String(chars);
			} finally {
				reader.close();
			}
		}
		return content;
	}
}
