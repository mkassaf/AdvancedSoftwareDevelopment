package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_compostion;

public class Butter implements Condiments {
    private static final double BUTTER_PRICE = 4;


    @Override
    public double getPrice() {
        return BUTTER_PRICE;
    }
}
