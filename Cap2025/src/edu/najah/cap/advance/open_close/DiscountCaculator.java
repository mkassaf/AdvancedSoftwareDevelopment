package edu.najah.cap.advance.open_close;

public class DiscountCaculator {

    public double calculatePrice(double price, Discount discount) {
        return discount.applyDiscount(price);
    }



}
