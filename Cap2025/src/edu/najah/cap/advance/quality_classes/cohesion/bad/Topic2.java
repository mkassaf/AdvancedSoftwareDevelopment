package edu.najah.cap.advance.quality_classes.cohesion.bad;

public class Topic2 {
    private String serverUrl = "db:url";

    public String getTopic() {
        return "topic from cache";
    }

    public void publish(Topic topic) {
        System.out.println("Connect to serverUrl : " + connect());

        System.out.println("publish via serverUrl :: " + topic.getTopic());
    }

    private String connect() {
        System.out.println("Connect to serverUrl : " + serverUrl);
        return "Connect to serverUrl : " + serverUrl;
    }
}
