package edu.najah.cap.advance.design_priniciples.prototype.color_store;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<>();

    static {
        System.out.println("I am static block!!!");
        colorMap.put("Red", new RedColor());
        colorMap.put("Blue", new BlueColor());
    }

    public static Color getColor(String name) {
        return (Color) colorMap.get(name).clone();
    }

}
