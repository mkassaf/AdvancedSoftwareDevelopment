package edu.najah.cap.main;

import edu.najah.cap.classes.User;

public class SuperUser extends User {

    public SuperUser(int id, String username, String password) {
        super(id, username, password);
    }

    public void print() {
        System.out.println(super.id);
        System.out.println(super.username);
        super.sayHello();
    }
}
