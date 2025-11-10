package edu.najah.cap.advance.design_priniciples.singelton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

        IntStream.range(0, 10000).parallel().forEach(i -> {
            new Thread(new Job()).run();
        });

        Database.print();
    }
    
    public static class Job implements Runnable {

        @Override
        public void run() {
            Database database = Database.getInstance();
        }
    }
}
