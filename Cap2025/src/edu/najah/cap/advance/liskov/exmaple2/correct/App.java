package edu.najah.cap.advance.liskov.exmaple2.correct;

public class App {

    public static void main(String[] args) {
        Flybale bird = new Hawk("My XYZ");
        bird.fly();

        Bird bird2 = new Hawk("My XYZ");
        bird2.setName("DASDASDASDASD");

        System.out.println(bird2.getName());
    }
}
