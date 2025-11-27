package edu.najah.cap.advance.observer.example1;

public class B implements Observer {
    private int value;

    B(Topic topic) {
        topic.subscribe(this);
    }

    @Override
    public void update(int value) {
        System.out.println("Update value in B");
        this.value = value;
    }
}
