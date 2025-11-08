package edu.najah.cap.advance.isp;

import java.util.Scanner;

public class Machine {
    private IVendingMachine vendingMachine;

    public Machine(IVendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select:");
        vendingMachine.sendMoney();
        String input = scanner.next();
        switch (input) {
            case "tea":
                vendingMachine.papareTea();
                break;
            case  "coffee":
                vendingMachine.papareCoffee();
                break;
            default:
                System.out.println("Invalid option");
        }


    }

}
