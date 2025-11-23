package edu.najah.cap.advance.assignments.assignment1;

import edu.najah.cap.advance.assignments.assignment1.connections.ConnectionManager;
import edu.najah.cap.advance.assignments.assignment1.executor.JobExecutor;
import edu.najah.cap.advance.assignments.assignment1.job.Job;
import edu.najah.cap.advance.assignments.assignment1.model.User;
import edu.najah.cap.advance.assignments.assignment1.templates.TemplateManager;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== TMPS Naive Starter App ===");

        // create a naive ConnectionManager (not a pool)
        ConnectionManager connManager = new ConnectionManager();

        // naive TemplateManager (builds templates from scratch each time)
        TemplateManager templateManager = new TemplateManager();

        // naive executor (does everything with if/else)
        JobExecutor executor = new JobExecutor(connManager);

        User alice = new User("alice", Arrays.asList("EMAIL", "REPORT")); // incomplete permissions

        // Demo: create a report job from template and execute
        System.out.println("\n--- Create Report Job from template (naive build) ---");

        //TODO problem 1: each time want to create job, it takes time to load and create job which includes creating template and then create job
        Job reportJob = templateManager.buildReportJobTemplate("MonthlyReport", "format=PDF;brand=TaskMaster").createJobInstance(); // builds from scratch
        reportJob.setRequestedBy(alice);

        System.out.println("\n--- Execute job (naive executor) ---");
        executor.executeJob(reportJob);

        Job reportJob2 = templateManager.buildEmailJobTemplate("Monthly email Report", "format=PDF;all=true").createJobInstance(); // builds from scratch
        reportJob2.setRequestedBy(alice);

        System.out.println("\n--- Execute job (naive executor) ---");
        executor.executeJob(reportJob2);
    }
}