package edu.najah.cap.advance.isp;

public class CoffeeOnlyMachine implements IVendingMachine{
    @Override
    public void sendMoney() {
        System.out.println("Send money");
    }

    @Override
    public void papareCoffee() {
        System.out.println("Coffee only");
    }

    @Override
    public void papareTea() {
        throw new UnsupportedOperationException("This method is not supported!!");
    }

    @Override
    public void perapreHotChoiclate() {

    }

}
