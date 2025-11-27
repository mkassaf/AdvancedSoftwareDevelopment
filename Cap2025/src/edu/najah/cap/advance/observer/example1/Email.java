package edu.najah.cap.advance.observer.example1;

public class Email implements Observer {

    public Email(Topic topic) {
        topic.subscribe(this);
    }

    @Override
    public void update(int value) {
        System.out.println("Sending email with new value :: " + value);
    }
}
