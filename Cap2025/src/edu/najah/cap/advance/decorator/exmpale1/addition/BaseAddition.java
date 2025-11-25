package edu.najah.cap.advance.decorator.exmpale1.addition;

import edu.najah.cap.advance.decorator.exmpale1.Baverage;

public abstract class BaseAddition implements Baverage  {
    protected Baverage baverage;

    public  BaseAddition(Baverage baverage) {
        this.baverage = baverage;
    }
}
