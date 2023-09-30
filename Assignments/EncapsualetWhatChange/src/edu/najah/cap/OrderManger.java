package edu.najah.cap;

public class OrderManger {

    private int id;

    public OrderManger(int id) {
        this.id = id;
    }

    //100 requests
    public void oder(String name) {
        Pancak pancak = Factory.createPancak(name);;

        //Call Methods (abstract)
        pancak.print();
        pancak.cook();
        pancak.eat();
    }


}
