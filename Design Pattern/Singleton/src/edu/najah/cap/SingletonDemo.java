package edu.najah.cap;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

public class SingletonDemo {

	public static void main(String[] args) {
		
		//SingleObject insatnce1 =new SingleObject(); // This is not allowed because the SingleObject constructor is private
		SingleObject instance1 = SingleObject.getInstance();
		SingleObject instance2 = SingleObject.getInstance();
		instance1.id = 5;
		//the id is not state but because insatnce2 == insatnce1 and both represent same object 
		// Anyone updates id, the other will be affected. BOTH are point to same and one object
		System.out.println("id = " + instance2.id); //5 
		System.out.println("id = " + instance1.id); //5 
		System.out.println("check is equal : " + (instance1 == instance2)); //true
		
		
		// will create a new object and return a TELNET connection
		Connection telnetConnection = Connection.getInstance(Connection.TELNET); 
		// will return the current TELNET connection 
		Connection telnetConnection2 = Connection.getInstance(Connection.TELNET); 
		// will create a new object
		Connection sshConnection = Connection.getInstance(Connection.SSH); 
		
		// will create a new object
		Connection httpConnection = Connection.getInstance(Connection.HTTP); 
		
		// will throw an expectation telling the user he can’t create more than 3 connections!
		Connection scpConnection = Connection.getInstance(Connection.SCP); 
		
		// will return the current SSH connection
		Connection sshConnection2 = Connection.getInstance(Connection.HTTP); 

		// will delete the current TELNET connection and return true, 
		//and it will return false if there is no TELNET connection at all. 
		boolean isReleased = Connection.release(Connection.TELNET);

		// will create a new FTP connection and return it.
		Connection ftpConnection = Connection.getInstance(Connection.FTP); 

		// return a list of current connections as Connection objects
		ArrayList<String> currentConnections = Connection.getCurrentConnections(); 
		
		//Will print a message says: Sending [My message] vi FTP protocol. 
		ftpConnection.send("My message");
		//Will print a message says: Sending [My message] vi SSH protocol. 
		sshConnection.send("My message");
		

	}

}
