package edu.najah.cap.advance.enum_example;

public class App {

    public static void main(String[] args) {
        //small, medium, large, extra large
        PizzaWithoutEnum smallPizza = new PizzaWithoutEnum("MARGHERITA", PizzaSizesConstants.SMALL);
        PizzaWithoutEnum mediumPizza = new PizzaWithoutEnum("PEPPERONI", PizzaSizesConstants.MEDIUM);
        PizzaWithoutEnum largePizza = new PizzaWithoutEnum("VEGGIE", PizzaSizesConstants.LARGE);
        PizzaWithoutEnum extraLargePizza = new PizzaWithoutEnum("BBQ_CHICKEN", PizzaSizesConstants.EXTRA_LARGE);

        //var unknownSizePizza = new PizzaWithoutEnum("UNKNOWN", 5); // Invalid size

        System.out.println("Small Pizza: " + smallPizza.getType() + ", Size: " + smallPizza.getSize());
        System.out.println("Medium Pizza: " + mediumPizza.getType() + ", Size: " + mediumPizza.getSize());
        System.out.println("Large Pizza: " + largePizza.getType() + ", Size: " + largePizza.getSize());
        System.out.println("Extra Large Pizza: " + extraLargePizza.getType() + ", Size: " + extraLargePizza.getSize());


        var smallPizzaEnum = new PizzaWithEnum("MARGHERITA", PizzaSize.valueOf("SMALL"));
        var mediumPizzaEnum = new PizzaWithEnum("PEPPERONI", PizzaSize.MEDIUM);
        var largePizzaEnum = new PizzaWithEnum("VEGGIE", PizzaSize.LARGE);
        var extraLargePizzaEnum = new PizzaWithEnum("BBQ_CHICKEN", PizzaSize.EXTRA_LARGE);

        System.out.println("Small Pizza: " + smallPizzaEnum.getType() + ", Size: " + smallPizzaEnum.getSize());
        System.out.println("Medium Pizza: " + mediumPizzaEnum.getType() + ", Size: " + mediumPizzaEnum.getSize());
        System.out.println("Large Pizza: " + largePizzaEnum.getType() + ", Size: " + largePizzaEnum.getSize().getSizeValue());
        System.out.println("Extra Large Pizza: " + extraLargePizzaEnum.getType() + ", Size: " + extraLargePizzaEnum.getSize());

        var unknownSizePizzaEnum = new PizzaWithEnum("UNKNOWN", PizzaSize.valueOf("Unknown")); // Exception

    }
}
