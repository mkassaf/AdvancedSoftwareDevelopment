package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution2;

public class SMSNotification extends BacisNotifaction {

    public SMSNotification(int id, String message) {
        super(id, message);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending via SMS: " + prepareMessage());
    }
}
