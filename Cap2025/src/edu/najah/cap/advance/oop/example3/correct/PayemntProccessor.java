package edu.najah.cap.advance.oop.example3.correct;

import edu.najah.cap.advance.oop.example3.correct.payment.Payment;

public class PayemntProccessor {

    public void processPayment(Payment paymentMethod, double amount) {
        //logic common for all payment methods can be added here
        paymentMethod.processPayment(amount);
        //logic such notifying the user can be added here
    }
}
