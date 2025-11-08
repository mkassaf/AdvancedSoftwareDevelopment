package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol;

import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol.behaviours.Flyable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol.behaviours.Quackable;

public class DecoyDuck extends Duck {
    public DecoyDuck(Flyable flyable, Quackable quackable) {
        super(flyable, quackable);
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck .. ");
    }
}
