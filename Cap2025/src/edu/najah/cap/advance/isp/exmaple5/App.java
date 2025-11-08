package edu.najah.cap.advance.isp.exmaple5;

public class App {

    public static void main(String[] args) {
        Payment payment = new CoinPayment();
        VM vm = new VM(payment);

        vm.addBaverge(new Coffee());
        vm.addBaverge(new Water());
    }
}
