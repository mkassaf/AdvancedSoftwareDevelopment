package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution1;

public class EmailAndSMSNotification extends EmailNotifcation {

    public EmailAndSMSNotification(String id, String message) {
        super(id, message);
    }

    @Override
    public void send() {
        super.send();//email send -> basic send

        System.out.println("Sending via SMS: " + prepareMessage()); //duplicate code
    }
}
