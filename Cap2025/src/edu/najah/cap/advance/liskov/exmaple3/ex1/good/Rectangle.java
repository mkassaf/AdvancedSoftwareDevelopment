package edu.najah.cap.advance.liskov.exmaple3.ex1.good;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }
}
