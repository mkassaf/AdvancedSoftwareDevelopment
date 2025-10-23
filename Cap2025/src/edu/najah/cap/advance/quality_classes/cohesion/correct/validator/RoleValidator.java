package edu.najah.cap.advance.quality_classes.cohesion.correct.validator;

import edu.najah.cap.advance.quality_classes.cohesion.correct.Person;
import edu.najah.cap.advance.quality_classes.cohesion.correct.Validator;

public class RoleValidator implements Validator {
    @Override
    public void verifyPerson(Person person) {
        if(person.getRole() == null || person.getRole().isBlank())
            throw new IllegalArgumentException("Role is required");
    }
}
