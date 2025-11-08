package edu.najah.cap.advance.isp.better;

public class SuperVMachine extends VendingMachine implements CoffeeMacker, TeaMacker{
    @Override
    public void paperCoffee() {
        System.out.println("Coffee");
    }

    @Override
    public void prepareTea() {

    }
}
