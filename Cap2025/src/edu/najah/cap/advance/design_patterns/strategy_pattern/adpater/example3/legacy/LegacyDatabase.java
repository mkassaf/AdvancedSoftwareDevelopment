package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example3.legacy;

public class LegacyDatabase implements ILegacyDatabase {
    public void insertData(String data) {
        System.out.println("Inserting data to the legacy db" + data);
    }

    public void getData(String id) {
        System.out.println("Getting a data from legacy db " + id);
    }
}
