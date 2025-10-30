package edu.najah.cap.advance.design_priniciples.programm_to_interface.example2;

public class App {
    public static void main(String[] args) {

        Screen screen = ScreenFactory.getScreen(ScreenType.Projector);

        WeatherApp weatherApp = new WeatherApp(screen);


        weatherApp.display();
    }
}
