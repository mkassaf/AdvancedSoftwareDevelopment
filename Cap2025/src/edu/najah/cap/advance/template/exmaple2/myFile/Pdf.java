package edu.najah.cap.advance.template.exmaple2.myFile;

public class Pdf extends File {

    @Override
    protected void open(){
        System.out.println("Open Pdf");
    }

    @Override
    protected void read(){
        System.out.println("Red Pdf");
    }

    @Override
    protected void close(){
        System.out.println("close Pdf");
    }


}
