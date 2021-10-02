package edu.najah.it.cap.demo;

import edu.najah.it.cap.demo.impl.File;
import edu.najah.it.cap.demo.impl.Folder;
import edu.najah.it.cap.demo.intf.FileSystem;
import edu.najah.it.cap.demo.intf.FolderFileSystem;

public class FileSystemDemo {
	
	public static void main(String[] args) {
		FolderFileSystem folder = new Folder();//1
		FolderFileSystem subFolder1 = new Folder();
		FolderFileSystem subFolder2 = new Folder();
		FolderFileSystem subSubFolder = new Folder();
		
		folder.addFileSystem(new File(5));// add 5, total 6
		folder.addFileSystem(new File(2));//add 2, total 8
		
		subFolder1.addFileSystem(new File(4));
		subFolder1.addFileSystem(new File(3));
		subFolder1.addFileSystem(new File(1));
		
		folder.addFileSystem(subFolder1);// 1 + add 8, total 17
		
		subSubFolder.addFileSystem(new File(8));
		subSubFolder.addFileSystem(new File(2));
		subFolder2.addFileSystem(new File(1));
		
		subFolder2.addFileSystem(subSubFolder);
		
		folder.addFileSystem(subFolder2); // 2+ add 11, total 30
		
		printSize(folder);//30
		
		
	}

	private static void printSize(FileSystem folder) {
		System.out.println(folder.getSize());//30
	}

}
