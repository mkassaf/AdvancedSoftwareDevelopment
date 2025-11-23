package edu.najah.cap.advance.assignments.assignment1.executor;


import edu.najah.cap.advance.assignments.assignment1.connections.Connection;
import edu.najah.cap.advance.assignments.assignment1.connections.ConnectionManager;
import edu.najah.cap.advance.assignments.assignment1.job.Job;

/*
 * Naive executor: performs all job types in one class using if/else.
 * Also handles acquiring/closing connections directly (no proxy).
 */
public class JobExecutor {
    private final ConnectionManager cm;

    public JobExecutor(ConnectionManager cm) {
        this.cm = cm;
    }

    public void executeJob(Job job) {
        System.out.printf("[NaiveExecutor] Starting job %s (%s) requested by %s%n",
                job.getName(), job.getType(),
                job.getRequestedBy() == null ? "unknown" : job.getRequestedBy().getName());
        // Acquire connection directly (no pool reuse)
        Connection c = cm.createConnection();
        try {
            if ("EMAIL".equals(job.getType())) {
                executeEmailJob(job, c);
            } else if ("DATA".equals(job.getType())) {
                executeDataJob(job, c);
            } else if ("REPORT".equals(job.getType())) {
                executeReportJob(job, c);
            } else {
                System.out.println("Unknown job type - nothing done.");
            }
        } finally {
            cm.closeConnection(c);
            System.out.printf("[NaiveExecutor] Finished job %s%n", job.getName());
        }
    }

    private void executeEmailJob(Job job, Connection c) {
        System.out.println("[EmailJob] Preparing to send email using config: " + job.getConfig());
        c.executeQuery("INSERT INTO email_sent (job, status) VALUES ('" + job.getId() + "', 'SENT')");
        // naive: no error handling, no retries
    }

    private void executeDataJob(Job job, Connection c) {
        System.out.println("[DataJob] Reading & transforming data using config: " + job.getConfig());
        c.executeQuery("SELECT * FROM source_table WHERE job_id = '" + job.getId() + "'");
        c.executeQuery("INSERT INTO processed_results (job_id) VALUES ('" + job.getId() + "')");
    }

    private void executeReportJob(Job job, Connection c) {
        System.out.println("[ReportJob] Generating report (" + job.getName() + ") using config: " + job.getConfig());
        c.executeQuery("SELECT * FROM report_source WHERE report = '" + job.getName() + "'");
        c.executeQuery("INSERT INTO generated_reports (job_id, path) VALUES ('" + job.getId() + "', '/reports/" + job.getId() + ".pdf')");
    }
}