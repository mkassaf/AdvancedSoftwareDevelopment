package edu.najah.cap.advance.design_priniciples.singelton;

import java.util.*;

public class FileV2 {
    private String path;

    private static Map<String, FileV2> instances = new HashMap<>();
    private static final int MAX_NUMBER_OF_INSTANCE = 10;

    private FileV2(String path) {
        this.path = path;
    }


    public void readFile() {
        System.out.println(this.path);
    }

    public static synchronized FileV2 getInstance(String path) {
        if (MAX_NUMBER_OF_INSTANCE <= instances.size()) {
            throw new RuntimeException("Reach max number of allowed instances!!");
        }
        return instances.computeIfAbsent(path, FileV2::createObject);
    }



    private static FileV2 createObject(String key) {
        System.out.println("Creating a new object for " + key);
        return new FileV2(key);
    }

    public static void main(String[] args) {
        FileV2 file1 = FileV2.getInstance("1");
        FileV2 file2 = FileV2.getInstance("2");
        FileV2 file11 = FileV2.getInstance("1");

        if (file1 == file2) {
            System.out.println("Fail");
        } else {
            System.out.println("Success");
        }

        if (file1 == file11) {
            System.out.println("Success");
        } else {
            System.out.println("Fail");
        }
    }
}
