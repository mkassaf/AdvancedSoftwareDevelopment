package edu.najah.cap.advance.examples.exc2;


public class AdvancedPrinter {
    private IPrinter printer;
    private IScanner scaner;

    public AdvancedPrinter(IPrinter printer, IScanner scaner) {
        this.printer = printer;
        this.scaner = scaner;
    }
    public void print() {
        printer.print();
    }

    public void scan() {
        this.scaner.scan();
    }
}
