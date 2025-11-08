package edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3;

import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.Sharable;

import java.util.List;

public class BasicPhotoCameraApp extends PhoneCameraApp {
    public BasicPhotoCameraApp(List<Sharable> sharables) {
        super(sharables);
    }

    public void edit() {
        System.out.println("Custom logic to edit the photo");
    }
}
