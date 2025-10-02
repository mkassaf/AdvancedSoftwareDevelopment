package edu.najah.cap.advance.example1;

public enum Gender {
    Male(0),
    Female(1);

    private int value;
    Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Gender valueOf(int value) {
        if (value == 0) {
            return Male;
        } else  {
            return Female;
        }
    }
}
