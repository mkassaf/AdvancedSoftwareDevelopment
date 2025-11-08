package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.sol1;

public class DecoyDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Mute");
    }

    @Override
    public void display() {
        System.out.println("I am DecoyDuck");
    }
}
