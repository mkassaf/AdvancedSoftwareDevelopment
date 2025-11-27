package edu.najah.cap.advance.decorator.exmaple4.style;

import edu.najah.cap.advance.decorator.exmaple4.Element;

public class Bold extends DecoratorStyle {

    public Bold(Element element) {
        super(element);
    }

    @Override
    public String render(String input) {
        return String.format("<b>%s</b>", element.render(input));
    }
}
