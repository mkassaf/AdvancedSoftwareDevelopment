package edu.najah.cap.advance.liskov.exmaple3.ext3;

public interface Bird {

    default void fly() {
        System.out.println("Bird default fly");
    }
}
