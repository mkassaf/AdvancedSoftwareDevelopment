package edu.najah.cap.coupling.after;

public class App {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("1234", 10));

        cart.checkout(new Palpay("111", 100));
        cart.checkout(new CreditCard("222", 2.2));
        cart.checkout(new JawwalPay());

    }
}
