package edu.najah.cap.advance.decorator.exmpale2.concrete;

import edu.najah.cap.advance.decorator.exmpale2.Baverage;

public class Coffee implements Baverage {
    @Override
    public double getCost() {
        return 3;
    }

    @Override
    public String getDescrption() {
        return "Coffee";
    }
}
