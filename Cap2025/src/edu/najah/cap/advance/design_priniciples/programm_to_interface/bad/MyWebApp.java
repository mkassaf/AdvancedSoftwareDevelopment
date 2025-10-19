package edu.najah.cap.advance.design_priniciples.programm_to_interface.bad;

public class MyWebApp {
    private PostgressDatabase  database;

    public MyWebApp(PostgressDatabase database) {
        this.database = database;
    }

    public void run() {
        try {
            database.init();
            database.update("updating from web app");
            System.out.println("Checking the result: " + database.retrive());
        } finally  {
            database.close();
        }

    }
}
