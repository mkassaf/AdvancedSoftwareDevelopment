package edu.najah.cap.advance.decorator.exmpale1.addition;

import edu.najah.cap.advance.decorator.exmpale1.Baverage;

public class Milk extends BaseAddition {


    public Milk(Baverage baverage) {
        super(baverage);
    }

    @Override
    public double getCost() {

        return baverage.getCost() + 1;
    }

    @Override
    public void getDescrption() {
        baverage.getDescrption();
        System.out.print("Milk ");
    }
}
