package edu.najah.cap.advance.quality_classes.coupling;

public class Listener {

    void listen(Event event) {
        System.out.println("Event :: " + event.extract());
    }
}
