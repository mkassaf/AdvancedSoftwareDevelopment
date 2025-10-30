package edu.najah.cap.advance.liskov.exmaple2.correct;

public class Hawk extends Bird implements Flybale {

    private String type;

    Hawk(String name) {
        super(name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("fly " + getName());
    }
}
