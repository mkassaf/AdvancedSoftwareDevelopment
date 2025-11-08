package edu.najah.cap.advance.isp.example2;

public class MyCustomVM implements VendingMachine{
    @Override
    public void takeMoney() {
        System.out.println("Take money");
    }

    @Override
    public void prepareCoffee() {
        System.out.println("Coffee");
    }

    @Override
    public void prepareTea() {
        System.out.println("Tea");
    }

    @Override
    public void prepareSnacks() {
        System.out.println("Snacks");
    }

    @Override
    public void prepareWater() {
        System.out.println("Water");
    }
}
