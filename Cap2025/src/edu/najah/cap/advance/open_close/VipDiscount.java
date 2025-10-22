package edu.najah.cap.advance.open_close;

public class VipDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% discount
    }
}
