package edu.najah.cap.advance.iss;

public class ReadOnly implements Database {
    @Override
    public void read() {
        System.err.println("Database is reading");
    }

    @Override
    public void write() {
        throw new UnsupportedOperationException("This database does not support write");
    }
}
