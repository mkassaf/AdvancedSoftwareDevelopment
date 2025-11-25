package edu.najah.cap.advance.decorator.exmaple3;

public class StrongText extends DocratorText {


    public StrongText(Text text) {
        super(text);
    }

    @Override
    public String getText(String str) {
        return "<strong>" + text.getText(str) + "</strong>";
    }
}
