package edu.najah.cap.advance.decorator.exmpale2.concrete;

import edu.najah.cap.advance.decorator.exmpale2.Baverage;

public class Tea implements Baverage {
    @Override
    public double getCost() {
        return 2;
    }

    @Override
    public String getDescrption() {
        return "Tea";
    }
}
