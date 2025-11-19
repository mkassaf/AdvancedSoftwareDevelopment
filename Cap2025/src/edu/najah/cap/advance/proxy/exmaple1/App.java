package edu.najah.cap.advance.proxy.exmaple1;

public class App {

    public static void main(String[] args) {
        IInternt iInternt = new ProxyInternt(new RealInternt());

        iInternt.connect("facebook.com");
    }
}
