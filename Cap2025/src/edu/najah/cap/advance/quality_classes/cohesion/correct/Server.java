package edu.najah.cap.advance.quality_classes.cohesion.correct;

public class Server {
    private String serverUrl = "db:url";

    public String connect() {
        System.out.println("Connect to serverUrl : " + serverUrl);
        return "Connect to serverUrl : " + serverUrl;
    }
}
