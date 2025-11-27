package edu.najah.cap.advance.decorator.exmaple4.style;

import edu.najah.cap.advance.decorator.exmaple4.Element;

public class Italic extends DecoratorStyle {

    public Italic(Element element) {
        super(element);
    }

    @Override
    public String render(String input) {
        return String.format("<i>%s</i>", element.render(input));
    }
}
