package edu.najah.cap.advance.liskov.incorrect;

public class App {
    public static void main(String[] args) {

        proccess(new Rectangle());
        proccess(new Square());
    }


    public static void proccess(Rectangle rectangle) {
        rectangle.setLength(5);
        rectangle.setWidth(10);
        System.out.println("Area :: " + rectangle.getArea());//50
    }
}
