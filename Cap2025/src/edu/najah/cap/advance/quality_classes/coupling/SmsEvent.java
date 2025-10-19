package edu.najah.cap.advance.quality_classes.coupling;

public class SmsEvent implements Event {

    private String message;

    public SmsEvent(String message) {
        this.message = message;
    }

    @Override
    public String extract() {
        return "SMS Event: " + message;
    }
}
