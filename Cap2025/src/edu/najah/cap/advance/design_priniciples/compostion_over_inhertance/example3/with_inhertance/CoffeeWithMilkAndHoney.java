package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_inhertance;

public class CoffeeWithMilkAndHoney extends CoffeeWithMilk {
    private static final double HONEY = 1;

    public CoffeeWithMilkAndHoney(int quantity) {
        super(quantity);
    }

    @Override
    public double getPrice() {
        return HONEY * quantity + super.getPrice();
    }
}
