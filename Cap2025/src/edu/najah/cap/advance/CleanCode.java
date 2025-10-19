package edu.najah.cap.advance;

import java.util.Scanner;

public class CleanCode {

    private static final int MIN_ALLOWED_AGE_BASED_ON_US_LAW = 18;
    private static final int SUSPENED_STATUS = 1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        int status = input.nextInt();

        if(isEligable(age, status)) {
            System.out.println("You are adult");
        }


    }

    private static boolean isEligable(int age, int status) {
        return  age >= MIN_ALLOWED_AGE_BASED_ON_US_LAW && status != SUSPENED_STATUS;
    }
}
