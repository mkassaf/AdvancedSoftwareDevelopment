package edu.najah.cap.advance.design_priniciples.programm_to_interface.bad;

public class App {

    public static void main(String[] args) {
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        PostgressDatabase  postgressDatabase = new PostgressDatabase();

        MyWebApp myWebApp = new MyWebApp(postgressDatabase);

        myWebApp.run();
    }
}
