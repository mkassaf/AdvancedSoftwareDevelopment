package edu.najah.cap.advance.design_priniciples.singelton;

public class Database {

    private static Database instance = null;
    private static int counter = 0;
    private static int conflictCounter = 0;
    private static int innerCounter = 0;
    private static int syncCounter = 0;
    private static int notInnerNullCounter = 0;
    private static int notOuterNullCounter = 0;

    private int anyCounter;


    private Database() {
        System.out.println("Should be called only once!!");
    }

    public static Database getInstance() {
        counter++;//896 threads tried to update this counter at the same time
        if (instance == null) {//7 threads read the instance = null at the same time
            conflictCounter++;//in parallel 7 6 5
            synchronized (Database.class) {
                innerCounter++;
                if (instance == null) {
                    syncCounter++;
                    instance = new Database();
                } else {
                    notInnerNullCounter++;
                }
            }
        } else {
            notOuterNullCounter++;
        }
        return instance;
    }

    public static void print() {
        System.out.println("syncCounter:: " + syncCounter);
        System.out.println("conflictCounter:: " + conflictCounter);
        System.out.println("innerCounter:: " + innerCounter);
        System.out.println("notInnerNullCounter:: " + notInnerNullCounter);
        System.out.println("notOuterNullCounter:: " + notOuterNullCounter);
        System.out.println("counter:: " + counter);
    }

    public void insert() {
        if (instance != null) {
            System.out.println("Inserting data to db");
        }
    }
}
