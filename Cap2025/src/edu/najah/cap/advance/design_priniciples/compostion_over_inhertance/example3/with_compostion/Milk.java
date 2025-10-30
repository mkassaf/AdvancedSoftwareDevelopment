package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_compostion;

public class Milk implements Condiments {

    private static final double MILK_PRICE = 2.5;

    public double getMilkPricePrice() {
        return (MILK_PRICE);
    }

    @Override
    public double getPrice() {
        return getMilkPricePrice();
    }
}
