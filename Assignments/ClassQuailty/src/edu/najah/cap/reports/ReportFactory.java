package edu.najah.cap.reports;

import edu.najah.cap.reports.abstraction.Reportable;
import edu.najah.cap.reports.impl.*;

public class ReportFactory {

    public static Reportable getReport(String name) {
        if (name.equals("course")) {
            return new CourseReport();
        } else if (name.equals("student")) {
            return new StduentReportV2();
        } else if ("UniversityReport".equals(name)){
          return new UniversityReport();
        } else if ("AvailableStudentsReport".equals(name)) {
            return new AvailableStudentsReport();
        } else if ("AvailableCoursesReport".equals(name)) {
            return new AvailableCoursesReport();
        }
        return null;
    }
}
