package edu.najah.cap.advance.oop.example2;

public class App2 {

    public static void main(String[] args) {
        //Camera device = new Device("1", "1"); error!!

        Device camera = new Camera("18", "Black", 10);

        System.out.println(camera.getModel());
        System.out.println(camera.getColor());
        System.out.println("Camera weight is: " + ((Camera)camera).getWeight());

        //Device device2 = new Device("18", "Black");
        //System.out.println("device2 weight is: " + device2.getWeight());
    }


    static void printWeight(Device device) {
        System.out.println(device.getWeight());
    }
}
