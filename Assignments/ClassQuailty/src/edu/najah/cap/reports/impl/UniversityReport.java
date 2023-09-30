package edu.najah.cap.reports.impl;

import edu.najah.cap.Course;
import edu.najah.cap.University;
import edu.najah.cap.reports.ReportFactory;
import edu.najah.cap.reports.abstraction.Reportable;

import java.util.List;

public class UniversityReport implements Reportable<University> {

    @Override
    public void generateReport(University university) {
        System.out.println("University Name:: " + university.getName());
        generateReportForCourses(university.getCourses());
    }

    private void generateReportForCourses(List<Course> courses) {
        for (Course course : courses) {
            System.out.println("Name:: " + course.getName() + " ID:: " + course.getId());
            ReportFactory.getReport("course").generateReport(course);
        }
    }

}
