package edu.najah.cap.file;

import java.io.File;

public abstract class FileReader {
	
	
	public String filepath;

	public String getReadFileFromDisk(String filePath) {
		File file = new File(filePath);
		return "";
	}
	
	abstract String getContent(String filePath);

}
