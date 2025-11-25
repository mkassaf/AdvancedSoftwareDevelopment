package edu.najah.cap.advance.compostition.exmaple3;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> items = new ArrayList<>();


    public Menu(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Menu:: " + name);
        for (MenuComponent item : items) {
            item.display();
        }
    }

    public void addMenu(MenuComponent item) {
        items.add(item);
    }
}
