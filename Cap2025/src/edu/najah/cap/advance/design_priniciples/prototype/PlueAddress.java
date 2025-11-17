package edu.najah.cap.advance.design_priniciples.prototype;

public class PlueAddress extends Address {
    private int extra;

    public PlueAddress(Country country, String city, String street, int extra) {
        super(country, city, street);
        this.extra = extra;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }


}
