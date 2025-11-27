package edu.najah.cap.advance.observer.example1.weather.clients;

public class Lcd implements Observer {

    public void display(int temp) {
        System.out.println("Current temp:: " + temp);
    }

    @Override
    public void update(int temp) {
        System.out.println("Updating LCD!!");
        display(temp);
    }
}
