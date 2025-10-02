package edu.najah.cap.advance.example1;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1 , "assaf", 20);
        Student student2 = new Student(1 , "assaf", 20);

        student1.print();
        student2.print();

        System.out.println("is == " + (student1.hashCode() == student2.hashCode()));//true or false and why?

        System.out.println("is equals " + (student1.equals(student2)));//true
        System.out.println("is equals " + (student1.equals("Hello")));//false

        String message = "Hi";//we create an object and then we put "Hi" in it
        message += " Ahmad";// we create a new object abd we put "Hi Ahmad";
        message += ", how are you?";// immutable -> we do not modify the value in memory
        for (int i = 0; i < 10; i++) {
            message = message + i;
            message = message.concat(String.valueOf(i));
        }
        System.out.println(message);

        StringBuffer  sb = new StringBuffer();
        for (int i = 0; i < 20; i++) {
            sb.append(i);
        }
        String finalString = sb.toString();
        System.out.println(sb.toString());

    }
}
