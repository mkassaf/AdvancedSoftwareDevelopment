package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example.solution2;


public abstract class BacisNotifaction implements Notification {
    protected int id;
    protected String message;

    public BacisNotifaction(int id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String prepareMessage() {
        return "Notification ID: " + id + ", Message: " + message;
    }

    @Override
    public void send() {
        System.out.println("Sending via app: " + prepareMessage());
    }

}
