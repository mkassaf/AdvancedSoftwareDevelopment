package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.sol1;

public abstract class Duck {
    public void swim() {
        System.out.println("Logic to swim");
    }

    public void fly() {
        System.out.println("Logic to fly");
    }

    public void quack() {
        System.out.println("logic to quack");
    }

    public abstract void display();
}
