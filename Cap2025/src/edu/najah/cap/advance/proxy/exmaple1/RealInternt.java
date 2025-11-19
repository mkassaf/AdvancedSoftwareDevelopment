package edu.najah.cap.advance.proxy.exmaple1;

public class RealInternt implements IInternt {

    @Override
    public void connect(String url) {

        System.out.println("Connecting to url " + url);
    }
}
