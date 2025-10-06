package edu.najah.cap.advance.oop.example2;

public class Camera extends Device {
    private int weight;

    public Camera(int weight) {
        super("N/A", "unSet!");
        this.weight = weight;
        System.out.println("Camera constructor without param is called!");
    }

    public Camera(String model, String color,  int weight) {
        super(color, model);
        this.weight = weight;
        System.out.println("Camera constructor with param is called!");
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
