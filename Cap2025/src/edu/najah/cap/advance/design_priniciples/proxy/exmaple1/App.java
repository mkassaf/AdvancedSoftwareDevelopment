package edu.najah.cap.advance.design_priniciples.proxy.exmaple1;

public class App {

    public static void main(String[] args) {
        IInternt iInternt = new Proxy(new RealInternt());

        iInternt.connect("facebook.com");
    }
}
