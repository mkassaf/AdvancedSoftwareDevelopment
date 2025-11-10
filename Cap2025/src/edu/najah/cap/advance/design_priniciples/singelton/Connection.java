package edu.najah.cap.advance.design_priniciples.singelton;

import java.util.HashMap;
import java.util.Map;

public class Connection {

    private static Connection instance = null;
    public static int counterOfCreation = 0;
    public static int counterOfTryCreation = 0;
    public static int counterOfConflict = 0;
    public static int counter = 0;
    public static Map<Integer, Integer> myMap= new HashMap();


    private Connection() {
        System.out.println("Connecting to the server");
        System.out.println("Connection is established");
    }


    private void init() {
        try {
            Thread.sleep(1000);//delay to simulate connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void notifyMe() {
        System.out.println("counterOfCreation");
    }

    public static Connection getInstance() {
        myMap.put(counter, counter);
        counter = counter + 1;
        if (instance == null) {
            counterOfConflict++;
            synchronized (Connection.class) {
                counterOfTryCreation++;
                if (instance == null) {
                    instance = new Connection();
                    counterOfCreation++;
                }
            }
        }
        return instance;
    }
}
