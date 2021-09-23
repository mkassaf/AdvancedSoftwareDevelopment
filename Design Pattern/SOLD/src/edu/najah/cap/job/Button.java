package edu.najah.cap.job;

public class Button {
	
	private Runner runner;
	
	Button(Runner runner){
		this.runner = runner;
	}
	
	public void click() {
		runner.run();
		
	}

}
