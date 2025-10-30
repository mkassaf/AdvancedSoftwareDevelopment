package edu.najah.cap.advance.examples.exc2;


public class AdvancedPrinterV3 implements IPrinterV3 {

    public void print() {
        System.out.println("print");
    }

    public void scan() {
        System.out.println("scan");
    }

    @Override
    public void sendFax() {
        throw new UnsupportedOperationException("We do not support this method");
    }
}
