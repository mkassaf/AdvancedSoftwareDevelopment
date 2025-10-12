package edu.najah.cap.advance.quality_classes;

public class App3 {

    public static void main(String[] args) {
        var subject = new Subject();
        subject.read(new NewTopic());
    }

    static class NewTopic implements Topic {
        @Override
        public void understand() {
            System.out.println("New topic !!");
        }
    }
}
