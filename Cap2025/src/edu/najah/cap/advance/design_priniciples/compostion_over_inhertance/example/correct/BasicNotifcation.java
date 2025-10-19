package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.correct;

public class BasicNotifcation extends AbstNotification {

    public BasicNotifcation(String id, String message) {
        super(id, message);
    }

    @Override
    public void send() {
        System.out.println("Notification via basic method: " + prepareMessage());
    }
}
