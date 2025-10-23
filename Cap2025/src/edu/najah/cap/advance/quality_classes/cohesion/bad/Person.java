package edu.najah.cap.advance.quality_classes.cohesion.bad;

public class Person {
    private int id;
    private String name;
    private String surname;
    private String role;
    private String databaseUrl;

    public Person(int id, String name, String surname, String role, String databaseUrl) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.databaseUrl = databaseUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void verifyPerson(Person person) {
        if(person.name == null || person.name.isBlank())
            throw new IllegalArgumentException("Name is required");

        if(person.surname == null || person.surname.isBlank())
            throw new IllegalArgumentException("Surname is required");

        if(person.role == null || person.role.isBlank())
            throw new IllegalArgumentException("Role is required");

    }

    public void connectDatabaseUrl() {
        System.out.println("Connecting to database..." + databaseUrl);
    }
    public void addPersonToDB(Person person) {
        verifyPerson(person);
        System.out.println("Adding person to database");
    }
}
