package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.sol2;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void quack() {
        System.out.println("quack quack quack");
    }
}
