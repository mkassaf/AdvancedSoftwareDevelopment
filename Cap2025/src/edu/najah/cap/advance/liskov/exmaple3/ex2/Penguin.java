package edu.najah.cap.advance.liskov.exmaple3.ex2;

public class Penguin extends Bird {
    private int length;

    public Penguin(String name, String color, int length) {
        super(name, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
