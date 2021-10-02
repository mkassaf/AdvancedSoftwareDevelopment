package edu.najah.it.cap.demo.impl;

import edu.najah.it.cap.demo.intf.FileSystem;

public class File implements FileSystem {

	private int size;
	
	public File(int size){
		this.size = size;
	}
	
	@Override
	public int getSize() {
		return size;
	}

}
