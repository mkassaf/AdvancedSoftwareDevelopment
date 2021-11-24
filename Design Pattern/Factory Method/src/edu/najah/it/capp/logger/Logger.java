package edu.najah.it.capp.logger;


public class Logger {
	private static Logger instance; 
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void logInfo(String message) {
		System.out.println(java.time.LocalDateTime.now()  + " [INFO] " + message);
	}
	
	public void logDebug(String message) {
		System.out.println(java.time.LocalDateTime.now()  + " [Debug] " + message);
	}
	public void logWarning(String message) {
		System.err.println(java.time.LocalDateTime.now()  + " [Warn] " + message);
	}
	public void logError(String message) {
		System.err.println(java.time.LocalDateTime.now()  + " [Error] " + message);
	}

}
