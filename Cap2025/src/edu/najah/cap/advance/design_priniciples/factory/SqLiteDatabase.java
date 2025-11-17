package edu.najah.cap.advance.design_priniciples.factory;

public class SqLiteDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("SqLiteDatabase");
    }
}
