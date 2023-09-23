package edu.najah.cap.cohesion.after;

import edu.najah.cap.cohesion.after.intrf.IReportingManager;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.List;

public abstract class AbsReportingManager implements IReportingManager {

    public final void generateReport(List<Book> books, List<Member> members) {
        System.out.println("Overdue books report");

        generateBooksReport(books);

        generateMembersReport(members);
    }

    protected abstract void generateMembersReport(List<Member> members);

    protected abstract void generateBooksReport(List<Book> books);
}
