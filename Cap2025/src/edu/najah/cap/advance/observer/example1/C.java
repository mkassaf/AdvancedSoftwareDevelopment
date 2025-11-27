package edu.najah.cap.advance.observer.example1;

public class C implements Observer {
    private int value;

    C(Topic topic) {
        topic.subscribe(this);
    }

    @Override
    public void update(int value) {
        System.out.println("Update value in C");
        this.value = value;
    }
}
