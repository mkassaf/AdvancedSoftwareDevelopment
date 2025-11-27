package edu.najah.cap.advance.observer.example1.weather;

import edu.najah.cap.advance.observer.example1.weather.clients.Heater;
import edu.najah.cap.advance.observer.example1.weather.clients.Lcd;
import edu.najah.cap.advance.observer.example1.weather.clients.Poiller;
import edu.najah.cap.advance.observer.example1.weather.clients.Window;
import edu.najah.cap.advance.observer.example1.weather.station.TempterSensor;
import edu.najah.cap.advance.observer.example1.weather.station.Topic;
import edu.najah.cap.advance.observer.example1.weather.station.WeatherStation;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Lcd lcd = new Lcd();
        Heater heater = new Heater();
        Window window = new Window();

        WeatherStation weatherStation = new WeatherStation();

        weatherStation.subscribe(lcd);
        weatherStation.subscribe(heater);
        weatherStation.subscribe(window);

        Topic tempterSensor = new TempterSensor();


        Poiller poiller = new Poiller(List.of(tempterSensor, weatherStation));

        new Thread(() -> {
            tempterSensor.run();
        }).start();

        weatherStation.run();


    }
}
