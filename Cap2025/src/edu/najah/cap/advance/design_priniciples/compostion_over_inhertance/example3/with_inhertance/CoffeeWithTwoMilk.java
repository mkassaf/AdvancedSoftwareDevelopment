package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_inhertance;

public class CoffeeWithTwoMilk extends CoffeeWithMilk {

    public CoffeeWithTwoMilk(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 2;
    }
}
