package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol;

import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol.behaviours.Flyable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol.behaviours.Quackable;

public class RedHeadInjuryDuck extends Duck {

    public RedHeadInjuryDuck(Flyable flyable, Quackable quackable) {
        super(flyable, quackable);
    }

    @Override
    public void display() {
        System.out.println("RedHeadInjuryDuck");
    }

}
