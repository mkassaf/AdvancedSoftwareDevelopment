package edu.najah.cap.advance.example2;


import java.util.*;

public class ToStringExample {

    public static void main(String[] args) {

        String str1 = "Alaa";//
        String str2 = "Alaa";

        str2 = "this is a new str";

        System.out.println(str1 == str2);

        StringBuffer message = new  StringBuffer();

        message.append("Hi");
        message.append("!");

        message.append("\n Ahmad!");

        String finalMessage =  message.toString();

        System.out.println(message);//will back

        Student student = new Student(1, "Hadi");
        Student student2 = new Student(1, "Hadi");

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        String o1 = "Ahmad";
        String o2 = "Ahmad";

        System.out.println(o1.hashCode() ==  o2.hashCode());

        Student alaa = new Student(1, "Alaa", Gender.FEMALE);
        Student hadi = new Student(1, "Hadi", Gender.MALE);

        sayHiToFemale(alaa);
        sayHiToFemale(hadi);

        System.out.println(alaa.getGender().getValue());
        System.out.println(hadi.getGender().getValue());
        sayHiToFemale(null);

        System.out.println(Gender.fromValue(1));
        System.out.println(Gender.fromValue(0));

        String[] stings =  new String[2];
        stings[0] = "Alaa";
        stings[1] = "Rami";

        int[] numbers = {1, 2};
        int[] numbers2 = {1, 2, 5};
        numbers = numbers2;

        Student[] students = {student, student2};

        for (String value : stings) {

            System.out.println(value);
            value = "Massa";
        }

        System.out.println(stings[0]);//Alla
        System.out.println(stings[1]);//Rami

        for (int i = 0; i < stings.length; i++) {
            System.out.println(stings[i]);
            stings[i] = "Massa";
        }

        System.out.println(stings[0]);//Massa
        System.out.println(stings[1]);//Massa

        Set<Student> stingList = new HashSet<>();

        stingList.add(student);
        stingList.add(student);
        stingList.add(student);

        System.out.println(stingList.size());

        for (Student s : stingList) {
            System.out.println(s);
        }

    }

    public static void sayHiToFemale(Student student) {
        if(Gender.FEMALE.equals(student)) {//null pointer to check
            System.out.println("Hi " +  student.getName() + " !");
        }
    }
}
