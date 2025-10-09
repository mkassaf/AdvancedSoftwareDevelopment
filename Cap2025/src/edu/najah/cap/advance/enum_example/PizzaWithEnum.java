package edu.najah.cap.advance.enum_example;

public class PizzaWithEnum {
    private String type;
    private PizzaSize size;

    public PizzaWithEnum(String type, PizzaSize size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }
    public PizzaSize getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

}
