package edu.najah.cap.advance.design_priniciples.programm_to_interface.example2;

public class ScreenFactory {

    public static Screen getScreen(ScreenType screenType) {
        switch (screenType) {
            case LCDScreen:
                return new LCDScreen();
            case LEDScreen:
                return new LEDScreen();
            default:
                return new ProjectScreen();
        }
    }
}
