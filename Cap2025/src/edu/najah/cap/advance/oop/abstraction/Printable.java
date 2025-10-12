package edu.najah.cap.advance.oop.abstraction;

public interface Printable {
    public default void print() {
        System.out.println("Printable");
    }
}
