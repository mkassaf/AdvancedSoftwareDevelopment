package edu.najah.cap.coupling.after;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }


    public void checkout(Payment payment) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        payment.pay(total);
    }
}
