package edu.najah.cap.advance;


import edu.najah.cap.advance.example1.Student;
import edu.najah.cap.advance.oop.MasterStudent;

public class Main {



    static class MyString {
        private String value;
        public MyString(String value) {
            this.value = value;
        }
    }

    static class MyCustomString extends MyString {
        public MyCustomString(String value) {
            super(value);
        }
        // assume this is hypothetically allowed
    }

    public static void main(String[] args) {
        var a = new MyString("test");
        var b = new MyCustomString("test");
        System.out.print(b.equals(a)); // ?
        System.out.print(b.equals(b)); // ?
        System.out.print(a.equals(b)); // ?
    }

}
