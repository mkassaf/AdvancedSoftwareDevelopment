package edu.najah.cap.exception;

public class Demo {

	public static void main(String[] args) {
		
		Example example = new Example();
		int numberOfTries = 5;
		
		while(numberOfTries > 0) {
			try {
				example.processData("");
				break;
			} catch (InvalidDataException e) {
				System.out.println("InvalidDataException:: " + e.getMessage());
				e.printStackTrace();
				break;
			} catch (ProcessBusyExecption e) {
				System.out.println("numberOfTries:: " + numberOfTries);
				System.out.println("ProcessBusyExecption:: " + e.getMessage());
				numberOfTries--;
				sleep(500L);
			} catch (DataProcessException e) {
				System.out.println("This is the data process message:: " + e.getMessage());
				e.printStackTrace();
				break;
			}
		}

	}

	private static void sleep(Long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
