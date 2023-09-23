package edu.najah.cap.cohesion.after.intrf;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.List;

public interface IReportingManager {
    void generateReport(List<Book> books, List<Member> members);
}
