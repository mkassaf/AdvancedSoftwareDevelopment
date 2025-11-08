package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2;

import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2.behaviour.Flyable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol2.behaviour.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("I am RedheadDuck");
    }

    @Override
    public void fly() {
        System.out.println("Logic from 22 lines of code to fly");
    }

    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
