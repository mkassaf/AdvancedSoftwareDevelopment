package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution1;

public class App {

    public static void main(String[] args) {
        Notification notification1 = new BasicNotifcation("1", "Hello User!");
        BasicNotifcation notification2 = new EmailNotifcation("2", "Hello via Email!");
        Notification notification3 = new SMSNotification("3", "Hello via SMS!");
        EmailNotifcation emailSmsNotification = new EmailAndSMSNotification("4", "Hello via Email and SMS!");

        notification1.send();
        notification2.send();
        notification3.send();
        emailSmsNotification.send();
    }
}
