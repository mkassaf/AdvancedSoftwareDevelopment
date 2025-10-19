package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        List<Condiments> condiments = new ArrayList<Condiments>();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Condiments (1 - Milk, 2-Mocha): ");
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            switch (num) {
                case 1:
                    condiments.add(new Milk());
                    break;
                case 2:
                    condiments.add(new Mocha());
                    break;
                case 3:
                    condiments.add(new Honey());
            }
        }

        Coffee coffee = new Coffee(1, condiments);

        System.out.println("Coffee: " + coffee.getPrice());
    }
}
