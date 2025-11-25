package edu.najah.cap.advance.design_priniciples.compostion_over_inhertance.example2.solution3;

public abstract class Baverage {
    private boolean withMilk;
    private boolean withHoney;
    private boolean withMocha;
    private boolean withSugger;

    public Baverage(boolean withMilk, boolean withHoney, boolean withMocha, boolean withSugger) {
        this.withMilk = withMilk;
        this.withHoney = withHoney;
        this.withMocha = withMocha;
        this.withSugger = withSugger;
    }


    public final int getPrice() {
        int total = getBasePrice();
        if (withHoney) {
            total += 2;
        }
        if (withMilk) {
            total +=1;
        }
        if (withMocha){
            total += 3;
        }
        if (withSugger) {
            total += 1;
        }
        return total;
    }

    protected abstract int getBasePrice();
}
