package edu.najah.cap.advance.decorator.exmaple4.style;

import edu.najah.cap.advance.decorator.exmaple4.Element;

public abstract class DecoratorStyle implements Element {
    protected Element element;

    public DecoratorStyle(Element element) {
        this.element = element;
    }
}
