package edu.najah.cap;

public class SingleObject {
	
	private static SingleObject instance = null; 
	
	public int id = 0;
	private SingleObject() {
		
	}
	public static SingleObject getInstance() {
		if(instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}

}
