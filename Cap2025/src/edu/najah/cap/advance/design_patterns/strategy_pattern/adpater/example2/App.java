package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example2;

import java.util.List;

public class App {

    Job job;

    App(Job job) {
        this.job = job;
    }

    void run() {
        job.run(List.of(
                new Xml("k1", "value1"),
                new Xml("k2", "value2")
        ));
    }

    public static void main(String[] args) {
        App app = new App(new JsonAdpater(new JsonHandler()));

        app.run();
    }
}
