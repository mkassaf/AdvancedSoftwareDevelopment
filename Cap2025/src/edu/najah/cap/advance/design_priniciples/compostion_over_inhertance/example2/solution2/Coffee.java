package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution2;

import java.util.List;

public class Coffee {
    private static final int COFFEE_PRICE = 2;
    protected int quantity;

    private final List<Condiments> condiments;

    public Coffee(int quantity, List<Condiments> condiments) {
        this.quantity = quantity;
        this.condiments = condiments;
    }

    public double getPrice() {
        double price = quantity * COFFEE_PRICE;
        for (var condiment : condiments) {
            price += condiment.getPrice();
        }
        return price;
    }
}
