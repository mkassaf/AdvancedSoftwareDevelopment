package edu.najah.cap.advance.observer.example1;

public class A implements  Observer {

    A(Topic topic) {
        topic.subscribe(this);
    }

    @Override
    public void update(int value) {
        System.out.println("Update value in A " + value);
    }
}
