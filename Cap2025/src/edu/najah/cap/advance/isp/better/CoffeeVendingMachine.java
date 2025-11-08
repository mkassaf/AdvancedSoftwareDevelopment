package edu.najah.cap.advance.isp.better;

public class CoffeeVendingMachine extends VendingMachine implements CoffeeMacker {

    @Override
    public void paperCoffee() {
        System.out.println("Coffee");
    }
}
