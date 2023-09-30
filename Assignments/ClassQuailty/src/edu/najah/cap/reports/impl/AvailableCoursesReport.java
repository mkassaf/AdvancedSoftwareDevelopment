package edu.najah.cap.reports.impl;

import edu.najah.cap.Course;
import edu.najah.cap.University;
import edu.najah.cap.reports.abstraction.Reportable;

import java.util.List;

public class AvailableCoursesReport implements Reportable<University> {

    @Override
    public void generateReport(University university) {
        generateReportForCourses(university.getCourses());
    }
    private void generateReportForCourses(List<Course> courses) {
        for (Course course : courses) {
            System.out.println("Name:: " + course.getName() + " ID:: " + course.getId());
        }
    }
}