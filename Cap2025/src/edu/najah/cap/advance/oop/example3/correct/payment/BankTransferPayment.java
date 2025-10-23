package edu.najah.cap.advance.oop.example3.correct.payment;

public class BankTransferPayment implements Payment {


    public void proccessBankTransferPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
        // Logic for processing bank transfer payment (20 lines of code)
        // channels, connection, apiKeys, etc. are used here
    }

    @Override
    public void processPayment(double amount) {
        proccessBankTransferPayment(amount);
    }
}
