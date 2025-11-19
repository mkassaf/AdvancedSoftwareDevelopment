package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1;

public class SqLite implements Database {
    @Override
    public void insert(String records) {
        System.out.println("Inseting data to SqLite db: " + records);
    }

    @Override
    public void retrive(String id) {
        System.out.println("Getting data from SqLite db: " + id);
    }
}
