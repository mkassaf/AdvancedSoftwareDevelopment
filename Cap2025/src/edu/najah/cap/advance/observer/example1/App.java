package edu.najah.cap.advance.observer.example1;

public class App {
    public static void main(String[] args) {
        Data data = new Data();

        A a = new A(data);
        B b = new B(data);
        C c = new C(data);

        var latestTopic = new LatestValue();
        Email email = new Email(latestTopic);

        latestTopic.updateMe(2);
        data.setValue(1);
    }
}
