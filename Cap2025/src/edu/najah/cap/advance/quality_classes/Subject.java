package edu.najah.cap.advance.quality_classes;

public class Subject {


    public void read(Topic  topic) {
        topic.understand();
    }


    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.read(new RegulareTopic());
    }
}
