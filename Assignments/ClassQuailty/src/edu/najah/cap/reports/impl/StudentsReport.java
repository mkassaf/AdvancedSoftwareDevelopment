package edu.najah.cap.reports.impl;

import edu.najah.cap.Course;
import edu.najah.cap.Student;
import edu.najah.cap.reports.abstraction.Reportable;


public class StudentsReport implements Reportable<Student> {


    @Override
    public void generateReport(Student student) {
        System.out.println("Name:: " + student.getName());
        for (Course course : student.getCourses()) {
            System.out.println("Name:: " + course.getName());
        }
    }

    /**
     * Bad design
     *
     * @param object
     */
    public void generateReportT(Object object) {
        if (object instanceof Student) {
            Student student = (Student) object;//casting
            System.out.println("Name:: " + student.getName());
            for (Course course : student.getCourses()) {
                System.out.println("Name:: " + course.getName());
            }
        } else {
            System.err.println("Invalid Object");
        }
    }
}
