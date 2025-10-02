package edu.najah.cap.advance.example2;

public enum Gender {
    MALE(0),
    FEMALE(1);

    private int value;
    Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Gender fromValue(int value) {
        if(value == 0) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }
}
