package edu.najah.cap.advance.oop.example1;

public class App {



    public static void main(String[] args) {

        Car car = new Car(2020, "red");//we create object/instance

        System.out.println(car.getColor());

        car.setColor("red");

        car.setModel(-10);
        System.out.println(car.getModel());

        car.stop();

        //car.setId(1111);

        NewCar newCar = new NewCar();
        newCar.setColor("red");
        newCar.setModel(2010);
        newCar.setId(1);
        System.out.println(newCar.getColor());
        System.out.println(newCar.getModel());
        System.out.println(newCar.getId());
        newCar.start();
        newCar.stop();

        Car car2 = new NewCar();

        System.out.println(((NewCar)car2).getId());
    }
}
