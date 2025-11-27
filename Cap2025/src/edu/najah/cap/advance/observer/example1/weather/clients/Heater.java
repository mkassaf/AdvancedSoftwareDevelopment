package edu.najah.cap.advance.observer.example1.weather.clients;

public class Heater implements Observer {

    public void adjust(int temp) {
        if (temp > 20) {
            System.out.println("Heater turn off");
        } else {
            System.out.println("Heater turn on");
        }
    }

    @Override
    public void update(int temp) {
        System.out.println("Updating Heater");
        adjust(temp);
    }
}
