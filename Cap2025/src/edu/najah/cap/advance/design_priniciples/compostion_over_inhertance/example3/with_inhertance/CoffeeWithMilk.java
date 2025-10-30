package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_inhertance;

public class CoffeeWithMilk extends Coffee {
    private static final double MILK_PRICE = 2.5;

    public CoffeeWithMilk(int quantity) {
        super(quantity);
    }

    public double getPrice() {
        return super.getPrice() + (MILK_PRICE * quantity);
    }
}
