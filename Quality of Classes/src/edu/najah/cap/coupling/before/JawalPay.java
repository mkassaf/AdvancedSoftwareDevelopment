package edu.najah.cap.coupling.before;

public class JawalPay {

    private String cardNumber;
    private double balance;

    public JawalPay(String cardNumber, double initialBalance) {
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
