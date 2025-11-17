package edu.najah.cap.advance.design_priniciples.singelton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class File {
    private final String path;

    private static Map<String, File> instances = new HashMap<>();
    private static final int MAX_NUMBER_OF_INSTANCES = 4;
    private File(String path) {
        this.path = path;
    }

    public void getFile() {
        System.out.println("File path " + path);
    }

    public static synchronized File getInstance(String path) {
        if (!instances.containsKey(path)) {
            if (instances.size() >= MAX_NUMBER_OF_INSTANCES) {
                throw new RuntimeException("We reached max number of files.");
            }
            instances.put(path, new File(path));
        }
        return instances.get(path);
        //return instances.computeIfAbsent(path, File::new);
    }


    public static void close (String path) {
        instances.remove(path);
    }

    public static void main(String[] args) {
        File file1 = File.getInstance("path1");
        File file2 = File.getInstance("path2");
        File file22 = File.getInstance("path2");

        if (file1 == file2) {
            System.out.println("Fail!!");
        } else {
            System.out.println("Success!!");
        }

        if (file2 == file22) {
            System.out.println("Success!!");
        } else {
            System.out.println("Fail!!");
        }
    }
}
