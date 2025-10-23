package edu.najah.cap.advance.design_priniciples.programm_to_interface.bad;

public class PostgressDatabase {

    public void init() {
        System.out.println("Connecting to Postgres...");
    }

    public void close() {
        System.out.println("Disconnecting from Postgres...");
    }

    public void update(String data) {
        System.out.println("Updating data via Postgres: " + data);
    }

    public String retrive() {
        return "Data from Postgres database";
    }
}
