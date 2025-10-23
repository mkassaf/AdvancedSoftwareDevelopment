package edu.najah.cap.advance.oop.example3.correct.payment;

public class CreditCardPayment implements Payment {

    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Logic for processing credit card payment (20 lines of code)
        // channels, connection, apiKeys, etc. are used here
    }
}
