package edu.najah.cap.advance.oop.example1;

public abstract class Car {
    //Properties / attributes

    public int model;
    public String color;


    /*public Car() {
        System.out.println("No param Car constructor is called");
    }*/

    public Car(int model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Car constructor called!");
    }

    // Behavior  action car can do

    public void drive() {
        System.out.println("drive");
    }

    public void stop() {
        System.out.println("stop");
    }

    public void start() {
        System.out.println("Check 1");
        System.out.println("Check 2");
        System.out.println("Check 3");
        System.out.println("Car started!");
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        if (model <= 0) {
            System.out.println("Invalid model");
        } else {
            this.model = model;
        }
    }

    public String getColor() {
        if (color == null) {
            return "Color is unset";
        }
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract int getId();
}
