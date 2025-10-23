package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution1;

public class CoffeeWithMocha extends Coffee {
    private static final int MOCHA_PRICE = 1;

    public CoffeeWithMocha(int quantity) {
        super(quantity);
    }

    public int getPrice() {
        return super.getPrice() + (MOCHA_PRICE * quantity);
    }
}
