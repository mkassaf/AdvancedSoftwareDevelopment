package edu.najah.cap.advance.assignments.assignment1.connections;

/*
 * Naive connection manager: creates a new connection each time (no pooling),
 * has a maximum allowed open connections but does not reuse or block properly.
 * This violates the Connection Pool requirement and should be refactored.
 */
public class ConnectionManager {
    private int counter = 0;
    private final int MAX = 10; // allowed max, but not enforced as pool reuse

    public Connection createConnection() {
        int n = ++counter;
        if (n > MAX) {
            //TODO problem 2: we need to ensure no more 10 connections.
            System.out.println("Warning: too many connections created. Still creating (naive).");
            return null;
        }
        return new Connection("Conn-" + n);
    }

    public void closeConnection(Connection c) {
        System.out.printf("[ConnectionManager] Closing connection %s (naive).%n", c.getId());
        // naive: does nothing to reuse
    }
}