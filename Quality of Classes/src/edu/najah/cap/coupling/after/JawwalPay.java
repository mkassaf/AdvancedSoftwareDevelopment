package edu.najah.cap.coupling.after;

public class JawwalPay implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " processed with JawwalPay");
    }
}
