package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol;

import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol.behaviours.InjuryFly;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol.behaviours.NewTypeOfFly;
import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern2.final_sol.behaviours.NormalFly;

public class App {

    public static void main(String[] args) {
        Duck duck = new RedheadDuck();

        duck.setFlyable(new NormalFly());

        duck.performFly();

        duck.setFlyable(new InjuryFly());

        duck.performFly();

        duck.setFlyable(new NewTypeOfFly());

        duck.performFly();
    }
}
