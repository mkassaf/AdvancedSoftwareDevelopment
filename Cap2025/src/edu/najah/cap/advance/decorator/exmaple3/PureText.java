package edu.najah.cap.advance.decorator.exmaple3;

public class PureText implements Text {
    @Override
    public String getText(String text) {
        return text;
    }
}
