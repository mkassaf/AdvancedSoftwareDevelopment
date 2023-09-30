package edu.najah.cap.v2;

import edu.najah.cap.v2.items.*;

public class DrinkFactory {
    public static Drink getDrink(String name) {
        if (name.equals("Coffee")) {
            return new Coffee();
        } else if (name.equals("Tea")) {
            return new Tea();
        } else {
            return null;
        }
    }
}
