package edu.najah.cap.advance.proxy.exmaple;

public class App {

    public static void main(String[] args) {
        IInternt iInternt = new Proxy(new RealInternt());

        iInternt.connect("facebook.com");
    }
}
