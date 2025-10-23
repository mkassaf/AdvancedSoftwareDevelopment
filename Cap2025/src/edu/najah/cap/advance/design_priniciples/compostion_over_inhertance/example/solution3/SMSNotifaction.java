package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution3;

public class SMSNotifaction {

    protected String id;
    protected String message;

    BasicNotifcation basicNotifcation;

    public SMSNotifaction(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public void send() {
        basicNotifcation.send();
        System.out.println("Sending via sms: " + prepareMessage());
    }

    public String prepareMessage() {
        return "Notification ID: " + id + ", Message: " + message;
    }
}
