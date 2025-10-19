package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution1;

public abstract class Notification {
    protected String id;
    protected String message;

    public Notification(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public void send() {
        System.out.println("Sending via app: " + prepareMessage());
    }

    public String prepareMessage() {
        return "Notification ID: " + id + ", Message: " + message;
    }
}
