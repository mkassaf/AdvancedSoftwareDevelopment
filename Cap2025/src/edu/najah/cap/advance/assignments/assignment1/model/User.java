package edu.najah.cap.advance.assignments.assignment1.model;

import java.util.*;

public class User {
    private final String name;
    private final List<String> permissions; // naive permission labels

    public User(String name, List<String> permissions) {
        this.name = name;
        this.permissions = permissions == null ? new ArrayList<>() : permissions;
    }

    public String getName() { return name; }
    public boolean hasPermission(String perm) {
        return permissions.contains(perm);
    }
}