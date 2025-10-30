package edu.najah.cap.advance.design_priniciples.programm_to_interface.example2;

public class WeatherApp {
    private Screen screen;

    public WeatherApp(Screen screen) {
        this.screen = screen;
    }

    public void display() {
        screen.printOnScreen();
        //((ProjectScreen)screen).displayOnScreen();

    }
}
