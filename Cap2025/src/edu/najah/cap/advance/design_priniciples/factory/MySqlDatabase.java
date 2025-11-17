package edu.najah.cap.advance.design_priniciples.factory;

public class MySqlDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("MySqlDatabase");
    }
}
