package edu.najah.cap;

public class MilkPancak implements Pancak {
    @Override
    public void print() {
        System.out.println("Milk Pancak");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Milk Pancak");
    }

    @Override
    public void eat() {
        System.out.println("Eating Milk Pancak");
    }
}
