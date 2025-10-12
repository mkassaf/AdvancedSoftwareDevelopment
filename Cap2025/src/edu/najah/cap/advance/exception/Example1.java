package edu.najah.cap.advance.exception;

import java.util.Date;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args)  {
        ClosableConnection  connection = new ClosableConnection();
        try {
            connection.connect();
            System.out.println("Step 1: " + connection);
        } catch (Exception e) {
            System.err.println("Exception step " + (new Date()).getTime());
        } finally {
            System.out.println("Final Step " + (new Date()).getTime());
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
            System.err.println("Exception step in final");
        }

    }


    public static class ClosableConnection implements AutoCloseable {

        public void connect() {
            System.out.println("Connecting connection");
            throw new RuntimeException();
        }

        @Override
        public void close() throws Exception {
            System.out.println("Closing connection");
        }
    }
}
