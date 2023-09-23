package edu.najah.cap.coupling.before;

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

    // This method is tightly coupled to the CreditCard class.
    public void checkout(CreditCard creditCard) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }

        if (creditCard.processPayment(total)) {
            System.out.println("Checkout successful. Total: $" + total);
            items.clear();
        } else {
            System.out.println("Checkout failed. Payment could not be processed.");
        }
    }

    // This method is tightly coupled to the Palpay class.
    public void checkout(Palpay palpay) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }

        if (palpay.processPayment(total)) {
            System.out.println("Checkout successful. Total: $" + total);
            items.clear();
        } else {
            System.out.println("Checkout failed. Payment could not be processed.");
        }
    }


    // This method is tightly coupled to the JawalPay class.
    public void checkout(JawalPay palpay) {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }

        if (palpay.processPayment(total)) {
            System.out.println("Checkout successful. Total: $" + total);
            items.clear();
        } else {
            System.out.println("Checkout failed. Payment could not be processed.");
        }
    }
}
