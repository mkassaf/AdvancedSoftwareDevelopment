package com.client;

import edu.najah.it.capp.asd.constants.ConnectionType;
import edu.najah.it.capp.asd.impl.ProtocolFactory;
import edu.najah.it.capp.asd.intf.Protocol;

public class Factory2 extends ProtocolFactory{
	
	public static Protocol createProcol(String connectionType) {
		Protocol instance = ProtocolFactory.createProcol(connectionType);
		if(instance == null) {
			if(connectionType.equals("SSL")) {
				//log 
				//return new SSL
			}
		}
		
		return null;
	}

}
