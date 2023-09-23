package edu.najah.cap.cohesion.after;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        System.out.println("Book " + book + " added");
    }

    public void removeBook(Book book) {
        System.out.println("Book " + book + " removed");
    }

    public void checkoutBook(Book book, Member member) {
        System.out.println("Book " + book + " checked out by " + member);
    }

    public void returnBook(Book book, Member member) {
        System.out.println("Book " + book + " returned by " + member);
    }

    public void updateBook(Book book) {
        System.out.println("Book " + book + " updated");
    }
    public List<Book> getBooks() {
        return books;
    }
}
