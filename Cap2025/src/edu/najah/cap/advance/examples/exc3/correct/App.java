package edu.najah.cap.advance.examples.exc3.correct;

import java.util.ArrayList;
import java.util.List;

public class App {

    private static List<Filter> filters = new ArrayList<>();


    private static TextProccesser textProccesser;

    static {
        filters.add(new ToLowerCaseFilter());
        filters.add(new TrimFilter());
        filters.add(new MaskFilter());
        filters.add(new SalahFilter());
        filters.add(new JaberFilter());
        textProccesser = new TextProccesser(filters);
    }

    public static void main(String[] args) {
        String text = " Hi every one, this is my Password!!! ";
        System.out.println(textProccesser.proccess(text));
    }
}
