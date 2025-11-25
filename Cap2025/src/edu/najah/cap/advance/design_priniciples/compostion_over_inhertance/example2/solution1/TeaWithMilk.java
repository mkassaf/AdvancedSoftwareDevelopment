package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution1;

public class TeaWithMilk extends Tea {
    public TeaWithMilk(int quantity) {
        super(quantity);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
