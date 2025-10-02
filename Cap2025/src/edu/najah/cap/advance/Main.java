package edu.najah.cap.advance;


import edu.najah.cap.advance.example1.Student;
import edu.najah.cap.advance.oop.MasterStudent;

public class Main {

    public static void main(String[] args) {
        var student = new Student(1 , "assaf", 20);

        MasterStudent student1 = new MasterStudent(1 , "assaf", 20);
        Student student2 = new MasterStudent(2 , "st2", 20);
        Object std3 = new MasterStudent(3 , "st3", 20);

        Object strObject = new String();
        Object strInt = new Integer(1);
        Object strMain = new Main();


        System.out.println("id: " + student1.id);
        System.out.println("username: " + student1.username);

        System.out.println("id: " + student2.id);
        System.out.println("username: " + ((MasterStudent)student2).username);//std22


    }
}
