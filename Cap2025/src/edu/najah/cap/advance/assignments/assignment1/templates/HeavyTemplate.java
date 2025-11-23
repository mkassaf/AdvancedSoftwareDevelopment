package edu.najah.cap.advance.assignments.assignment1.templates;

import edu.najah.cap.advance.assignments.assignment1.job.Job;

/*
 * Naive representation of a heavy template. It includes a method createJobInstance()
 * that builds a Job object from the template.
 */
public class HeavyTemplate {
    private final String type;
    private final String name;
    private final String config;
    private final String templateBody;

    public HeavyTemplate(String type, String name, String config, String templateBody) {
        this.type = type;
        this.name = name;
        this.config = config;
        this.templateBody = templateBody;
    }

    // naive: creates a new Job from scratch (no clone/prototype)
    public Job createJobInstance() {
        String id = templateBody + " _ " + type + "-" + System.currentTimeMillis();
        return new Job(id, type, name, config);
    }


}