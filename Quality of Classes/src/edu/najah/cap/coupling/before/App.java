package edu.najah.cap.coupling.before;

public class App {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("1234", 10));

        cart.checkout(new Palpay("", 10));
        cart.checkout(new CreditCard("", 1));
        cart.checkout(new JawalPay("", 1));
    }
}
