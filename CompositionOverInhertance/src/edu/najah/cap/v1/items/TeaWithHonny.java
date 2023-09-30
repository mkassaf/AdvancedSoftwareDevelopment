package edu.najah.cap.v1.items;

public class TeaWithHonny extends Tea {
    @Override
    public String getName() {
        return super.getName() + " with Honny";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " with Honny";
    }
}
