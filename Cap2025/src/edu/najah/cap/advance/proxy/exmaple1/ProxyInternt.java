package edu.najah.cap.advance.proxy.exmaple1;

public class ProxyInternt implements IInternt {

    private IInternt realInternt;

    public ProxyInternt(IInternt realInternt) {
        this.realInternt = realInternt;
    }

    @Override
    public void connect(String url) {
        if (url.contains("facebook.com")) {
            System.out.println("Forbidden!!");
            return;
        }
        realInternt.connect(url);
    }
}
