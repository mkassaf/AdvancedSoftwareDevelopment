package edu.najah.cap.advance.decorator.exmpale2;

import edu.najah.cap.advance.decorator.exmpale2.concrete.Coffee;
import edu.najah.cap.advance.decorator.exmpale2.extra.Milk;
import edu.najah.cap.advance.decorator.exmpale2.extra.Mocha;

public class App {

    public static void main(String[] args) {

        Baverage coffee = new Coffee();
        System.out.println(coffee.getDescrption() + " " + coffee.getCost());

        Milk coffeeWithMilk = new Milk(coffee);

        System.out.println(coffeeWithMilk.getDescrption() + " " + coffeeWithMilk.getCost());


        Milk coffeeWithMilkWithMilk = new Milk(coffeeWithMilk);

        System.out.println(coffeeWithMilkWithMilk.getDescrption() + " " + coffeeWithMilkWithMilk.getCost());

        Mocha coffeeWithMilkWithMilkWithMocha = new Mocha(coffeeWithMilkWithMilk);

        System.out.println(coffeeWithMilkWithMilkWithMocha.getDescrption() + " " + coffeeWithMilkWithMilkWithMocha.getCost());
    }
}
