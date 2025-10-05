package edu.najah.cap.advance.exception;

import edu.najah.cap.advance.oop.MyCustomException;

import java.io.IOException;
import java.util.Scanner;

public class ErrorHandling {


    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter a string");
                String in = input.nextLine();
                int value = Integer.parseInt(in);

                double x = 10 / value;
                System.out.println("Result = " + x);

                System.out.println("Result = " + getData(value));


                System.out.println("Successfully processed");
            }  catch (NullPointerException e) {
                System.out.println("NullPointerException :: " + e.getMessage());
            } catch (MyCustomException e) {
                System.out.println("MyCustomException :: " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println("Runtime :: " + e.getMessage());
            } catch (Exception e) {
                throw e;
            } finally {
                System.out.println("Closing program");
            }
        }
    }

    //Checked exception , unchecked
    public static String getData(int input) throws Exception{
        if(input == 0) {
            //error return nothing
            throw new IOException("Invalid input");
        } else if(input == 1) {
            throw new MyCustomException("number 1 is not allowed");
        } else {
            return String.valueOf(input);
        }

    }
}
