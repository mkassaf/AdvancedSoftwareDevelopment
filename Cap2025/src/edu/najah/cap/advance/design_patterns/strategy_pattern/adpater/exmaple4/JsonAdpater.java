package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.exmaple4;

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
        Map<String, String> objectsAsMap = convertXmlToJson(objects);
        jsonHandler.proccess(objectsAsMap);
    }

    private Map<String, String> convertXmlToJson(List<Xml> objects) {
        Map<String, String> objectsAsMap = new HashMap<>();

        for (Xml xml: objects) {
            objectsAsMap.put(xml.getTag(), xml.getValue());
        }
        return  objectsAsMap;
    }
}
