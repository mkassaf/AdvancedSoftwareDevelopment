package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2;

import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2.behaviour.Flyable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2.behaviour.Quackable;

public class MarllaledIjuryDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("I am MarllaledIjuryDuck");
    }

    @Override
    public void fly() {
        System.out.println("I fly slowly ...");
    }

    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
