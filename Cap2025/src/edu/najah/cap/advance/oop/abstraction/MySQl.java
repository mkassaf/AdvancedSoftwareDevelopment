package edu.najah.cap.advance.oop.abstraction;

public class MySQl implements Database , Printable{

    @Override
    public void insert(String data) {
        System.out.println("MySQl inset");
    }

    @Override
    public String get() {
        System.out.println("MySQl get");
        return "MySQl get";
    }

    @Override
    public void print() {
        System.out.println("MySQl print");
    }
}
