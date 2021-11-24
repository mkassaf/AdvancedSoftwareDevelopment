package edu.najah.cap.exception;

public class DataProcessException extends Exception {

	public DataProcessException(String string) {
		super(string);
	}
	
	@Override
	public String getMessage() {
		
		return "[DataProcessException :: ] " + super.getMessage();
	}

}
