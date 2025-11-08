package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol.behaviours;

public class Mute implements Quackable {
    @Override
    public void quack() {
        System.out.println("Mute");
    }
}
