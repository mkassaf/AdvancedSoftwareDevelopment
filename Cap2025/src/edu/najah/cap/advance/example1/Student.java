package edu.najah.cap.advance.example1;

public class Student implements Comparable<Student> {
    public int id;
    protected String name;
    private int age;
    private Gender gender;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void print() {
        System.out.println("Company id: " + id + " name: " + name + " age: " + age);
        Math.abs(this.age - this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;//data type casting

            if(this.id == student.id && this.name == student.name && this.age == student.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id + this.name.hashCode() + this.age;
    }

    @Override
    public String toString() {
        return  "Company id: " + id + " name: " + name + " age: " + age;
    }

    public String stdeuntToString() {
        return "Company id: " + id + " name: " + name + " age: " + age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public int compareTo(Student o) {
        return o.age - this.age;
    }
}
