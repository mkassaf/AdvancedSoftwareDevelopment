package edu.najah.cap.advance.oop.example2;

public class Mobile extends Device {

    public Mobile(String color, String model) {
        super(color, model);
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
