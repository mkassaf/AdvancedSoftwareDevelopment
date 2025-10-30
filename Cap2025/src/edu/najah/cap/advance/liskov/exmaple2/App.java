package edu.najah.cap.advance.liskov.exmaple2;

public class App {

    public static void main(String[] args) {
        Bird bird = new Penguin("My XYZ");
        bird.fly();
    }
}
