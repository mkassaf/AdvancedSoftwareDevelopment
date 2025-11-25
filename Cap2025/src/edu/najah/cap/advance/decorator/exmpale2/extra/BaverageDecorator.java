package edu.najah.cap.advance.decorator.exmpale2.extra;

import edu.najah.cap.advance.decorator.exmpale2.Baverage;

public abstract class BaverageDecorator implements Baverage {
    protected Baverage baverage;

    public BaverageDecorator(Baverage baverage) {
        this.baverage = baverage;
    }
}
