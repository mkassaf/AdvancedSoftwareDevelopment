package edu.najah.cap.advance.observer.example1.weather.station;

import java.util.Random;

public class TempterSensor extends Topic {


    public TempterSensor() {
        duration = 4000;
    }

    private int getTemprtureUsingInnerSosnor() {
        System.out.println("Checking from TempterSensor");
        return new Random().nextInt(1, 40);
    }

    @Override
    protected int getData() {
        return getTemprtureUsingInnerSosnor();
    }
}
