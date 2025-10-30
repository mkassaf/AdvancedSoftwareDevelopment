package edu.najah.cap.advance.liskov.exmaple3.ex1;

public class App {
    public static void main(String[] args) {
        var shape = new Square();
        printArea(shape);
    }

    public static void printArea(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setLength(10);
        if (rectangle.getArea() <= 50) {
            //logic
            System.out.println("Area is lower than 50");
        }
        System.out.println("Area: " + rectangle.getArea());
    }
}
