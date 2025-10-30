package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_inhertance;

public class Coffee {
    private static final double BASE_COFFEE_PRICE = 3;
    protected int quantity;

    public Coffee(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return BASE_COFFEE_PRICE * quantity;
    }
}
