package edu.najah.it.capp.asd.impl;

import edu.najah.cap.legcy.protocol.TFTPProtocol;
import edu.najah.it.capp.asd.intf.Protocol;

public class TFTPAdpter implements Protocol {

	private TFTPProtocol tftpLegcy;
	private static Protocol instance;
	
	
	private TFTPAdpter() {
		System.out.println("Creating a new TFTPAdpter insatnce");
		tftpLegcy = TFTPProtocol.getTFTPInstance();
	}
	
	protected static Protocol getInsatnce() {
		if(instance == null) {
			instance = new TFTPAdpter();
		}
		return instance;
	}
	
	@Override
	public boolean release() {
		if(tftpLegcy != null) {
			tftpLegcy.releaseTFTP();
		}
		instance = null;
		return false;
	}

	@Override
	public void send(String message) {
		if(tftpLegcy != null) {
			tftpLegcy.sendMessage(message);
		}
	}

}
