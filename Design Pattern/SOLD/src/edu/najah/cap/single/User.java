package edu.najah.cap.single;

public class User {
	public int id;
	public String name;
	
	
	NorthwindEntities entities;
	
	
	User(){
		entities.find();
	}
	

}
