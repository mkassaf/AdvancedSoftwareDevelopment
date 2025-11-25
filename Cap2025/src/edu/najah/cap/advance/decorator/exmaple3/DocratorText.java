package edu.najah.cap.advance.decorator.exmaple3;

public abstract class DocratorText implements Text {
    protected Text text;
    public DocratorText(Text text){
        this.text = text;
    }
}
