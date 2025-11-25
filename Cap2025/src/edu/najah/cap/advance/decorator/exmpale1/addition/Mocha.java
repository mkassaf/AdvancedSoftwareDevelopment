package edu.najah.cap.advance.decorator.exmpale1.addition;

import edu.najah.cap.advance.decorator.exmpale1.Baverage;

public class Mocha extends BaseAddition {

    public Mocha(Baverage baverage) {
        super(baverage);
    }

    @Override
    public double getCost() {
        return baverage.getCost() + 2;
    }

    @Override
    public void getDescrption() {
        baverage.getDescrption();
        System.out.print("Mocha ");
    }
}
