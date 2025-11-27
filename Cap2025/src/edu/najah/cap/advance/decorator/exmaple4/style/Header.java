package edu.najah.cap.advance.decorator.exmaple4.style;

import edu.najah.cap.advance.decorator.exmaple4.Element;

public class Header extends DecoratorStyle {

    public Header(Element element) {
        super(element);
    }

    @Override
    public String render(String input) {
        return String.format("<h>%s</h>", element.render(input));
    }
}
