package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance;

public class StringTemplate implements Template<String> {

    private String id;
    private String message;

    public StringTemplate(String id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String prepareMessage() {
        return "Notification ID: " + id + ", Message: " + message;
    }
}
