package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example3;

import edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example3.legacy.ILegacyDatabase;

public class DatabaseLegacyAdapter implements  Database {

    private ILegacyDatabase legacyDatabase;

    DatabaseLegacyAdapter(ILegacyDatabase legacyDatabase) {
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
