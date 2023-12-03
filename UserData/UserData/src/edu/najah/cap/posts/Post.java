package edu.najah.cap.posts;

public class Post {

    private final String id = java.util.UUID.randomUUID().toString();
    private String title;
    private String body;
    private String author;
    private String date;

    public Post(String title, String body, String author, String date) {
        this.title = title;
        this.body = body;
        this.author = author;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }
}
