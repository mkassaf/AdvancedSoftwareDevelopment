package edu.najah.cap.advance.open_close;

public class EidDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.85; // 15% discount
    }
}
