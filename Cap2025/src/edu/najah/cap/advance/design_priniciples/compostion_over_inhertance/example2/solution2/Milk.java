package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution2;

public class Milk implements Condiments {
    private static final double MILK_PRICE = 1;


    public double getTotalPrice() {
        return MILK_PRICE;
    }

    @Override
    public double getPrice() {
        return getTotalPrice();
    }
}
