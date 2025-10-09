package edu.najah.cap.advance.enum_example;

public class PizzaWithoutEnum {
    private String type;
    private int size;

    public PizzaWithoutEnum(String type, int size) {
        this.type = type;
        if(size < 0 || size > 3) {
            //bad practice to throw exception in constructor
            throw new IllegalArgumentException("Invalid pizza size: " + size);
        }
        this.size = size;
    }

    public String getType() {
        return type;
    }
    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        if(size <= PizzaSizesConstants.SMALL || size >= PizzaSizesConstants.EXTRA_LARGE) {
            throw new IllegalArgumentException("Invalid pizza size: " + size);
        }
        this.size = size;
    }

}
