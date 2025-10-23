package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution1;

public class Coffee {
    private static final int COFFEE_PRICE = 2;
    protected int quantity;

    public Coffee(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return quantity * COFFEE_PRICE;
    }
}
