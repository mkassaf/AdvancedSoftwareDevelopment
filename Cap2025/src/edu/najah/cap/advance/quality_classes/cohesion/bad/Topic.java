package edu.najah.cap.advance.quality_classes.cohesion.bad;

public class Topic {
    private final String topic;
    private String serverUrl = "db:url";

    public Topic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
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
