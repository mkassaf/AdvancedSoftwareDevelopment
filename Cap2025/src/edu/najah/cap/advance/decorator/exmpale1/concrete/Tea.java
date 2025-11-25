package edu.najah.cap.advance.decorator.exmpale1.concrete;

import edu.najah.cap.advance.decorator.exmpale1.Baverage;

public class Tea implements Baverage {
    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public void getDescrption() {
        System.out.print("Tea ");
    }
}
