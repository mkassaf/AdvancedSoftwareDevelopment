package edu.najah.cap.advance.compostition.exmaple2;

public class Staff extends Employee {

    public Staff(String name) {
        super(name);
    }

    @Override
    void printName() {
        System.out.println(" Name: " + this.name);
    }
}
