package edu.najah.cap.advance.compostition.exmaple2;


public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract void printName();
}
