package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_compostion;


import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of coffees you want to buy: ");
            int numberOfCoffees = input.nextInt();
            if (numberOfCoffees == 0) {
                break;
            }
            Coffee coffee = new Coffee(numberOfCoffees);

            while (true) {
                System.out.println("Do you want to add any condiments: ");
                String coffeeType = input.next();
                if (coffeeType.equalsIgnoreCase("m")) {
                    coffee.addCondiment(new Milk());
                } else if (coffeeType.equalsIgnoreCase("h")) {
                    coffee.addCondiment(new Honey());
                } else if (coffeeType.equalsIgnoreCase("b")) {
                    coffee.addCondiment(new Butter());
                }
                if (coffeeType.equalsIgnoreCase("c")) {
                    break;
                }
            }

            System.out.println("Price is:  " + coffee.getPrice());
        }


    }
}
