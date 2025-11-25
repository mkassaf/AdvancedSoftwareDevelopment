package edu.najah.cap.advance.decorator.exmpale1.concrete;

import edu.najah.cap.advance.decorator.exmpale1.Baverage;

public class Coffee implements Baverage {
    @Override
    public double getCost() {
        return 4;
    }

    @Override
    public void getDescrption() {
      System.out.print("Coffee ");
    }
}
