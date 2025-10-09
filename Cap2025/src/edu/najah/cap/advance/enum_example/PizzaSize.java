package edu.najah.cap.advance.enum_example;

public enum PizzaSize {
    SMALL(1), MEDIUM(2), LARGE(3), EXTRA_LARGE(4);

    private final int sizeValue;

    PizzaSize(int sizeValue) {
        this.sizeValue = sizeValue;
    }

    public int getSizeValue() {
        return sizeValue;
    }
}
