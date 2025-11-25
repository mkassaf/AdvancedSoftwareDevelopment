package edu.najah.cap.advance.compostition.exmaple3;

public class MenuItem extends MenuComponent {


    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Menu item:: " + name);
    }
}
