package edu.najah.cap.advance.proxy.exmaple;

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
