package edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3;

import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.Savable;
import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.Save;
import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.ShareViaEmail;
import edu.najah.cap.advance.design_patterns.strategy_pattern.exmaple3.alogrithem.ShareViaWhatsup;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args) {
        var start = Instant.now();
        System.out.println(start);
        PhoneCameraApp app1 = new BasicPhotoCameraApp(List.of(new ShareViaWhatsup()));
        PhoneCameraApp app2 = new CameraPlusApp(List.of(new ShareViaWhatsup(), new ShareViaEmail()));
        PhoneCameraApp app3 = new CameraPlusApp(List.of(new ShareViaWhatsup(), new ShareViaEmail()));


        app1.edit();
        app2.edit();

        app1.save();
        app2.save();

        app1.share();

       /* Savable save1 = Save.getInstance();
        Savable save2 = app1.getSave();
        Savable save3 = app2.getSave();

        if (save1 == save2) {
            System.out.println("They are exactly same");
        } else {
            System.out.println("They are NOT!!");
        }*/
        var end = Instant.now();
        System.out.println(end);
        System.out.println(end.toEpochMilli() - start.toEpochMilli());

    }
}
