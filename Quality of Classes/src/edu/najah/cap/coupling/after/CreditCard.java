package edu.najah.cap.coupling.after;

public class CreditCard implements Payment {
    private String cardNumber;
    private double balance;

    public CreditCard(String cardNumber, double initialBalance) {
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
            System.out.println("Payment of " + amount + " processed with credit card " + cardNumber);
        } else {
            System.out.println("Payment of " + amount + " failed with credit card " + cardNumber);
        }
    }
}
