package edu.najah.cap.advance.quality_classes.prmitive;

import edu.najah.cap.advance.quality_classes.cohesion.correct.Person;

public class App {
    public static void main(String[] args) {

    }


    public static boolean validate(Person person) {
        if(isEmpty(person.getName())) {
            return false;
        }
        if(isEmpty(person.getSurname())) {
            return false;
        }
        if(isEmpty(person.getRole())) {
            return false;
        }

        if (isSuspended(person.getRole())) {
            return false;
        }
        return true;
    }

    private static boolean isSuspended(String role) {
        return role.equals("suspended");
    }


    private static boolean isEmpty(String name) {
        return name == null || name.isBlank();
    }
}
