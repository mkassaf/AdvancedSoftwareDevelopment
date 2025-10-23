package edu.najah.cap.advance.quality_classes.coupling;

public class TextEvent implements Event {
    private String text;

    public TextEvent(String text) {
        this.text = text;
    }

    @Override
    public String extract() {
        return text;
    }
}
