package edu.najah.cap.advance.project1.connections;

public class Connection {
    private final String id;
    public Connection(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    // naive query simulation
    public void executeQuery(String q) {
        System.out.printf("[Conn %s] Executing query: %s%n", id, q);
    }
}