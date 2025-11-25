package edu.najah.cap.advance.decorator.exmpale2.extra;

import edu.najah.cap.advance.decorator.exmpale2.Baverage;

public class Mocha extends BaverageDecorator  {

    private static final int MOCHA_PRICE = 5;

    public Mocha(Baverage baverage) {
        super(baverage);
    }

    @Override
    public double getCost() {
        return baverage.getCost() + MOCHA_PRICE;
    }

    @Override
    public String getDescrption() {
        return baverage.getDescrption() + " with Mocha" ;
    }


}
