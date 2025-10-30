package edu.najah.cap.advance.liskov.exmaple3.ext3;

public class App {
    public static void main(String[] args) {
        Bird bird = new Penguin();

        bird.fly();
    }
}
