package edu.najah.cap;

import edu.najah.cap.intf.Data;

public class PrototypeDemo {

	public static void main(String[] args) {
		Data data = new Data("Mustafa", "assaf");
		Data data2 = (Data) data.clone();
		data2.setSecondName("Assaf");
		System.out.println(data2.getFirtName() + " " + data2.getSecondName());
		System.out.println(data.getFirtName() + " " + data.getSecondName());

	}

}
