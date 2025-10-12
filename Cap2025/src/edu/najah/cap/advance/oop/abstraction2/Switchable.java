package edu.najah.cap.advance.oop.abstraction2;

public interface Switchable {

    public default void doAnything() {
        System.out.println("doAnything");
    }
    public void trunOn();
    public void trunOff();
}
