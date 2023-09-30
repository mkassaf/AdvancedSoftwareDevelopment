package edu.najah.cap;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private String major;

    private List<Student> students;

    public Course(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        students = new ArrayList<Student>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
