package edu.najah.cap.v1;

import edu.najah.cap.v1.items.*;

public class DrinkFactory {
    public static Drink getDrink(String name) {
        if (name.equals("Coffee")) {
            return new Coffee();
        } else if (name.equals("Tea")) {
            return new Tea();
        } else if (name.equals("TeaWithHonny")) {
            return new TeaWithHonny();
        } else if ("TeaWithExtraHonny".equals(name)) { // this is better
            return new TeaWithExtraHonny();
        } else if ("TeaWithHonnyAndMilk".equals(name)) {
            return new TeaWithHonnyAndMilk();
        }else {
            return null;
        }
    }
}
