package edu.najah.cap.advance.quality_classes.cohesion.correct;

public class Publisher {

    private Server server;

    public Publisher() {
        server = new Server();
    }


    public void publish(Topic topic) {
        System.out.println("Connect to serverUrl : " + server.connect());

        System.out.println("publish via serverUrl :: " + topic.getTopic());
    }
}
