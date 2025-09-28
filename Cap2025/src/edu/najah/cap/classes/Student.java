package edu.najah.cap.classes;

public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Student) {
            Student student = (Student) object;//casting -> you know and sure object is studnet object
            return student.getName() == this.name;
        }
        return false;
    }

    public Student getThis() {
        return this;
    }
}
