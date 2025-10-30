package edu.najah.cap.advance.liskov.exmaple3.ex2;

public class Bird {
    private String name;
    private String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color;
    }
}
