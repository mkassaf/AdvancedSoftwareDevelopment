package edu.najah.cap.reports.impl;

import edu.najah.cap.Student;
import edu.najah.cap.reports.abstraction.Reportable;

public class StduentReportV2 implements Reportable<Student> {

        @Override
        public void generateReport(Student student) {
            System.out.println("Name:: " + student.getName());
            System.out.println("ID:: " + student.getId());
            System.out.println("GPA:: " + student.getGpa());
        }
}
