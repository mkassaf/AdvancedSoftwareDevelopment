package edu.najah.cap.advance.examples.exc2;

public class SuperPrinterV2 implements IPrinter, IFax, IScanner {
    @Override
    public void print() {
        System.out.println("logic contains 32 lines of code to do print");
    }

    @Override
    public void sendFax() {
        System.out.println("sendFax");
    }

    @Override
    public void scan() {
        System.out.println("scan");
    }

}
