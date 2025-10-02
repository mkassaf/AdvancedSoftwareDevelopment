package edu.najah.cap.advance.example2;


public class Student {
    private int id;
    private String name;
    private Gender gender;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", Name: " + this.name;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }


}
