package edu.najah.cap.coupling.after;

public class Palpay implements Payment {
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

    @Override
    public void pay(double amount) {
        if (processPayment(amount)) {
            System.out.println("Payment of " + amount + " processed with Palpay " + cardNumber);
        } else {
            System.out.println("Payment of " + amount + " failed with Palpay " + cardNumber);
        }
    }
}
