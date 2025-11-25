package edu.najah.cap.advance.template.exmaple1;

public class Pdf extends FileTemplate {
    @Override
    protected void open() {
        System.out.println("Open Pdf");
    }

    @Override
    protected void read() {
        System.out.println("read Pdf");
    }

    @Override
    protected void close() {
        System.out.println("Closing Pdf");
    }
}
