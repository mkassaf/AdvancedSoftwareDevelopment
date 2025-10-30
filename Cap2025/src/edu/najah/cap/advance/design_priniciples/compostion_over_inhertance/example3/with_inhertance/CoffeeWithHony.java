package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_inhertance;

public class CoffeeWithHony extends Coffee {
    private static final double HONEY = 1;

    public CoffeeWithHony(int quantity) {
        super(quantity);
    }

    public double getPrice() {
        return super.getPrice() + (HONEY * quantity);
    }
}
