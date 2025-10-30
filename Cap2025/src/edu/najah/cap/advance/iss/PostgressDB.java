package edu.najah.cap.advance.iss;

public class PostgressDB implements Database {
    @Override
    public void read() {
        System.out.println("Reading Postgres DB");
    }

    @Override
    public void write() {
        System.out.println("Writing Postgres DB");
    }
}
