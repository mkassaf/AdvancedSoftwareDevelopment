package edu.najah.cap.advance.observer.example1.weather.station;

import edu.najah.cap.advance.observer.example1.weather.clients.Observer;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;


public abstract class Topic {
    private List<Observer> observers = new ArrayList<>();
    protected int duration = 10000;

    public void notifyAll(int temp) {
        for (Observer observer: observers) {
            observer.update(temp);
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    public final void run() {
        while (true) {
            int temp = getData();
            notifyAll(temp);
            try {
                sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    protected abstract int getData();
}
