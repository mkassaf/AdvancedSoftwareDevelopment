package edu.najah.cap.advance.compostition.exmaple2;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        var topManager = new Manager("Mustafa");
        topManager.addEmployee(new Staff("Omar"));
        var manager1 = new Manager("Jaber");
        var manager2 = new Manager("Saleh");

        topManager.addEmployee(manager1);
        topManager.addEmployee(manager2);

        manager1.addEmployee(new Staff("Jaber 1"));
        manager1.addEmployee(new Staff("Jaber 2"));

        manager2.addEmployee(new Staff("Saleh 1"));
        manager2.addEmployee(new Staff("Saleh 2"));

        var manager21 = new Manager("Syofan");
        manager21.addEmployee(new Staff("Sofyan1"));
        manager21.addEmployee(new Staff("Sofyan2"));

        manager2.addEmployee(manager21);


        topManager.printName();
    }
}
