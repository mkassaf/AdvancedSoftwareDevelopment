package edu.najah.cap.advance.observer.example1.weather.clients;

import edu.najah.cap.advance.observer.example1.weather.station.TempterSensor;
import edu.najah.cap.advance.observer.example1.weather.station.Topic;
import edu.najah.cap.advance.observer.example1.weather.station.WeatherStation;

import java.util.List;

public class Poiller implements Observer {

    public Poiller(List<Topic> topics) {
        for (Topic topic : topics) {
            topic.subscribe(this);
        }
    }

    @Override
    public void update(int temp) {
        System.out.println("Poiller:: Turn on or off based on " + temp);
    }
}
