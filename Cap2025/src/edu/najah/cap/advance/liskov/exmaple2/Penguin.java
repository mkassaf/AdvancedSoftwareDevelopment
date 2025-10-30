package edu.najah.cap.advance.liskov.exmaple2;

public class Penguin extends Bird {

    Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        throw  new UnsupportedOperationException("I can't fly");
    }
}
