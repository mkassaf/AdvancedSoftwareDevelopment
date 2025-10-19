package edu.najah.cap.advance.design_priniciples.programm_to_interface.correct;

public class MyWebApp {
    private Database database;

    public MyWebApp(Database database) {
        this.database = database;
    }

    public void run() {
        try {
            database.open();
            database.update("updating from web app");
            System.out.println("Checking the result: " + database.retrive());
        } finally  {
            database.close();
        }

    }
}
