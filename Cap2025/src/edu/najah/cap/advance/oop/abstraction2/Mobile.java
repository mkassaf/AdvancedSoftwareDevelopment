package edu.najah.cap.advance.oop.abstraction2;

public final class Mobile extends Device implements  Interactable {
    @Override
    public void interact() {
        System.out.println("Mobile Interact");
    }

    @Override
    public void trunOn() {
        System.out.println("trunOn");
    }

    /*@Override
    public void trunOff() {
        System.out.println("trunOff");
    }*/
}
