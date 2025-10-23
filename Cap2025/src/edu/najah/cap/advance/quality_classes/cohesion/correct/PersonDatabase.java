package edu.najah.cap.advance.quality_classes.cohesion.correct;


import java.util.ArrayList;
import java.util.List;

public class PersonDatabase {
    private String databaseUrl;
    private List<Validator> personValidators = new ArrayList<>();

    public PersonDatabase(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public void connectDatabaseUrl() {
        System.out.println("Connecting to database..." + databaseUrl);
    }
    public void addPersonToDB(Person person) {
        for (Validator validator : personValidators) {
            validator.verifyPerson(person);
        }
        System.out.println("Adding person to database");
    }

    public void registerValidator(Validator validator) {
        personValidators.add(validator);
    }
}
