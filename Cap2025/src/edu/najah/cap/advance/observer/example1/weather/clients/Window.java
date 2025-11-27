package edu.najah.cap.advance.observer.example1.weather.clients;

public class Window implements Observer {

    public void control(int temp) {
        if (temp > 30 || temp < 5) {
            System.out.println("Close!");
        } else  {
            System.out.println("Open!");
        }
    }

    @Override
    public void update(int temp) {
        System.out.println("Updating Window!!");
        control(temp);
    }
}
