package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol1;

public class RubberDuck extends Duck {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Squeeze Squeeze");
    }

    @Override
    public void display() {
        System.out.println("I am RubberDuck");
    }
}
