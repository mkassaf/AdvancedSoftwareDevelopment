package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution1;

public class Tea {
    private static final int TEA_PRICE = 1;
    protected int quantity;

    public Tea(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return quantity * TEA_PRICE;
    }
}
