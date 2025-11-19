package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1;

import edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1.legacy.ILegacyDatabase;

public class DatabaseAdapter implements Database {
    private ILegacyDatabase legacyDatabase;

    DatabaseAdapter(ILegacyDatabase legacyDatabase) {
        this.legacyDatabase = legacyDatabase;
    }

    @Override
    public void insert(String records) {
        legacyDatabase.insertData(records);
    }

    @Override
    public void retrive(String id) {
        legacyDatabase.getData(id);
    }
}
