package edu.najah.cap.advance.observer.example1.weather.station;

import static java.lang.Thread.sleep;

public abstract class Runner {
    private Topic topic;
    protected int duration = 10000;

    Runner(Topic topic) {
        this.topic = topic;
    }

    public final void run() {
        while (true) {
            int temp = getData();
            topic.notifyAll(temp);
            try {
                sleep(duration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    protected abstract int getData();
}
