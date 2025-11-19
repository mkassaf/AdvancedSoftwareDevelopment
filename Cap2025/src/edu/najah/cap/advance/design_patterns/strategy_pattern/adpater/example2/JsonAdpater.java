package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonAdpater implements Job {

    private JsonHandler jsonHandler;

    public JsonAdpater(JsonHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    @Override
    public void run(List<Xml> objects) {
        Map<String, String> myMap = new HashMap<>();

        for (Xml xml: objects) {
            myMap.put(xml.getTag(), xml.getValue());
        }

        jsonHandler.proccess(myMap);
    }

    /**
     * config -> xml
     * open source lib -> validate schema (json)
     *
     * xml -> json -> validate json
     */
}
