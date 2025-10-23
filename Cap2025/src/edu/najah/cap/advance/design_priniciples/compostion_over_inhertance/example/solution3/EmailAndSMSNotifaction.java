package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution3;

import edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution1.EmailNotifcation;

public class EmailAndSMSNotifaction {

    protected String id;
    protected String message;

    EmailNotifcation emailNotifcation;
    SMSNotifaction smsNotifaction;


    public EmailAndSMSNotifaction(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public void send() {
        emailNotifcation.send();
        smsNotifaction.send();
    }

    public String prepareMessage() {
        return "Notification ID: " + id + ", Message: " + message;
    }
}
