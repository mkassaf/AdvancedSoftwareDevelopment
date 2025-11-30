package edu.najah.cap.advance.assignments.assignment2;

public class Dashboard {
    public void updateMetrics(Event e) {
        System.out.println(String.format("[Dashboard] metrics updated for %s, payload: %s", e.getId() , e.getPayload()));
    }
}
