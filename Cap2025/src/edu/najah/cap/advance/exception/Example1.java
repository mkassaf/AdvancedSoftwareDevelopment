package edu.najah.cap.advance.exception;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args)  {
        ClosableConnection  connection = new ClosableConnection();
        try {
            connection.connect();
            System.out.println("Step 1: " + connection);
        } catch (Exception e) {
            System.err.println("Exception step");
        } finally {
            System.out.println("Final Step");
            try {
                connection.close();
            } catch (Exception e) {
                System.err.println("Exception while closing connection");
            }
        }
        System.out.println("Current Connection: " + connection);


        try(ClosableConnection connection1 = new ClosableConnection()) {
            connection1.connect();
        } catch (Exception e) {
            System.err.println("Exception step");
        }

    }


    public static class ClosableConnection implements AutoCloseable {

        public void connect() {
            System.out.println("Connecting connection");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Closing connection");
        }
    }
}
