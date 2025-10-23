package org.example;

public class Validtor {

    private static final int MIN_PASSWORD_LENGTH = 8;

    public static boolean verifyAfterCase1(String password) {
        if(password.equals("")){
            return false;
        }
        return true;
    }

    public static boolean verifyAfterCase2BeforeRefactor(String password) {
        if (!password.equals("")) {
            if (password.length() >= 8) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyAfterCase2AfterRefactor(String password) {
        if (password.equals("")) {
            return false;
        }
        if (password.length() < MIN_PASSWORD_LENGTH) {//magic number
            return false;
        }
        return true;
    }

    public static boolean verifyAfterCase3(String password) {
        if (password.equals("")) {
            return false;
        }
        if (password.length() < MIN_PASSWORD_LENGTH) {//magic number
            return false;
        }
        //logic
        return true;
    }
    /*
    1- Password is not empty
        input: ""
        output: false

        input: "ab"
        output: true

    2- Password length >= 8 chars
    input: "1212"
    output: false

    input: "12345678"
    output: true

    3- password contains digit

    4- password contains letter

    5- password contain upper case

    6- lower case

    i
     */
}
