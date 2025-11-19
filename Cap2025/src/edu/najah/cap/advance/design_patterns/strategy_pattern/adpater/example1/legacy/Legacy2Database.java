package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1.legacy;

public class Legacy2Database {

    public void insert(String query) {
        System.out.println("Insert from legacy 2:: " + query);
    }

    public void get(int id) {
        System.out.println("Get from legacy 2:: " + id);
    }
}
