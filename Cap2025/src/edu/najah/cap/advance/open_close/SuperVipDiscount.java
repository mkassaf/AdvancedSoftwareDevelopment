package edu.najah.cap.advance.open_close;

public class SuperVipDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.7; // 30% discount
    }
}
