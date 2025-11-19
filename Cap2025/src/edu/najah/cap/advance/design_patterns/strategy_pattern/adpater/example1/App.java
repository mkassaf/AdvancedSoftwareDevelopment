package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1;

import edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example1.legacy.Legacy2Database;

public class App {

    Database database;
    
    App(Database database) {
        this.database = database;
    }
    
    public void process() {
        this.database.insert("Hello");
        this.database.retrive("1");
    }

    public static void main(String[] args) {
        App app = new App(new DatabaseAdapter2(new Legacy2Database()));

        app.process();
    }
}
