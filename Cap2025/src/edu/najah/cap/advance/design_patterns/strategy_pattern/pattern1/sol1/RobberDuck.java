package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.sol1;

public class RobberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("RobberDuck .. ");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Other sound .. ");
    }
}
