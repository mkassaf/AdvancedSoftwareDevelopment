package edu.najah.cap.advance.design_priniciples.prototype;


public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address1 = new PlueAddress(new Country(1, "PS"), "Nablus", "1", 1);

        Address address11 = address1.clone();

        Address address2 = new Address(new Country(1, "PS"), "Nablus", "2");

        Address address3 = new Address(new Country(1, "PS"), "Nablus", "3");

        address11.setStreet("11");
        address11.getCountry().setName("JO");

        System.out.println("getCountrycode " + address11.getCountry().getCode());//1
        System.out.println("getStreet " + address11.getStreet());//11
        System.out.println(((PlueAddress)address11).getExtra());//1
        System.out.println("getCountry " + address11.getCountry().getName());//JO

        System.out.println("getCountrycode " + address1.getCountry().getCode());//1
        System.out.println("getStreet " + address1.getStreet());//11 ? 1
        System.out.println(((PlueAddress)address1).getExtra());//1
        System.out.println("getCountry " + address1.getCountry().getName());//JO ? PS

    }

    public static Address copy(Address address) {
        Address copy = new Address();
        Country counterCopy = new Country(address.getCountry().getCode(), address.getCountry().getName());
        copy.setCountry(counterCopy);
        copy.setStreet(address.getStreet());
        copy.setCity(address.getCity());

        return copy;
    }


}
