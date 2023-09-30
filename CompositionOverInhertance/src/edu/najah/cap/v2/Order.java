package edu.najah.cap.v2;

import edu.najah.cap.v2.items.Drink;
import edu.najah.cap.v2.items.Extra;
import edu.najah.cap.v2.items.Milk;
import edu.najah.cap.v2.items.Sugger;

public class Order {


    public static void main(String[] args) {
        Order order = new Order();
        Drink drink = DrinkFactory.getDrink("Coffee");

        print(drink);

        drink.addExtra(new Milk());

        //Coffee with milk
        print(drink);
        //Coffee with milk with milk
        drink.addExtra(new Milk());
        print(drink);

        //Coffee with milk with milk with Sugger
        drink.addExtra(new Sugger());
        print(drink);
    }



    public static void print(Drink drink) {
        System.out.println("Adding " + drink.getName());
        System.out.println("Price: " + drink.getPrice());
        System.out.println("Description: " + drink.getDesc());
    }
}
