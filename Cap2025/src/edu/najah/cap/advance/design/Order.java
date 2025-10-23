package edu.najah.cap.advance.design;

public class Order {


    public Pizza requestPizza(String pizzaName) {

        Pizza pizza = PizzaFactory.getPizza(pizzaName);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }


}
