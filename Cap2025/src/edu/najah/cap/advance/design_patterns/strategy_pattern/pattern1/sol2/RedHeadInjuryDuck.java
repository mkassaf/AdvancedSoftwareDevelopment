package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.sol2;

public class RedHeadInjuryDuck extends Duck implements Flyable, Quackable  {

    @Override
    public void fly() {
        System.out.println("Fly slowly");
    }

    @Override
    public void display() {
        System.out.println("RedHeadInjuryDuck");
    }

    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
