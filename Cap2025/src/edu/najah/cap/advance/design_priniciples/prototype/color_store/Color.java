package edu.najah.cap.advance.design_priniciples.prototype.color_store;

public abstract class Color implements Cloneable {
    protected String colorName;
    protected String size;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }

    public void printColor() {
        System.out.println(colorName);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
