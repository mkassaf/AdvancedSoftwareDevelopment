package edu.najah.cap.v1.items;

public class Coffee implements Drink {
    private String name;
    private double price;
    private String desc;

    public Coffee() {
        this.name = "Coffee";
        this.price = 1.99;
        this.desc = "Coffee";
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDesc() {
        return this.desc;
    }
}
