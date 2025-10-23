package edu.najah.cap.advance.design_priniciples.programm_to_interface.correct;

public class App {

    public static void main(String[] args) {

        MyWebApp myWebApp = new MyWebApp(DatabaseFactory.getDatabase(DatabaseType.MY_CUSTOM));

        myWebApp.run();
    }
}
