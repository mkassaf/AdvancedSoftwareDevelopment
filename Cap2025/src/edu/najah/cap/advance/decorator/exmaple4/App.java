package edu.najah.cap.advance.decorator.exmaple4;

import edu.najah.cap.advance.decorator.exmaple4.style.Bold;
import edu.najah.cap.advance.decorator.exmaple4.style.Italic;
import edu.najah.cap.advance.decorator.exmaple4.style.Stronge;

public class App {

    public static void main(String[] args) {
        Element element = new Text();
        System.out.println(element.render("Body"));

        Element boldText = new Bold(element);

        System.out.println(boldText.render("Body"));

        Element strongBoldText = new Stronge(boldText);
        System.out.println(strongBoldText.render("Body"));

        Element italicStrongBoldText = new Italic(strongBoldText);
        System.out.println(italicStrongBoldText.render("Body"));
    }
}
