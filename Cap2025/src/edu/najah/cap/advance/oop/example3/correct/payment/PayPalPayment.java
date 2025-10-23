package edu.najah.cap.advance.oop.example3.correct.payment;

public class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic for processing PayPal payment (20 lines of code)
        // channels, connection, apiKeys, etc. are used here
    }
}
