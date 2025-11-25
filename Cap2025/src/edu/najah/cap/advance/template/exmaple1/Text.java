package edu.najah.cap.advance.template.exmaple1;

public class Text extends FileTemplate {
    @Override
    protected void open() {
        System.out.println("Open Text");
    }
    @Override
    protected void read() {
        System.out.println("read Text");
    }
    @Override
    protected void close() {
        System.out.println("Closing Text");
    }


}
