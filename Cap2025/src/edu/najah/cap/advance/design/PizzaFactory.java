package edu.najah.cap.advance.design;

public class PizzaFactory {

    public static Pizza getPizza(String pizzaName) {
        Pizza pizza;

        if (pizzaName.equals("Vegetable")) {
            pizza = new VegPizza();
        } else if (pizzaName.equals("Classic")) {
            pizza = new ClassicPizza();
        }  else if (pizzaName.equals("Four")) {
            pizza = new FourPizza();
        } else if (pizzaName.equals("Cheese")) {
            pizza = new CheesPizza();
        } else {
            throw new IllegalArgumentException("Invalid pizza name");
        }
        return pizza;
    }
}
