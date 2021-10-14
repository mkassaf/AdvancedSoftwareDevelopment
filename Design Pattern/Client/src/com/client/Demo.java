package com.client;

import edu.najah.it.capp.asd.constants.ConnectionType;
import edu.najah.it.capp.asd.impl.Ssh;
import edu.najah.it.capp.asd.intf.Protocol;
import edu.najah.it.capp.asd.service.Connection;

public class Demo {

	public static void main(String[] args) {
		
		
		Protocol mySSH = Connection.getInstance(ConnectionType.SSH);
		mySSH.send("Testing ssh from another project.");
		
	}

}
