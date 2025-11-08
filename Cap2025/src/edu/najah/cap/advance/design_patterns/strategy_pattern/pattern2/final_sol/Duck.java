package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol;

import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol.behaviours.Flyable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol.behaviours.Quackable;

public abstract class Duck {

    private Flyable flyable;
    private Quackable quackable;

    public void swim() {
        System.out.println("I can swim");
    }

    public void performFly() {
        flyable.fly();
    }

    public void performQuack() {
        quackable.quack();
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public abstract void display();
}
