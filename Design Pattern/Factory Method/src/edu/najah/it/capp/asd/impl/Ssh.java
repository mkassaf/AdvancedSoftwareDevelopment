package edu.najah.it.capp.asd.impl;

import edu.najah.it.capp.asd.intf.Protocol;

public class Ssh implements Protocol {

private static Protocol instance;
	
	
	private Ssh() {
		System.out.println("Creating a new SSH insatnce");
	}
	
	protected static Protocol getInsatnce() {
		if(instance == null) {
			instance = new Ssh();
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
		System.out.println("Sending message from SSH :: " + message);

	}

}
