package edu.najah.cap.advance.design_priniciples.prototype;

public class Address implements Cloneable {
    private Country country;
    private String city;
    private String street;


    public Address(){}

    public Address(Country country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        var copy = (Address)super.clone();
        copy.setCountry(country.clone());
        return copy;
    }
}
