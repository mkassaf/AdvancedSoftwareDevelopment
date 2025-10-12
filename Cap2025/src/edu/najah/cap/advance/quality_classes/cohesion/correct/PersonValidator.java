package edu.najah.cap.advance.quality_classes.cohesion.correct;

s
public class PersonValidator {


    public void verifyPerson(Person person) {
        if(person.getName() == null || person.getName().isBlank())
            throw new IllegalArgumentException();

    }
}
