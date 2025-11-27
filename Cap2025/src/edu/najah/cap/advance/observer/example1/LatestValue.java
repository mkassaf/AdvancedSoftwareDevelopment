package edu.najah.cap.advance.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class LatestValue implements Topic {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void updateMe(int value) {
        for (var observer: observers){
            observer.update(value * 10);
        }
    }
}
