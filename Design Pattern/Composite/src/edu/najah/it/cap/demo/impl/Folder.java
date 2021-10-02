package edu.najah.it.cap.demo.impl;

import java.util.ArrayList;
import java.util.List;

import edu.najah.it.cap.demo.intf.FileSystem;
import edu.najah.it.cap.demo.intf.FolderFileSystem;

public class Folder implements FolderFileSystem {

	private List<FileSystem> fileSystemList = new ArrayList<FileSystem>();
	
	@Override
	public int getSize() {
		int totalSize = 1;//Defual size is 1KB;
		for (FileSystem fileSystem : fileSystemList) {
			totalSize += fileSystem.getSize();
		}
		return totalSize;
	}

	@Override
	public void addFileSystem(FileSystem fileSystem) {
		fileSystemList.add(fileSystem);
		
	}

	@Override
	public void removeFileSystem(FileSystem fileSystem) {
		fileSystemList.remove(fileSystem);
		
	}
	
	

}
