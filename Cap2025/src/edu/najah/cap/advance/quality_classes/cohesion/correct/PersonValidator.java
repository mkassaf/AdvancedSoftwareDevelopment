package edu.najah.cap.advance.quality_classes.cohesion.correct;


public class PersonValidator implements Validator {


    public void verifyPerson(Person person) {
        if(person.getName() == null || person.getName().isBlank())
            throw new IllegalArgumentException();

        if (person.getSurname() == null || person.getSurname().isBlank())
            throw new IllegalArgumentException();

    }
}
