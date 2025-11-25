package edu.najah.cap.advance.decorator.exmpale1;

import edu.najah.cap.advance.decorator.exmpale1.addition.Milk;
import edu.najah.cap.advance.decorator.exmpale1.addition.Mocha;
import edu.najah.cap.advance.decorator.exmpale1.concrete.Tea;

public class App {

    public static void main(String[] args) {

        Baverage tea = new Tea();

        Baverage milkWithTea = new Milk(tea);

        System.out.print(milkWithTea.getCost());
        System.out.println();
        milkWithTea.getDescrption();

        Baverage teamWithMilkWithMoch = new Mocha(milkWithTea);
        System.out.print(teamWithMilkWithMoch.getCost());
        System.out.println();
        teamWithMilkWithMoch.getDescrption();

        Baverage teamWithMilkWith2Moch = new Mocha(teamWithMilkWithMoch);
        System.out.print(teamWithMilkWith2Moch.getCost());
        System.out.println();
        teamWithMilkWith2Moch.getDescrption();
    }
}
