package edu.najah.cap.advance.oop.example2;

public class App {

    public static void main(String[] args) {

        Mobile mobile = new Mobile("", "");//instance from class Moble, we created an object from Mobile class

        System.out.println(mobile.getColor());
        System.out.println(mobile.getModel());

        mobile.setModel("");//this is an invalid

        System.out.println(mobile.getColor());
        System.out.println(mobile.getModel());

        mobile.setModel("ABC123");
        mobile.setColor("Red");

        System.out.println(mobile.getColor());
        System.out.println(mobile.getModel());

        Mobile iphone = new Iphone("", "");

        iphone.setColor("Green");
        iphone.setModel("BB123");
        System.out.println(iphone.getColor());
        System.out.println(iphone.getModel());
    }
}
