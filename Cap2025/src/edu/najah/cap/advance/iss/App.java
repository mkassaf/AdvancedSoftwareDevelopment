package edu.najah.cap.advance.iss;

public class App {
    private Database database;
    public App(Database database) {
        this.database = database;
    }

    public void read() {
        database.read();
    }

    public static void main(String[] args) {
        App app = new App(new ReadOnly());

        app.read();
    }


}
