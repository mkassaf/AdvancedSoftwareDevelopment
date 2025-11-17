package edu.najah.cap.advance.design_priniciples.factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Database database = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select Database type:");

        String type = scanner.next();

        database = DatabaseFactory.getDatabase(type);


        database.connect();

    }
}
