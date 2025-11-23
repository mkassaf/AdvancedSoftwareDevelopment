package edu.najah.cap.advance.assignments.assignment1.templates;

/*
 * Naive TemplateManager: builds heavy templates from scratch each time (simulated via sleep)
 */
public class TemplateManager {

    public HeavyTemplate buildEmailJobTemplate(String templateName, String config) {
        var templateBody =  simulateHeavyLoad("EmailTemplate:"+templateName);
        HeavyTemplate t = new HeavyTemplate("EMAIL", templateName, config, templateBody);
        System.out.println("Built Email template (heavy): " + templateName);
        return t;
    }

    public HeavyTemplate buildDataProcessingTemplate(String templateName, String config) {
        var templateBody = simulateHeavyLoad("DataTemplate:"+templateName);
        HeavyTemplate t = new HeavyTemplate("DATA", templateName, config, templateBody);
        System.out.println("Built DataProcessing template (heavy): " + templateName);
        return t;
    }

    public HeavyTemplate buildReportJobTemplate(String templateName, String config) {
        var templateBody = simulateHeavyLoad("ReportTemplate:"+templateName);
        HeavyTemplate t = new HeavyTemplate("REPORT", templateName, config, templateBody);
        System.out.println("Built Report template (heavy): " + templateName);
        return t;
    }

    private String simulateHeavyLoad(String msg) {
        System.out.println("Simulating heavy template creation for: " + msg);
        try { Thread.sleep(3000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        return "Large template";
    }
}
