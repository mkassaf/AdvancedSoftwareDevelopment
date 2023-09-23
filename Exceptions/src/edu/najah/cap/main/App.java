package edu.najah.cap.main;

import java.util.EmptyStackException;
import java.util.Scanner;

public class App {


    public App() {
        int x = 10;
        int y =20;
        try {
            connect(4);

        } catch (Exception e){
            //
        }

        //
    }

    public static int execute(String name, String pawword){
        String query = "Select * from User where name like '"+name+"' and pawword = '" +pawword+ "'";
        System.out.println(query);
        //int result = executeFromDB(query)
        return 1;
    }

    public static void main(String[] args) {
        

        if (execute("Kharobi", "asdasd' or '1' = '1") > 0){
            System.out.println("Authorized !!");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1: ");

        System.out.println("====== 1");
        try {
            System.out.println("====== 2 try");
            //throw new Exception("E");
        } catch (Exception e){
            System.out.println("====== 3 catch");
        } finally {
            System.out.println("====== 4 finally");
        }
        System.out.println("====== End ");

        while (true){
            System.out.println("Enter n1: ");
            int n1 = scanner.nextInt();
            System.out.println("Enter n2: ");
            int n2 = scanner.nextInt();

            Double result = null;

            try {
                result = divide(n1,n2);
                System.out.println("result : " + result);
            } catch (IllegalArgumentException e){
                //e.printStackTrace();
                System.err.println("IllegalArgumentException:: " + e.getMessage());
            } catch (Exception e){
                e.printStackTrace();
                System.err.println("RuntimeException:(SystemBusyException): " + e.getMessage());
                System.out.println("Sending email to the admin user.");
            }


        }
    }


    /**
     * USed from another component
     * @param x
     * @return
     */
    public static int connectToDB(int x, int timeout){
        //logic
        if (x == 0){
            return 0;//System is down
        }
        if (x == 10){
            return -1;//System is currently busy
        }
        if (x == 20){
            return -10;//Timout error -> 10 sec -> 20 sec
        }
        return 200;//connected
    }

    public static void connect(int input) throws Exception {
        int connectStatus  = connectToDB(input, 10);
        if (connectStatus == 0){
            throw new Exception("System is down");
        } else if (connectStatus == 10){
            //system busy -- let's try again
            // try 5, wait 5 seconds
            for (int i = 0; i < 5 && connectStatus == 10; i++) {
                Thread.sleep(5);
                connectStatus  = connectToDB(input, 10);

            }
            throw new Exception("System is busy");//

        } else if (connectStatus == 20){
            connectStatus  = connectToDB(input, 100);//


        } else {
            //nothing
        }
    }


    public static Double divide(int n1, int n2) throws Exception {


        if (isNotValid(n2)){
            throw new IllegalArgumentException("Can't divide by zero");
        }
        if (n1 == 0){//"connectDatabase"
            throw new SystemBusyException("System is busy");
        }
        if (n1 == n2){
            throw new DivideByZeroException("Error .... ");
        }
        return Double.valueOf(n1/n2);
    }

    private static boolean isNotValid(int n2) {
        return n2 == 0;
    }
}
