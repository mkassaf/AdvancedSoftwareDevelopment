package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution1;

public class EmailNotifcation extends BasicNotifcation {

    public EmailNotifcation(String id, String message) {
        super(id, message);
    }

    @Override
    public void send() {
        super.send();//call the basic send method (System.out.println("Sending via app: " + prepareMessage());)
        System.out.println("Sending via email: " + prepareMessage());
    }

}
