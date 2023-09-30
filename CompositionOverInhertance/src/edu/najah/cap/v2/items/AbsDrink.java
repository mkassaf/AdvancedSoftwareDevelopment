package edu.najah.cap.v2.items;

import java.util.ArrayList;
import java.util.List;

public class AbsDrink implements Drink {

    private String name;
    private double price;
    private String desc;

    private List<Extra> extras;

    public AbsDrink(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        extras = new ArrayList<>();
    }

    public String getName() {
        return this.name + " with " + getName(this.extras);
    }

    private String getName(List<Extra> extras) {
        String name = "";
        for (Extra extra : extras) {
            name += extra.getName() + ", ";
        }
        return name;
    }

    public double getPrice() {
        return this.price + getPrice(this.extras);
    }

    private double getPrice(List<Extra> extras) {
        double price = 0;
        for (Extra extra : extras) {
            price += extra.getPrice();
        }
        return price;
    }

    public String getDesc() {
        return this.desc;
    }

    public void addExtra(Extra extra) {
        extras.add(extra);
    }


}
