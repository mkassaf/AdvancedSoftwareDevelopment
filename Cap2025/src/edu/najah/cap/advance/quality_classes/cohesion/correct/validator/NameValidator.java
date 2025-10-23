package edu.najah.cap.advance.quality_classes.cohesion.correct.validator;


import edu.najah.cap.advance.quality_classes.cohesion.correct.Person;
import edu.najah.cap.advance.quality_classes.cohesion.correct.Validator;

public class NameValidator implements Validator {


    @Override
    public void verifyPerson(Person person) {
        if(person.getName() == null || person.getName().isBlank())
            throw new IllegalArgumentException("Name is required");
    }


    public void printName() {
        System.out.println("Getting name...");
    }
}
