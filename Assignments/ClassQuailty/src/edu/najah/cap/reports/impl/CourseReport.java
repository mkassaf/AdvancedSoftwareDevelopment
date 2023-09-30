package edu.najah.cap.reports.impl;

import edu.najah.cap.Course;
import edu.najah.cap.Student;
import edu.najah.cap.reports.abstraction.Reportable;


public class CourseReport implements Reportable<Course> {

    @Override
    public void generateReport(Course course) {
        for (Student student : course.getStudents()) {
            System.out.println("Name:: " + student.getName());
        }
    }
}
