package edu.najah.cap.advance.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        // store record key and value
        //key unique
        Map map1 = new HashMap<String,Integer>();
        //var map1 = new HashMap<String,Integer>(); same
        Map<String,Integer> map2 = Map.of(
                "S1", 1,
                "S2", 1,
                "S3", 1
        );

        map1.put("K1", 1);

        if(map1.containsKey("K1")) {
            System.out.println("value before" + map1.get("K1"));
        }

        map1.put("K1", 2);
        System.out.println("value after" + map1.get("K1"));

        map1.put("K2", 20);
        System.out.println("value after:: " + map1.getOrDefault("K2" , 10));

        if(!map1.containsKey("K2")) {
            map1.put("K2", 30);
        }

        map1.putIfAbsent("K3", 30);
        map1.putIfAbsent("K3", 60);
        map1.putIfAbsent("K3", 90);

        System.out.println("value after:: " + map1.get("K3"));//30

        map1.put("S40", 40);//add a new value
        map1.put("S40", 400);//override
        map1.put("S40", 4000);//override
        map1.put("S40", 40000);//override

        System.out.println("value 40:: " + map1.get("S40"));//40000

        Set<String> keys = map1.keySet();

        for(String k : keys) {
            System.out.println("Key " + k + " , Value: " + map1.get(k));
        }

        map2.forEach((key, value) -> {
            System.out.println("Key " + key + " , Value: " + value);
        });
    }
}
