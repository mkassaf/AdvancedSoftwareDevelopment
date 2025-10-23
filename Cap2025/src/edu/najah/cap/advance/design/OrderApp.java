package edu.najah.cap.advance.design;

public class OrderApp {

    public void order(String type) {
        Pizza pizza = PizzaObjectFactory.createPizzaObject(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
