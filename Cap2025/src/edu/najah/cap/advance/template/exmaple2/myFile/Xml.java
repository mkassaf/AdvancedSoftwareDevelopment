package edu.najah.cap.advance.template.exmaple2.myFile;

public class Xml extends File {

    @Override
    protected void open(){
        System.out.println("Open Xml");
    }

    @Override
    protected void read(){
        System.out.println("Red Xml");
    }

    @Override
    protected void close(){
        System.out.println("close Xml");
    }
}
