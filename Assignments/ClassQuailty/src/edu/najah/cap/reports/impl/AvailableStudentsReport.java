package edu.najah.cap.reports.impl;

import edu.najah.cap.Student;
import edu.najah.cap.University;
import edu.najah.cap.reports.abstraction.Reportable;

import java.util.List;

public class AvailableStudentsReport implements Reportable<University> {

    @Override
    public void generateReport(University university) {
        generateReportForStudents(university.getStudents());
    }
    private void generateReportForStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println("Name:: " + student.getName() + " ID:: " + student.getId() + " GPA:: " + student.getGpa());
        }
    }
}
