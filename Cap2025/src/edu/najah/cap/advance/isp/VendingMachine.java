package edu.najah.cap.advance.isp;

public class VendingMachine implements IVendingMachine{

    @Override
    public void sendMoney() {
        System.out.println("Send money");
    }

    @Override
    public void papareCoffee() {
        System.out.println("Coffee");
    }

    @Override
    public void papareTea() {
        System.out.println("Tea");
    }

    @Override
    public void perapreHotChoiclate() {
        System.out.println("HotChoiclate");
    }
}
