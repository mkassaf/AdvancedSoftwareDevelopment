package edu.najah.cap.advance.isp.better;

import java.util.Scanner;

public class Machine {
    private Payment payment;
    private TeaMacker teaMacker;
    private CoffeeMacker coffeeMacker;

    public Machine(TeaMacker teaMacker, CoffeeMacker coffeeMacker) {
        this.coffeeMacker = coffeeMacker;
        this.teaMacker = teaMacker;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select:");
        payment.sendMoney();
        String input = scanner.next();
        switch (input) {
            case "tea":
                if (teaMacker != null ) {
                    teaMacker.prepareTea();
                }
                break;
            case  "coffee":
                if (coffeeMacker != null) {
                    coffeeMacker.paperCoffee();
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
