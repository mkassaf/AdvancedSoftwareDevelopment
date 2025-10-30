package edu.najah.cap.advance.liskov.correct;

public class Rectangle implements Shape {
    private int length;
    private int width;

    public int getArea() {
        return length * width;
    }
}
