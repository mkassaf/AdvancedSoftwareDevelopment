package edu.najah.cap.advance.decorator.exmaple3;

public class BoldText extends DocratorText {


    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String getText(String str) {
        return "<b>" + text.getText(str) + "</b>";
    }
}
