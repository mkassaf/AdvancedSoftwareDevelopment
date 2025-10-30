package edu.najah.cap.advance.liskov.exmaple2.correct;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    Bird(String name) {
        this.name = name;
    }
}
