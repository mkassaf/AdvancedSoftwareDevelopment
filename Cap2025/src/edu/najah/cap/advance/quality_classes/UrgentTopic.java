package edu.najah.cap.advance.quality_classes;

public class UrgentTopic implements Topic {

    public void gotIt() {
        System.out.println("got it");
    }

    @Override
    public void understand() {
        gotIt();
    }
}
