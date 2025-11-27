package edu.najah.cap.advance.decorator.exmaple4.style;

import edu.najah.cap.advance.decorator.exmaple4.Element;

public class Stronge extends DecoratorStyle {

    public Stronge(Element element) {
        super(element);
    }

    @Override
    public String render(String input) {
        return String.format("<strong>%s</strong>", element.render(input));
    }
}
