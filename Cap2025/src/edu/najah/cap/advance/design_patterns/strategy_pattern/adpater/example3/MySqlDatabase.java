package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example3;

public class MySqlDatabase implements Database {
    @Override
    public void insert(String records) {
        System.out.println("Inseting data to MySql db: " + records);
    }

    @Override
    public void retrive(String id) {
        System.out.println("Getting data from MySql db: " + id);
    }
}
