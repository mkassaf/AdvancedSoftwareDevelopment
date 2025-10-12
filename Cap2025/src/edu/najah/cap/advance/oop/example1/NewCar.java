package edu.najah.cap.advance.oop.example1;

public final class NewCar extends  Car {

    int id;

    public NewCar() {
        super(0, "N/A");
    }

    public NewCar(int id) {
        super(0, "N/A");
        this.id = id;
    }

    public NewCar(int id, int model, String color) {
        super(0, "N/A");
        this.id = id;

    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Check 4 after start");
    }

    public static void main(String[] args) {
        Car car = new NewCar(1, 2020, "red");

        //NewCar car2 = new NewCar(1);

        System.out.println(((NewCar)car).getId());//1

        car.start();
    }
}
