package edu.najah.it.capp.asd.impl;

import edu.najah.it.capp.asd.constants.ConnectionType;
import edu.najah.it.capp.asd.intf.Protocol;

public class ProtocolFactory {
	
	public static Protocol createProcol(String connectionType) {
		
		if(connectionType.equals(ConnectionType.FTP)) {
			return Ftp.getInsatnce();//Create a new instance
		}
		if(connectionType.equals(ConnectionType.SSH)) {
			return Ssh.getInsatnce();
		}
		if(connectionType.equals(ConnectionType.TELNET)) {
			return Telnet.getInsatnce();
		}
		if(connectionType.equals(ConnectionType.SCP)) {
			return Scp.getInsatnce();
		}
		if(connectionType.equals(ConnectionType.TFTP)) {
			return TFTPAdpter.getInsatnce();
		}
		if(connectionType.equals(ConnectionType.TFTP)) {
			return TFTPAdpter.getInsatnce();
		}
		return null;
	}

}
