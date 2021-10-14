package edu.najah.it.capp.asd.impl;

import edu.najah.it.capp.asd.intf.Protocol;

public class Scp implements Protocol {

private static Protocol instance;
	
	
	private Scp() {
		System.out.println("Creating a new SCP insatnce");
	}
	
	protected static Protocol getInsatnce() {
		if(instance == null) {
			instance = new Scp();
		}
		return instance;
	}
	@Override
	public boolean release() {
		instance = null;
		return true;
	}

	@Override
	public void send(String message) {
		System.out.println("Sending message from SCP :: " + message);

	}

}
