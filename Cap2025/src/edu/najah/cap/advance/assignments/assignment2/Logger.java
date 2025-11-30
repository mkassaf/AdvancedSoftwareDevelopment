package edu.najah.cap.advance.assignments.assignment2;

public class Logger {
    public void log(Event event) {
        System.out.println("[LOG] Processed event " + event.getId() + " type " + event.getType());
    }
}
