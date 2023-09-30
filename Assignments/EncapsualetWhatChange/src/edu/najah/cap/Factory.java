package edu.najah.cap;

public class Factory {

    public static Pancak createPancak(String name) {
        //Create Object
        if (name.equals("Banan")) {
            return new BananPancak();
        } else if (name.equals("Milk")) {
            return new MilkPancak();
        } else {
            return null;
        }
    }
}
