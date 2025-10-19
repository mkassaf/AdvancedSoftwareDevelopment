package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution1;

public class App {

    public static void main(String[] args) {
        Coffee coffee = new Coffee(2);

        System.out.println(coffee.getPrice());
    }
}
