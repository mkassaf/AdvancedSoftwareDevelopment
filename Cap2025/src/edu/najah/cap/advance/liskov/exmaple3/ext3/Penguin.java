package edu.najah.cap.advance.liskov.exmaple3.ext3;

public class Penguin implements Bird {
    private String name;
    private String color;

    public void fly() {
        throw  new UnsupportedOperationException("Not supported yet.");
    }
}
