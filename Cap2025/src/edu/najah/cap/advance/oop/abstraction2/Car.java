package edu.najah.cap.advance.oop.abstraction2;

public class Car implements Printable {
    public void trunOn() {
        System.out.println("trunOn car");
    }

    public void trunOff() {
        System.out.println("trunOff car");
    }

    @Override
    public void print() {
        System.out.println("print car info");
    }
}
