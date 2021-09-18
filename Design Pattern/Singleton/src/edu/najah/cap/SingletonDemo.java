package edu.najah.cap;

public class SingletonDemo {

	public static void main(String[] args) {
		
		//SingleObject insatnce1 =new SingleObject(); // This is not allowed because the SingleObject constructor is private
		SingleObject instance1 = SingleObject.getInstance();
		SingleObject instance2 = SingleObject.getInstance();
		instance1.id = 5;
		//the id is not state but because insatnce2 == insatnce1 and both represent same object 
		// Anyone updates id, the other will be affected. BOTH are point to same and one object
		System.out.println("id = " + instance2.id); //5 
		System.out.println("id = " + instance1.id); //5 
		System.out.println("check is equal : " + (instance1 == instance2)); //true

	}

}
