package edu.najah.cap.advance.liskov.sol2;

public class App {

    public static void main(String[] args) {
        check(new Admin());
    }


    public static void check(User user) {
        user.setFirstName("Ahmad");
        user.setLastName("Rami");

        if (user.getFirstName().equals("Ahmad") && user.getLastName().equals("Rami")) {
            System.out.println("You are now logged in as " + user.getFirstName() + " " + user.getLastName());
        }
    }
}
