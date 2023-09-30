package edu.najah.cap;

public class BananPancak implements Pancak {
    @Override
    public void print() {
        System.out.println("Banan Pancak");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Banan Pancak");
    }

    @Override
    public void eat() {
        System.out.println("Eating Banan Pancak");
    }
}
