package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.correct;

public class SMSNotifcation extends AbstNotification {

    public SMSNotifcation(String id, String message) {
        super(id, message);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS: " + prepareMessage());
    }

}
