package edu.najah.cap.advance.isp;

public class App {

    public static void main(String[] args) {
        Machine machine = new Machine(new MyCustomVendingMachine());

        machine.run();
    }
}
