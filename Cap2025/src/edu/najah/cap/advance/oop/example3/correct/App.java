package edu.najah.cap.advance.oop.example3.correct;

import edu.najah.cap.advance.oop.example3.correct.payment.PayPalPayment;

public class App {


    public static void main(String[] args) {
        PayemntProccessor paymentProcessor = new PayemntProccessor();
        var paymentMethod = PaymentFactory.getPaymentMethod(PaymentType.PAYPAL);
        paymentProcessor.processPayment(paymentMethod, 100.0);
    }

}
