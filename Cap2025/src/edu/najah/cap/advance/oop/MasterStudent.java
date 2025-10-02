package edu.najah.cap.advance.oop;

import edu.najah.cap.advance.example1.*;

public class MasterStudent extends Student {

    public String username;

    public MasterStudent(int id, String name, int age) {
        super(id, name, age);
        this.username = name + id;
    }


    public void display() {
        System.out.println("This is the student display");
        System.out.println("Id: " + this.id);
        System.out.println("Id: " + this.name);//because MasterStudent is a child class from Stduent
    }

    public MasterStudent getThis() {
        return this;
    }
}
