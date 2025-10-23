package edu.najah.cap.advance.design;

public class PizzaObjectFactory {


    public static Pizza createPizzaObject(String type) {
        Pizza pizza;

        if (type.equals("Cheese")) {
            pizza = new CheesPizza();
        } else if (type.equals("Veggie")) {
            pizza = new VegPizza();
        } else if ("Four".equals(type)) {
            pizza = new FourPizza();
        } else if (type.equals("Classic")) {
            pizza = new ClassicPizza();
        } else {
            throw new IllegalArgumentException("Invalid type of order");
        }
        return pizza;
    }
}
