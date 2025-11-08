package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol;

import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol.behaviours.Flyable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol.behaviours.Quackable;

public abstract class Duck {
    private Flyable flyable;
    private Quackable quackable;

    public Duck(Flyable flyable, Quackable quackable) {
        this.quackable = quackable;
        this.flyable = flyable;
    }

    public void swim() {
        System.out.println("Logic to swim");
    }

    public abstract void display();

    public void callFly() {
        flyable.fly();
    }

    public void callQuack() {
        quackable.quack();
    }
}
