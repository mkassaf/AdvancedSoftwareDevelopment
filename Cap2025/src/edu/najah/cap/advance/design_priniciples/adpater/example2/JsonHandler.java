package edu.najah.cap.advance.design_priniciples.adpater.example2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsonHandler {

    public void proccess(Map<String, String> values) {
        Set<String> keys = values.keySet();
        for (String key : keys) {
            System.out.println("Key :: " + key);
            System.out.println("Value:: " + values.get(key));
        }

    }
}
