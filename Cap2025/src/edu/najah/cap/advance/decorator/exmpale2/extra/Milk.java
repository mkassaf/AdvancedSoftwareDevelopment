package edu.najah.cap.advance.decorator.exmpale2.extra;

import edu.najah.cap.advance.decorator.exmpale2.Baverage;

public class Milk extends BaverageDecorator  {

    private static final int MILK_PRICE = 3;

    public Milk(Baverage baverage) {
        super(baverage);
    }

    @Override
    public double getCost() {
        return baverage.getCost() + MILK_PRICE;
    }

    @Override
    public String getDescrption() {
        return baverage.getDescrption() + " with Milk" ;
    }


}
