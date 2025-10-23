package edu.najah.cap.advance.quality_classes.cohesion.correct.validator;


import edu.najah.cap.advance.quality_classes.cohesion.correct.Person;
import edu.najah.cap.advance.quality_classes.cohesion.correct.Validator;

public class SurnameValidator implements Validator {


    @Override
    public void verifyPerson(Person person) {
        if(person.getSurname() == null || person.getSurname().isBlank())
            throw new IllegalArgumentException("Surname is required");
    }
}
