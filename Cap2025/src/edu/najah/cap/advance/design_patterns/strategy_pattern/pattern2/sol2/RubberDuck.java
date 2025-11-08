package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2;


import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2.behaviour.Quackable;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("I am RubberDuck");
    }

    @Override
    public void quack() {
        System.out.println("Squeeze !!");
    }
}
