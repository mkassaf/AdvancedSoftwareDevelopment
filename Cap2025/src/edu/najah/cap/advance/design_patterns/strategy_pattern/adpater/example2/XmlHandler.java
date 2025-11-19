package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example2;

import java.util.List;

public class XmlHandler implements Job {

    @Override
    public void run(List<Xml> objects) {
        objects.forEach(xml -> {
            System.out.println("Key" + xml.getTag());
            System.out.println("Value" + xml.getValue());
        });
    }
}
