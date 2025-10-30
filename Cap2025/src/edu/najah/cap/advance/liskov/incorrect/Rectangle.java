package edu.najah.cap.advance.liskov.incorrect;

public class Rectangle {
    private int length;
    private int width;

    public int getArea() {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
