package edu.najah.cap.advance.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Data implements Topic {
    private int value;

    private final List<Observer> observers = new ArrayList<>();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }

    private void notifyObservers(int value) {
        for (var observer: observers) {
            observer.update(value);
        }
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

}
