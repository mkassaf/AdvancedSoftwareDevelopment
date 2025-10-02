package edu.najah.cap.advance.collection;

import edu.najah.cap.advance.example1.Student;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        Set<Student> studentList = new TreeSet<>();
        studentList.add(new Student(5 , "5555", 25));
        studentList.add(new Student(7 , "77777", 27));
        studentList.add(new Student(1 , "Jana", 20));
        studentList.add(new Student(1 , "Jana", 20));
        studentList.add(new Student(3 , "Sam", 26));

        System.out.println(studentList.size());//

        for (Student s : studentList) {
            System.out.println(s.toString());
        }

        //Functional interface and reactive programming
        /*studentList.forEach(student -> {
            System.out.println(student.toString());
        });*/


        var myNewList = List.of("Hi");

        myNewList.add("Hello");

    }


    static void myFunction(Student student) {
        System.out.println(student.toString());
    }
}
