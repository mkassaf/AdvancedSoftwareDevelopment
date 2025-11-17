package edu.najah.cap.advance.design_priniciples.prototype.color_store;

public class App {

    public static void main(String[] args) {

        Color red1 = ColorStore.getColor("Red");
        Color red2 = ColorStore.getColor("Red");

        red1.printColor();
        red2.printColor();

        red1.setSize("10");
        red2.setSize("20");

        System.out.println("Size 1:: " + red1.getSize());//10
        System.out.println("Size 2:: " + red2.getSize());//20
    }
}
