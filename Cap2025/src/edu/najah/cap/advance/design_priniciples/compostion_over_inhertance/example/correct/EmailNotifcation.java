package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.correct;

public class EmailNotifcation extends AbstNotification {


    public EmailNotifcation(String id, String message) {
        super(id, message);
    }

    @Override
    public void send() {
        System.out.println("Sending Email: " + prepareMessage());
    }
}
