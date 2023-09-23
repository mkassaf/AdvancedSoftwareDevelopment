package edu.najah.cap.cohesion.before;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<Book> books;
    private List<Member> members;

    public LibraryManager() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Methods for managing books
    public void addBook(Book book) {
        books.add(book);
    }

    public void editBook(Book book) {
        System.out.println("Book " + book + " edited");
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void checkoutBook(Book book, Member member) {
        System.out.println("Book " + book + " checked out by " + member);
    }

    public void returnBook(Book book, Member member) {
        System.out.println("Book " + book + " returned by " + member);
    }

    // Methods for managing members
    public void addMember(Member member) {
        members.add(member);
    }

    public void editMember(Member member) {
        System.out.println("Member " + member + " edited");
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void generateReport() {
        System.out.println("Overdue books report");

        for (Book book : books) {
            System.out.println(book);
        }

        for (Member member : members) {
            System.out.println(member);
        }
    }
}

