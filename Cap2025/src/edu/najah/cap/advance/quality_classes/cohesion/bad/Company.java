package edu.najah.cap.advance.quality_classes.cohesion.bad;

public class Company {
    private int id;
    private String name;
    private String surname;
    private String stdId;
    private String databaseUrl;

    public Company(int id, String name, String surname, String stdId, String databaseUrl) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.stdId = stdId;
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

    public void verifyPerson(Company person) {
        if(person.name == null || person.name.isBlank())
            throw new IllegalArgumentException();

        if(person.surname == null || person.surname.isBlank())
            throw new IllegalArgumentException();

    }

    public void connectDatabaseUrl() {
        System.out.println("Connecting to database..." + databaseUrl);
    }
    public void addCompanyToDB(Company person) {
        verifyPerson(person);
        System.out.println("Adding person to database");
    }
}
