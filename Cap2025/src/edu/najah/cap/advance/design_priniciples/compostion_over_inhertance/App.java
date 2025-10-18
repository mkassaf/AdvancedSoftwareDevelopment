package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance;

public class App {


    /*
    Imagine you are designing an app that has various types of notifications:
    - id
    - message

    - send
    - prepareMessage
    Basic notifications -> send message via app (System.out.println("Sending via app: " + message);)
    Basic + Email notifications -> send message via app + email
    Basic + SMS notifications -> send message via app + SMS
    Basic + Email + SMS notifications -> send message via app + email + SMS


     */

    public static void main(String[] args) {
        String message = print("Hello Composition over Inheritance!");
        int value = print(1);
    }


    public static <T> T print(T message) {
        System.out.println(message);
        return message;
    }
}
