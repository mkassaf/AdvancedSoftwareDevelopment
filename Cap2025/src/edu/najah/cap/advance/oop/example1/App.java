package edu.najah.cap.advance.oop.example1;

public class App {



    public static void main(String[] args) {



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

        Car car2 = new NewCar(44);

        System.out.println(car2.getId());
    }
}
