package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.correct;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        EmailNotifcation emailNotification = new EmailNotifcation("1", "Hello via Email!");

        SMSNotifcation smsNotification = new SMSNotifcation("2", "Hello via SMS!");

        WhatsupNotifcation whatsupNotification = new WhatsupNotifcation("3", "Hello via Whatsup!");



        List<AbstNotification> notifications = new ArrayList<>();

        notifications.add(emailNotification);
        notifications.add(smsNotification);
        notifications.add(whatsupNotification);

        for (AbstNotification notification : notifications) {
            notification.send();
        }


        AbstNotification notification = new Notification("1", "message 2",
                List.of(emailNotification, smsNotification, whatsupNotification));

        notification.send();
    }
}
