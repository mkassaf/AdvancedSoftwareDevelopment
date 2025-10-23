package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.correct;

public abstract class AbstNotification {

    protected String id;
    protected String message;

    public AbstNotification(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public  abstract void send();
    public  String prepareMessage() {
        return "Notification ID: " + id + ", Message: " + message;
    }
}
