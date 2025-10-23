package edu.najah.cap.advance.quality_classes.cohesion.bad;

public class PersonWithRoleValidator extends Person {


    public PersonWithRoleValidator(int id, String name, String surname, String role, String databaseUrl) {
        super(id, name, surname, role, databaseUrl);
    }

    public void verifyPerson(Person person) {
        super.verifyPerson(person);
        //Does this code break any SOLID principles?
        if(person.getRole() == null || person.getRole().isBlank())
            throw new IllegalArgumentException("Role is required");
    }
}
