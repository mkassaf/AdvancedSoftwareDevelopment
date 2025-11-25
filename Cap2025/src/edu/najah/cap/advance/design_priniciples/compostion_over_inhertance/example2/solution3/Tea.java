package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution3;

public class Tea extends Baverage {

    public Tea(boolean withMilk, boolean withHoney, boolean withMocha, boolean withSugger, boolean withDoubleMilk) {
        super(withMilk, withHoney, withMocha, withSugger, withDoubleMilk);
    }

    @Override
    protected int getBasePrice() {
        return 1;
    }
}
