package edu.najah.cap.exception;

public class ProcessBusyExecption extends DataProcessException {

	public ProcessBusyExecption(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String getMessage() {
		
		return "[Process is busy Execption :: ] " + super.getMessage();
	}

}
