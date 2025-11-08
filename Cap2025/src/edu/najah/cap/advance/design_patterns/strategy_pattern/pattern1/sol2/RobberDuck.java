package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.sol2;

public class RobberDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("RobberDuck .. ");
    }

    @Override
    public void quack() {
        System.out.println("Other sound .. ");
    }
}
