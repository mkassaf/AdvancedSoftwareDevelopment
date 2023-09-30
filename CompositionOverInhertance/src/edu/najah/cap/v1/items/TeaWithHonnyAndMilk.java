package edu.najah.cap.v1.items;

public class TeaWithHonnyAndMilk extends TeaWithHonny {
    @Override
    public String getName() {
        return super.getName() + " with Milk";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.3;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " with Milk";
    }
}
