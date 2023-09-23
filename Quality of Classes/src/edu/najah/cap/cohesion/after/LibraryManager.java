package edu.najah.cap.cohesion.after;


import edu.najah.cap.cohesion.after.intrf.IReportingManager;

import java.awt.print.Book;

public class LibraryManager {
    private BookManager bookManager;
    private MemeberManager memeberManager;
    private IReportingManager reportingManager;


    public LibraryManager() {
        bookManager = new BookManager();
        memeberManager = new MemeberManager();
        reportingManager = new ReportingManager();
    }

    public void generateReport() {
        reportingManager.generateReport(bookManager.getBooks(), memeberManager.getMembers());
    }

    public BookManager getBookManager() {
        return bookManager;
    }

    public MemeberManager getMemeberManager() {
        return memeberManager;
    }


    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.getBookManager().addBook(new Book());
        libraryManager.getMemeberManager().addMember(new UniMember("Ahmad", "11", "email", "000" ));
        libraryManager.getMemeberManager().addMember(new ITMemeber("Arin"));
        libraryManager.generateReport();
    }
}
