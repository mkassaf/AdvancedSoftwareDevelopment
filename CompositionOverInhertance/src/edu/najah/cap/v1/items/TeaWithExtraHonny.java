package edu.najah.cap.v1.items;

public class TeaWithExtraHonny extends TeaWithHonny {

    @Override
    public String getName() {
        return super.getName() + " with Extra Honny";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " with Extra Honny";
    }
}
