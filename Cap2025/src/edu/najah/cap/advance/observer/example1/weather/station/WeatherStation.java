package edu.najah.cap.advance.observer.example1.weather.station;

import java.util.Random;

public class WeatherStation extends Topic {


    private int getTemprture() {
        System.out.println("Checking from WeatherStation");
        return new Random().nextInt(1, 40);
    }

    @Override
    protected int getData() {
        return getTemprture();
    }
}
