package edu.najah.cap;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread("M1");

		MyThread t2 = new MyThread("M2");
		

		MyThread t3 = new MyThread("M3");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
	public static void handle(String message) {
		System.out.println(Thread.currentThread().getId() + " :: Handling the message :: " + message );
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getId() + " :: Finish handling the message :: " + message );

	}

}
