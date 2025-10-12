package edu.najah.cap.advance.quality_classes.cohesion.correct;


public class PersonDatabase {
    private String databaseUrl;

    public PersonDatabase(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void connectDatabaseUrl() {
        System.out.println("Connecting to database..." + databaseUrl);
    }
    public void addPersonToDB(Person person) {
        System.out.println("Adding person to database");
    }
}
