package edu.najah.cap.cohesion.after;

import edu.najah.cap.cohesion.after.intrf.IReportingManager;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.List;

public class ReportingManager extends AbsReportingManager {

    @Override
    protected void generateMembersReport(List<Member> members) {
        for (Member member : members) {
            System.out.println(member);
        }

    }

    @Override
    protected void generateBooksReport(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
