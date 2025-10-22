package edu.najah.cap.advance.open_close;

public class App {

    public static void main(String[] args) {

        DiscountCaculator discountCaculator = new DiscountCaculator();


        double finalPrice = discountCaculator.calculatePrice(100, new RegulareDiscount());

    }
}
