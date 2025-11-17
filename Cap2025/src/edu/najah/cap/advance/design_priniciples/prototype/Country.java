package edu.najah.cap.advance.design_priniciples.prototype;

public class Country implements Cloneable {
    private int code;
    private String name;

    public Country(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Country clone() throws CloneNotSupportedException {
        return (Country) super.clone();
    }
}
