package edu.najah.cap.advance.assignments.assignment2;

public class App {

    public static void main(String[] args) {
        EventProcessor eventProcessor = new EventProcessor(new Database(), new Dashboard(), new Logger());

        Event e1 = new Event("USER", "user-click");
        e1.setEncrypt(true);
        e1.setAddMetadata(true);
        e1.setMetadata("u=42");

        eventProcessor.process(e1);

        Event e2 = new Event("SECURITY", "failed-login");
        e2.setCompress(true);
        eventProcessor.process(e2);
    }
}
