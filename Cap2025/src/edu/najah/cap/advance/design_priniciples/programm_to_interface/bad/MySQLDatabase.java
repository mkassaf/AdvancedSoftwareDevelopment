package edu.najah.cap.advance.design_priniciples.programm_to_interface.bad;

public class MySQLDatabase {
    public void connect() {
        System.out.println("Connecting to MySql database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from MySql database...");
    }

    public void update(String data) {
        System.out.println("Updating data via MySQL: " + data);
    }

    public String getData() {
        return "Data from MySql database";
    }
}
