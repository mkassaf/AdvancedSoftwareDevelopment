package edu.najah.cap.advance.compostition.exmaple2;

import java.util.ArrayList;
import java.util.List;

public class Manager extends  Employee {

    private List<Employee> employees = new ArrayList<>();

    public Manager(String name) {
        super(name);
    }

    @Override
    void printName() {
        System.out.println("Name: " + this.name);
        for (Employee employee: employees) {
            employee.printName();
        }
    }


    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
