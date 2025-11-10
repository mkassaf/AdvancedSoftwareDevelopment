package edu.najah.cap.advance.design_priniciples.singelton;

import java.time.Instant;
import java.util.stream.IntStream;

public class MyApp {

    public static void main(String[] args) {
        var current = Instant.now();

        IntStream.range(0, 1000).parallel().forEach(i -> {
            new Thread(()-> {
                Connection connection1 = Connection.getInstance();
            }).run();
        });
        System.out.println("counterOfCreation:  " + Connection.counterOfCreation);//number of conflict
        System.out.println("counterOfConflict:  " + Connection.counterOfConflict);//counter of getInstance calls
        System.out.println("counterOfTryCreation:  " + Connection.counterOfTryCreation);//counter of getInstance calls
        System.out.println("counter:  " + Connection.counter);//counter of getInstance calls
        System.out.println("counter:  " + Connection.myMap.size());//counter of getInstance calls

        /*
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        Connection connection3 = Connection.getInstance();


        if (connection1 == connection2) {
            System.out.println("The are pointing to the same object");
        } else {
            System.out.println("The ARE NOT pointing to the same object");
        }*/

        System.out.println(Instant.now().toEpochMilli() - current.toEpochMilli());
    }
}
