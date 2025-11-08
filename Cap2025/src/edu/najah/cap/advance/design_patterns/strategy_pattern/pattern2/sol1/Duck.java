package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol1;

public abstract class Duck {
    public void swim() {
        System.out.println("I can swim");
    }

    public void fly() {
        System.out.println("Logic from 20 lines of code to fly");
    }

    public void quack() {
        System.out.println("quack quack");
    }

    public abstract void display();

}
