package edu.najah.cap.advance.isp.example2;

import java.util.Scanner;

public class Machine {
    private VendingMachine vendingMachine;

    Machine(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    public void run() {
       while (true) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Please select:: ");
           var option = scanner.nextInt();

           switch (option) {
               case 1:
                   vendingMachine.prepareCoffee();
                   break;
               case 2:
                   vendingMachine.prepareWater();
                   break;
               case 3:
                   vendingMachine.prepareSnacks();
                   break;
               case 0:
                   return;
           }
       }
    }
}
