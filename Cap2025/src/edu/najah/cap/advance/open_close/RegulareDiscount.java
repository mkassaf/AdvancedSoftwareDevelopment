package edu.najah.cap.advance.open_close;

public class RegulareDiscount implements Discount {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% discount
    }
}
