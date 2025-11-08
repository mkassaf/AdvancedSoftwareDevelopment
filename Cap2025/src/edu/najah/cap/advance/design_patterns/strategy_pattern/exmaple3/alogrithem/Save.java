package edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem;

public class Save implements Savable {

    private String status = "";
    private static Savable instance = null;

    private Save() {
        connectToTheServer();
    }

    private void connectToTheServer()  {
        System.out.println("Connecting to the sever");
        try {
            //Sleep for 3 seconds to simulate the time to connect to the server.
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        System.out.println("Connected");
        status = "Connected";
    }

    @Override
    public void save() {
        if (status.equals("Connected")) {
            System.out.println("logic to save photo \nSaving ... ");
        } else {
            System.out.println("System is not connected, please connect.");
        }

    }

    public static Savable getInstance() {
        //logic
        //1- First, we do not have any object ->
        // 1.1 create object
        // 1.2 save object
        // 1.3 return it
        //2- Second
        // returned the stored object
        if (instance == null) {
            instance = new Save();
        }
        return instance;
    }
}
