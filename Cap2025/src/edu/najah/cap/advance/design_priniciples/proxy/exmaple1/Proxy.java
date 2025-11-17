package edu.najah.cap.advance.design_priniciples.proxy.exmaple1;

public class Proxy implements IInternt {

    RealInternt realInternt;

    Proxy(RealInternt realInternt) {
        this.realInternt = realInternt;
    }

    @Override
    public void connect(String url) {

        if (url.contains("facebook.com")) {
            System.out.println("Blocked!!");
            return;
        }

        realInternt.connect(url);
    }
}
