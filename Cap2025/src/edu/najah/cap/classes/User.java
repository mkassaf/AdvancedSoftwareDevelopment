package edu.najah.cap.classes;

public class User {
    public int id;
    protected String username;
    private  String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
    }

    protected void sayHello() {
        System.out.println("Hello from protected function!!");
    }
}
