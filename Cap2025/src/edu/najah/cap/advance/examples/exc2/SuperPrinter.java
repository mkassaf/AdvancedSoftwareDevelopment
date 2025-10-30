package edu.najah.cap.advance.examples.exc2;

public class SuperPrinter {

    private IPrinter printer;
    private IScanner scaner;
    private IFax fax;

    public SuperPrinter(IPrinter printer, IScanner scaner, IFax fax) {
        this.printer = printer;
        this.scaner = scaner;
        this.fax = fax;
    }

    public void print() {
        printer.print();
    }

    public void scan() {
        scaner.scan();
    }

    public void sendFax() {
        fax.sendFax();
    }
}
