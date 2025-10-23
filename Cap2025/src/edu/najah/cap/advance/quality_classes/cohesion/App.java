package edu.najah.cap.advance.quality_classes.cohesion;

import edu.najah.cap.advance.quality_classes.cohesion.correct.Person;
import edu.najah.cap.advance.quality_classes.cohesion.correct.PersonDatabase;
import edu.najah.cap.advance.quality_classes.cohesion.correct.PersonValidator;
import edu.najah.cap.advance.quality_classes.cohesion.correct.Validator;
import edu.najah.cap.advance.quality_classes.cohesion.correct.validator.IdValidator;
import edu.najah.cap.advance.quality_classes.cohesion.correct.validator.NameValidator;
import edu.najah.cap.advance.quality_classes.cohesion.correct.validator.RoleValidator;
import edu.najah.cap.advance.quality_classes.cohesion.correct.validator.SurnameValidator;

import java.util.List;

public class App {



    public static void main(String[] args) {

        Person person = new Person(1, "Ahmad", "Assaf", "Admin");


        PersonDatabase personDatabase = new PersonDatabase("db:sql");//Object - Singleton

        getValidators().forEach(personDatabase::registerValidator);

        personDatabase.registerValidator(p -> {
            if (p.getId() == 1) {
                throw new IllegalArgumentException("1 is taken");
            }
        });

        //personDatabase.connectDatabaseUrl();
        //personDatabase.addPersonToDB(person);


        Validator nameValidator = new NameValidator();
        if(nameValidator instanceof NameValidator) {

            ((NameValidator)nameValidator).printName();
        } else {
            System.out.println("Not a name validator");
        }

    }


    public static void addRole(Person person, String role) {
        person.setRole(role);
        Validator validator = new RoleValidator();
        validator.verifyPerson(person);
    }



    public static List<Validator> getValidators() {
        return List.of(
                new NameValidator(),
                new SurnameValidator(),
                new IdValidator(),
                new RoleValidator()
        );
    }
}
