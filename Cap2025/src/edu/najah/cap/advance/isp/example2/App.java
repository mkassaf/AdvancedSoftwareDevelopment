package edu.najah.cap.advance.isp.example2;

public class App {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new MyCustomVM();
        Machine machine = new Machine(vendingMachine);
    }
}
