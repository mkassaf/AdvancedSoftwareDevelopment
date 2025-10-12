package edu.najah.cap.advance.quality_classes.cohesion;

import edu.najah.cap.advance.quality_classes.cohesion.correct.Person;
import edu.najah.cap.advance.quality_classes.cohesion.correct.PersonDatabase;
import edu.najah.cap.advance.quality_classes.cohesion.correct.PersonValidator;

public class App {

    public static void main(String[] args) {

        Person person = new Person(1, "Mustafa", "Assaf", "Admin");

        PersonValidator  personValidator = new PersonValidator();

        personValidator.verifyPerson(person);

        PersonDatabase personDatabase = new PersonDatabase("db:sql");

        personDatabase.connectDatabaseUrl();

        personDatabase.addPersonToDB(person);
    }
}
