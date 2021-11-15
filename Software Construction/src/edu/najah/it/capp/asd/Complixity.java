package edu.najah.it.capp.asd;

public class Complixity {
	
	public int data;
	
	
	int analyzData() {
		if(data == 0) {
			return -1;
		}
		return 1;
	}
	void changeData(int input) {
		if(input == 0) {
			data = 0;
		}
		data = 1; 
	}

}
