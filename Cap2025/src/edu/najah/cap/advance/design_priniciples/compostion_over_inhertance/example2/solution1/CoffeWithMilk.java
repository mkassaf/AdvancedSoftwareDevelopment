package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution1;

public class CoffeWithMilk extends  Coffee {
    private static final int MILK_PRICE = 1;

    public CoffeWithMilk(int quantity) {
        super(quantity);
    }

    public int getPrice() {
        return super.getPrice() + (MILK_PRICE * quantity);
    }
}
