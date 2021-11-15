package edu.najah.cap;

import java.util.*;
import java.util.ArrayList;

public class Connection {

	// definition all connection as static instance
	private static Connection httpConnection = null;
	private static Connection sshConnection = null;
	private static Connection telnetConnection = null;
	private static Connection scpConnection = null;
	private static Connection ftpConnection = null;

	// definition all protocols as static variable
	public static final String HTTP = "Http";
	public static final String SSH = "Ssh";
	public static final String TELNET = "Telnet";
	public static final String SCP = "Scp";
	public static final String FTP = "Ftp";
	private static final int MAX_NUMBER_OF_CONNECTIONS = 4;

	// definition variable to store #connections that created
	public static int numberConnections = 0;
	// definition list of string to store all connection that created
	public static List<String> allConnections = new ArrayList<String>();

	// constructor
	private Connection() {
	}

	// function to create new connection if does not exist and #connections still
	// less than 3
	public static Connection CreateConnection(Connection connection, String protocol) {

		if (connection == null) {
			if (Connection.numberConnections < MAX_NUMBER_OF_CONNECTIONS) {
				connection = new Connection();
				Connection.allConnections.add(protocol);
				System.out.println("Create New Connection");
				Connection.numberConnections++;

			} else {
				System.out.println("Sorry, You Can't Create More Than " + MAX_NUMBER_OF_CONNECTIONS +" Conncetions!");
			}

		} else
			System.out.println("This Connection Already Exists");
		return connection;
	}

	// function to remove connection according to protocol which in the parameter
	public static boolean releaseByParameter(String protocol) {

		if (protocol.equalsIgnoreCase(Connection.HTTP)) {
			if (httpConnection != null) {
				httpConnection = null;
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		} else if (protocol.equalsIgnoreCase(Connection.SSH)) {
			if (sshConnection != null) {
				sshConnection = null;
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		} else if (protocol.equalsIgnoreCase(Connection.TELNET)) {
			if (telnetConnection != null) {
				telnetConnection = null;
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		} else if (protocol.equalsIgnoreCase(Connection.SCP)) {
			if (scpConnection != null) {
				scpConnection = null;
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		} else if (protocol.equalsIgnoreCase(Connection.FTP)) {
			if (ftpConnection != null) {
				ftpConnection = null;
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		}
		removeProtcole(protocol);

		return false;
	}

	private static void removeProtcole(String protocol) {
		
		if(Connection.allConnections.contains(protocol)){
			Connection.numberConnections--;
			Connection.allConnections.remove(protocol);
		}
		
	}

	// function to get connection as the protocol which in the parameter
	public static Connection getInstance(String protocol) {

		if (protocol.equalsIgnoreCase(Connection.HTTP)) {
			return httpConnection = Connection.CreateConnection(httpConnection, protocol);

		} else if (protocol.equalsIgnoreCase(Connection.SSH)) {
			return sshConnection = Connection.CreateConnection(sshConnection, protocol);

		} else if (protocol.equalsIgnoreCase(Connection.TELNET)) {
			return telnetConnection = Connection.CreateConnection(telnetConnection, protocol);

		} else if (protocol.equalsIgnoreCase(Connection.SCP)) {
			return scpConnection = Connection.CreateConnection(scpConnection, protocol);

		} else if (protocol.equalsIgnoreCase(Connection.FTP)) {
			return ftpConnection = Connection.CreateConnection(ftpConnection, protocol);

		}

		return null;
	}

	// public to return all connection has been created as a list
	public static List<String> getCurrentConnections() {
		return Connection.allConnections;

	}
	
	// function to send message to the user as the object which call the function
	public void send(String message) {

		if (this == httpConnection) {
			System.out.println("Sending" + message + " Via HTTP Protocaol");

		} else if (this == sshConnection) {
			System.out.println("Sending" + message + " Via SSH Protocaol");

		} else if (this == telnetConnection) {
			System.out.println("Sending" + message + " Via TELNET Protocaol");

		} else if (this == scpConnection) {
			System.out.println("Sending" + message + " Via SCP Protocaol");

		} else if (this == ftpConnection) {
			System.out.println("Sending" + message + " Via FTP Protocaol");

		}
	}

	/// POUNS
	// function to remove connection according to the object call the function
	public boolean releaseByObject() {

		if (this == httpConnection) {
			if (httpConnection != null) {
				httpConnection = null;
				Connection.numberConnections--;
				Connection.allConnections.remove(Connection.HTTP);
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		} else if (this == sshConnection) {
			if (sshConnection != null) {
				sshConnection = null;
				Connection.numberConnections--;
				Connection.allConnections.remove(Connection.SSH);
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		} else if (this == telnetConnection) {
			if (telnetConnection != null) {
				telnetConnection = null;
				Connection.numberConnections--;
				Connection.allConnections.remove(Connection.TELNET);
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		} else if (this == scpConnection) {
			if (scpConnection != null) {
				scpConnection = null;
				removeProtcole(Connection.SCP);
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		}/* else if (this == ftpConnection) {
			if (ftpConnection != null) {
				ftpConnection = null;
				Connection.numberConnections--;
				Connection.allConnections.remove(Connection.FTP);
				System.out.println("This Connection Has Been Deleted");
				return true;
			} else {
				System.out.println("This Connection Does not Exist");
				return false;
			}

		}*/

		return false;
	}
}
