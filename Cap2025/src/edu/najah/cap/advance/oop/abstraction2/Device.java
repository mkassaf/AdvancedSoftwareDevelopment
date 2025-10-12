package edu.najah.cap.advance.oop.abstraction2;

public class Device implements Printable, Runable {
    public void trunOn() {
        System.out.println("trunOn");
    }

    public final void trunOff() {
        System.out.println("trunOff");
    }

    @Override
    public void print() {
        System.out.println("Device Info");
    }

    @Override
    public void run() {
        System.out.println("Device Run");
    }
}
