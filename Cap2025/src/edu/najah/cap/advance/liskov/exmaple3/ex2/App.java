package edu.najah.cap.advance.liskov.exmaple3.ex2;

public class App {

    public static void main(String[] args) {
        Bird bird = new Penguin("A", "Black", 1);

        System.out.println(bird);

        //bird.fly();
    }
}
