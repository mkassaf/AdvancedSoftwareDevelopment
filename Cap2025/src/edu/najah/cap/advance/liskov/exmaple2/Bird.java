package edu.najah.cap.advance.liskov.exmaple2;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    Bird(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("fly .. " + getName());//logic of 20 lines
    }
}
