package edu.najah.cap.advance.design_patterns.strategy_pattern.pattern1.sol2;

public class App {

    public static void main(String[] args) {

        RedheadDuck duck = new RedheadDuck();

        callFly(duck);
        callQuack(duck);
        callSwim(duck);

    }


    static void callFly(Flyable flyable) {
        flyable.fly();
    }

    static void callQuack(Quackable quackable) {
        quackable.quack();
    }

    static void callSwim(Duck duck) {
        duck.swim();
    }
}
