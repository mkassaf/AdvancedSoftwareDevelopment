package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance;

public class IntTemplate implements Template<Integer> {

    private int id;
    private int message;

    public IntTemplate(int id, int message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public Integer prepareMessage() {
        return id + message;
    }
}
