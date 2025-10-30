package edu.najah.cap.advance.liskov.exmaple2;

public class Hawk extends Bird {

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
}
