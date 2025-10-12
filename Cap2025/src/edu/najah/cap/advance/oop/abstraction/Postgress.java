package edu.najah.cap.advance.oop.abstraction;

public class Postgress implements Database, Editable {

    public void insert(String data) {
        System.out.println("Postgress inset");
    }

    public String get() {
        System.out.println("Postgress get");
        return "Postgress get";
    }

    @Override
    public void edit(String data) {
        System.out.println("Postgress edit");
    }
}
