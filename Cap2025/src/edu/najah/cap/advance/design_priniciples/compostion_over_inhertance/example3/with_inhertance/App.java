package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example3.with_inhertance;

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
            System.out.println("Enter the coffee type you want to buy: ");
            String coffeeType = input.next();
            Coffee coffee;
            if (coffeeType.equalsIgnoreCase("m")) {
                coffee = new CoffeeWithMilk(numberOfCoffees);
            } else if (coffeeType.equalsIgnoreCase("h")) {
              coffee = new CoffeeWithHony(numberOfCoffees);
            } else if (coffeeType.equalsIgnoreCase("2m")) {
              coffee = new CoffeeWithTwoMilk(numberOfCoffees);
            } else {
                coffee = new Coffee(numberOfCoffees);
            }

            System.out.println("Price is:  " + coffee.getPrice());
        }


    }
}
