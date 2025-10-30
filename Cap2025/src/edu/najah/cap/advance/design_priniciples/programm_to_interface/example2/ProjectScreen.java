package edu.najah.cap.advance.design_priniciples.programm_to_interface.example2;

public class ProjectScreen implements Screen {

    public void displayOnScreen() {
        System.out.println("A large logic to display image via projector");
    }

    @Override
    public void printOnScreen() {
        displayOnScreen();
    }
}
