package edu.najah.cap.advance.design_priniciples.programm_to_interface.correct;

public class MyCustomMySQL extends MySQLDatabase{
    @Override
    public void close() {
        super.close();
        System.out.println("Cleaning database...");
    }
}
