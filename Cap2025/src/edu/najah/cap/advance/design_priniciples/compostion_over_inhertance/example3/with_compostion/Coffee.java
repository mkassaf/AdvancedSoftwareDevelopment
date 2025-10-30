package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_compostion;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    private static final double BASE_COFFEE_PRICE = 3;
    protected int quantity;

    private List<Condiments> condiments= new ArrayList<>();

    public Coffee(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        var price =  BASE_COFFEE_PRICE * quantity;
        for (var condiment : condiments) {
            price += (condiment.getPrice() * quantity);
        }
        return price;
    }

    public void addCondiment(Condiments condiment) {
        condiments.add(condiment);
    }
}
