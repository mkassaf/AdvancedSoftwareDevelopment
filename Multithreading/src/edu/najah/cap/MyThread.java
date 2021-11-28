package edu.najah.cap;

public class MyThread extends Thread {
	
	private static int numberOfProccessed = 0;
	private String message;
	
	public MyThread(String message) {
		this.message = message;
	}
	@Override
    public void run() {
		System.out.println(Thread.currentThread().getId() + " :: Handling the message :: " + message );
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		numberOfProccessed++;
		System.out.println(Thread.currentThread().getId() + " :: Finish handling the message :: " + message );
		System.out.println("numberOfProccessed:: " + numberOfProccessed);
    }
	public static int getNumberOfProccessed() {
		return numberOfProccessed;
	}
	
	private static void setNumberOfProceesed() {
		
	}
}
