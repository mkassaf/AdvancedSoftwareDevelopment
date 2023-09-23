package edu.najah.cap.main;

import java.util.Scanner;

public class ExecpetionExample {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter  number 1");
            int number = scanner.nextInt();
            System.out.println("Enter  numbers 2");
            int number2 = scanner.nextInt();

            System.out.println(number / number2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Do another action .. ");

    }
}
