package edu.najah.cap.coupling.before;

public class Palpay {
    private String cardNumber;
    private double balance;

    public Palpay(String cardNumber, double initialBalance) {
        this.cardNumber = cardNumber;
        this.balance = initialBalance;
    }

    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
