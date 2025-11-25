package edu.najah.cap.advance.template.exmaple1;

public class Xml extends FileTemplate {
    @Override
    protected void open() {
        System.out.println("Open Xml");
    }

    @Override
    protected void read() {
        System.out.println("read Xml");
    }

    @Override
    protected void close() {
        System.out.println("Closing Xml");
    }
}
