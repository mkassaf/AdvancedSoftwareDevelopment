package edu.najah.cap.advance.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        run();
        System.out.println("Number of connection is: " + Connection.getNumbOfConnection());
/*
        while (true) {
            try (Connection connection = new Connection()) {
                connection.connect();
                System.out.println("Number of connections: " + connection.getNumbOfConnection());
                Scanner input = new Scanner(System.in);
                System.out.println("Enter number");
                int number = input.nextInt();//at this line, it throws an exception!
                System.out.println("The number is " + number);
                System.out.println("Number of connections: " + connection.getNumbOfConnection());
            } catch (Exception e) {
                System.err.println("Invalid input: " + e.getMessage());
            }
        }
        */

    }

    public static void run() {
        while (true) {
            Connection connection = new Connection();
            try {
                connection.connect();
                System.out.println("Number of connections: " + connection.getNumbOfConnection());
                Scanner input = new Scanner(System.in);
                System.out.println("Enter number");
                int number = input.nextInt();//at this line, it throws an exception!
                System.out.println("The number is " + number);
                System.out.println("Number of connections: " + connection.getNumbOfConnection());

                if(number == 0) {
                    return;
                }

            } catch (Exception e) {
                System.err.println("Invalid input: " + e.getMessage());
            } finally {
                System.out.println("Closing ......");
                connection.close();
            }
        }
    }

    public static class Connection implements AutoCloseable {
        private static int numbOfConnection = 0;

        public void connect() {
            System.out.println("Connect to server");
            numbOfConnection++;
        }

        public void close() {
            System.out.println("Connection closed");
            numbOfConnection--;
        }

        public static int getNumbOfConnection() {
            return numbOfConnection;
        }

    }
}
