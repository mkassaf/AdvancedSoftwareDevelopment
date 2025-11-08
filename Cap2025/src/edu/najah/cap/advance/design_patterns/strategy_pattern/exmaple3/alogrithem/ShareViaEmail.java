package edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem;

public class ShareViaEmail implements Sharable {
    @Override
    public void share() {
        System.out.println("Share via Email");
    }
}
