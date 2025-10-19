package edu.najah.cap.advance.design_priniciples.programm_to_interface.correct;

public interface Database {
    void open();
    void close();
    void update(String data);
    String retrive();
}
