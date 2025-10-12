package edu.najah.cap.advance.oop.example2;

public abstract class Device {
    //Attributes or properties
    private String color;
    private String model;

    public Device(String color, String model) {
        this.color = color;
        this.model = model;
        System.out.println("Device constructor is called!");
    }

    //Behavior
    public void turnOn() {
        System.out.println("Turning on");
    }

    public void turnOff() {
        System.out.println("Turning off");
    }

    public String getColor() {
        if (color == null) {
            return "N/A";
        }
        return color;
    }

    public String getModel() {
        if (model == null) {
            return "Unset!";
        }
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        if (model == null || model.equals("") || model.trim().equals("")) {
            System.out.println("Invalid model");
            return;//exit
        }
        this.model = model;
    }

    public abstract int getWeight();
}
