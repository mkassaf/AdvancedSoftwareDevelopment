package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.correct;

import java.util.List;

public class Notification extends AbstNotification {
    protected List<AbstNotification> notifications;

    public Notification(String id, String message, List<AbstNotification> notifications) {
       super(id, message);
        this.notifications = notifications;
    }

    @Override
    public void send() {
        System.out.println("Sending Basic: " + prepareMessage());

        for (AbstNotification notification : notifications) {
            notification.send();
        }
    }
}
