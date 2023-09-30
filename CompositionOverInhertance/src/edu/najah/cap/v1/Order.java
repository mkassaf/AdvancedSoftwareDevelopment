package edu.najah.cap.v1;

import edu.najah.cap.v1.items.Drink;

public class Order {


    public static void main(String[] args) {
        Order order = new Order();
        order.getDrink("Coffee");
        order.getDrink("Tea");
        order.getDrink("TeaWithHonny");
        order.getDrink("TeaWithExtraHonny");



    }


    public void getDrink(String name) {
        Drink drink = DrinkFactory.getDrink(name);
        System.out.println("Adding " + drink.getName() + " to order");
        System.out.println("Price: " + drink.getPrice());
        System.out.println("Description: " + drink.getDesc());
    }
}
