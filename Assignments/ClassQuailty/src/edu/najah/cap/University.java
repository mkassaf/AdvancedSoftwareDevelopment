package edu.najah.cap;

import edu.najah.cap.reports.ReportFactory;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final String name;
    private List<Student> students;
    private List<Course> courses;

    public University(String name) {
        this.name = name;
        this.students = students = new ArrayList<Student>();
        this.courses = courses = new ArrayList<Course>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     * TODO
     *
     * @param student
     * @param course
     */
    public void enrollStudentInCourse(Student student, Course course) {
        student.getCourses().add(course);
        course.getStudents().add(student);
    }

    private void printStudents() {
        ReportFactory.getReport("student").generateReport(students);
    }
    private void printCourses() {
        ReportFactory.getReport("course").generateReport(courses);
    }
    private void printStudentsInCourse(Course course) {
        ReportFactory.getReport("AvailableCoursesReport").generateReport(this);
    }
    public void printCoursesForStudent(Student student) {
        ReportFactory.getReport("AvailableStudentsReport").generateReport(this);
    }
    public void printAll() {
        ReportFactory.getReport("UniversityReport").generateReport(this);
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
