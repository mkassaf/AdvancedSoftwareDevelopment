package edu.najah.cap.advance.oop.example3.incorrect;

public class PayemntProccessor {
    //attributes channels, connection, apiKeys, etc.

    public void processPayment(String paymentMethod, double amount) {
        //logic common for all payment methods can be added here
        if (paymentMethod.equals("CreditCard")) {
            proccessCreditCardPayment(amount);
        } else if (paymentMethod.equals("PayPal")) {
            proccessPayPalPayment(amount);
        } else if (paymentMethod.equals("BankTransfer")) {
            proccessBankTransferPayment(amount);
        } else {
            System.out.println("Unsupported payment method: " + paymentMethod);
        }
        //logic such notifying the user can be added here
    }

    private void proccessBankTransferPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
        // Logic for processing bank transfer payment (20 lines of code)
        // channels, connection, apiKeys, etc. are used here
    }

    private void proccessPayPalPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Logic for processing PayPal payment (20 lines of code)
        // channels, connection, apiKeys, etc. are used here
    }

    private void proccessCreditCardPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Logic for processing credit card payment (20 lines of code)
        // channels, connection, apiKeys, etc. are used here
    }
}
