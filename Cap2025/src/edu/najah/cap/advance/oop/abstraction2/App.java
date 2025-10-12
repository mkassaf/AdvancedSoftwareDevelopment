package edu.najah.cap.advance.oop.abstraction2;


import edu.najah.cap.advance.oop.abstraction.Database;

public class App {

    public static Device device = new Device();
    public static Painter painter = new Painter();
    public static Cleaner cleaner = new Cleaner();
    public static Car car = new Car();
    public static Mobile  mobile = new Mobile();

    public static void main(String[] args) {
        callRun(cleaner);
        callRun(device);
        callRun(mobile);

        callRun(new Runable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });

        callPrint(painter);
        callPrint(device);
        callPrint(car);
        callPrint(mobile);

        callInteract(mobile);

        callTrunOn(device);
        callTrunOn(car);

        //Runable runable = new Runable(); //Error
        Runable runable1 = new Device();
        Runable runable2 = new Mobile();

        runable1.run();

    }

    private static void callInteract(Interactable interactable) {
        interactable.interact();
    }

    private static void callTrunOn(Device device) {
        device.trunOn();
        device.trunOff();
    }

    private static void callTrunOn(Car car) {
        car.trunOn();
        car.trunOff();
    }

    private static void callPrint(Printable printable) {
        printable.print();
    }


    private static void callRun(Runable runable) {
        runable.run();
    }



}
