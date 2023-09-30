package edu.najah.cap.v2.items;

public interface Drink {
    public String getName();
    public double getPrice();
    public String getDesc();
    void addExtra(Extra extra);
}
