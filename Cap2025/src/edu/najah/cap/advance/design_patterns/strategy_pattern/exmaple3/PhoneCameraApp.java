package edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3;


import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.Savable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.Save;
import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.Sharable;

import java.util.List;

public abstract class PhoneCameraApp {

    private List<Sharable> sharables;

    public PhoneCameraApp(List<Sharable> sharables) {
        this.sharables = sharables;
    }

    public void save() {
        Save.getInstance().save();
    }

    public void talk() {
        //logic to talk a photo
        System.out.println("Talking a photo ..");
    }

    public void share() {
        for (Sharable sharable : sharables) {
            sharable.share();
        }
    }


    public abstract void edit() ;
}
