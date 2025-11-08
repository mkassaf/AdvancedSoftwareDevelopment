package edu.najah.cap.advance.isp.example2;

public class Custom2VM implements VendingMachine {
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
    }

    @Override
    public void prepareWater() {
        throw new UnsupportedOperationException("We do not support water!!");
    }
}
