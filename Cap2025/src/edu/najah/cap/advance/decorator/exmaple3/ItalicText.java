package edu.najah.cap.advance.decorator.exmaple3;

public class ItalicText extends DocratorText {


    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String getText(String str) {
        return "<i>" + text.getText(str) + "</i>";
    }
}
