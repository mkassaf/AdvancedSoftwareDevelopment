package edu.najah.cap.classes;

public class OOP {

    public static void main(String[] args) {
        Student s1 = new Student("Student 1");
        Student s2 = new Student("Student 1");

        System.out.println(s1.getName());
        System.out.println(s2.getName());

        Object obj = new Student("Student 222");

        Student s4 = (Student) obj;

        System.out.println(s4.getName());

        System.out.println("== " + (s1 == s2));//will return false
        System.out.println("equals?? " + s1.equals("s4"));

        System.out.println(s2.getClass().getName());
        // will print true or false
        // equals function where did it come from?


        User user = new User(1, "assaf", "123");

        System.out.println(user.id);
        System.out.println(user.username);
        user.sayHello();
        //System.out.println(user.password);
    }
}
