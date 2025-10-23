package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.correct;

public class EmailNotificationV2 extends AbstNotification {

    private AbstNotification AbstNotification;
    public EmailNotificationV2(String id, String message, AbstNotification AbstNotification) {
        super(id, message);
        this.AbstNotification = AbstNotification;
    }

    @Override
    public void send() {
        AbstNotification.send();
        System.out.println("Email via app: " + prepareMessage());
    }
}
