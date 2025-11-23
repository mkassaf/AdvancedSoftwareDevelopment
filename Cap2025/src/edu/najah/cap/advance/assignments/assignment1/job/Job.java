package edu.najah.cap.advance.assignments.assignment1.job;

import edu.najah.cap.advance.assignments.assignment1.model.User;

public class Job {
    private String id;
    private String type; // "EMAIL","DATA","REPORT"
    private String name;
    private String config; // naive serialized config
    private User requestedBy;

    public Job(String id, String type, String name, String config) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.config = config;
    }
    public String getId() { return id; }
    public String getType() { return type; }
    public String getName() { return name; }
    public String getConfig() { return config; }
    public void setRequestedBy(User u) { this.requestedBy = u; }
    public User getRequestedBy() { return requestedBy; }
}