package edu.najah.cap.advance.liskov.correct;

public class Square implements Shape {
    private int side;

    @Override
    public int getArea() {
        return side * side;
    }

    Square(int side) {
        this.side = side;
    }
}
