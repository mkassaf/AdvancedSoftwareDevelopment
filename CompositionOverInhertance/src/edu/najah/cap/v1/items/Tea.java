package edu.najah.cap.v1.items;

public class Tea implements Drink {
    private String name;
    private double price;
    private String desc;

    public Tea() {
        this.name = "Tea";
        this.price = 1.99;
        this.desc = "Tea";
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
