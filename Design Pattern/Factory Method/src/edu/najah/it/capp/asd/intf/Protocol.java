package edu.najah.it.capp.asd.intf;

import edu.najah.it.capp.exception.ProtocolException;

public interface Protocol {
	
	//Connection is already released
	//Unable to release the connection 
	//connection is use 
	public boolean release() throws ProtocolException;
	
	
	//No connection
	//timeout connection
	//System busy exception
	public void send(String message) throws ProtocolException;

}
