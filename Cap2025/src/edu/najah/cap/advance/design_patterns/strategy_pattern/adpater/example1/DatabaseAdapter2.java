package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1;

import edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1.legacy.Legacy2Database;

public class DatabaseAdapter2 implements Database {

    private Legacy2Database legacy2Database;

    public DatabaseAdapter2(Legacy2Database legacy2Database) {
        this.legacy2Database = legacy2Database;
    }

    @Override
    public void insert(String records) {
        legacy2Database.insert(records);
    }

    @Override
    public void retrive(String id) {

        legacy2Database.get(Integer.valueOf(id));// Wrapper
    }
}
