package edu.najah.cap.advance.design_priniciples.programm_to_interface.correct;

public class PostgressDatabase implements Database {

    public void init() {
        System.out.println("Connecting to Postgres...");
    }

    @Override
    public void open() {
        init();
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
