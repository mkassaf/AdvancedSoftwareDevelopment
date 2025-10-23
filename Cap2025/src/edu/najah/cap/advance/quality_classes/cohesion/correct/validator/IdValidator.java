package edu.najah.cap.advance.quality_classes.cohesion.correct.validator;


import edu.najah.cap.advance.quality_classes.cohesion.correct.Person;
import edu.najah.cap.advance.quality_classes.cohesion.correct.Validator;

public class IdValidator implements Validator {


    @Override
    public void verifyPerson(Person person) {
        System.out.println("Validating Id..." + person.getId());
        if(person.getId() < 0) {
            throw new IllegalArgumentException("Id is required");
        }
    }
}
