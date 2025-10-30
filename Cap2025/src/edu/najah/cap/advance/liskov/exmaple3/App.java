package edu.najah.cap.advance.liskov.exmaple3;

public class App {

    static User user = new SuperAdmin();

    public static void main(String[] args) {
        user.setName("Ahmad");
        user.setEmail("Rami");

        if (user.getName().equals("Ahmad")) {
            System.out.println("Hello Ahmad");
        }
        if (user.getEmail().equals("Rami")) {
            System.out.println("Hello Rami");
        }
    }
}
