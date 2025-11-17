package edu.najah.cap.advance.design_priniciples.proxy.exmaple1;

public class RealInternt implements IInternt {

    @Override
    public void connect(String url) {
        System.out.println("Connecting to url " + url);
    }
}
