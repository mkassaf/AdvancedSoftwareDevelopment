package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol;


import edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.final_sol.behaviours.*;

public class App {

    public static void main(String[] args) {
        Duck duck = new RedheadDuck(new FlyNormal(), new Quack());
        Duck duck2 = new RedheadDuck(new FlySlowly(), new Quack());
        Duck duck3 = new RedheadDuck(new FlySlowly(), new Squeez());
        Duck duck4 = new RedheadDuck(new NoFly(), new Squeez());


    }

}
