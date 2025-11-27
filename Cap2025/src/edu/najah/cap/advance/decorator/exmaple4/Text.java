package edu.najah.cap.advance.decorator.exmaple4;

public class Text implements Element {
    @Override
    public String render(String input) {
        return String.format("<Text>%s</Text>", input);
    }
}
