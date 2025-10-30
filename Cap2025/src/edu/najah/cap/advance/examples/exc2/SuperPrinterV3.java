package edu.najah.cap.advance.examples.exc2;

public class SuperPrinterV3 extends SuperPrinter implements ICopy, IScanner, IPrinter, IFax {
    private ICopy copy;

    public SuperPrinterV3(IPrinter printer, IScanner scaner, IFax fax, ICopy copy) {
        super(printer, scaner, fax);
        this.copy = copy;
    }

    public void copy() {
        this.copy.copy();
    }
}
