package edu.najah.cap.advance.quality_classes.cohesion.correct;

public class App {

    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        publisher.publish(new Topic("topic"));

    }
}
