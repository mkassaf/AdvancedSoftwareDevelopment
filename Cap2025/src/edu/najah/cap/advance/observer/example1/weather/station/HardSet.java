package edu.najah.cap.advance.observer.example1.weather.station;

import java.util.Random;

public class HardSet extends Topic {

    public HardSet(int durarion) {
        this.duration = durarion;
    }

    @Override
    protected int getData() {
        System.out.println("Get data from HardSet");
        return getFromSwitch();
    }

    private int getFromSwitch() {
        return new Random().nextInt(0, 50);
    }
}
