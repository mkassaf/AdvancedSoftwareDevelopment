package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol.behaviours;

public class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
