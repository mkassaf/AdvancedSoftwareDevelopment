package edu.najah.cap.advance.quality_classes.prmitive;

public class App2 {

    public static void main(String[] args) {

    }


    public static boolean checkPassword(String password) {
        if(isEmpty(password)) {
            return false;
        }
        if (!meetPasswordLength(password)) {
            return false;
        }
        if (containsPersonalInfo(password)) {
            return false;
        }

        return true;
    }

    private static boolean containsPersonalInfo(String password) {
        return password.contains("personal info");
    }

    private static boolean meetPasswordLength(String password) {
        return password.length() >= 5;
    }

    private static boolean isEmpty(String password) {
        return password == null || password.isEmpty();
    }
}
