package edu.najah.cap.advance.liskov.exmaple3.ex2;

public class Owl extends Bird implements Flyable {
    private int age;

    public Owl(String name, String color, int age) {
        super(name, color);
    }

    public int getAge() {
        return age;
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
