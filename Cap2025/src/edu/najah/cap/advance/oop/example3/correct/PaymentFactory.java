package edu.najah.cap.advance.oop.example3.correct;

import edu.najah.cap.advance.oop.example3.correct.payment.BankTransferPayment;
import edu.najah.cap.advance.oop.example3.correct.payment.CreditCardPayment;
import edu.najah.cap.advance.oop.example3.correct.payment.PayPalPayment;
import edu.najah.cap.advance.oop.example3.correct.payment.Payment;

public class PaymentFactory {

    public static Payment getPaymentMethod(PaymentType method) {
        switch (method) {
            case CREDIT_CARD:
                return new CreditCardPayment();
            case PAYPAL:
                return new PayPalPayment();
            case BANK_TRANSFER:
                return new BankTransferPayment();
            default:
                throw new IllegalArgumentException("Invalid payment method");
        }
    }
}
